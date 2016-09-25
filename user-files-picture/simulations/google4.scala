package test4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class google4 extends Simulation {
	//val url1 = System.getenv("Jsonpoint")
//val feeders=jsonUrl(url1)

before{
	println("Simulation about login will begin")
}
	val httpProtocol = http
		.inferHtmlResources(WhiteList(), BlackList())
		.acceptHeader("application/json, text/plain, */*")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")


	object Index{
		val url2=System.getenv("Jsonpoint")
		val feeders=jsonUrl(url2)
		val feeder=csv("login.csv").random
		
		val index=exec(feed(feeder))
		.exec(feed(feeders))
		.exec(http("Init")
			.get("${url}/_matrix/client/")
			.resources(http("Acces api")
			
			
				.get("${url}/_matrix/client/api/v1/pushrules/?access_token=${token}")
			.check(status.is(200)),
            http("Access sync")
			.get("${url}/_matrix/client/api/v1/initialSync?access_token=${token}&limit=8")
			.check(status.is(200)),
            http("presence")
			.put("${url}/_matrix/client/api/v1/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
			.body(RawFileBody("RecordedSimulatelogin_0003_request.txt"))
			.check(status.is(200)),
            http("turnServer")
			.get("${url}/_matrix/client/api/v1/voip/turnServer?access_token=${token}")
			.check(status.is(200)),
            http("Login page")
			.get("${url}/_matrix/client/app/login/login.html")
			.check(status.is(200)),
            http("list event")
			.get("${url}/_matrix/client/api/v1/events?access_token=${token}&from=s20_10_4_1_1_1&timeout=30000")
			.check(status.is(200)),
            http("logo picture")
			.get("${url}/_matrix/client/img/logo.png")
			.check(status.is(200)),
            http("event")
			.get("${url}/_matrix/client/api/v1/events?access_token=${token}&from=s20_11_5_1_1_1&timeout=30000")
			.check(status.is(200)))
			.check(status.is(200)))
			.pause(7)
		}
		object Login{
				
			 val feeder =csv("login.csv").random
			//val feeders=jsonUrl(url1)
		val login= exec(feed(feeder))
		//.exec(feed(feeders))
		.exec(http("login")
			.post("${url}/_matrix/client/api/v1/login")
			.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.resources(http("Home user")
			.get("${url}/_matrix/client/app/home/home.html")
			.check(status.is(200)),
        
            http("Logo-small")
			.get("${url}/_matrix/client/img/logo-small.png")
			.check(status.is(200)),
            http("TurnServer Access")
			.get("${url}/_matrix/client/api/v1/voip/turnServer?access_token=${token}")
			.check(status.is(200)),
            http("DisplayName")
			.get("${url}/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/displayname?access_token=${token}")
			.check(status.is(200)),
            http("Get public Room")
			.get("${url}/_matrix/client/api/v1/publicRooms")
			.check(status.is(200)),
            http("profile info")
			.get("${url}/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/avatar_url?access_token=${token}")
			.check(status.is(200)),
            http("Info recent event")
			.get("${url}/_matrix/client/app/recents/recents.html")
			.check(currentLocation.saveAs("ccurrentLocation"))
			.check(responseTimeInMillis.saveAs("responseTime"))
			.check(regex("""https://(.*)/.*""").count.saveAs("Https")),
			//.check(bodyString.saveAs("bodystring"))
			//.check(bodyBytes.saveAs("bodybytes")),
            http("Close picture")
			.get("${url}/_matrix/client/img/close.png")
	
			.check(status.is(200)))
			.check(status.is(200)))
		}
			 object CreatePublicRoom{
	val createpublicroom=exec(http("create room")
			.options("${url}/_matrix/client/r0/createRoom?access_token=${token}")
	
			.resources(http("Guest Join")
			.post("${url}/_matrix/client/r0/createRoom?access_token=${token}")
		
			.body(RawFileBody("RecordedSimulateCreatePublicroom_0038_request.txt"))

			 .check(jsonPath("$.room_id").transform(_.split(':')(0).toString).saveAs("room_id")),
            http("Infos event")
			.get("${url}/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1511_1233_764_7_1_1&access_token=${token}")
		
			.check(status.is(200)),
            http("Voice image")
			.get("{url}:8081/img/voice.svg")
	
			.check(status.is(304)),
            http("search image")
			.get("${url}:8081/img/search.svg")
	
			.check(status.is(304)),
            http("setting image")
			.get("${url}:8081/img/settings.svg")
			.check(status.is(304)),
            http("leave image")
			.get("${url}:8081/img/leave.svg")
			.check(status.is(304)),
            http("upload image")
			.get("${url}:8081/img/upload.svg")
			.check(status.is(304)),
            http("call image")
			.get("${url}:8081/img/call.svg")
			.check(status.is(304)),
          http("Info user")
			.get("${url}/_matrix/client/r0/rooms/${room_id}%3Amatrix.allmende.io/messages?from=s1510_1233_764_7_1_1&limit=20&dir=b&access_token=${token}")
			.check(status.is(200)),
            http("edit image")
			.get("${url}:8081/img/edit.png")
			.check(status.is(304)),
            http(" Time Room")
			.get("${url}/_matrix/client/r0/rooms/${room_id}%3Amatrix.allmende.io/messages?from=t1-1509_1233_764_7_1_1&limit=20&dir=b&access_token=${token}")
			.check(status.is(200)),
            http("admin image")
			.get("${url}:8081/img/admin.svg")
			.check(status.is(200)))
			.check(status.is(200)))
			
			
			.exec(session => {
				println(System.getenv("Jsonpoint"))

				session
			})
          
		}

after{
	println("Simulation about login is finished")
}
val admins=scenario("Admins").exec(Index.index,Login.login,CreatePublicRoom.createpublicroom)
	setUp(admins.inject(
	rampUsers(1) over (1 seconds)))
	
	.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5),
	details("Login").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
	
}



				
	
