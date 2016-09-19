import os
import time
import json
import requests
import sys
import zipfile
import io
import subprocess
from celery import Celery

#listTest={"USA": "http://192.168.2.76:7070","France":"http://104.198.192.108:7070" } 
env=os.environ
CELERY_BROKER_URL=env.get('CELERY_BROKER_URL','redis://localhost:6379'),
CELERY_RESULT_BACKEND=env.get('CELERY_RESULT_BACKEND','redis://localhost:6379')
indexnum=0
index=0
Name=""

Nb_request=0
celery= Celery('tasks',
                broker=CELERY_BROKER_URL,
                backend=CELERY_RESULT_BACKEND)


@celery.task(name='mytasks.add')
def add(x, y):
    time.sleep(5) # lets sleep for a while before doing the gigantic addition task!
    return x + y
    
@celery.task(name='mytask.get')
def get(Scenario,SourceName,param2):
	global indexnum
	global index
	global Name
	global Nb_request
	scenario_content=Scenario.split('.')
	scenario=scenario_content[2]
	#global Datacontent
	with open("data.json") as json_file:
		listTest=json.load(json_file)
	time.sleep(80)
	for l in range(0,40):
		url=listTest[SourceName]+"/gatling/"+Scenario
		res=requests.get(url)
		jst=json.loads(res.content)
		jstab=jst['status']
		Datacontent=jst['status']
		if jstab=="stopped":
			urlresult=listTest[SourceName]+"/gatling/"+scenario+"/reports"
			r=requests.get(urlresult)
			js=json.loads((r.content))
			tabjs=js['reports']
			Time_id=0
			index=len(tabjs)
			diff=index-param2
			#diff=0
			for j in range(0,diff):
				for i in range(0,index):
					Data=tabjs[i]
					Data_time=Data.split('-')
					time_id=Data_time[1]
					if time_id>Time_id:
						Time_id=time_id
						Name=tabjs[i]
				tabjs.remove(Name)
			Time_id=0
			for i in range(0,index-diff):
				Data=tabjs[i]
				Data_time=Data.split('-')
				time_id=Data_time[1]
				if time_id>Time_id:
					Time_id=time_id
					Name=tabjs[i]
			urlget=listTest[SourceName]+"/gatling/"+scenario+"/reports/"+Name
			requests.get(urlget)
			urlanalyse=listTest[SourceName]+"/analyse/"+Name
			reanalyse=requests.get(urlanalyse)
			requests.get(urlget)
			urlgets=listTest[SourceName]+"/gatling/downloads/"+Name
			requests.get(urlgets)
			re=requests.get(urlget)
			z = zipfile.ZipFile(io.BytesIO(re.content))
			z.extractall()
			return str(urlget)
			
			sys.exit(0)
		#	Datacontent=str(re.content)
			#break
	return "WAIT"
	#Datacontent
