from flask import Flask, request
app = Flask(__name__)

@app.route('/')
def index():
    return 'Index Page'
@app.route('/hello')
def hello():
    return 'Hello, World'
@app.route('/launchtest', methods=['GET'])
def test():
        url=request.args.get('url')
	#scenario=request.args.get('scenario')
	#print(scenario)
	return "toto"
@app.route('/post/<int:post_id>')
def show_post(post_id):
	return 'Post %d' %post_id


if __name__ == "__main__":
    app.run(debug=True, host= '0.0.0.0')
