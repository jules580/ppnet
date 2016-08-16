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
from flask import Flask, request, send_file, send_from_directory
from flask import url_for
from worker import celery
from celery.result import AsyncResult
import celery.states as states
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
@app.route('/add/<int:param1>/<int:param2>')
def add(param1,param2):
    task = celery.send_task('mytasks.add', args=[param1, param2], kwargs={})
    return "<a href='{url}'>check status of {id} </a>".format(id=task.id,
                url=url_for('check_task',id=task.id,_external=True))

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
	global iden_num
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
		subprocess.call(["zip","-r",Name+"/test.zip",Name ])
        	return send_file(Name+'/test.zip')

	#del iden[param3]
	#iden.insert(param3,"")
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
                subprocess.call(["zip","-r",Name+"/test.zip",Name ])
                return send_file(Name+'/test.zip')

	#del idenmatrix[param3]
	#idenmatrix.insert(param3,"")	
		
  
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
 	TargetUrl=str(j)+"testTargetUrl"
 	scenarioName=str(j)+"scenarioName"
	testSourceUrl=str(j)+"testSourceUrl" 
   	Tester=Receive_data[testSourceUrl]
         #if tester==testerId:
 
 	 #   k+=1
  	if testerId==Tester and Send==False:
 		
		Send=True
   		testnum=Receive_data
 		testTargetUrl=Receive_data[testTargetUrl]
   		Scenario=Receive_data[scenarioName]
 		testreceive={"testTargetUrl": testTargetUrl, "scenarioName": Scenario, "tester": Tester}
 		#del Data[j]
		#Data.insert(j,"")
                
  JsonData=json.dumps(testreceive,sort_keys=True, indent=4)
  Send=False
  return JsonData

@app.route('/test/conf/vector/<testerId>')
def runvector(testerId):
 
  global DataVector
  #global tester
  global k
  global SendVector
  global testreceivevector
  for j in range(k,0,-1):	
	Receive_data_vector=DataVector[j]
 	TargetUrl=str(j)+"testTargetUrl"
 	scenarioName=str(j)+"scenarioName"
 	testTargetUrl=str(j)+"testTargetUrl" 
	TargetVectorUrl=str(j)+"testTargetVectorUrl"
   	Tester=Receive_data_vector[testTargetUrl]
         #if tester==testerId:
 
 	 #   k+=1
  	if testerId==Tester and SendVector==False:
		SendVector=True
   		testnum=Receive_data_vector
 		Url=Receive_data_vector[testTargetUrl]
   		Vector=Receive_data_vector[testTargetVectorUrl]
 		testreceivevector=Matrix+","+Vector
 		#del DataVector[j]
 		#k-=1
                
  
  SendVector=False
  return testreceivevector

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
	Scenario=Scenariotab[1]
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
	Scenario=ScenarioTab[1]
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
	
if __name__ == '__main__':
    app.run(debug=env.get('DEBUG',True),
            port=int(env.get('PORT',5000)),
            host=env.get('HOST','0.0.0.0')
   )
