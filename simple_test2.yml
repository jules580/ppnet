from flask import Flask, jsonify, request
from flask.views import MethodView
from flasgger import Swagger

app = Flask(__name__)


# config your API specs
# you can define multiple specs in the case your api has multiple versions
# ommit configs to get the default (all views exposed in /spec url)
# rule_filter is a callable that receives "Rule" object and
#   returns a boolean to filter in only desired views

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

swagger = Swagger(app)  # you can pass config here Swagger(app, config={})

class VectorAPI(MethodView):
    def post(self):
        """
        Launch a simulation connected to a scenario in one particular gatlin testserver in order to attack a specific matrix server and the vector which is conneted to this matrix server
        ---
        tags:
          - vector
        parameters:
          - in: body
            name: Attack_infos
            description: It is the scenario , the gatling test server, the vector interface and the matrix server that the clieny choose to have for this test
            required: true
            schema:
              id: infos_attack
              required:
                - scenarioName
                - testTargetUrl
                - testSourceName
                - testTargetVectorUrl
              properties:
                scenarioName:
                    type: string
                    description: this is the name of the sceanrio that the client want to launch in order to attack a specifc target 
                    default: tai.vector.LoginVector

                testTargetUrl:
                    type: string
                    description: this is the url of the matrix or vector server the client want to attack
                    default: http://192.168.2.77:8008

                testSourceName:
                    type: string
                    description: this is the name of the server of test
                    default: France
                testTargetVectorUrl:
                    type: string
                    description: this is the url of vector interface
                    default: http://192.168.2.77:8081

        responses:
          201:
            description: GUID and the status of the request
            schema:
                id: Status
                type: object
                required:
                    - status
                    - request_id
                    - details
                properties:
                    status:
                        type: string
                        description: it is the status of the request
                        default: Sucess
                        
                    request_id:
                        type: int
                        description: it is the guid of the request
                        default: 1
                    details:
                        type: string
                        description: it is the details of the status
                        default: true
        """
        return jsonify(
            {"data": request.json, "status": "New user created"}
        ), 201        

class MatrixAPI(MethodView):

 def post(self):
        """
        launch a simulation connected to a scenario in one particular gatling test server in order to attack a specific target
        ---
        tags:
          - matrix
        parameters:
          - in: body
            name: Attack_infos
            description: It is the scenari, the gatling server and the specific matrix server that the client choose to have for this test
            schema:
              id: infos_attack
              required:
                - scenarioName
                - testTargetUrl
                - testSourceName
              properties:
                scenarioName:
                    type: string
                    description: this is the name of the sceanrio that the client want to launch in order to attack a specifc target 
                    default: tai.matrix.LoginMatrix
                testTargetUrl:
                    type: string
                    description: this is the url of the matrix or vector server the client want to attack
                    default: http://192.168.2.77:8008
                testSourceName:
                    type: string
                    description: this is the name of the server of test
                    default: France
        responses:
          201:
            description: GUID and status of te request
            schema:
                id: Status
                type: object
                required:
                    - status
                    - request_id
                    - details
                properties:
                    status:
                        type: string
                        description: it is the status of the request
                        default: Sucess
                    request_id:
                        type: int
                        description: it is the guid of the request
                        default: 1
                    details:
                        type: string
                        description: it is the details about the sucess or the failure
                        default: true
        """
        return jsonify(
            {"data": request.json, "status": "New user created"}
        ), 201


       # return jsonify({"newuser": request.json, "team_id": team_id})

class CheckAPI(MethodView):
    def get(self,id):
        """
        this methods return the status of the simulation
        ---
        tags:
          - matrix
        parameters:
          - name: id
            in: path
            description: it is the id of the simulation
            required: true
            type: integer
            format: int64
        responses:
          200:
            description: this method will return the scenario name and the status of the client test request
            schema:
                id: test
                required:
                    - status
                    - Scenario_Name
                properties:
                    status:
                        type: string
                        description: it is the status of the request.The request can be stop or can be running
                        default: running
                    Scenario_Name:
                        type: string
                        description: it is the name of the scenario that the client choose
                        default: tai.vector.LoginVector
                     
        """
        return "toto"

class ResultAPI(MethodView):
    def get(self,id):
        """
        this methods will send a request to get the result of the task in a flask+celery server 
        ---
        tags:
          - matrix
        parameters:
          - name: id
            in: path
            description: it is the id of the simulation
            required: true
            type: integer
            format: int64
        responses:
          201:
            description: this method will return an id of the task which is send to the flask+ceery server
            schema:
                id: Task
                type: object
                required:
                    - request_id
                properties:
                    request_id:
                        type: string
                        description: it is the id of the task which is send to the flask+celery server
                        default: 1
        """

        data = {
            "hack": "string",
            "subitems": [
                {
                    "bla": "string",
                    "blu": 0
                }
            ]
        }
        return jsonify(data)
class ChecksAPI(MethodView):
    def get(self,id):
        """
        this methods return the status of the simulation fo vector
        ---
        tags:
          - vector
        parameters:
          - name: id
            in: path
            description: it is the id of the simulation
            required: true
            type: integer
            format: int64
        responses:
          200:
            description: this method will return the scenario name and the status of the client test request
            schema:
                id: Status
                type: object
                required:
                    - status
                    - Scenario_Name
                properties:
                    status:
                        type: string
                        description: it is the status of the request.It can be running or stop
                        default: running
                    Scenario_Name:
                        type: string
                        description: it is the name of the scenario that the client chose to launch
                        default: tai.matrix.LoginMatrix
        """             
        return "toto"

class GetReportsVectorAPI(MethodView):        
    def get(self, id):
        """
        this methods will give the list of all request_name(Name of the scenario+timsatp) with the same scenario
        ---
        tags:
          - vector
        parameters:
          - name: id
            in: path
            description: it is the id of the simulation
            required: true
            type: integer
            format: int64
        responses:
          200:
            description: this will give a list of all request_name
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
                            description: it is the list of all simulation that have in commun the same scenario of test
                            default: [loginvector-1471435202189]
        """
        data = {
            "users": [
                {"name": "Steven Wilson", "team": team_id},
                {"name": "Mikael Akerfeldt", "team": team_id},
                {"name": "Daniel Gildenlow", "team": team_id}
            ]
        }
        return jsonify(data)
class GetReportsMatrixAPI(MethodView):
    def get(self,id):
        """
        this methods will give the list of all request_name (Name of the scenario+timestap) which have the same scenario
        ---
        tags:
          - matrix
        parameters:
          - name: id
            in: path
            description: it is the id of the simulation
            required: true
            type: integer
            format: int64
        responses:
          200:
            description: this will give a List of all request_name
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
            "users": [
                {"name": "test", "team": team_id}
            ]
        }    
        return jsonify(data)
class ResultSimulationAPI(MethodView):
    def get(self,id):
        """
        this methods will ask the flask+celery server in order to get the result of the simultion.If the simultion is not ready, there will be a pending message
        ---
        tags:
          - matrix
        parameters:
          - name: id
            in: path
            description: it is the id of the task of requestResult
            required: true
            type: integer
            format: int64
        responses:
          201:
            description:  this method will give the result as a zipfile
            schema:
                id: Logfile
                type: object
                required:
                    - Logifle
                    - index
                properties:
                    logfile:
                        type: string
                        description: it is the log file of the simultion the client has chose to launch
                    index:
                        type: string
                        description: it is an html file which contain all graphe of the simulation
                    
        """



        data= {
            "user" :[
                {"name":"test","team": team_id}
            ]
        }
        return jsonify(data)

class ResultSimulationsAPI(MethodView):
    def get(self,id):
        """
        this methods will ask the flask+celery server in order to get the result of the simultion.If the simultion is not ready, there will be a pending message
        ---
        tags:
          - vector
        parameters:
          - name: id
            in: path
            description: it is the id of the task f the requestresult
            required: true
            type: integer
            format: int64
        responses:
          201:
            description:  this method will give a zip file
            schema:
                id: Logfile
                type: object
                required:
                    - Logifle
                    - index
                properties:
                    logfile:
                        type: string
                        description: it is the logfile of the simultion that the client choose to launch
                    index:
                        type: string
                        description: it is an html file of all graphe of the simultion that the client chose to launch
                    
        """
        data= {
            "user" :[
                {"name":"test","team": team_id}
            ]
        }
        return jsonify(data)

class ResultsAPI(MethodView):
    def get(self,id):
        """
        this methods will send create a new task in flask+celery server in order to get the result of the simulation
        ---
        tags:
          - vector
        parameters:
          - name: id
            in: path
            description: it is the id of the simulation
            required: true
            type: integer
            format: int64
        responses:
          201:
            description:  this method will receuve the id of the taks in the flask+celery server
            schema:
                id: Task
                type: object
                required:
                    - request_id
                properties:
                    request_id:
                        type: int
                        description: it is the id of the task which is send to the flask+celery server
                        default: 1
        """



        data= {
            "user": [
                {"name":"test", "team": team_id}
            ]
        }

        return jsonify(data)

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
    def get(self,simulation_name):
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

view = MatrixAPI.as_view('launchtest_Matrix')
app.add_url_rule(
    '/launchtest/matrix',
    view_func=view,
    methods=[ "POST"],
    endpoint='launchtest_Matrix',
)





view2=GetReportsVectorAPI.as_view('getreports_vector')
app.add_url_rule(
    '/getreports/vector/<int:id>',
    view_func=view2,
    methods=["GET"],
    endpoint='getreports_vector')

view6=GetReportsMatrixAPI.as_view('getreports_matrix')
app.add_url_rule(
    '/getreports/matrix/<int:id>',
    view_func=view6,
    methods=["GET"],
    endpoint='getreport_matrix')

view3 = VectorAPI.as_view('launchtest_Vector')
app.add_url_rule(
    '/launchtest/vector',
    view_func=view3,
    methods=[ "POST"],
    endpoint='launchtest_Vector',
)

view4= CheckAPI.as_view('checkstatus_matrix')
app.add_url_rule(
    '/checkstatus/matrix/<int:id>',
    view_func=view4,
    methods=["GET"],
    endpoint='checkstatus_matrix')

view5= ChecksAPI.as_view('checkstatus_vector')
app.add_url_rule(
    '/checkstatus/vector/<int:id>',
    view_func=view5,
    methods=["GET"],
    endpoint='checkstatus_vector')

view7= ResultAPI.as_view('requestResult_matrix')
app.add_url_rule(
    '/requestResult/matrix/<int:id>',
    view_func=view7,
    methods=["GET"],
    endpoint= 'requestResult_matrix')

        
view8= ResultsAPI.as_view('requestResult_vector')
app.add_url_rule(
    '/requestResult/vector/<int:id>',
    view_func=view8,
    methods=["GET"],
    endpoint="requestResult_vector")

view9= ResultSimulationAPI.as_view('getresult_matrix')
app.add_url_rule(
    '/getresult/matrix/<int:id>',
    view_func=view9,
    methods=["GET"],
    endpoint="getresult_matrix")

view10= ResultSimulationsAPI.as_view('getresult_vector')
app.add_url_rule(
    '/getresult/vector/<int:id>',
    view_func=view10,
    methods=["GET"],
    endpoint="getresult_vector")
  


views= SimulationAPI.as_view('simulation_name_start')
app.add_url_rule(
    '/gatling/<string:simulation_name>/start',
    view_func=views,
    methods=["GET"],
    endpoint="simulation_name_start")

views2= SimulationsAPI.as_view('simulation_name_stop')
app.add_url_rule(
    '/gatling/<string:simulation_name>/stop',
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

if __name__ == "__main__":
    app.run(debug=True)
