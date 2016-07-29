from flask import Flask, abort, redirect, url_for
app = Flask(__name__)

@app.route('/')
def index():
    return 'Index Page'
@app.route('/hello')
def hello():
    return 'Hello, World'
@app.route('/user/<username>')
def show_user_profile(username):
	return 'User %s' %username

@app.route('/post/<int:post_id>')
def show_post(post_id):
	return 'Post %d' %post_id

@app.route('/projects/')
def projects():
	return 'The project page'
@app.route('/about')
def about():
	return redirect(url_for('hello'))
if __name__ == "__main__":
    app.run(debug=False, host= '0.0.0.0')
