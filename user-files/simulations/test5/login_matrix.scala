 package test5
 
 import scala.concurrent.duration._
 import io.gatling.core.Predef._
 import io.gatling.http.Predef._
 import io.gatling.jdbc.Predef._
 import Trait_Matrix._
 
 object Login_Matrix2 extends Trait_Matrix{
	 val feeder=csv("login.csv").random
	
		val login_matrix2= exec(feed(feeder))
		.exec(http("login")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_9) 
			.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.resources(http("Home user")
			.get("/_matrix/client/app/home/home.html")
			.check(status.is(200)),
        
            http("Logo-small")
			.get("/_matrix/client/img/logo-small.png")
			.headers(headers_11)
			.check(status.is(200)),
            http("TurnServer Access")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=${token}")
			.headers(headers_12)
			.check(status.is(200)),
            http("DisplayName")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/displayname?access_token=${token}")
			.headers(headers_12)
			.check(status.is(200)),
            http("Get public Room")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_12)
			.check(status.is(200)),
            http("profile info")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/avatar_url?access_token=${token}")
			.headers(headers_12)
			.check(status.is(200)),
            http("Info recent event")
			.get("/_matrix/client/app/recents/recents.html")
			.check(status.is(200))
			.check(currentLocation.saveAs("ccurrentLocation"))
			.check(responseTimeInMillis.saveAs("responseTime"))
			.check(regex("""https://(.*)/.*""").count.saveAs("Https")),
			//.check(bodyString.saveAs("bodystring"))
			//.check(bodyBytes.saveAs("bodybytes")),
            http("Close picture")
			.get("/_matrix/client/img/close.png")
			.headers(headers_11)
			.check(status.is(200)))
			.check(status.is(200)))
			
			.exec(session => {
				println("test"+session)
				session
			})
 }
 
