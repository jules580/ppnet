#!/bin/bash
#echo "this is a script"
#sh /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/bin/gatling.sh -s $1
a=0
d=4
c=1
e=3
f=6
g=10
h=12

echo -n "URL: "
read URL
echo -n "nb RampUser: "
read RampUser
echo -n "Time of TimeRampUser: "
read Time
echo -n "Global time stats: "
read GlobalTime
echo -n "FailedRequest count stats: "
read FailedRequestCount
for i in `seq 1 3`;
do
for j in $*;
do
echo $1> gatling.txt
infos=$(cut -d'.' -f2 gatling.txt)
scala=".scala"
NbArguments=$#
DernierArgument=${!NbArguments}
info="/home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/user-files/simulations/default4/"$infos
echo $info > gatling2.txt


infos3=$(cut -d 'y' -f1 gatling2.txt)
sed -re 's/coucou/'$(echo $URL)'/g' $info$scala> $infos3$d$scala
sed -re 's/10101010/'$(echo $RampUser)'/g' $infos3$d$scala > $infos3$h$scala
sed -re 's/11111111/'$(echo $Time)'/g' $infos3$h$scala> $infos3$e$scala
sed -re 's/10111011/'$(echo $GlobalTime)'/g' $infos3$e$scala> $infos3$f$scala
sed -re 's/10111110/'$(echo $FailedRequestCount)'/g' $infos3$f$scala > $infos3$g$scala
sed -re 's/RecordedSimulateloginFalsey/RecordedSimulateloginFalse/g' $infos3$g$scala > $infos3$scala


 rm -f $infos3$h$scala
 rm -f $infos3$d$scala
rm -f $infos3$e$scala
rm -f $infos3$f$scala
rm -f $infos3$g$scala
sudo chmod 777 $infos3$scala

echo $infos
index="*"
util=$(cut -d'y' -f1 gatling.txt)
echo "this is a script $a"
sh /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/bin/gatling.sh -s $util -on  $DernierArgument$a  -rf /home/tai/test-gatling > gatling.txt
cd $DernierArgument$a$index
 cp simulation.log /home/tai/test-gatling
cd ..
#more simulation.log


#awk -F " " '{ print $5,"="$8}' simulation.log
awk -F " " '{ if($1!="USER" && $1!="ASSERTION" && $1!="RUN")
if($8!="KO")
print $4 $5" User"$3," = "$8
else
print $4 " User"$3," = " $9" "$10" "$11" "$12" "$13
}' simulation.log
test=$(grep -i WARN gatling.txt)

counter=$(grep -o WARN gatling.txt| wc -l)
grep -i 'request count' gatling.txt > test8.txt
awk -F " " '{print $2,$3," = "$4}' test8.txt
grep -i ' t ' gatling.txt > test12.txt
awk -F " " '{if($2!="800")
print $2,$3,$4,$5" = " $6
else
print $2,$3,$4,$5,$6,$7,$8 " = " $9}'  test12.txt
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
let "a=a+1"

sudo rm -f gatling.txt
#echo "this is an other script $a"
#sh /home/tai/Bureau/gatling-charts-highcharts-bundle-2.2.2/bin/gatling.sh -s $2$d  >gatling2.txt


#test=$(grep -i WARN gatling2.txt) 
#counter=$(grep -o WARN gatling2.txt| wc -l)
#if [ "$counter" -ne "$d" ]
#then
#echo " NOK "
#echo $test
#echo $counter
#else 
#echo "OK tr"
#fi

#sudo rm -f gatling2.txt

done
done
#sudo rm -f gatling.txt




