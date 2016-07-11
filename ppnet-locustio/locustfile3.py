from locust import HttpLocust, TaskSet, task 
from random import *    
        
def about(self):
	test="/_session"
        #reponse=self.client.put("/test"+str(random()))
	reponse = self.client.post(test, {"username":"root", "password":"root"})
	print "Reponse status code", reponse.status_code
	print "Reponse content:", reponse.content
    
def index(self):    
	with self.client.get("/", catch_response=True) as reponse:
		print "Reponse content:", reponse.content
       		if reponse.content != "Sucess":
			reponse.failure("Got wrong reponse")	
class MyTaskSet(TaskSet):
	tasks = {about: 1, index: 3}
class MyLocust(HttpLocust):
    
    task_set = MyTaskSet
    min_wait = 5000
    max_wait = 15000
  
