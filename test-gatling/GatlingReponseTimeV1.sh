
#!/bin/sh
a=0
b=0
c=1
echo -n " Directory:"
read Direct

for counter in $*
do

(xterm -e sh /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/bin/gatling.sh -s $counter -on $Direct$a )&

#(sh /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/bin/gatling.sh -s $2 -on $3$a) 
let "a=a+1"
done
wait
index=*
cd /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/results/$Direct$b$index

enter=$(awk -F" " '{ if($1!="USER" && $1!="ASSERTION" && $1!="RUN" && $5=="send") print $6}' simulation.log)

StartValue=$(awk -F" " '{ if($4=="Typing" && $5=="ok") print $7}' simulation.log)
echo $StartValue



cd /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/results/$Direct$c$index

final=$(awk -F" " '{ if($1!="USER" && $1!="ASSERTION" && $1!="RUN" && $4=="Receive") print $7}' simulation.log)

FinalValue=$(awk -F" " '{ if($4=="Typing") print $6}' simulation.log)
echo $FinalValue

value="Init value: "
echo $value$enter
valu="Final value: "
echo $valu$final



Latence="Latency: "
let "diff=FinalValue-StartValue"
let "var=final-enter-diff"

times=$var
echo $Latence$times




