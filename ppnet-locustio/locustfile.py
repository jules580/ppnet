from locust import HttpLocust, TaskSet, task 
from random import *    
class MyTaskSet(TaskSet):     
   
 
    @task(1)
    def about(self):
        test="/_session"
        #reponse=self.client.put("/test"+str(random()))
	reponse = self.client.post(test, {"username":"root", "password":"root"})
	print "Reponse status code", reponse.status_code
	print "Reponse content:", reponse.content
        print "Reponse apparent encoding", reponse.apparent_encoding
	print "Reponse cookies", reponse.cookies
	print "Reponse elapsed", reponse.elapsed
	print "Reponse encoding", reponse.encoding
	print "Reponse headers", reponse.headers
	print "Reponse history", reponse.history
	print "Reponse is_permanent_redirect", reponse.is_permanent_redirect
	print "Reponse is_redirect", reponse.is_redirect
	print "reponse json", reponse.json
	print "Reponse raise for status", reponse.raise_for_status()
	print "Reponse raw", reponse.raw
        print "Reponse reason", reponse.reason
	print "Reponse status_code", reponse.status_code
	print "Reponse test", reponse.text
	print "Reponse url", reponse.url

class MyLocust(HttpLocust):
    
    task_set = MyTaskSet
    min_wait = 5000
    max_wait = 15000
  
