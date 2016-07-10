#!/bin/bash

# en premier il faut justement savoir et mettre justement en place le docker engine en utilisant directement le docker toolbox
#liste tpus les difféentes vm qui ont été créer et qui ont été mise en place
docker-machine ls
docker-machine create -d virtualbox manager
docker-machine create -d virtualbox agent1
docker-machine create -d virtualobox agent2

# si on a eu le même problèem que moi etq  que notre machine a du justement se redemarre il faut justement utiliser la commande suivante pour mettre en place et pour redemarre en soit le host 

docker-machine start manager
docker-machine regenerate-certs manager
#o utilise ensuite la commande suvante qui va en effet permettre d'envoyer des docker commande au niveau des différents docker engine et c'est comme cela que cela va donctionner.
#On va ainsi mettre en lient le docker clinet avec le docker engine ce qui permet ene efeft de la communication entre les deux type de conteur.
eval $(docker-machine env manager)
#cela va ainsi créee un id pour le swarm cluster
docker run --rm swarm create
#on a justement que tous cette commande nous permet justement de metrre en place une nouvelle image qui sera ainsi utiliser
docker-machine ls 
#cela permet justement de voir quelle snt les machines qui tourne en soi sur le réseua
#cela crée un conteneur de docker swarm qui se trouve sur le manager
docker run -d -p 3376:3376 -t -v /var/lib/boot2docker:/certs:ro swarm manager -H 0.0.0.0:3376 --tlsverify --tlscacert=/certs/ca.pem --tlscert=/certs/server.pem --tlskey=/certs/server-key.pem token=//d6caa974ee6562e8a1ebc10ad44bac47
eval $(docker-machine env agent1)
# maintenant on va justemet mettre en place uncontenaiur au niveau de ce noued et on va justement ergarder comment le tous av aainsi régaire et comment le tous fonctionne en soi
docker run -d swarm join --addr=$(docker-machine ip agent1):2376 token=//d6caa974ee6562e8a1ebc10ad44bac47
#on va justement mettre en place les même chose au niveau du deuxième agtn ou on met aussi en place un conteneur
docker run -d swarm join addr=$(docker-machine ip agent2):2376 token=//d6caa974ee6562e8a1ebc10ad44bac47
#cela va ainsi connecter le docker swarm avec le docker client
DOCKER_HOST=$(docker-machine ip manager):3376


#comme on est justement sur un version qui est dans mon cas une version mac il faut justement prendre en compte des chise en plus.
#En effet il faut justement chanegr certainne commande.
#Il faut en effet changer certaine des commande:
#eval "$(docker-machine env agent1)"
#eval "$(docker-machine env agent4)"
#eval "$(docker-machine env manager)"
#avir des infos sur swarm
docker info do
#avec le docker info on peut aussi préciser qeulle contennaire onn soubhiate voir en utilisant option -H avec l'addrese
# liste des dockers image ui sont disponible
docker image 


#si on veut justement mettre en place un matser il luei fau en soi dire des chose sur lui, on met justement la commande suivante

docker-machine create -d virtualbox --swarm-master agent6

#On a ensuite tous ce qui concerne en soit la deuxième partie sui concerne justement la mise en place du deuxième type de réseau et qui est justement la mise en place du résezu overlays dans le but de mettre et de comprendre ainsi comment fonctionne en soi docker compose
docker-machine create -d virtualbox mh-keystore

#Ensuite on  met justement en place tous ce qui concerne les différents partie sur la variable d'environnement
eval "$(docker-machine env mh-keystore)"
#On va ensuite dorectment mettre en place et utiliser en soi consul pour tous les différents besoin de cette exercie
docker run -d -p "8500:8500" -h "consul" progrium/consul -sever -bootstrap
#On regarde justement ensnuite tpius les différents programme
 qui tourne

docker ps

#ensuite on va justement créer et on va justement mettre en place le noeud matser
docker-machine create -d virtualbox --swarù --swarm-master --swarm-discover="consul://$(docker-machine ip mh-keystore):8500" --engine-opt="cluster-store=consul//$(docker-machine ip mh-keystore):8500" --engine-opt="cluster-advertise=eth1:2376" mhs-demo0
#znsuite on crée justement le deuxième npeud

docker-machine create -d virtualbox --swarm --swarm-master --swarm-discovery="consul://$(docker-machine ip mh-keystore):8500" --engine-opt="cluster-stoe=consul//$(docker-machine ip mh-keystore):8500" --engine-opt="cluster-advertise=eth1:2376" mhs-demo1
#ensuite on va justement regadre tous les machine qui existe
docker-machine ls

#On va justement mettre en place environnemern de docker swarm

eval "$(docker-machine env --swarm mhs-demo0)"

#on regarder en suite tous les infos

docker info
#one va justement suite xree le réseau overlays

docker network create --driver overlay --subnet=10.0.9.0/24 my-net 

#on va justement ensuite regarder les différents réseau qui sont en soi disponible 

docker network ls
eval $(docker-machine env mhs-demo0)
docker netwrok ls




eval $(docker-machine env mhs-demo1)
docker network ls

eval "$(docker-machine env mh-keystore)"

docker network lsdocker network ls


#on va justement esnuite directement lancer une apllication
eval $(docker-machine env --swarm mhs-demo0);
docker run-itd --nam=web --net=my-net --env="constaint:node==mhs-demo0" nginx
docker run -it --rm --net=my-net --env="constraint:node=mhs-demo1" busybox wget -O- http//web
#On va ensuite tous les différentes activité qui vienne en soi de l'éxteeieur et en soi les analyser
docker network ls
d

mkdir composetest
cd composetest

sudo nano app.py

sudo nano Dockerfile
sudo nano requiremnts.txt

docker build -t vbaer/web .
sudo nano docker-compose.yml

docker push vbaer/web

docker-compose up -d
docker-compose scale web=3


