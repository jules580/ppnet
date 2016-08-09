from flask import Flask, request, send_file
import json
import requests
import time
import requests, zipfile, io
from flask import url_for
from flask import redirect
import os.path
import json
import psutil
import subprocess
import zipfile
import re
app = Flask(__name__, static_folder='static')
i=0
k=0
Data=["test"]
DataVector=["test"]
Send=False
listTest={"test": "http://192.168.2.76:7070" } 
SendVector=True
testreceive=""
testreceivevector=""

@app.route('/test3')
def test():
	zip_file_url="http://104.197.228.95:5050/data-zip.zip"
	r = requests.get(zip_file_url)
	z = zipfile.ZipFile(io.BytesIO(r.content))
	z.extractall()
	
	subprocess.call(["zip","-r","/app/data-zip/test.zip","/app/data-zip/" ])
        return send_file('data-zip/test.zip')
	#zipdir(report,z
@app.route("/launchtest/matrix")
def echo(): 
    data=request.args.get('content','')
    content=data.split(',')
    scenario=content[1]
    global i
    global Data
    global listTest
    i+=1
   # content.append(str(i))
    url= str(i)+"url"
    scenario= str(i)+"scenario"
    tester= str(i)+"tester"
     #test= { name : content[0], name2: content[1], name3: content[2]}
    testnum= "test"+str(i)
    testnum={ url: content[0], scenario: content[1], tester: content[2]}
    index=i
    Data.append(testnum)
    Receive_data=Data[index]
    URL=Receive_data[url]
    #r=requests.get('http://192.168.2.77:')
    r=requests.get(listTest[content[2]]+"/gatling/"+content[1]+"/start")     
    return "You said: "+str(i)+" "+str(r.content)  
    #
    #return str(r.content)

	    
@app.route("/launchtest/vector")
def echo2(): 
    data=request.args.get('content','')
    content=data.split(',')
    scenario=content[1]
    global k
    global DataVector
    global listTest
    k+=1
   # content.append(str(i))
    url= str(k)+"url"
    scenario= str(k)+"scenario"
    tester= str(k)+"tester"
    matrix=str(k)+"matrix"
     #test= { name : content[0], name2: content[1], name3: content[2]}

    testnumvector={ url: content[0], scenario: content[1], tester: content[2], matrix: content[3]}
    index=k
    DataVector.append(testnumvector)
    Receive_data_vector=DataVector[index]
    URL=Receive_data_vector[url]
    r=requests.get(listTest[content[2]]+"/gatling/"+content[1]+"/start")
    return "You said: "+str(k)+" "+str(r.content)

   
@app.route('/test/conf/matrix/<testerId>')
def run(testerId):
 
  global Data
  #global tester
  global i
  global Send
  global testreceive
  for j in range(i,0,-1):	
	Receive_data=Data[j]
 	url=str(j)+"url"
 	scenario=str(j)+"scenario"
	tester=str(j)+"tester" 
   	Tester=Receive_data[tester]
         #if tester==testerId:
 
 	 #   k+=1
  	if testerId==Tester and Send==False:
 		
		Send=True
   		testnum=Receive_data
 		Url=Receive_data[url]
   		Scenario=Receive_data[scenario]
 		testreceive={"url": Url, "scenario": Scenario, "tester": Tester}
 		del Data[j]
 		i-=1
                
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
 	url=str(j)+"url"
 	scenario=str(j)+"scenario"
 	tester=str(j)+"tester" 
	matrix=str(j)+"matrix"
   	Tester=Receive_data_vector[tester]
         #if tester==testerId:
 
 	 #   k+=1
  	if testerId==Tester and SendVector==False:
		SendVector=True
   		testnum=Receive_data_vector
 		Url=Receive_data_vector[url]
   		Matrix=Receive_data_vector[matrix]
 		testreceivevector=Url+","+Matrix
 		#del DataVector[j]
 		#k-=1
                
  
  SendVector=False
  return testreceivevector

@app.route('/checkstatus/matrix/<Scenario>')
def check(Scenario):
	global listTest
	global DataVector
	global i
	DataReceive=Data[i]
	tester=str(i)+"tester"
	test=DataReceive[tester]
        urlsend=listTest[test]+"/gatling/"+Scenario
        r=requests.get(urlsend)
        #return "hello"+Scenario
	js= json.loads((r.content))
	return "Scenario"+Scenario+" is "+js['status']
@app.route('/checkstatus/vector/<Scenario>')
def check2(Scenario):
        global listTest
        global DataVector
        global k
        DataReceive=DataVector[k]
        tester=str(k)+"tester"
        test=DataReceive[tester]
        urlsend=listTest[test]+"/gatling/"+Scenario
        r=requests.get(urlsend)
        #return "hello"+Scenario
        js= json.loads((r.content))
        return "Scenario"+Scenario+" is "+js['status']

@app.route('/getreports/matrix/<Scenario>')
def getreports(Scenario):
	global listTest
        global DataVector
	global i
	DataReceive=Data[i]
	tester=str(i)+"tester"
	test=DataReceive[tester]
        urlresult=listTest[test]+"/gatling/"+Scenario+"/reports"
	r=requests.get(urlresult)
	js=json.loads((r.content))
	tabjs=js['reports']
	index=len(tabjs)-1
	return "Last Reports"+tabjs[0]

@app.route('/getreports/vector/<Scenario>')
def getreports2(Scenario):
        global listTest
        global DataVector
        global k
        DataReceive=DataVector[k]
        tester=str(k)+"tester"
        test=DataReceive[tester]
        urlresult=listTest[test]+"/gatling/"+Scenario+"/reports"
        r=requests.get(urlresult)
        js=json.loads((r.content))
        tabjs=js['reports']
        index=len(tabjs)-1
        return "Last Reports"+tabjs[0]

@app.route('/getresult/matrix/<Scenario>')
def getresults(Scenario):
	global listTest
        global DataVector
	global i
	global ReturnData
	DataReceive=Data[i]
	tester=str(i)+"tester"
	test=DataReceive[tester]
	del Data[i]
	i-=1
	scenario_content=Scenario.split('.')
	scenario=scenario_content[1]
	for m in range(0,40):
		url=listTest[test]+"/gatling/"+Scenario
		res=requests.get(url)
		jst=json.loads(res.content)
		jstab=jst['status']
		ReturnData=jsbtab
		if jstab=="stopped":
			urlresult=listTest[test]+"/gatling/"+scenario+"/reports"
			r=requests.get(urlresult)
			js=json.loads((r.content))
			tabjs=js['reports']
			index=len(tabjs)-1
			Name=tabjs[0]
			urlget=listTest[test]+"/gatling/"+scenario+"/reports/"+Name
			requests.get(urlget)
		        urlgets=listTest[test]+"/gatling/downloads/"+Name
			rest=requests.get(urlgets)	
			re=requests.get(urlget)
 			ReturnData=str(re.content)
			break
		time.sleep(2)
	return ReturnData
@app.route('/getresult/vector/<Scenario>')
def getresults2(Scenario):
        global listTest
        global DataVector
        global k
        DataReceive=DataVector[k]
        tester=str(k)+"tester"
        test=DataReceive[tester]
        del DataVector[k]
        k-=1
        scenario_content=Scenario.split('.')
        scenario=scenario_content[1]
        for l in range(0,40):
                url=listTest[test]+"/gatling/"+Scenario
                res=requests.get(url)
                jst=json.loads(res.content)
                jstab=jst['status']
                if jstab=="stopped":
                        urlresult=listTest[test]+"/gatling/"+scenario+"/reports"
                        r=requests.get(urlresult)
                        js=json.loads((r.content))
                        tabjs=js['reports']
                        index=len(tabjs)-1
                        Name=tabjs[0]
                        urlget=listTest[test]+"/gatling/"+scenario+"/reports/"+Name
                        requests.get(urlget)
                        urlgets=listTest[test]+"/gatling/downloads/"+Name
                        rest=requests.get(urlgets)
                        re=requests.get(urlget)

                        break
                time.sleep(2)
        return str(re.content)

if __name__ == "__main__":
	app.run(debug=True, host= '0.0.0.0')
