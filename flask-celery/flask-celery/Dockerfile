FROM ubuntu:14.04


RUN apt-get update -y
RUN apt-get install -y python-pip python-dev
RUN pip install --upgrade setuptools
RUN apt-get install -y wget
RUN wget https://pypi.python.org/packages/83/84/b3b81fa11b54f3cdc141e22f1cc27dc68f7698eead0e4494f2fa23ae5073/pytz-2015.7-py3.5.egg
RUN easy_install pytz-2015.7-py3.5.egg
ENV CELERY_BROKER_URL redis://redis:6379/0
ENV CELERY_RESULT_BACKEND redis://redis:6379/0
ENV C_FORCE_ROOT true


# copy source code
COPY . /flask-celery
WORKDIR /flask-celery

# install requirements
RUN pip install -r requirements.txt


# run the worker
#ENTRYPOINT ['celery']
#CMD ['-A','tasks', 'worker','--loglevel=info']
ENTRYPOINT celery -A tasks worker --loglevel=info
