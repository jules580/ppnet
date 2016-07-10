

#en premier nous allons justement en soi mette en place tous les difféentesn notions qui nous perme justement en soit de mettre en place du ssh

sudo cp  dcos.pem ~/.ssh

sudo chmod 777 ~/.ssh/dcos.pem

ssh-add ~/.ssh/dcos.pem
dcos node ssh --master-proxy --leader

dcos node ssh --master-proxy --mesos-id="id de mesos"

# mise en place de l'exemple de dépoliement qui est données comme exemple

dcos package install cassandra

dcos package install marathon-lb

sudo nano oinker-with-marathon-lb.json

dcos maathon app add oinke-with-marathon-lb.json

dcos marathon app list

curl http://marathon-lb.marathon.mesos:10000/

dcos marathon app update oinke-with-marathon-lb instances=2

dcos maathon app update oinker-with-marathon-lb instances=4

#On peut ensuite justement diectement mettre en soit en place l'application quui est justeme,yn l('application sur un conteneur docke qui tourne njystement

sudo mkdir simple-docker-tutorial

sudo cd simple-docker-tutorial


sudo nano index.html

<html>
   <body>
   <h1> Hello wold </h1>
   </body>
</html>
sudo nano Dockerfile

FROM nginx:1.9
COPY index.html /usr/shae/nginx/html/index.html

docke build -t vbaer/simple-docker .

docke login

docker push vbaer/simple-docker

sudo nano nginx.json

dcos marathon app add nginx.json

dcos marathon app list

#insdtall du cli pour mette en place justement les difféents installation qu sont uustement possible


sudo pip install vitualenv

sudo mkdi dcos

cd dcos

sudo curl -O https://downlads.dcos.io/dcos-cli/install.sh

bash install.sh  <install_di> http://<hosturl>

dcos help

sudo pip install vitualenv


sudo c












