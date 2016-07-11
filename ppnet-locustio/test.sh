#!/bin/sh
scp $1 tai@192.168.2.77:~/ 
scp $1 tai@192.168.2.76:~/ 
xterm -e 'ssh 192.168.2.77 locust -f '$1' --master --host=http://192.168.2.77:30000; bash' &
sleep 10
xterm -e 'ssh 172.17.0.1 locust -f '$1' --slave --master-host=192.168.2.77 --host=http://192.168.2.77:30000; bash'&
sleep 10
xterm -e 'ssh 192.168.2.76 locust -f '$1' --slave --master-host=192.168.2.77 --host=http://192.168.2.77:30000'
