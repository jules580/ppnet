import time
import json
import requests
import sys

if sys.argv[1]=="vector":
	Task={"scenario":sys.argv[2],"tester":sys.argv[3],"url":sys.argv[4],"matrix":sys.argv[5]}
	r=requests.post('http://192.168.2.77:5000/launchtest/vector',data=json.dumps(Task,sort_keys=True,indent=4))
	print "Send request:"+r.content
	js=json.loads(r.content)
	Uid=js['request_id']
	time.sleep(5)
	re=requests.get("http://192.168.2.77:5000/checkstatus/vector/"+Uid)
	print "Getstatus"+re.content
	time.sleep(5)
	res=requests.get("http://192.168.2.77:5000/getreports/vector/"+Uid)
	print "List Reports:"+res.content
	time.sleep(5)
	resa=requests.get("http://192.168.2.77:5000/requestResult/vector/"+Uid)
	js2=json.loads(resa.content)
	print "Request Id"+resa.content
	request_id=js2['request_id']
	resal=requests.get("http://192.168.2.77:5000/getresult/vector/"+request_id)
	print "Result:"+resal.content
	time.sleep(98)
	resal2=requests.get("http://192.168.2.77:5000/getresult/vector/"+request_id)
	print "Result:"+resal2.content
    
	
elif sys.argv[1]=="matrix":
	Task={"scenario":sys.argv[2],"tester":sys.argv[3], "url":sys.argv[4]}
	#r=requests.post('http://192.168.2.77:5000/launchtest/matrix',data='{"scenario":"test5.RecordedSimulateloginFalse2","tester":"test","url":"http://192.168.2.77:8008"}')
	r=requests.post('http://192.168.2.77:5000/launchtest/matrix',data=json.dumps(Task,sort_keys=True,indent=4))
	print "Send request:"+r.content
	js=json.loads(r.content)
	Uid=js['request_id']
	time.sleep(5)
	re=requests.get("http://192.168.2.77:5000/checkstatus/matrix/"+Uid)
	print "Getstatus:"+re.content
	time.sleep(5)
	res=requests.get( "http://192.168.2.77:5000/getreports/matrix/"+Uid)
	print "List Reports:"+res.content
	time.sleep(5)
	resa=requests.get("http://192.168.2.77:5000/requestResult/matrix/"+Uid)
	js2=json.loads(resa.content)
	print "Request Id:"+resa.content
	request_id=js['request_id']
	resal=requests.get("http://192.168.2.77:5000/getresult/matrix/"+Uid)
	print "Result:"+resal.content
	time.sleep(98)
	resal2=requests.get("http://192.168.2.77:5000/getresult/matrix/"+Uid)
	print "Result"+resal2.content
else:
	print "Nothing"	
