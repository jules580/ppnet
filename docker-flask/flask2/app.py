


from flask import Flask, request
app = Flask(__name__)
i=0  
@app.route("/launchtest")
def echo(): 
    url=request.args.get('content','')
    content=url.split(',')
    scenario=content[1]
    global i
    i+=1
   # content.append(str(i))
    name= str(i)+"url"
    name2= str(i)+"scenario"
    name3= str(i)+"tester"
    test= { name : content[0], name2: content[1], name3: content[2]}
    return "You said: " +test[name3]

if __name__ == "__main__":
    app.run(debug=True, host= '0.0.0.0')

