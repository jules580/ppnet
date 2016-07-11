from locust import HttpLocust, TaskSet, task 
from random import *    
import requests
import re

class MyTaskSet(TaskSet):     
   
 
    @task(1)
    def about(self):
        test="/#/login"
        #reponse=self.client.put("/test"+str(random()))
        url= "http://localhost:8006/#login"
        payload= {"_recherche_recherchertype[Username]:'test'"}
        s= requests.Session()
        rget= s.get(url)
        token  = re.search("name=\"_recherche_recherchertype\[\_token\]\" value=\" ([a-z0-9]{40})\"", rget.text).group(1)
        payload["_recherche_recherchertype[_token]"]= token
	reponse = self.post(url, data=payload)
	print "Reponse status code", reponse.status_code
	print "Reponse content:", reponse.content
class MyLocust(HttpLocust):
    
    task_set = MyTaskSet
    min_wait = 5000
    max_wait = 15000
  
