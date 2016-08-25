#! /usr/bin/python

from flask import Flask
from flask import url_for
from flask import redirect
import os.path
import json
import psutil
import subprocess
import zipfile
import re
from flask import Flask, jsonify, request
from flask.views import MethodView
from flasgger import Swagger


app = Flask(__name__, instance_relative_config=True)
app.config['GATLING_PATH'] = '/opt/gatling'
app.config['SIM_PATH'] = app.config['GATLING_PATH']+'/user-files/simulations/'
app.config['REPORT_PATH'] = app.config['GATLING_PATH']+'/results/'
app.config['TMP_PATH'] = ''
app.config['DEBUG'] = False
app.debug = app.config['DEBUG']
app.static_url_path = app.config['TMP_PATH']
app.static_folder = app.config['TMP_PATH']
app.config.from_envvar('CONFIG_FILE', silent=True)


_GATLING_PATH = app.config['GATLING_PATH']
_SIM_PATH = app.config['SIM_PATH']
_REPORT_PATH = app.config['REPORT_PATH']
_TMP_PATH = app.config['TMP_PATH']
app.config['SWAGGER'] = {
    "swagger_version": "2.0",
    # headers are optional, the following are default
    # "headers": [
    #     ('Access-Control-Allow-Origin', '*'),
    #     ('Access-Control-Allow-Headers', "Authorization, Content-Type"),
    #     ('Access-Control-Expose-Headers', "Authorization"),
    #     ('Access-Control-Allow-Methods', "GET, POST, PUT, DELETE, OPTIONS"),
    #     ('Access-Control-Allow-Credentials', "true"),
    #     ('Access-Control-Max-Age', 60 * 60 * 24 * 20),
    # ],
    # another optional settings
    # "url_prefix": "swaggerdocs",
    # "subdomain": "docs.mysite,com",
    # specs are also optional if not set /spec is registered exposing all views
    "specs": [
        {
            "version": "0.0.1",
            "title": "Api v1",
            "endpoint": 'v1_spec',
            "route": '/v1/spec',

            # rule_filter is optional
            # it is a callable to filter the views to extract

            # "rule_filter": lambda rule: rule.endpoint.startswith(
            #    'should_be_v1_only'
            # )
        }
    ]
}

swagger = Swagger(app)

def zipdir(path, zip):
    os.chdir(_REPORT_PATH)
    for root, dirs, files in os.walk(path):
        for file in files:
            zip.write(os.path.join(root, file))
    os.chdir(_GATLING_PATH)


def sanitize(var):
    """Sanitize function to replace characters that
    are being replaced by gatling when e.g. generating
    reports"""

    chars = {
        "_": "-"
    }

    for key, val in chars.items():
        var = re.sub(key, val, var)

    return var


def exists(simulation):
    """Function to check if the simulation actually exists
    and returns true or false"""
    app.logger.debug('Checking if file '
                     + _SIM_PATH + simulation + '.scala exits')
    return os.path.exists(_SIM_PATH + simulation + '.scala')


def check(simulation):
    """Checks if a simulation is currently running by
    listing processes"""
    app.logger.debug('Checking if ' + simulation + ' is running')
    procs = []
    _procs = psutil.process_iter()

    for proc in _procs:
        procs.append(proc.as_dict(attrs=['cmdline']))

    for pproc in procs:
        for item in pproc['cmdline']:
            if simulation in item:
                return True

    return False


def sim_action(simulation, action):
    """Starts or stopps a simulation"""
    app.logger.debug('Calling ' + action + ' on ' + simulation)
    if action == 'start' or action == 'stop':
	simulationtab=simulation.split('.')
	simulations=simulationtab[2].lower()
	proca= subprocess.Popen(['ls','/app'], stdout=subprocess.PIPE)
	outofdata=proca.stdout.read()
	outtab=outofdata.split('\n')
	index=len(outtab)
	#outoftab=[]
	#for j in range(0,index):
	#	itemtab=outtab[j]
	#	if simulations in itemtab: 
	#		outoftab.append(itemtab)
	for i in range(0,index):
		name=simulations+str(i)+".txt"
		stdoutname="stdout"+name
		if i!=0 and stdoutname not in outofdata:
			break
        if action == 'start':
	   
		
	    with open("/app/stdout"+name,"wb") as out, open("stderr"+simulationtab[2]+".txt","wb") as err:
           	 p = subprocess.Popen([_GATLING_PATH + '/bin/gatling.sh', '-s', simulation],stdout=out,stderr=err)
            return True

        if action == 'stop':
            procs = []
            _procs = psutil.process_iter()
            for proc in _procs:
                procs.append(proc.as_dict(attrs=['pid', 'cmdline']))

            for pproc in procs:
                for item in pproc['cmdline']:
                    if simulation and 'java' in item:
                        app.logger.debug('Killing PID: ' + str(pproc['pid']))
                        p = subprocess.Popen(['kill', str(pproc['pid'])],
                                             stdout=subprocess.PIPE)
                        return p.communicate()[1]
    return False


def reports(simulation, action='find', report=None ):
    """Finds/lists a list of reports for simulation, default action is
    to find the reports, can be set to:
        -find
        -download
        """
    lreports = []
    if action == 'find':
        simulation = simulation.lower()
        simulation = sanitize(simulation)
        app.logger.debug('Checking if '
                         + _REPORT_PATH + ' exists.')
        for item in os.listdir(_REPORT_PATH):
            if simulation in item:
                lreports.append(item)
        return lreports

    if action == 'download':
        simulation = simulation.lower()
        simulation = sanitize(simulation)
	for item in os.listdir(_REPORT_PATH):
		if simulation in item:
			lreports.append(item)
	
	#num = lreports.index(report)
	#num = len(lreports)
	lreports2=[]
	prefix=lreports[0].split('-')[0]
	for i in range(0,len(lreports)):
		text=lreports[i]
		data=text[len(prefix)+1:]
		lreports2.append(data)
	lreports3=sorted(lreports2)
	lreports4=[prefix+"-"+s for s in lreports3]
	app.logger.debug('Checking if '
                        + _REPORT_PATH + report + ' exists.')
	if report:
            report = sanitize(report)
	    simulation = sanitize(simulation)
	    if "atrix" in simulation:
		k=1
	    else:
		k=1
	    p1 = subprocess.Popen(["cp","-f","/app/stdout"+simulation+str(lreports4.index(report)+k)+".txt",_REPORT_PATH+report+"/gatling.txt"])
	    p1.wait()
            if os.path.exists(_REPORT_PATH + report):
               
		app.logger.debug('Found the path, now lets zip it up')
                zippedfile = _TMP_PATH + report + '.zip'
                try:
                    zipf = zipfile.ZipFile(zippedfile, 'w')
                    zipdir(report, zipf)
                    zipf.close()
		   # subprocess.call(["cp","-f",_GATLING_PATH+"/"+report+'.zip',"/app/"+report+'.zip'])
                    return app.send_static_file(report + '.zip')
                except Exception as e:
                    return e
            else:
                return ("<h2>Error: Report " + report +
                        " does not exist.</h2>", 404)
        else:
            return ("<h2>Error: No report name supplied.</h2>", 404)


@app.route('/', methods=['GET'])
def index():
    return redirect(url_for('gatling'), code=302)


@app.route('/favicon.ico', methods=['GET'])
def favicon():
    return ''


@app.route('/gatling', methods=['GET'])
@app.route('/gatling/', methods=['GET'])
def gatling():
    """Returns simple text with what url structure we expect"""
    return '<html><body><p style="margin: 20px; font-size: 12pt; font-family: Arial;">\
        Valid path to access a simulation is: /gatling/simulation_name/\
        </p></body></html>'


@app.route('/gatling/<simulation>', methods=['GET'])
@app.route('/gatling/<simulation>/', methods=['GET'])
def gatling_simulation(simulation):
    """Returns the status of a simulation in json format as
    {\"status\": \"running|stopped\"}"""
    if exists(simulation):
        _ret = check(simulation)

        if _ret is True:
            _retval = {"status": "running"}
        else:
            _retval = {"status": "stopped"}

        return json.dumps(_retval, indent=4)
    else:
        return("<h2>Simulation not found!</h2>", 404)


@app.route('/gatling/<simulation>/<action>', methods=['GET'])
def gatling_simulation_action(simulation, action):
    """Returns status of action for simulation, if the status is failed,
    it will try to also give failure details at a best effort basis"""

    _ret = {"status": "failed"}

    if exists(simulation):

        if action == 'start':
            if check(simulation) is True:
                _ret = {"status": "failed", "message": simulation +
                        " is already running"}
                return json.dumps(_ret, indent=4)

        if action == 'stop':
            if check(simulation) is False:
                _ret = {"status": "failed", "message": simulation +
                        " is not running"}
                return json.dumps(_ret, indent=4)

        ret = sim_action(simulation, action)
        if ret is None or True:
            _ret = {"status": "success", "details": ret}
        else:
            _ret = {"status": "failed", "details": ret}

    return json.dumps(_ret, indent=4)


@app.route('/gatling/<simulation>/reports', methods=['GET'])
@app.route('/gatling/<simulation>/reports/', methods=['GET'])
def gatling_simulation_reports(simulation):
    """Returns a list of reports for the simulation in json format as
    {\"reports\": \"['report1','report2',...]\"}"""

    _retval = {"reports": []}

    if exists(simulation):
        retval = reports(simulation, action='find')
        _retval = {"reports": retval}

    return json.dumps(_retval)


@app.route('/gatling/<simulation>/reports/<report>', methods=['GET'])
def gatling_simulation_reports_download(simulation, report):
    """Returns a report zip file"""
    return reports(simulation, action='download', report=report)
@app.route('/gatling/downloads/<report>')
def downloads(report):
	subprocess.call(["cp","-f",_GATLING_PATH+"/"+report+'.zip',"/app/"+report+'.zip'])
	Task-{"Action":"Done"}
	return jsin.dumps(Task, indent=4)
@app.route('/gatling/loads')
def loads():
	subprocess.call(["sh","/opt/gatling/user-files/data/Vector.sh"])
	Task-{"Action":"Done"}
	return json.dumps(Task, indent=4)
@app.route('/analyse/<report>')
def anayse(report):
	subprocess.call(["cp","-f","/opt/gatling/user-files/data/jsonresult.sh","/opt/gatling/results/"+report])
	#p1.wait()
	subprocess.call(["sh","/opt/gatling/results/"+report+"/jsonresult.sh","/opt/gatling/results/"+report])
	#subprocess.call(["cp","-f","/app/result.txt","/opt/gatling/results/"+report])	
	#file = open('/app/result.txt','r')

			#output= subprocess.check_ouput(['cat','/opt/gatling/results/'+report+'/result.txt'])
#Task=proc2.stdout.read()
	Task={"Action":"Done"}
	return json.dumps(Task, indent=4)
	#return file.read()
@app.route('/analyseresult/<report>')
def getanalyse(report):
	file=open('/opt/gatling/result.txt','r')
	return file.read()

class SimulationAPI(MethodView):
    def get(self,simulation_name):
        """
        this methods will launch the simulation of the client test request
        ---
        tags:
          - simulation
        parameters:
          - name: simulation_name
            in: path
            description: it is the name of the simulation we want to start
            required: true
            type: string
            format: utf8
        responses:
          201:
            description:  this method will return the status of this request with some details
            schema:
                id: status
                type: object
                required:
                    - status
                    - details
                properties:
                    status:
                        type: string
                        description: this is the status of the simulation.It can be sucess or fail
                        default: Sucess
                    details:
                        type: string
                        description: this is the details about the sucess or the fail request
                        default: true
        """
        data= {
            [ {"user":"test","team":team_id}
            ]
        }
        return jsonify(data)

class SimulationsAPI(MethodView):
    def get(self,simulation_name,action):
        """
        this methods will stop the simulation of the client test request
        ---
        tags:
          - simulation
        parameters:
          - name: simulation_name
            in: path
            description: it is the name of the simulartion we want to start
            required: true
            type: string
            format: utf8
	  - name: action
	    in : path
	    description: action
	    required: true
	    type: string
	    format: utf8	
        responses:
          201:
            description:  this method will return the status of this request with some details
            schema:
                id: status
                type: object
                required:
                    - status
                    - message
                properties:
                    status:
                        type: string
                        description: this is the status of the simulation.It can be sucess or fail
                        default: Sucess
                    message:
                        type: string
                        description: this is the detail of the succes or not of the request
                        default: true
        """
        data= {
            [ {"user":"test","team_id":team}
            ]
        }
        return jsonify(data)

class SimulationsCheckAPI(MethodView):
    def get(self,simultion_name):
        """
        this methods return the status of the simultion associate with the client test request
        ---
        tags:
          - simulation
        parameters:
          - name: simulation_name
            in: path
            description: It is the name of the scenario we want to chek the status
            required: true
            type: string
            format: utf8
        responses:
          201:
            description:  this methods will return the status of the simulations
            schema:
                id: Status
                type: object
                required:
                    - Status
                properties:
                    Status:
                        type: string
                        description: this is the status of the simulation.It can be stopped or running
                        default: running
        """
        data= {
            [ {"user":"name","team":team_id}
            ]
        }
        return jsonify(data)

class SimulationsReportAPI(MethodView):
    def get(self,simulation_name):
        """
        this metods will give the list of all report_id(Name of the scenario+timestap) which have the same scenario
        ---
        tags:
          - simulation
        parameters:
          - name: simulation_name
            in: path
            description: It is the name of the scenaio the client wan to launch
            required: true
            type: string
            format: utf8
        responses:
          201:
            description:  this will give the list of all report_id (Name of the scenario+timestap)
            schema:
                id: Report_List
                type: array
                items:
                    id: reports
                    required:
                        - ListReport
                    properties:
                        ListReport:
                            type: string
                            description: it is the list of all simulation name that have the same scenario in the launch
                            default: [loginmatrix-1471434838433]
        """
        data= {
            [ {"user":"name","team":team_id}
            ]
        }
        return jsonify(data)

class SimulationsReportIdAPI(MethodView):
    def get(self,simulation_name,report_id):
        """
        this methods will zip the file in the report-id directory and will send the zip to the client 
        ---
        tags:
          - simulation
        parameters:
          - name: simulation_name
            in: path
            description: it is the name of the simulation the client want to launch
            required: true
            type: string
            format: utf8
          - name: report_id
            in: path
            description: this is the id of the fiolder of the simulation we want to downloads
            required: true
            type: string
            format: utf8
        responses:
          201:
            description:  this methods allow us to download the report-id zipfile
            schema:
                id: Zipfile
                type: object
                required:
                    - Zip
                properties:
                    Zip:
                        type: string
                        description: this is a file which contain all graphe and the simulation log
        """
        data= {
            [ {"user":"name","team":team_id}
            ]
        }
        return jsonify(data)

class DownloadAPI(MethodView):
    def get(self,report_id):
        """
        this methods fix one error in the previous methods because the zip file is store in the wrong path 
        ---
        tags:
          - simulation
        parameters:
          - name: report_id
            in: path
            description: this is the id of the folder of the simulation we want to downloads
            required: true
            type: string
            format: utf8
        responses:
          201:
            description:  the change have been done
            schema:
                id: Zipfile
                type: object
                required:
                    - Done
                properties:
                    Done:
                        type: string
                        description: the change have been done
        """

        data= {
            [ {"user":"name","team":team_id}
            ]
        }
        return jsonify(data)
class LoadsAPI(MethodView):
    def get(self):
        """
        this methods will report the list of all user associate with thei token and the name of the room that they have access
        ---
        tags:
          - simulation
        responses:
          201:
            description:  the change have been done
            schema:
                id: Zipfile
                type: object
                required:
                    - Done
                properties:
                    Done:
                        type: string
                        description: the change have been done
        """
        data= {
            [ {"user":"name", "team":team_id}
            ]
        }
class AnalyseAPI(MethodView):
	def get(self):
		 """
        this methods will ask the system to analyse the result of the simulation
        ---
        tags:
          - simulation
        parameters:
          - name: report_id
            in: path
            description: this is the id of the folder of  the simualtion we launch
            required: true
            type: string
            format: utf8       
        responses:
          201:
            description:  Analyse have been done
            schema:
                id: Action
                type: object
                required:
                    - Action
                properties:
                    Action:
                        type: string
                        description: Analyse has been done
                        default: Done
        """
class AnalyseResultAPI(MethodView):
	def get(self):
		        """
        this methods will give you a part of the result of the analyse.This analyse has just the simulation.log and not the interface
        ---
        tags:
          - simulation
        parameters:
          - name: report_id
            in: path
            description: this is the id of the folder that we want to have the result
            required: true
            type: string
            format: utf8       
        responses:
          201:
            description:  Give part analyse
            schema:
                id: Action
                type: object
                required:
                    - Json
                properties:
                    Json:
                        type: string
                        description: Result a part of the analyse
       
        """		

#views= SimulationAPI.as_view('simulation_name_start')
#app.add_url_rule(
 #   '/gatling/<string:simulation_name>/start',
  #  view_func=views,
   # methods=["GET"],
    #endpoint="simulation_name_start")

views2= SimulationsAPI.as_view('simulation_name_stop')
app.add_url_rule(
    '/gatling/<string:simulation_name>/<string:action>',
    view_func=views2,
    methods=["GET"],
    endpoint="simulation_name_stop")

views3= SimulationsCheckAPI.as_view('simulation_check')
app.add_url_rule(
    '/gatling/<string:simulation_name>',
    view_func=views3,
    methods=["GET"],
    endpoint="simulation_check")

views4= SimulationsReportAPI.as_view('simulation_report')
app.add_url_rule(
    '/gatling/<string:simulation_name>/reports',
    view_func=views4,
    methods=["GET"],
    endpoint="simulation_report")

views5= SimulationsReportIdAPI.as_view('simulation_report_id')
app.add_url_rule(
    '/gatling/<string:simulation_name>/reports/<string:report_id>',
    view_func=views5,
    methods=["GET"],
    endpoint="simulation_report_id")
# you can still use @app.route if you want
views6= DownloadAPI.as_view('simulation_download')
app.add_url_rule(
    '/gatling/downloads/<string:report_id>',
    view_func=views6,
    methods=["GET"],
    endpoint="simulation_download")
views7= LoadsAPI.as_view('simulation_loads')
app.add_url_rule(
    '/gatling/loads',
    view_func=views7,
    methods=["GET"],
    endpoint="simulation_loads"
    )

views8= AnalyseAPI.as_view('analyse')
app.add_url_rule(
     '/analyse/<int:report_id>',
	  view_func=views8,
	  methods=["GET"],
	  endpoint="analyse")
views9= AnalyseResultAPI.as_view('analyseresult')
app.add_url_rule(
	'/analyseresult/<int:report_id>',
	view_func=views9,
	methods=["GET"],
	endpoint="analyseresult")

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=8080)
