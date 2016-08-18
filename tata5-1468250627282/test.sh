sudo echo '{ "data":[' >result.txt

awk -F " " '{ if($1!="USER" && $1!="ASSERTION" && $1!="RUN")
if($8!="KO")
print "{request:"$4"_"$5",user_id:"$3",status:"$8"}" 
else
print "{request:"$4",user_id:"$3",details:"$9"_"$10"_"$11"_"$12"_"$13"}"
}' simulation.log >> result.txt
