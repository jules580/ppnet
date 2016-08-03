
from flask import Flask, request
import json
import requests
import time
app = Flask(__name__)
i=0
k=0
Data=["test"]
DataVector=["test"]
Send=False
SendVector=True
testreceive=""
testreceivevector=""
@app.route("/launchtest/matrix")
def echo(): 
    data=request.args.get('content','')
    content=data.split(',')
    scenario=content[1]
    global i
    global Data
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
    r=requests.get("http://192.168.2.76:7070/gatling/"+content[1]+"/start")     
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
    k+=1
   # content.append(str(i))
    url= str(k)+"url"
    scenario= str(k)+"scenario"
    tester= str(k)+"tester"
    matrix=str(k)+"matrix"
     #test= { name : content[0], name2: content[1], name3: content[2]}

    testnumvector={ url: content[0], scenario: content[1], tester: content[2], m
atrix: content[3]}
    index=k
    DataVector.append(testnumvector)
    Receive_data_vector=DataVector[index]
    URL=Receive_data_vector[url]
    r=requests.get("http://192.168.2.76:7070/gatling/"+content[1]+"/start")
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
 		del DataVector[j]
 		k-=1
                
  
  SendVector=False
  return testreceivevector

@app.route('/checkstatus/<Scenario>')
def check(Scenario):
        urlsend="http://192.168.2.76:7070/gatling/"+Scenario
        r=requests.get(urlsend)
        #return "hello"+Scenario
	js= json.loads((r.content))
	return "Scenario"+Scenario+" is "+js['status']

@app.route('/getreports/<Scenario>')
def getreports(Scenario):
        urlresult="http://192.168.2.76:7070/gatling/"+Scenario+"/reports"
	r=requests.get(urlresult)
	js=json.loads((r.content))
	tabjs=js['reports']
	index=len(tabjs)-1
	return "Last Reports"+tabjs[0]


@app.route('/getresult/<Scenario>')
def getresults(Scenario):
	scenario_content=Scenario.split('.')
	scenario=scenario_content[1]
	for i in range(0,40):
		url="http://192.168.2.76:7070/gatling/"+Scenario
		res=requests.get(url)
		jst=json.loads(res.content)
		jstab=jst['status']
		if jstab=="stopped":
			urlresult="http://192.168.2.76:7070/gatling/"+scenario+"
/reports"
			r=requests.get(urlresult)
			js=json.loads((r.content))
			tabjs=js['reports']
			index=len(tabjs)-1
			Name=tabjs[0]
			urlget="http://192.168.2.76:7070/gatling/"+scenario+"/re
ports/"+Name
			requests.get(urlget)
			urlgets="http://192.168.2.76:7070/gatling/downloads/"+Na
me
			rest=requests.get(urlgets)	
			re=requests.get(urlget)
 			
			break
		time.sleep(2)
	return str(re.content)

if __name__ == "__main__":
	app.run(debug=True, host= '0.0.0.0')
