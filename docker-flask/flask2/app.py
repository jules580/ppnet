
from flask import Flask, request
import json
import requests
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
    return "You said: "+str(i) 
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

    testnumvector={ url: content[0], scenario: content[1], tester: content[2], matrix: content[3]}
    index=k
    DataVector.append(testnumvector)
    Receive_data_vector=DataVector[index]
    URL=Receive_data_vector[url]
    #r=requests.get("url")
    return "You said: "+str(k) 
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

if __name__ == "__main__":
	app.run(debug=True, host= '0.0.0.0')
