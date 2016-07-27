package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulatepublicroomtrue2 extends Simulation {
before{
	println("Simulation of private room is about to start")
}
	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.acceptHeader("application/json, text/plain, */*")
		.acceptEncodingHeader("gzip, deflate, sdch")
		.acceptLanguageHeader("fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

	val headers_0 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_16 = Map("Accept" -> "image/webp,image/*,*/*;q=0.8")

    val uri1 = "http://0.0.0.0:3030/_matrix"

object Login{
	val feeder=csv("login.csv").random
		val login=exec(feed(feeder))
		.exec(http("Login")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_0)
			.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.resources(http("InitialSync")
			.get("/_matrix/client/api/v1/initialSync?access_token=${token}&limit=8")
			.check(status.is(200)),
            http("TurnServer")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=${token}")
			.check(status.is(200)),
          /*  http("Infos Profile")
			.get("/_matrix/client/api/v1/profile/%40${login}3Amatrix.allmende.io/displayname?access_token=${token}")
			.check(status.is(200)),
            http("Infos Profile2")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/avatar_url?access_token=${token}")
			.check(status.is(200)),*/
            http("List Public Rooms")
			.get("/_matrix/client/api/v1/publicRooms")
			.check(status.is(200)),
            http("Access Event1")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s164_249_20_1_1_1&timeout=30000")
			.check(status.is(200)),
            http("Access Event2")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s164_250_20_1_1_1&timeout=30000")
			.check(status.is(200)))
			.check(status.is(200)))
			
		.pause(23)
	}
	object CreateRoom{
	val feeder= csv("login2.csv").random
	val createroom= exec(feed(feeder))
		.exec(http("CreateRoom")
			.post("/_matrix/client/api/v1/createRoom?access_token=${token}")
			.headers(headers_0)
			//.body(RawFileBody("RecordedSimulatepublicroomtrue_0008_request.txt"))
			.body(StringBody("""{"visibility":"true","invite":["${invite}"]}"""))
			.check(responseTimeInMillis.saveAs("ReponseTime"))
			.check(currentLocation.saveAs("CurrentLocation"))
			.check(status.is(200).saveAs("teststatus"))
			.check(regex("""https://(.*)/.*""").count.saveAs("Https"))
			.resources(//http("acces Room")
			//.get("/_matrix/client/api/v1/rooms/!hhYFDErHCDGoMIPUNU%3Amatrix.allmende.io/initialSync?access_token=${token}&limit=30")
			//.check(status.is(200)),
            http("Event from the room")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s166_250_20_1_1_1&timeout=30000")
			.check(status.is(200)),
            http("Event form the room 2")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s167_251_20_1_1_1&timeout=30000")
			.check(status.is(200)),
            http("Event from the room3")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s168_251_20_1_1_1&timeout=30000")
			.check(status.is(200)),
            http("Event form the room4")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s169_251_20_1_1_1&timeout=30000")
			.check(status.is(200)),
          /*  http("access Room2")
			.get("/_matrix/client/api/v1/rooms/!hhYFDErHCDGoMIPUNU%3Amatrix.allmende.io/initialSync?access_token=${token}&limit=30")
			.check(status.is(200)),*/
            http("request_15")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s170_251_20_1_1_1&timeout=30000")
			.check(status.is(200)),
            http("Infos identity")
			.get("/_matrix/media/v1/identicon/%40${login}%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_16)
			.check(status.is(200)),
            http("Logo user")
			.get("/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.headers(headers_16)
			.check(status.is(404)))
           // http("Infos room")
			//.get("/_matrix/client/api/v1/rooms/!hhYFDErHCDGoMIPUNU%3Amatrix.allmende.io/messages?access_token=${token}&dir=b&from=t1-164_251_20_1_1_1&limit=30")
			//.check(status.is(200)))
			.check(status.is(200)))
			.exec(session => {
				
				println("test: "+session)
			
				session
			})
			
}
after{
	println("Simulation about private room is finished")
}
val admins= scenario("Admins").exec(Login.login,CreateRoom.createroom)
	setUp(admins.inject(
	//nothingFor(4 seconds),
	rampUsers(20) over(20 seconds)))
	//rampUsers(10) over (29 seconds))
	/*constantUsersPerSec(2) during (5 seconds))
	constantUsersPerSec(2) during (5 seconds) randomized,
    rampUsersPerSec(2) to 3 during (3 seconds)*/
	
	//.throttle(reachRps(20) in (20 seconds)))
	
	
	
	.protocols(httpProtocol)
	
}

