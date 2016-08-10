import json
import requests
url="http://0.0.0.0:7676/test.json"
r=requests.get(url)
js=json.loads((r.content))
tabjs=js['report']
Time_id=0
for i in range(0,index):
	Data=tabjs[i]
	Data_time=Data.split('-')
	time_id=Data_time[1]
	if time_id>Time_id:
		Time_id=Time_id
		Data_last=tabjs[i]
