import os
import time
import json
import requests
import sys
from celery import Celery

env=os.environ
CELERY_BROKER_URL=env.get('CELERY_BROKER_URL','redis://localhost:6379'),
CELERY_RESULT_BACKEND=env.get('CELERY_RESULT_BACKEND','redis://localhost:6379')
indexnum=0

celery= Celery('tasks',
                broker=CELERY_BROKER_URL,
                backend=CELERY_RESULT_BACKEND)


@celery.task(name='mytasks.add')
def add(x, y):
    time.sleep(5) # lets sleep for a while before doing the gigantic addition task!
    return x + y
    
@celery.task(name='mytask.get')
def get(Scenario):
	global indexnum
	global index
	scenario_content=Scenario.split('.')
	scenario=scenario_content[1]
	#global Datacontent
	#time.sleep(30)
	for l in range(0,40):
		url="http://192.168.2.76:7070/gatling/"+Scenario
		res=requests.get(url)
		jst=json.loads(res.content)
		jstab=jst['status']
		Datacontent=jst['status']
		time.sleep(4)
		if jstab=="stopped":
			urlresult="http://192.168.2.76:7070/gatling/"+scenario+"/reports"
			r=requests.get(urlresult)
			js=json.loads((r.content))
			tabjs=js['reports']
			if indexnum==3:
				index=len(tabjs)-1
			else:
				index=0
			indexnum+=1
			Name=tabjs[index]
			urlget="http://192.168.2.76:7070/gatling/"+scenario+"/reports/"+Name
			requests.get(urlget)
			urlgets="http://192.168.2.76:7070/gatling/downloads"+Name
			requests.get(urlgets)
			re=requests.get(urlget)
			return str(re.content)
			sys.exit(0)
		#	Datacontent=str(re.content)
			#break
	return "WAIT"
	#Datacontent
