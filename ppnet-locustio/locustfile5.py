from locust import  Locust,TaskSet, task
class ForumPage(TaskSet):
    @task(20)
    def read_thread(self):
        print "execute task"

    @task(1)
    def new_thread(self):
        print "execute second task"

    @task(5)
    def stop(self):
        self.interrupt()

class MyTaskSet(TaskSet):
    tasks = {ForumPage:10}

    @task
    def index(self):
       print "Locust instance (%r) executing my_task" % (self.locust)
class MyLocust(Locust):
	task_set= MyTaskSet
