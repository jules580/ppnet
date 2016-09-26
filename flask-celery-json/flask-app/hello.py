import json
def number(argument):
	switcher = {
	Name[0]: zero,
	Name[1]: one,
	Name[2]: two,
	Name[3]: three
	}
	func=switcher.get(argument,"nothing")
	return func()
def zero():
	a=tab[0]
	tab[0]=a+1

def one():
	b=tab[1]
	tab[1]=b+1

def two():
	c=tab[2]
	tab[2]=c+1
def three():
	d=tab[3]
	tab[3]=d+1

def getresult(argument):
		switcher = {
			Name[0]: zeros,
			Name[1]: ones,
			Name[2]: twos,
			Name[3]: threes,
		}
		func= switcher.get(argument,"nothing")
		return func()

def zeros():
	return tab[0]
def ones():
	return tab[1]
def twos():
	return tab[2]
def threes():
	return tab[3]
def initialisation():
	for i in range(0,10):
		tab[i]=0



with open('data.json') as json_file:
	data=json.load(json_file)
Name=[]
for cle in data.keys():
	Name.append(cle)

Name.append("Canada")
Name.append("Irland")
Name.append("Italie")
Name.append("Germany")
#Name=["USA","France","Canada","Irlande","Italie"]
tab={}
for i in range(0,len(Name)):
	tab[i]=0
#SourceName="USA"
#number(SourceName)
#print "USA:"+str(tab[0])

