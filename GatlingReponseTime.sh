
#!/bin/sh
a=0
(sh /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/bin/gatling.sh -s $1 -on $3) &

(sh /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/bin/gatling.sh -s $2 -on $3$a) &
index=*
cd /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/results/$3$index

enter=$(awk -F" " '{ if($1!="USER" && $1!="ASSERTION" && $1!="RUN" && $4=="Send") print $6}' simulation.log)



cd /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/results/$3$a$index

final=$(awk -F" " '{ if($1!="USER" && $1!="ASSERTION" && $1!="RUN" && $4=="Receive") print $6}' simulation.log)

value="Init value: "
echo $value$enter
valu="Final value: "
echo $valu$final

time= " ms"

Latence="Latency: "
var=$final-$enter
echo $Latence$var$time




