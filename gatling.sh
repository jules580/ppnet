#!/bin/bash
#echo "this is a script"
#sh /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/bin/gatling.sh -s $1
a=0
d=4
for i in `seq 1 2`;
do
echo "this is a script $a"
sh /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/bin/gatling.sh -s $1 > gatling.txt

test=$(grep -i WARN gatling.txt)

count=$(grep -o WARN gatling.txt| wc -l)

if [ "$count" -ne "$d" ]
then 
echo "NOK"
echo $test
echo $count
else
echo "OK t"
fi

echo $test
sudo rm -f gatling.txt
echo "this is an other script $a"
sh /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/bin/gatling.sh -s $2 >gatling2.txt

test=$(grep -i WARN gatling2.txt) 
count=$(grep -o WARN gatling2.txt| wc -l)
if [ "$count" -ne "$d" ]
then
echo " NOK "
echo $test
echo $count
else 
echo "OK tr"
fi
#sudo rm -f gatling2.txt
let "a=a+1"
done
#sudo rm -f gatling.txt

