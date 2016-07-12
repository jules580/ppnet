#!/bin/bash
#echo "this is a script"
#sh /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/bin/gatling.sh -s $1
a=0
d=4
#for i in `seq 1 2`;
#do
echo $1> gatling.txt
infos=$(cut -d'.' -f2 gatling.txt)
scal=".scala"
sed -re 's/test/coucou' $1$scala
echo $infos
index="*"
echo "this is a script $a"
sh /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/bin/gatling.sh -s $1 -on $3  -rf /home/tai/test-gatling > gatling.txt
cd $3$index
 cp simulation.log /home/tai/test-gatling
cd ..
#more simulation.log

awk -F " " '{ print $5,"="$8}' simulation.log
test=$(grep -i WARN gatling.txt)

counter=$(grep -o WARN gatling.txt| wc -l)
grep -i 'request count' gatling.txt > test8.txt
awk -F " " '{print $2,$3," = "$4}' test8.txt
grep -i time gatling.txt > test9.txt
grep -i '> m' test9.txt> test10.txt
awk -F " " '{print $2,$3," = "$5}' test10.txt
grep -i 'percentile' test9.txt > test11.txt
awk -F " " '{print $2,$3,$4,$5" = "$6}' test11.txt

if [ "$counter" -ne "$d" ]
then 
echo "NOK"
#echo $test
echo $counter
echo $awk>test.txt
echo $test
else
echo "OK t"
fi


sudo rm -f gatling.txt
echo "this is an other script $a"
sh /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/bin/gatling.sh -s $2  >gatling2.txt


test=$(grep -i WARN gatling2.txt) 
counter=$(grep -o WARN gatling2.txt| wc -l)
if [ "$counter" -ne "$d" ]
then
echo " NOK "
echo $test
echo $counter
else 
echo "OK tr"
fi
#sudo rm -f gatling2.txt
let "a=a+1"
#done
#sudo rm -f gatling.txt

