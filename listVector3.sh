#!/bin/bash

declare test 
test["testre"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0cmVzOm1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2OTAwNzk0MDE0OQowMDJmc2lnbmF0dXJlIGRUE9vAYQhJCFwcIjajtpnnAIZIE4Gg2KR7SbMhPMvJCg";
test["test456"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU2Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2ODkzMDYzMTEzMgowMDJmc2lnbmF0dXJlIM43c91RBwkw_4i8PvwfN1wkjoPIEuR2oTWybK69ElVeCg";
test["test01"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTI5NzQ4MjYyCjAwMmZzaWduYXR1cmUg0sPxMBzITAj1Pw3yGtx1d6n-O67Jpb8uHVj646KXMM0K";
#test["test02"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDI6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTI5Nzg0ODM5CjAwMmZzaWduYXR1cmUgZEMWcnatOW_bwbkiDilxyaU7-bJhy5TdbzCO1z8eXYEK";
test["test03"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDM6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTI5ODE0MTYzCjAwMmZzaWduYXR1cmUgqPsvxSrw-jCqaiXImqTX8g2asmXOe5DVyvVJdMAf2soK";
#test["test04"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwMjY0MzE2CjAwMmZzaWduYXR1cmUgZBnl_2RpIakkSyEDPAKNMNQUMwXYWLGDCc26rMeav-0K";
#test["test05"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwMjk5NDIwCjAwMmZzaWduYXR1cmUgzjLnBmOvshmzeDYGiZs0R-kfAIb-RyXEvmTu2Oa6n3MK";
#test["test06"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDY6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwMzQyMzAwCjAwMmZzaWduYXR1cmUgH-cjuDELh7tD4YBU5OYaFSpTHBajbIsIsqYZ_jqeP_kK";
#test["test07"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDc6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwMzcwMjc1CjAwMmZzaWduYXR1cmUgp8CIqtPJjx82VCsIdnZrHD2GRIzZUWhzupDNXRauEiUK";
#test["test09"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNDEwMjY5CjAwMmZzaWduYXR1cmUg_P5uXRLeJ91wBTAk79dXvxoNYmrngRA1iUv1pUc27oAK";
#test["test10"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTA6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNDMyMjQ5CjAwMmZzaWduYXR1cmUgUsfUN-9Q5OB31_58292jc1DJj2RC24YrcqCqNOFBzxMK";
#test["test11"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNDc3MjI1CjAwMmZzaWduYXR1cmUg_e8WcwpDXykwFA71Qhb0mzU91sB9I8ZeJ9l5rpFDgsMK";
#test["test12"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTI6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNDk3MTMyCjAwMmZzaWduYXR1cmUglbuUwp6dZ7qQVP8LNMZGmEu_pVkz06exu123NlArMaIK";
#test["test13"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTM6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNTMyOTY3CjAwMmZzaWduYXR1cmUgkn46kEJca4Kt6NGu4PQlD6x5rOcW2kJ6Mj0es4utG64K"; 
#test["test14"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNTU1ODk4CjAwMmZzaWduYXR1cmUgVZg36iVtkyfIxbB4zxT64ot-fpTH6U6bSeH3QDCryX8K"; 
#test["test15"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNTgzNzc3CjAwMmZzaWduYXR1cmUgWIKnsAE41T-4ouqvZWUwRY3Tes3oXt7qHAirgcLGPaUK";
test["testres"]="http://0.0.0.0:3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0cmVzOm1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2OTAwNzk0MDE0OQowMDJmc2lnbmF0dXJlIGRUE9vAYQhJCFwcIjajtpnnAIZIE4Gg2KR7SbMhPMvJCg";
declare tokens
tokens["testre"]="MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0cmVzOm1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2OTAwNzk0MDE0OQowMDJmc2lnbmF0dXJlIGRUE9vAYQhJCFwcIjajtpnnAIZIE4Gg2KR7SbMhPMvJCg";
tokens["test456"]="MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU2Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2ODkzMDYzMTEzMgowMDJmc2lnbmF0dXJlIM43c91RBwkw_4i8PvwfN1wkjoPIEuR2oTWybK69ElVeCg";
tokens["test01"]="MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTI5NzQ4MjYyCjAwMmZzaWduYXR1cmUg0sPxMBzITAj1Pw3yGtx1d6n-O67Jpb8uHVj646KXMM0K";
tokens["test03"]="MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDM6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTI5ODE0MTYzCjAwMmZzaWduYXR1cmUgqPsvxSrw-jCqaiXImqTX8g2asmXOe5DVyvVJdMAf2soK";
tokens["testres"]="MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0cmVzOm1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2OTAwNzk0MDE0OQowMDJmc2lnbmF0dXJlIGRUE9vAYQhJCFwcIjajtpnnAIZIE4Gg2KR7SbMhPMvJCg";
#sudo curl -s echo "${test["$1"]}" > test.txt
# tr -d '  \n' <test.txt >test2.txt
i=89
init=1
count=$(grep -o invite_state test2.txt | wc -l
 )

#for j in {$init..$count}
#do

#INVITE
cut -d',' -f$i test2.txt > test05.json
cut -d'{' -f3 test05.json > test051.json
cut -d':' -f1 test051.json > test06.json
tokens=$(echo "${tokens["$1"]}")
seda=$(sed 's/"!/!/g' test06.json)
echo $1,$1,$seda,$tokens >> test07.csv
let "i=i+20" 

rm -f test05.json
rm -f test051.json
rm -f test06.json
let "count=count-1"
#No invite
for ((j=0;j<count;j++))
do
cut -d',' -f$i test2.txt > test05.json
#cut -d'{' -f3 test05.json > test051.json
cut -d':' -f1 test05.json > test06.json
seda=$(sed 's/"!/!/g' test06.json) 
tokens=$(echo "${tokens["$1"]}")
echo $1,$1,$tokens,$seda >>test07.csv 
let "i=i+20" 
rm -f test05.json
rm -f test06.json
done
#done


#JOIN
cut -d',' -f$i test2.txt > test05.json
cut -d'{' -f2 test05.json> test051.json
cut -d':' -f1 test051.json > test06.json
seda=$(sed 's/"!/!/g' test06.json)
tokens=$(echo "${tokens["$1"]}")
echo $1,$1,$seda,$tokens >>test07.csv 
rm -f test05.json
rm -f test06.json
rm -f test051.json
#cut -d',' -f$i $1 > test05.json
#cut -d':' -f2 test05.json > test06.json
#sed 's/"!/!/g' test06.json >> test07.json
#rm -f test05.json
#rm -f test06.json


#No Join
count2=$(grep -o unread test2.txt| wc -l)
let "count2=count2-1"
sed 's/unread/~/g' test2.txt > test3.txt
cut -d'~' -f1 test3.txt>test4.txt
 
k=$(grep -o , test4.txt| wc -l )
let "k=k+2"
cut -d',' -f$k test2.txt> test05.json
cut -d':' -f1 test05.json> test06.json

seda=$(sed 's/"!/!/g' test06.json)
tokens=$(echo "${tokens["$1"]}")
echo $1,$1,$seda,$tokens >> test07.csv
let "k=k+117"
rm -f test05.json
rm -f test06.json
p=3
for ((l=1;l<$count2;l++)) 
do
cut -d'~' -f$p test3.txt > test4.txt

cut -d':' -f2 test4.txt> test5.txt
cut -d',' -f2 test5.txt >test6.txt
seda=$(sed 's/"!/!/g' test06.txt)
tokens=$(echo "${tokens["$1"]}")
echo $1,$1,$seda,$tokens >> test07.csv
let "p=p+2"
rm -f test05.json
rm -f test06.json

done
#done
more test07.csv
#rm -f test07.csv
