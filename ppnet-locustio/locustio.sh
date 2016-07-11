#!/bin/sh
scp $1 tai@$2:~/ 
scp $1 tai@$3:~/ 
ssh $2 "sudo apt-get install python-pip python-dev build-essential; sudo pip install --upgrade pip; sudo pip install --upgrade virtualenv; sudo pip install locustio"
ssh $3 "sudo apt-get install python-pip python-dev build-essential; sudo pip install --upgrade pip; sudo pip install --upgrade virtualenv; sudo pip install --upgrade locustio"

xterm -e 'ssh '$2' locust -f '$1' --master --host='$5'; bash' &
sleep 10
xterm -e 'ssh '$3' locust -f '$1' --slave --master-host='$2' --host='$5'; bash'&
sleep 10
xterm -e 'ssh '$4' locust -f '$1' --slave --master-host='$2' --host='$5'; bash' &
