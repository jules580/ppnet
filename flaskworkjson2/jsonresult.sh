#!/bin/bash
echo '{ "data":[' >result.txt

awk -F " " '{ if($1!="USER" && $1!="ASSERTION" && $1!="RUN")
if($8!="KO")
if ($7="OK")
print "{\"request\":\""$4"_"$5"\",\"user_id\":\""$3"\",\"status\":\""$7"\"}," 
else if ($8="OK")
print "{\"request\":\""$4"_"$5"\",\"user_id\":\""$3"\",\"status\":\""$8"\"}," 
else
print "{\"request\":\""$4"_"$5"\",\"user_id\":\""$3"\",\"status\":\""$9"\"}," 
else
print "{\"request\":\""$4"\",\"user_id\":\""$3"\",\"details\":\""$9"_"$10"_"$11"_"$12"_"$13"\"},"
}' simulation.log >> result.txt

z=$(cat result.txt)
echo "${z%?}"> result.txt
echo "],">> result.txt



test=$(grep -i WARN gatling.txt)

counter=$(grep -o WARN gatling.txt| wc -l)
grep -i 'request count' gatling.txt > test8.txt
awk -F " " '{print "\""$2"_"$3"\""":"$4","}' test8.txt>> result.txt

echo '"time":[' >>result.txt
grep -i ' t ' gatling.txt > test12.txt
awk -F " " '{if($2!="800")
print "{\"tinf\":0,\"tsup\":"$4/1000",\"nb\":" $6"},"
else
print "{\"tinf\":"$2/1000",\"tsup\":"$7/1000",\"nb\":" $9"},"}'  test12.txt >> result.txt

z=$(cat result.txt)
echo "${z%?}" > result.txt
echo "]," >> result.txt
grep -i time gatling.txt > test9.txt
grep -i '> m' test9.txt> test10.txt
awk -F " " '{print "\""$2"_"$3"\":"$5","}' test10.txt>> result.txt
grep -i 'percentile' test9.txt > test11.txt
awk -F " " '{print "\""$2"_"$3"_"$4"_"$5"\":"$6","}' test11.txt >> result.txt
echo '"stats": ['>> result.txt
grep -i 'Global:' gatling.txt| sed '/^ *Global/s/://' > test13.txt
awk -F " " '{ print "{\"type\":\""$1"\",\"stat\":\""$2"_"$3"_"$4"_"$5"_"$6"_"$7"_"$8"\",\"param\":"$9",\"status\":\""$11"\"},"}' test13.txt >> result.txt
grep -i 'For' gatling.txt | sed '1d' | sed '/^ *For all requests/s/://' > test14.txt
awk -F " " '{print "{\"type\":\""$1"_"$2"_"$3"\",\"stat\":\""$4"_"$5"_"$6"_"$7"_"$8"_"$9"_"$10"\",""\"param\":"$11",\"status\":\""$13"\"},"}' test14.txt >> result.txt
z2=$( cat result.txt)
echo "${z2%?}" > result.txt
echo "]" >> result.txt
echo '"info":  [' >> result.txt
sudo grep -i WARN gatling.txt > test70.txt
sudo sed "s/'/ /g" test70.txt > test71.txt
 sudo sed 's/:/ /g' test71.txt > test72.txt
cat test72.txt | sed '1d'> test73.txt

awk -F " " '{ if($11="failed") 
	print "{\""$8"\":\""$9"_"$10"\",status:\""$11"\",\"details\":\""$12"_"$13"_"$14"_"$15"_"$16"_"$17"_"$18"\"},"
	else if($10="failed")
	print "{\""$8"\":\""$9"\",status:\""$10"\",\"details\":\""$11"_"$12"_"$13"_"$14"_"$15"_"$16"_"$17"\"},"
	else 
	print "{\""$8"\":\""$9"_"$10"_"$11"\",status:\""$12"\",\"details\":\""$13"_"$14"_"$15"_"$16"_"$17"_"$18"_"$19"\"},"
	}' test73.txt>>result.txt
z3=$(cat result.txt)
echo "${z3%?}" > result.txt
echo "]" >> result.txt
d=0
rm -f test9.txt
rm -f test10.txt
rm -f test11.txt
rm -f test12.txt
rm -f test13.txt
rm -f test14.txt
rm -f test8.txt
rm -f test70.txt
rm -f test71.txt
rm -f test72.txt
rm -f test73.txt

sed '/io.gatling.http.resolver/d' result.txt> result2.txt
rm -f result.txt
cp -f result2.txt result.txt
cat result.txt
if [ "$counter" -ne "$d" ]
then
echo "NOK"
else
echo "OK"
fi
