#!/bin/bash

# en premier il faut justement savoir et mettre justement en place le docker engine en utilisant directement le docker toolbox
docker-machine ls
docker-machine create -d virtualbox manager
docker-machine create -d virtualbox agent1
docker-machine create -d virtualobox agent2

# si on a eu le même problèem que moi etq  que notre machine a du justement se redemarre il faut justement utiliser la commande suivante pour mettre en place et pour redemarre en soit le host 

docker-machine start manager
docker-machine regenerate-certs manager
#o utilise ensuite la commande suvante qui va en effet permettre d'envoyer des docker commande au niveau des différents docker engine et c'est comme cela que cela va donctionner.
eval $(docker-machine env manager)
docker run --rm swarm create
#on a justement que tous cette commande nous permet justement de metrre en place une nouvelle image qui sera ainsi utiliser
docker-machine ls 
#cela permet justement de voir quelle snt les machines qui tourne en soi sur le réseua
docker run -d -p 3376:3376 -t -v /var/lib/boot2docker:/certs:ro swarm manager -H 0.0.0.0:3376 --tlsverify --tlscacert=/certs/ca.pem --tlscert=/certs/server.pem --tlskey=/certs/server-key.pem token=//d6caa974ee6562e8a1ebc10ad44bac47
eval $(docker-machine env agent1)
# maintenant on va justemet mettre en place uncontenaiur au niveau de ce noued et on va justement ergarder comment le tous av aainsi régaire et comment le tous fonctionne en soi
docker run -d swarm join --addr=$(docker-machine ip agent1):2376 token=//d6caa974ee6562e8a1ebc10ad44bac47
#on va justement mettre en place les même chose au niveau du deuxième agtn ou on met aussi en place un conteneur
docker run -d swarm join addr=$(docker-machine ip agent2):2376 token=//d6caa974ee6562e8a1ebc10ad44bac47

#comme on est justement sur un version qui est dans mon cas une version mac il faut justement prendre en compte des chise en plus.
#En effet il faut justement chanegr certainne commande.
#Il faut en effet changer certaine des commande:
#eval "$(docker-machine env agent1)"
#eval "$(docker-machine env agent4)"
#eval "$(docker-machine env manager)"

