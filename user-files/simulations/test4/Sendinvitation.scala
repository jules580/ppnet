 package test4
 import scala.concurrent.duration._
 
 import io.gatling.core.Predef._
 import io.gatling.http.Predef._
 import io.gatling.jdbc.Predef._
 
 import Trait._
object SendInvitation2 extends Trait{
	val feeder=csv("login2.csv").random

		val sendinvitation2=exec(feed(feeder))
		.exec(
		http("Rooms Infos")
			.options("/_matrix/client/r0/rooms/${tables}%3Amatrix.allmende.io/invite?access_token=${token}")
			.headers(headers_11)
			.resources(http("Send Invitation")
			.post("/_matrix/client/r0/rooms/${tables}%3Amatrix.allmende.io/invite?access_token=${token}")
			.headers(headers_12)
			.body(RawFileBody("RecordedSimulateCreatePrivateRoomVector_0062_request.txt"))
			.check(status.is(200)),
            http("f4c371 image")
			.get("http://" + uri1 + ":8081/img/f4c371.png")
			.headers(headers_63)
			.check(status.is(304)))
			.check(status.is(200)))
			.exec(session => {
				println("session"+session)
				session
			})
			
		}
		
