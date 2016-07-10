#On va justement regarder et justement tester en soi la version de dcos aquo est justement la version de dcos qui est la version sur un équipement qui demande 16GB de ram et je pense justement pas du tous que mon rodinateur ne va justement demander comment le mettre en place
#on a justement tous cette partie sur l'installation de cos sur vagrant.Je pense que je vais justement le mettre en place au niveau de ubuntu 64V bist



sudo apt-get update
sudo apt-get install curl git
curl -O https://downloads.dcos.io/dcos/EarlyAccess/dcos_generate_config.sh


#procédure pour installer docker


sudo apt-get -y install docker.io
ln -sf /usr/bin/docker.io /usr/local/bin/docker
sed -i '$acomplete -F _docker docker ' /etc/bash_completion.d/docker.io
docker pull ubuntu

docker run -i -t ubuntu /bin/bash_completion
docker search debian

#on va justement regarder l'autre tehcnique

#on va justement continuer à regader ce qui se passe avec une autre technique sur un auyte site

sudo apt-get install virtalbox
sudo apt-get install vagrant

sudo apt-get install virtaulbox-dkms
#ceic est justement tous la partie sur la mise en place de tous ce qui concerne en soi la partie sur l'install de vagrant

#Ceci est justement pour mettre en place vagrant
vagrant box add precise32 http://files.vagrantup.com/precise32.box
sudo mkdir vagrant_project
cd vagrant_project
vagrant init
vagrant update
vagrant ssh


vagrant box add precise32c http://files.vagrantup;com/precise3é.box

vagrant init
vagrant update

vagrant ssh

#Il faut ensuite mettre en place virtualbox

#sudo apt-get install virtualbox
#sudo git clone https://github.com/dcos/dcos-vagrant

#VBoxManage list hostonlyifs | grep vboxnet0 -q || VBoxManage hostonlyif create

#VBoxManage hostonlyif ipconfig vboxnet0 --ip 192.168.65.1

#vagrant plugin install vagrant-hostmanager

#export DCOS_CONFIG_PATH=etc/config-1.7.yaml
#sudo cp VagrantConfig.yaml.sample VagrantConfig.yaml
#vagrant up m1 a1 p1 boot



#sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv E56151BF
#DISTRO=$(lsb_release -is | tr '[:upper:]' '[:lower:]')
#CODENAME=$(lsb_release -cs)
#sudo DEBIAN_FRONTEND=noniuneractive apt-get install -y python-software-properties software-properties-common
s
#echo "deb http://repos.mesosphere.com/${DISTRO} ${CODENAME} main"
#sudo tee /etc/apt/sources.list.d/meosphere.list
#sudo apget -y update

#sudo add-apt-repersitory ppa:webudp8team/java
#sudo apt-get update -y
#sudo apt-get install -y oracle-java8-installer oracel-java8-set-default

#sudo apt-get install -y oracle-java8

#Pour justement mettre en place la solution qui est en effet ainsi porpooser par la solution qui est la solution de dcos on peut justement le mettre en place.
#mais le problème du cas de l'eexemple justement qui est présneter ici avec le cas de dcos est que justement dans l''exmple qui donne on a justement tous une partie sur bento/centos-7.1 mais on ne l'installe justement jamais ce qui est bien sur assez étrange et qui est assez étonnant

#on va justement regarder les différebts notions que l'on voit justement avec l'autre méthode
#sudo mkdir vm-install
#cd vm-install

#vagrant init bento/centos-7.1
#vagrant up
#vagrant ssh

#sudo vi /etc/hostonlyifscat /etc/hostonlyifs
#sudo rpm -Uvh http://repos.mesosphere.com/el/7/noarch/RPM/mesosphere-el-repo-7.1.noarch.rpm
#https://atlas.hashicorp.com/bento/boxes/centos-7.1/versions/2.2.2/providers/virtualbox.box

#vagrant box add bentos/centos-7.1 ~/virtualbox.box
#sudo apt-get -y install mesosphere
#sudo apt-get -y install marathon
#Voic la liste des choses qu(il faut justement faire quand on sait que le ous est justement toatlement fonctionelle
#sudo zookerper-server software-properties-common
#server.1=1.1.1:2888:3888
#server.2=2.2.2:2888:3888
#server.3=3.3.3.3:2888:3888
#######
#sudo service mesos-slave software-properties-common
#sudo sh -c "echo manual > /etc/init/mesos-slacve.override"
#sudo apt-key adv--keyserver hkp://keysercer.ubuntu.com:80 recv E56151BF
#DISTRO=$(lsb_release -is | tr '[:upper]' '[:lower:]')
#CODENAME=$(lsb_release -cs)

#echo "deb http://repos.emsophere.list.d/mesospher.list"

 #sudo apt-get install mesospher
 #sudo vi /etc/hostonlyif cet /etc/hostlonlyif
     
# vagrant box add bentos/centos-7.1
s

 #vagrant box add bentos/centos-7.1
# sudo apt-get install mesospher
 #echo "deb http:///repos.mesosphe"




 #Installtion de doc s par la méthode de la mise en place des différents ccomposnat  qui sont justement mise en place un par un


 sudo mkdir vm-install
 cd vm-install
 vagrant init bento/centos-7.1

 vagrant upvagrant ssh
#Inside noeud 1
 sudo apt-get install nano

 sudo nano /etc/hosts
cat /etc/hosts

sudo rpm -Uvh http://repos.mesospher.coim/el/7/noarch/RPMS/mesospher-el-repo-7-1.noarch.rpm
sudo yum -y install mesos marathon
sudo rpm -Uvh http://archive.cloudera.com/cdh4/one-click)install/redhat/6/x86_64/cloudera-cdh-4-0.x86_64.rpm
sudo yum -y install zookeeper zookeeper-server
sudo -u zookeeper zookeeper-server-initialize --myid=1

sudo service zookeeper-server start
sudo service zookerper-server stop
sudo service zookerper-server start
sudo service mesos-master start
sudo service mesos-slave start
sudo netstat -nlp | grep mesospher
exporr MASTER=$(mesos-resolve ‘cat /etc/mesos/zk ‘ 2>/dev/null)
mesos help

mesos-execute --master=$MASTER --name="cluster-test" --command="sleep 40"

sudo service marathon start
netstat -nlp | grep 8000
curl http://192.168.33.12:8000

curl http://192.168.33.12:8000/stderr
curl http://192.168.33.12:8000/stdout

curl http://0.0.0.0:8080/metrcis | python -m json.tool

curl http://0.0.0.0:8080/v2/apps | python -m json.tool

curl -X DELETE http://0.0.0.0:8080/v2/apps/test | python -m json.tool

curl http://0.0.0.0:8080/v2/apps/test | python -m json.tool


#Install meso dns mais cela ne fonctionne justement pas bien du tous

sudo yum -y install golang git bind-utils

mkdir ~/go
export GOPATH=$HOME/go
export PATH=$PATH:*GOPATH/bin
go get github.com/tools/godeep
go get github.com/mesosphere/mesos-dns
cd $GOPATH/src/github.com/mesosphere/mesos-dns

godep go build .

sudo nano /etc/resolv.conf

#Il faut justement mettre en place nameserver 192.168.33.10

cp config.json.sample config.json

#j'ai justement chosi de ahcner l'addresse ip qui est justement l'addresse 192.168.33.12

sudo /home/vagrant/go/src/github.com/mesosphere/mesos-dns/mesos-dns -v=1 -config=/home/vagrant/go/src/github.com/mesospher/mesos-dns/config.json


#contraint
hostname:CLUSTE:node1


sudo yum -y install chronos

sudo servic chronos start

sudo chkconfig zookeeper-server on
sudo chkconfig mesos-master on
sudo chkconfig mesos-slave on
sudo chkco fig marathon o,
sudo chkconfig chronos on
vagrant halt
vagrant package oracel-java8-set-default
vagrant destroy oracel-java8-set-default
vagrant box add mesos-matser package.box
vagrant up node2
vagrant ssh node2

sudo rpm -Uvh http://repos.mesosphere.com/el/7/noarch/RPMS/mesosphere-el-repo-7-1.noarch.rpm
sudo yum -y install mesos
sudo yum install -y golang git device-mapper-event-libs docker
sudo chkconfig docker on
sudo service docker start
export GOPATH=~/go
go get github.com/golang/example/outyet

cd $GOPATH/src/github.com/golang/example/outyet

sudo docker build -t outyet .

sudo docker run --publish 6060:8080 --name test --rm outyet

echo 'docker,mesos' sudo tee /etc/mesos-slave/containerizers

sudo service mesos-slave retsart

curl -X POST http://192.168.33.12:8080/v2/apps -d @/vagrant/outyet.json -H "Content-tyep: application/json"

sudo yum install -y golang git device-mapper-events-libs docker
sudo chkconfig docker on
sudo service docker start
export GOPATH=~/go
go get github.com/golang/example/outyet

cd *GOPATH/src/github.com/golang/example/outyet


sudo docker build -t outyet .

sudo docker runn --oublish 6060:8080 --name test --rm outytet
sudo docker save --output=outyet.tar.gz outyet
cp outyet.tar.gz /vagrant
vagrant ssh node2
sudo yum install -y device-mapper-event-libs docker
sudo chkconfig docker on
sudo service docker start
echo 'docker,mesos' | sudo tee /etc/mesos-slave/containerizers

sudo service mesos-slave restart

sudo docker load --inpurt=/vagrant/outyet.tar?gz

sudo docker run --publish 6060:8080 --name test --rm outyet

sudo service mesos-slave start
echo 'docker,mesos' sudo tee /etc/mesos-slave/containerize

#install de dcos clis sur le cas des différents test qui sont mise en plave

sudo pip install virtualenv

sudo mkdir dcos && cd dcos
curl -O https://dwonloads.dcos.io/dcos-cli/instrall.sh
bash install.sh ~/dcos_test/vm-install http://192.168.333.12:5050
sudo pip install virtualenv

sudo mkdir dcos 
cd dcos
curl -o https://downloads.dcos.io/dcos-cli/install.sh

bash install.sh ~/dcos_test/vm-install http://192.168.33.12:50505

#Partie de test de mise en place de mesos dns et test justement sur le reste pour voir

sudo apt-get install nano

sudo mkdir /etc/mesos-dns
sudo nano /etc/mesos-dns/config.json

sudo docker pull mesosphere/mesos-dns
sudo docker run --net=host -d -v "/etc/mesos-dns/config.json:/config.json" mesosphere/mesos-dns -config=/config.json


#liste des instruction qui sont justement mise en place dans un script


mkdir ~/go
export GOPATH=$HOME/go
export PATH=$PATH:$GOPATH/bin
go get github.com/tools/godeep
go get github.com/mesosphere/mesos-dns
cd $GOPATH/src/github.com/mesosphere/mesos-dns

godep go build .
cp /vagrant/config.json


vagrant up node1
vagrant up
vagrant ssh node1


