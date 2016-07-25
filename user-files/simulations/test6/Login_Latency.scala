 package test6
 import scala.concurrent.duration._
 
 import io.gatling.core.Predef._
 import io.gatling.http.Predef._
 import io.gatling.jdbc.Predef._
 import Trait_Latency._
 object Login_Latency2 extends Trait_Latency{
	 val feeder=csv("login.csv").random
	 val login_latency2=exec(feed(feeder))
		.exec(http("Give Login")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_3)
			.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
						//.body(RawFileBody("RecordedSimulateSENDER4_0003_request.txt"))
             
			.resources(http("Inital Sync")
			.get("/_matrix/client/api/v1/initialSync?access_token=${token}&limit=8")
			.headers(headers_4)
			// 12 taille  du domaine qui est unique à changer
			.check(jsonPath("$..room_id").transform(_.dropRight(19)).saveAs("tables")),
            http("Presence User")
			.put("/_matrix/client/api/v1/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulateSENDER4_0005_request.txt"))
			.check(status.is(200)),
            http("Turn Server")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("Home page")
			.get("/_matrix/client/app/home/home.html")
			.headers(headers_7)
			.check(status.is(200)),
            http("Event Acess")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s1380_1053_36_2_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
            http("Logo small")
			.get("/_matrix/client/img/logo-small.png")
			.check(status.is(200)),
            http("Profil User")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/displayname?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("Profile Infos")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/avatar_url?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("Public Rooms")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_4)
			.check(status.is(200)),
            http("Recents Infos")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_7)
			.check(status.is(200)),
            http("Image Close")
			.get("/_matrix/client/img/close.png")
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session =>{
				println("test :"+session)
				session
			})
		.pause(14)
	 
 }
