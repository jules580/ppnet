from flask import Flask, jsonify, request, g
from flask.views import MethodView
from flasgger import Swagger
import os
import requests
import time
import json
from flask import Flask, request, send_file
import json
import requests
import time
import subprocess
import requests, zipfile, io
from flask import jsonify
from flask import Flask, session, request, send_file, send_from_directory
from flask import url_for
from worker import celery
from celery.result import AsyncResult
import celery.states as states
import unicodedata
i=0
k=0
Data=["test"]
DataVector=["test"]
Send=False
listTest={"USA": "http://192.168.2.76:7070", "France":"http://192.168.2.77:7070" } 
SendVector=True
testreceive=""
testreceivevector=""
env=os.environ
app = Flask(__name__, static_folder='static')
iden={}
idenmatrix={}
iden_num=0
iden_matrix_num=0

# config your API specs
# you can define multiple specs in the case your api has multiple versions
# ommit configs to get the default (all views exposed in /spec url)
# rule_filter is a callable that receives "Rule" object and
#   returns a boolean to filter in only desired views

app.config['SWAGGER'] = {
    "swagger_version": "2.0",
    # headers are optional, the following are default
    # "headers": [
    #     ('Access-Control-Allow-Origin', '*'),
    #     ('Access-Control-Allow-Headers', "Authorization, Content-Type"),
    #     ('Access-Control-Expose-Headers', "Authorization"),
    #     ('Access-Control-Allow-Methods', "GET, POST, PUT, DELETE, OPTIONS"),
    #     ('Access-Control-Allow-Credentials', "true"),
    #     ('Access-Control-Max-Age', 60 * 60 * 24 * 20),
    # ],
    # another optional settings
    # "url_prefix": "swaggerdocs",
    # "subdomain": "docs.mysite,com",
    # specs are also optional if not set /spec is registered exposing all views
    "specs": [
        {
            "version": "0.0.1",
            "title": "Api v1",
            "endpoint": 'v1_spec',
            "route": '/v1/spec',

            # rule_filter is optional
            # it is a callable to filter the views to extract

            # "rule_filter": lambda rule: rule.endpoint.startswith(
            #    'should_be_v1_only'
            # )
        }
    ]
}

swagger = Swagger(app)
@app.route('/add/<int:param1>/<int:param2>')
def add(param1,param2):
    task = celery.send_task('mytasks.add', args=[param1, param2], kwargs={})
    return "<a href='{url}'>check status of {id} </a>".format(id=task.id,
                url=url_for('check_task',id=task.id,_external=True))

@app.route('/init/')
def init():
	session['iden_matrix_num']=0
	#idenmatrix={}
	#g.idenmatrix=idenmatrix
	return str(session['iden_matrix_num'])	
@app.route('/check/<string:id>')
def check_task(id):
    res = celery.AsyncResult(id)
    if res.state==states.PENDING:
        return res.state
    else:
        return str(res.result)
        
@app.route('/requestResult/vector/<int:param4>')
def getresults2(param4):
	global iden
	global iden_num
	global listTest
	global DataVector
	global k
	DataReceive=DataVector[param4]
	testSourceName=str(param4)+"testSourceName"
	scenarioName=str(param4)+"scenarioName"
	
	SourceName=DataReceive[testSourceName]
	Scenario=DataReceive[scenarioName]
	#del DataVector[param4]
	#DataVector.insert(param4,"")

	
	task= celery.send_task('mytask.get', args=[Scenario,SourceName], kwargs={})
	res= celery.AsyncResult(task.id)
	iden_num+=1
	iden[iden_num]=task.id
	
	Task={"request_id":str(iden_num)}
	return json.dumps(Task,sort_keys=True,indent=4)
@app.route('/requestResult/<int:param2>')
def getresults3(param2):	
	global idenmatrix
	#global iden_matrix_num
	global listTest
	#global Data
	Data=session['DATA']

	DataReceive=Data[param2]
	scenarioName=str(param2)+"scenarioName"
	Scenario=DataReceive[scenarioName]
	testSourceName=str(param2)+"testSourceName"
	SourceName=DataReceive[testSourceName]
	#del Data[param2]
	#Data.insert(param2,"")
	with open('data.json') as json_file:
		listTest2=json.load(json_file)
	Name=[]
	param1=0
	param3=0
	i=session['index']
	for cle in listTest2.keys():
		Name.append(cle)
	for K in range(1,i+1):
		DataR=Data[K]	
		testSourceNames=str(K)+"testSourceName"
		SourceNames=DataR[testSourceNames]
		if SourceNames==Name[1]:
			param1+=1
		elif SourceNames==Name[0]:
			param3+=1
	if SourceName==Name[1]:
		param2=param1
	elif SourceName==Name[0]:
		param2=param3	
	#time.sleep(30)
	task= celery.send_task('mytask.get', args=[Scenario,SourceName,param2], kwargs={})
	#iden_matrix_num=session['iden_matrix_num']
	iden_matrix_num=session['iden_matrix_num']
	iden_matrix_num+=1
	#idenmatrix=session['idenmatrix']
	#idenmatrix=getattr(g,'idenmatrix', None)
	idenmatrix[iden_matrix_num]=task.id
	session['iden_matrix_num']=session['iden_matrix_num']+1
	#session['iden_matrix_num']=iden_matrix_num
	Task={"request_id":str(iden_matrix_num)}
	return json.dumps(Task,sort_keys=True,indent=4)	
@app.route('/requestResult/matrix/<int:param2>')
def getresultsmatrix2(param2):
	global idenmatrix
	global iden_matrix_num
	global listTest
	global Data

	DataReceive=Data[param2]
	scenarioName=str(param2)+"scenarioName"
	Scenario=DataReceive[scenarioName]
	testSourceName=str(param2)+"testSourceName"
	SourceName=DataReceive[testSourceName]
	#del Data[param2]
	#Data.insert(param2,"")
			
	
	#time.sleep(30)
	task= celery.send_task('mytask.get', args=[Scenario,SourceName], kwargs={})
	iden_matrix_num+=1
	idenmatrix[iden_matrix_num]=task.id
	
	Task={"request_id":str(iden_matrix_num)}
	return json.dumps(Task,sort_keys=True,indent=4)
    
@app.route('/getresult/vector/<int:param3>')
def check(param3):
	global iden
	#global iden_num
	identi=iden[param3]

	datares="Pending"
	res= celery.AsyncResult(identi)
	if res.state==states.PENDING:
		Task={"status":res.state}
		return json.dumps(Task,sort_keys=True,indent=4)	
	else:
		zip_file_url=res.result
		r = requests.get(zip_file_url)
		z = zipfile.ZipFile(io.BytesIO(r.content))
		z.extractall()
	        Nametab=zip_file_url.split('s/')
		Name=Nametab[1]
		subprocess.call(["sh","/flask-app/"+Name+"/jsonresult.sh","/flask-app/"+Name])
		subprocess.call(["cp","-f","/flask-app/result.txt","/flask-app/"+Name+"/result.txt"])
		time.sleep(2)
		subprocess.call(["zip","-r",Name+"/test.zip",Name ])
        	return send_file(Name+'/test.zip')

	#del iden[param3]
	#iden.insert(param3,"")
@app.route('/jsonresult/vector/<int:param3>')
def check3(param3):
	global iden
	global iden_num
	identi=iden[param3]
	res=celery.AsyncResult(identi)
	if res.state==states.PENDING:
		Task={"status":res.state}
		return json.dumps(Task,sort_keys=True,indent=4)
	else:
		zip_file_url=res.result
		r=requests.get(zip_file_url)
		z = zipfile.ZipFile(io.BytesIO(r.content))
		z.extractall()
		Nametab= zip_file_url.split('s/')
		Name=Nametab[1]
		p1=subprocess.call(["sh","/flask-app/"+Name+"/jsonresult.sh","/flask-app/"+Name])
		file= open('/flask-app/result.txt','r')
		return file.read()
@app.route('/getresult/<int:param3>')
def check46(param3):
	global idenmatrix
	#global iden_matrix_num
	identi=idenmatrix[param3]
   
	res= celery.AsyncResult(identi)
	if res.state==states.PENDING:
		 Task={"status":res.state}
		 return json.dumps(Task,sort_keys=True,indent=4)	
	else:
		zip_file_url=res.result
       		r = requests.get(zip_file_url)
        	z = zipfile.ZipFile(io.BytesIO(r.content))
        	z.extractall()
        	Nametab=zip_file_url.split('s/')
        	Name=Nametab[1]
		subprocess.call(["sh","/flask-app/"+Name+"/jsonresult.sh","/flask-app/"+Name])
		subprocess.call(["cp","-f","/flask-app/result.txt","/flask-app/"+Name])
		time.sleep(2)
		subprocess.call(["zip","-r",Name+"/test.zip",Name ])
		return send_file(Name+'/test.zip')
@app.route('/getresult/matrix/<int:param3>')
def check2(param3):
	global idenmatrix
	#global iden_matrix_num
	identi=idenmatrix[param3]
   
	res= celery.AsyncResult(identi)
	if res.state==states.PENDING:
		 Task={"status":res.state}
		 return json.dumps(Task,sort_keys=True,indent=4)	
	else:
		zip_file_url=res.result
                r = requests.get(zip_file_url)
                z = zipfile.ZipFile(io.BytesIO(r.content))
                z.extractall()
                Nametab=zip_file_url.split('s/')
                Name=Nametab[1]
		subprocess.call(["sh","/flask-app/"+Name+"/jsonresult.sh","/flask-app/"+Name])
		subprocess.call(["cp","-f","/flask-app/result.txt","/flask-app/"+Name])
		time.sleep(2)
		subprocess.call(["zip","-r",Name+"/test.zip",Name ])
                return send_file(Name+'/test.zip')

	#del idenmatrix[param3]
	#idenmatrix.insert(param3,"")	
@app.route('/jsonresults/<int:param3>')
def check654(param3):
	global indenmatrix
	#idenmatrix=getattr(g,'idenmatrix', None)
	identi=idenmatrix[param3]
	res= celery.AsyncResult(identi)
	if res.state==states.PENDING:
		Task={"status":res.state}
		return json.dumps(Task,sort_keys=True,indent=4)
	else:
		zip_file_url=res.result
		r = requests.get(zip_file_url)
		z= zipfile.ZipFile(io.BytesIO(r.content))
		z.extractall()
		Nametab=zip_file_url.split('s/')
		Name=Nametab[1]
		subprocess.call(["sh","/flask-app/"+Name+"/jsonresult.sh","/flask-app/"+Name])
		file= open('/flask-app/result.txt','r')
		return file.read()  		
@app.route('/jsonresult/matrix/<int:param3>')
def check5(param3):
	global indentmatrix
	identi=idenmatrix[param3]
	res= celery.AsyncResult(identi)
	if res.state==states.PENDING:
		Task={"status":res.state}
		return json.dumps(Task,sort_keys=True,indent=4)
	else:
		zip_file_url=res.result
		r = requests.get(zip_file_url)
		z= zipfile.ZipFile(io.BytesIO(r.content))
		z.extractall()
		Nametab=zip_file_url.split('s/')
		Name=Nametab[1]
		subprocess.call(["sh","/flask-app/"+Name+"/jsonresult.sh","/flask-app/"+Name])
		file= open('/flask-app/result.txt','r')
		return file.read()  
@app.route("/launchtests/", methods=["PUT","POST"])
def echo23():
	JsonData=json.loads(json.dumps(request.get_json(force=True)))
	TargetUrl=JsonData['testTargetUrl']
	scenarioName=JsonData['scenarioName']
	testSourceName= JsonData['testSourceName']
	application=JsonData['application']
	content=[]
	content.append(TargetUrl)
	content.append(scenarioName)
	content.append(testSourceName)
	content.append(application)
	global i
	global Data
	global listTest
	i+=1
	testTargetUrl= str(i)+"testTargetUrl"
	scenarioName= str(i)+"scenarioName"
	testSourceName= str(i)+"testSourceName"
	Application= str(i)+"application"
	if application=="matrix":
		testnum="test"+str(i)
		testnum={ testTargetUrl: content[0], scenarioName: content[1], testSourceName: content[2], Application: content[3]}
	else:
		TargetVectorUrl= JsonData['testTargetVectorUrl']
		content.append(TargetVectorUrl)
		testTargetVectorUrl= str(i)+"testTargetVectorUrl"
		testnum= "test"+str(i)
		testnum={ testTargetUrl: content[0], scenarioName: content[1], testSourceName: content[2], testTargetVectorUrl: content[4], Application: content[3]}
		
		
	index=i
	Data.append(testnum)
	session['DATA']=Data
	session['index']=i
	Receive_data=Data[index]
	URL=Receive_data[testTargetUrl]
	with open("data.json") as json_file:
		listTest2=json.load(json_file)
	r=requests.get(listTest2[content[2]]+"/gatling/"+content[1]+"/start")
	js=json.loads(r.content)
	Status=js["status"]
	if Status!="failed":
		Details=js["details"]
		Task={"request_id":str(i),"status":Status,"details":str(Details)}
		return json.dumps(Task,sort_keys=True,indent=4)
	else:
		Message=js["message"]
		Task={"status":Status,"details":Message}
		return json.dumps(Task,sort_keys=True,indent=4)
@app.route("/launchtest/matrix", methods=["PUT","POST"])
def echo():
	JsonData=json.loads(json.dumps(request.get_json(force=True)))
	TargetUrl=JsonData['testTargetUrl']
	scenarioName=JsonData['scenarioName']
	testSourceName=JsonData['testSourceName'] 
	content=[]
	content.append(TargetUrl)
	content.append(scenarioName)
	content.append(testSourceName)
	global i
	global Data
	global listTest
	i+=1
   # content.append(str(i))
	testTargetUrl= str(i)+"testTargetUrl"
	scenarioName= str(i)+"scenarioName"
	testSourceName= str(i)+"testSourceName"
     #test= { name : content[0], name2: content[1], name3: content[2]}
	testnum= "test"+str(i)
	testnum={ testTargetUrl: content[0], scenarioName: content[1], testSourceName: content[2]}
	index=i
	Data.append(testnum)
	Receive_data=Data[index]
	URL=Receive_data[testTargetUrl]
    #r=requests.get('http://192.168.2.77:')
	r=requests.get(listTest[content[2]]+"/gatling/"+content[1]+"/start")     
	js=json.loads(r.content)
	Status=js["status"]
	if Status!="failed":
		Details=js["details"]	
		Task={"request_id":str(i),"status":str(Status),"details":str(Details)}
		return json.dumps(Task,sort_keys=True,indent=4) 
	else:
		Message=js["message"]
		Task={"status":Status,"details":Message}
		return json.dumps(Task,sort_keys=True, indent=4)
	#+str(i)+" "+str(r.content)  
    #
    #return str(r.content)

	    
@app.route("/launchtest/vector", methods=["PUT","POST"])
def echo2(): 
	JsonData=json.loads(json.dumps(request.get_json(force=True)))
	TargetUrl=JsonData['testTargetUrl']
	scenarioName=JsonData['scenarioName']
	testSourceName=JsonData['testSourceName']
	TargetVectorUrl=JsonData['testTargetVectorUrl']
	content=[]
	content.append(TargetUrl)
	content.append(scenarioName)
	content.append(testSourceName)
	content.append(TargetVectorUrl)
	
	global k
	global DataVector
	global listTest
	k+=1
   # content.append(str(i))
	testTargetUrl= str(k)+"testTargetUrl"
	scenarioName= str(k)+"scenarioName"
	testSourceName= str(k)+"testSourceName"
	testTargetVectorUrl=str(k)+"testTargetVectorUrl"
     #test= { name : content[0], name2: content[1], name3: content[2]}

	testnumvector={ testTargetUrl: content[0], scenarioName: content[1], testSourceName: content[2], testTargetVectorUrl: content[3]}
	index=k
	DataVector.append(testnumvector)
	Receive_data_vector=DataVector[index]
	URL=Receive_data_vector[testTargetUrl]
	r=requests.get(listTest[content[2]]+"/gatling/"+content[1]+"/start")
	js=json.loads((r.content))
	Status=js['status']
	if Status!="failed":
		Details=js['details']

		Task={"request_id":str(k),"status":str(Status),"details":str(Details)}
		return json.dumps(Task,sort_keys=True, indent=4)
   	else:
		Message=js['message']
		Task={"status":Status,"details":Message}
		return json.dumps(Task,sort_keys=True, indent=4)
@app.route('/test/conf/matrix/<testerId>')
def run(testerId):
 
  global Data
  #global tester
  global i
  global Send
  global testreceive
  for j in range(i,0,-1):	
	Receive_data=Data[j]
 	testTargetUrl=str(j)+"testTargetUrl"
 	scenarioName=str(j)+"scenarioName"
	testSourceName=str(j)+"testSourceName" 
   	Tester=Receive_data[testSourceName]
   	
         #if tester==testerId:
 
 	 #   k+=1
  	if testerId==Tester and Send==False:
 		
		Send=True
   		testnum=Receive_data
 		testTargetUrl=Receive_data[testTargetUrl]
   		Scenario=Receive_data[scenarioName]
 		testreceive={"url": testTargetUrl, "scenarioName": Scenario, "testSourceName": Tester}
 		#del Data[j]
		#Data.insert(j,"")
                
  JsonData=json.dumps(testreceive,sort_keys=True, indent=4)
  Send=False
  return JsonData
@app.route('/test/confs/<testerId>')
def run4(testerId):
	global Data
	global i
	global Send
	global testreceive
	for j in range(i,0,-1):
		Receive_data=Data[j]
		testTargetUrl=str(j)+"testTargetUrl"
		scenarioName=str(j)+"scenarioName"
		testSourceName=str(j)+"testSourceName"
		application=str(j)+"application"
		Application=Receive_data[application]
		Tester=Receive_data[testSourceName]
		if testerId==Tester and Send==False:
			Send=True
			testnum=Receive_data
			testTargetUrl=Receive_data[testTargetUrl]
			Scenario=Receive_data[scenarioName]
			if Application == "matrix":	
				testreceive={"url": testTargetUrl, "scenarioName": Scenario, "testSourceName": Tester}
				Infos=json.dumps(testreceive,sort_keys=True,indent=4)
			else:
				testTargetVectorUrl=str(j)+"testTargetVectorUrl"
				TargetUrl= str(j)+"testTargetUrl"
				Matrix=Receive_data[TargetUrl]
				Vector=Receive_data[testTargetVectorUrl]
				Infos=Matrix+","+Vector
	
	Send=False
	return Infos
@app.route('/test/conf/vector/<testerId>')
def runvector(testerId):
 
  global DataVector
  #global tester
  global k
  global SendVector
  global testreceivevector
  for j in range(k,0,-1):	
	Receive_data_vector=DataVector[j]
 	testSourceName=str(j)+"testSourceName"
 	scenarioName=str(j)+"scenarioName"
 	testTargetUrl=str(j)+"testTargetUrl" 
	testTargetVectorUrl=str(j)+"testTargetVectorUrl"
   	Tester=Receive_data_vector[testSourceName]
         #if tester==testerId:
 
 	 #   k+=1
  	if testerId==Tester and SendVector==False:
		SendVector=True
   		testnum=Receive_data_vector
 		Matrix=Receive_data_vector[testTargetUrl]
   		Vector=Receive_data_vector[testTargetVectorUrl]
 		testreceivevector=Matrix+","+Vector
 		#del DataVector[j]
 		#k-=1
                
  
  SendVector=False
  return testreceivevector
@app.route('/checkstatus/<int:id>')
def check54(id):
	#global listTest
	#global Data
	#global i
	Data=session['DATA']
	i=session['index']
	DataReceive=Data[id]
	testSourceName=str(id)+"testSourceName"
	test=DataReceive[testSourceName]
	scenarioName=str(id)+"scenarioName"
	Scenario=DataReceive[scenarioName]
	with open("data.json") as json_file:
		listTest2=json.load(json_file)
        urlsend=listTest2[test]+"/gatling/"+Scenario
        r=requests.get(urlsend)
        #return "hello"+Scenario
	js= json.loads((r.content))
	Task={"scenarioName":Scenario,"status":js['status']}
	return json.dumps(Task,sort_keys=True,indent=4)
@app.route('/checkstatus/matrix/<int:id>')
def checks(id):
	global listTest
	global DataVector
	global i
	DataReceive=Data[id]
	testSourceName=str(id)+"testSourceName"
	test=DataReceive[testSourceName]
	scenarioName=str(id)+"scenarioName"
	Scenario=DataReceive[scenarioName]
        urlsend=listTest[test]+"/gatling/"+Scenario
        r=requests.get(urlsend)
        #return "hello"+Scenario
	js= json.loads((r.content))
	Task={"scenarioName":Scenario,"status":js['status']}
	return json.dumps(Task,sort_keys=True,indent=4)

@app.route('/checkstatus/vector/<int:id>')
def checks2(id):
        global listTest
        global DataVector
        global k
        DataReceive=DataVector[id]
        testSourceName=str(id)+"testSourceName"
        test=DataReceive[testSourceName]
        scenarioName=str(id)+"scenarioName"
	Scenario=DataReceive[scenarioName]
        urlsend=listTest[test]+"/gatling/"+Scenario
        r=requests.get(urlsend)
        #return "hello"+Scenario
        js= json.loads((r.content))
        Task={"scenarioName":Scenario,"status":js['status']}
	return json.dumps(Task,sort_keys=True,indent=4)
@app.route('/getreports/<int:id>')
def getreports4(id):
	#global listTest
	#global Data
	#global i
	Data=session['DATA']
	i=session['index']
	DataReceive=Data[id]
	testSourceName=str(id)+"testSourceName"
	test=DataReceive[testSourceName]
	scenarioName=str(id)+"scenarioName"
	ScenarioData=DataReceive[scenarioName]
	Scenariotab=ScenarioData.split('.')
	Scenario=Scenariotab[2]
	with open("data.json") as json_file:
		listTest2= json.load(json_file)
    	urlresult=listTest2[test]+"/gatling/"+Scenario+"/reports"
	r=requests.get(urlresult)
	js=json.loads((r.content))
	tabjs=js['reports']
	index=len(tabjs)-1
        tab=" "
	if index>=0:
		for p in range(0,index-1):
			tab+=tabjs[p]+", "
		tab+=tabjs[index]
	else:
		tab+= "No simulation"
	Task={"Tab":[tab]}
	return json.dumps(Task,sort_keys=True,indent=4)
@app.route('/getreports/matrix/<int:id>')
def getreports(id):
	global listTest
        global Data
	global i
	DataReceive=Data[id]
	testSourceName=str(id)+"testSourceName"
	test=DataReceive[testSourceName]
	scenarioName=str(id)+"scenarioName"
	ScenarioData=DataReceive[scenarioName]
	Scenariotab=ScenarioData.split('.')
	Scenario=Scenariotab[2]
        urlresult=listTest[test]+"/gatling/"+Scenario+"/reports"
	r=requests.get(urlresult)
	js=json.loads((r.content))
	tabjs=js['reports']
	index=len(tabjs)-1
        tab=" "
	if index>=0:
		for p in range(0,index-1):
			tab+=tabjs[p]+", "
		tab+=tabjs[index]
	else:
		tab+= "No simulation"
	Task={"Tab":[tab]}
	return json.dumps(Task,sort_keys=True,indent=4)
@app.route('/getreports/vector/<int:id>')
def getreports2(id):
        global listTest
        global DataVector
        global k
        DataReceive=DataVector[id]
        testSourceName=str(id)+"testSourceName"
        test=DataReceive[testSourceName]
	scenarioName=str(id)+"scenarioName"
	ScenarioData=DataReceive[scenarioName]
	ScenarioTab=ScenarioData.split('.')
	Scenario=ScenarioTab[2]
        urlresult=listTest[test]+"/gatling/"+Scenario+"/reports"
        r=requests.get(urlresult)
        js=json.loads((r.content))
        tabjs=js['reports']
        index=len(tabjs)-1
	tab=" "
	if index>=0:
		for l in range(0,index-1):
			tab+=tabjs[l]+","
       		tab+=tabjs[index]
	else:
		tab+=" No simulation"
	Task={"Tab":[str(tab)]}
        return json.dumps(Task,sort_keys=True, indent=4)
@app.route('/test', methods=["PUT","POST"])
def new():
	JsonData=json.loads(json.dumps(request.get_json(force=True)))
	url=JsonData['testTargetUrl']
	scenarioName=JsonData['scenarioName']
	testSourceName=JsonData['testSourceName']
	return "Mon url est:"+url+", Mon scenario est:"+scenarioName+",Mon testeur est:"+testSourceName
app.secret_key="test"	
class VectorAPI(MethodView):
    def post(self):
        """
        Launch a simulation connected to a scenario in one particular gatlin testserver in order to attack a specific matrix server and the vector which is conneted to this matrix server
        ---
        tags:
          - vector
        parameters:
          - in: body
            name: Attack_infos
            description: It is the scenario , the gatling test server, the vector interface and the matrix server that the clieny choose to have for this test
            required: true
            schema:
              id: infos_attack
              required:
                - scenarioName
                - testTargetUrl
                - testSourceName
                - testTargetVectorUrl
		- application
              properties:
                scenarioName:
                    type: string
                    description: this is the name of the sceanrio that the client want to launch in order to attack a specifc target 
                    default: tai.vector.LoginVector
                testTargetUrl:
                    type: string
                    description: this is the url of the matrix or vector server the client want to attack
                    default: http://192.168.2.77:8008
                testSourceName:
                    type: string
                    description: this is the name of the server of test
                    default: France
                testTargetVectorUrl:
                    type: string
                    description: this is the url of vector interface
                    default: http://192.168.2.77:8081
		application:
		    type: string
		    description: this is the name of the product we want to test
		    default: vector
        responses:
          201:
            description: GUID and the status of the request
            schema:
                id: Status
                type: object
                required:
                    - status
                    - request_id
                    - details
                properties:
                    status:
                        type: string
                        description: it is the status of the request
                        default: Sucess
                        
                    request_id:
                        type: int
                        description: it is the guid of the request
                        default: 1
                    details:
                        type: string
                        description: it is the details of the status
                        default: true
        """
        return jsonify(
            {"data": request.json, "status": "New user created"}
        ), 201        

class MatrixAPI(MethodView):

 def post(self,Matrix):
        """
        launch a simulation connected to a scenario in one particular gatling test server in order to attack a specific target
        ---
        tags:
          - matrix
        parameters:
	  - name: Barre
	    in: path
	    description: Barre
	    type: string
	    required: true
	    default: /
          - in: body
            name: Attack_infos
            description: It is the scenari, the gatling server and the specific matrix server that the client choose to have for this test
            schema:
              id: infos_attack
              required:
                - scenarioName
                - testTargetUrl
                - testSourceName
		- application
              properties:
                scenarioName:
                    type: string
                    description: this is the name of the sceanrio that the client want to launch in order to attack a specifc target 
                    default: tai.matrix.LoginMatrix
                testTargetUrl:
                    type: string
                    description: this is the url of the matrix or vector server the client want to attack
                    default: http://192.168.2.77:8008
                testSourceName:
                    type: string
                    description: this is the name of the server of test
                    default: France
		application:
		    type: string
		    description: this is the name of the product we want to test
		    default: matrix
        responses:
          201:
            description: GUID and status of te request
            schema:
                id: Status
                type: object
                required:
                    - status
                    - request_id
                    - details
                properties:
                    status:
                        type: string
                        description: it is the status of the request
                        default: Sucess
                    request_id:
                        type: int
                        description: it is the guid of the request
                        default: 1
                    details:
                        type: string
                        description: it is the details about the sucess or the failure
                        default: true
        """
        return jsonify(
            {"data": request.json, "status": "New user created"}
        ), 201


       # return jsonify({"newuser": request.json, "team_id": team_id})

class CheckAPI(MethodView):
    def get(self,id_matrix):
        """
        this methods return the status of the simulation
        ---
        tags:
          - matrix
        parameters:
          - name: id_matrix
            in: path
            description: it is the id of the simulation
            required: true
            type: integer
            format: int64
        responses:
          200:
            description: this method will return the scenario name and the status of the client test request
            schema:
                id: test
                required:
                    - status
                    - Scenario_Name
                properties:
                    status:
                        type: string
                        description: it is the status of the request.The request can be stop or can be running
                        default: running
                    Scenario_Name:
                        type: string
                        description: it is the name of the scenario that the client choose
                        default: tai.vector.LoginVector
                     
        """
        return "toto"

class ResultAPI(MethodView):
    def get(self,id_matrix):
        """
        this methods will send a request to get the result of the task in a flask+celery server 
        ---
        tags:
          - matrix
        parameters:
          - name: id_matrix
            in: path
            description: it is the id of the simulation
            required: true
            type: integer
            format: int64
        responses:
          201:
            description: this method will return an id of the task which is send to the flask+ceery server
            schema:
                id: Task
                type: object
                required:
                    - request_id
                properties:
                    request_id:
                        type: string
                        description: it is the id of the task which is send to the flask+celery server
                        default: 1
        """

        data = {
            "hack": "string",
            "subitems": [
                {
                    "bla": "string",
                    "blu": 0
                }
            ]
        }
        return jsonify(data)
class ChecksAPI(MethodView):
    def get(self,id_vector):
        """
        this methods return the status of the simulation fo vector
        ---
        tags:
          - vector
        parameters:
          - name: id_vector
            in: path
            description: it is the id of the simulation
            required: true
            type: integer
            format: int64
        responses:
          200:
            description: this method will return the scenario name and the status of the client test request
            schema:
                id: Status
                type: object
                required:
                    - status
                    - Scenario_Name
                properties:
                    status:
                        type: string
                        description: it is the status of the request.It can be running or stop
                        default: running
                    Scenario_Name:
                        type: string
                        description: it is the name of the scenario that the client chose to launch
                        default: tai.matrix.LoginMatrix
        """             
        return "toto"

class GetReportsVectorAPI(MethodView):        
    def get(self, id_vector):
        """
        this methods will give the list of all request_name(Name of the scenario+timsatp) with the same scenario
        ---
        tags:
          - vector
        parameters:
          - name: id_vector
            in: path
            description: it is the id of the simulation
            required: true
            type: integer
            format: int64
        responses:
          200:
            description: this will give a list of all request_name
            schema:
                id: Report_List
                type: array
                items:
                    id: reports
                    required:
                        - ListReport
                    properties:
                        ListReport:
                            type: string
                            description: it is the list of all simulation that have in commun the same scenario of test
                            default: [loginvector-1471435202189]
        """
        data = {
            "users": [
                {"name": "Steven Wilson", "team": team_id},
                {"name": "Mikael Akerfeldt", "team": team_id},
                {"name": "Daniel Gildenlow", "team": team_id}
            ]
        }
        return jsonify(data)
class GetReportsMatrixAPI(MethodView):
    def get(self,id_matrix):
        """
        this methods will give the list of all request_name (Name of the scenario+timestap) which have the same scenario
        ---
        tags:
          - matrix
        parameters:
          - name: id_matrix
            in: path
            description: it is the id of the simulation
            required: true
            type: integer
            format: int64
        responses:
          200:
            description: this will give a List of all request_name
            schema:
                id: Report_List
                type: array
                items:
                    id: reports
                    required:
                        - ListReport
                    properties:
                        ListReport:
                            type: string
                            description: it is the list of all simulation name that have the same scenario in the launch
                            default: [loginmatrix-1471434838433]
        """




        data= {
            "users": [
                {"name": "test", "team": team_id}
            ]
        }    
        return jsonify(data)
class ResultSimulationAPI(MethodView):
    def get(self,id_matrix):
        """
        this methods will ask the flask+celery server in order to get the result of the simultion.If the simultion is not ready, there will be a pending message
        ---
        tags:
          - matrix
        parameters:
          - name: id_matrix
            in: path
            description: it is the id of the task of requestResult
            required: true
            type: integer
            format: int64
        responses:
          201:
            description:  this method will give the result as a zipfile
            schema:
                id: Logfile
                type: object
                required:
                    - Logifle
                    - index
                properties:
                    logfile:
                        type: string
                        description: it is the log file of the simultion the client has chose to launch
                    index:
                        type: string
                        description: it is an html file which contain all graphe of the simulation
                    
        """



        data= {
            "user" :[
                {"name":"test","team": team_id}
            ]
        }
        return jsonify(data)

class ResultSimulationsAPI(MethodView):
    def get(self,id_vector):
        """
        this methods will ask the flask+celery server in order to get the result of the simultion.If the simultion is not ready, there will be a pending message
        ---
        tags:
          - vector
        parameters:
          - name: id_vector
            in: path
            description: it is the id of the task f the requestresult
            required: true
            type: integer
            format: int64
        responses:
          201:
            description:  this method will give a zip file
            schema:
                id: Logfile
                type: object
                required:
                    - Logifle
                    - index
                properties:
                    logfile:
                        type: string
                        description: it is the logfile of the simultion that the client choose to launch
                    index:
                        type: string
                        description: it is an html file of all graphe of the simultion that the client chose to launch
                    
        """
        data= {
            "user" :[
                {"name":"test","team": team_id}
            ]
        }
        return jsonify(data)

class ResultsAPI(MethodView):
    def get(self,id_vector):
        """
        this methods will send create a new task in flask+celery server in order to get the result of the simulation
        ---
        tags:
          - vector
        parameters:
          - name: id_vector
            in: path
            description: it is the id of the simulation
            required: true
            type: integer
            format: int64
        responses:
          201:
            description:  this method will receuve the id of the taks in the flask+celery server
            schema:
                id: Task
                type: object
                required:
                    - request_id
                properties:
                    request_id:
                        type: int
                        description: it is the id of the task which is send to the flask+celery server
                        default: 1
        """



        data= {
            "user": [
                {"name":"test", "team": team_id}
            ]
        }

        return jsonify(data)

class JsonResultAPI(MethodView):
	def get(self,id_matrix):
		"""
        this methods will give the result of the simulation in a response in json
        ---
        tags:
          - matrix
        parameters:
          - name: id_matrix
            in: path
            description: This is the id of the task we have launch to get the result of the simulation
            required: true
            type: string
            format: utf8       
        responses:
          201:
            description:  Give  analyse
            schema:
                id: Action
                type: object
                required:
                    - Json
                properties:
                    Json:
                        type: string
                        description:  the analyse in a json way
       
        """			
class JsonResultsAPI(MethodView):
      def get(self,id_vector):
		"""
        this methods will give the result of the simulation in a response in json
        ---
        tags:
          - vector
        parameters:
          - name: id_vector
            in: path
            description: This is the id of the task we have launch to get the result of the simulation
            required: true
            type: string
            format: utf8       
        responses:
          201:
            description:  Give  analyse
            schema:
                id: Action
                type: object
                required:
                    - Json
                properties:
                    Json:
                        type: string
                        description:  the analyse in a json way
       
        """						
class ConfAPI(MethodView):
     	def get(self,SourceId):
        	"""
	this methods a json file in order to give the data in the particular test server
        ---
        tags:
          - matrix
        parameters:
          - name: SourceId
            in: path
            description: This is the name of the test server
            required: true
            type: string
            format: utf8
        responses:
          201:
            description:  Data
            schema:
                id: Action
                type: object
                required:
                    - Json
                properties:
                    Json:
                        type: string
                        description:  the infromations from the user  in a json way
        """
class ConfsAPI(MethodView):
        def get(self,SourceId):
                """
        this methods give  file in order to give the data in the particular t$
        ---
        tags:
          - matrix
        parameters:
          - name: SourceId
            in: path
            description: This is the name of the test server
            required: true
            type: string
            format: utf8
        responses:
          201:
            description:  Data
            schema:
                id: Action
                type: object
                required:
                    - Json
                properties:
                    Json:
                        type: string
                        description:  the informations from the user  for the server in a textfile
        """
class InitAPI(MethodView):
	def get(self):
           """
      	this methods initialize the manager .
        ---
        tags:
          - matrix
        responses:
          201:
            description:  Give the initial number
            schema:
                id: Action
                type: object
                required:
                    - Num
                properties:
                    Num:
                        type: int
                        description: This is the initial number of the simulation
        """
			
view = MatrixAPI.as_view('launchtest_Matrix')
app.add_url_rule(
    '/launchtests<string:Barre>',
    view_func=view,
    methods=[ "POST"],
    endpoint='launchtest_Matrix',
)





view2=GetReportsVectorAPI.as_view('getreports_vector')
app.add_url_rule(
    '/getreports/<int:id_vector>',
    view_func=view2,
    methods=["GET"],
    endpoint='getreports_vector')

view6=GetReportsMatrixAPI.as_view('getreports_matrix')
app.add_url_rule(
    '/getreports/<int:id_matrix>',
    view_func=view6,
    methods=["GET"],
    endpoint='getreport_matrix')

view3 = VectorAPI.as_view('launchtest_Vector')
app.add_url_rule(
    '/launchtests/',
    view_func=view3,
    methods=[ "POST"],
    endpoint='launchtest_Vector',
)

view4= CheckAPI.as_view('checkstatus_matrix')
app.add_url_rule(
    '/checkstatus/<int:id_matrix>',
    view_func=view4,
    methods=["GET"],
    endpoint='checkstatus_matrix')

view5= ChecksAPI.as_view('checkstatus_vector')
app.add_url_rule(
    '/checkstatus/<int:id_vector>',
    view_func=view5,
    methods=["GET"],
    endpoint='checkstatus_vector')

view7= ResultAPI.as_view('requestResult_matrix')
app.add_url_rule(
    '/requestResult/<int:id_matrix>',
    view_func=view7,
    methods=["GET"],
    endpoint= 'requestResult_matrix')
        
view8= ResultsAPI.as_view('requestResult_vector')
app.add_url_rule(
    '/requestResult/<int:id_vector>',
    view_func=view8,
    methods=["GET"],
    endpoint="requestResult_vector")

view9= ResultSimulationAPI.as_view('getresult_matrix')
app.add_url_rule(
    '/getresult/<int:id_matrix>',
    view_func=view9,
    methods=["GET"],
    endpoint="getresult_matrix")

view10= ResultSimulationsAPI.as_view('getresult_vector')
app.add_url_rule(
    '/getresult/<int:id_vector>',
    view_func=view10,
    methods=["GET"],
    endpoint="getresult_vector")

view11 = JsonResultAPI.as_view('jsonresult_matrix')
app.add_url_rule(
	'/jsonresults/<int:id_matrix>',
	view_func=view11,
	methods=["GET"],
	endpoint="jsonresult_matrix")
view12= JsonResultsAPI.as_view('jsonresult_vector')
app.add_url_rule(
	'/jsonresults/<int:id_vector>',
	view_func=view12,
	methods=["GET"],
	endpoint="jsonresult_vector")

view13= ConfAPI.as_view('conf')
app.add_url_rule(
	'/test/confs/<string:SourceId>',
	view_func=view13,
	methods=["GET"],
	endpoint="SourceId")
view14=ConfsAPI.as_view('conf')
app.add_url_rule(
	'/test/confs/<string:SourceIdVector>',
	view_func=view14,
	methods=["GET"],
	endpoint="SourceIdVector")

view15=InitAPI.as_view('init')
app.add_url_rule(
        '/init/',
        view_func=view15,
        methods=["GET"],
        endpoint="init2")

if __name__ == '__main__':
    app.run(debug=env.get('DEBUG',True),
            port=int(env.get('PORT',5000)),
            host=env.get('HOST','0.0.0.0')
)
