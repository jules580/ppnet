from flask import Flask, request
import json
import requests
app = Flask(__name__)
i=0
Data=["test"]
tester=""  
Send=False
testreceive=""
@app.route("/launchtest")
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
    return "You said: "+str(i) 
   #r=requests.get('http://localhost:8888/MAMP/?language=French')
   #return str(r.content)
@app.route('/test/conf/<testerId>')
def run(testerId):
  k=0
  global Data
  global tester
  global i
  global Send
  global testreceive
  for j in range(i,0,-1):	

 	Receive_data=Data[j]
 	tester=str(j)+"tester" 
	url=str(j)+"url"
	scenario=str(j)+"scenario"
  	Tester=Receive_data[tester]
        #if tester==testerId:

	 #   k+=1
 	if testerId==Tester and Send==False:
		k+=1
  		testnum=Receive_data
		Url=Receive_data[url]
  		Scenario=Receive_data[scenario]
		testreceive={"url": Url, "scenario": Scenario, "tester": Tester}
		del Data[j]
		i-=1
                Send=True
  JsonData=json.dumps(testreceive,sort_keys=True, indent=4)
  Send=False
  return JsonData


