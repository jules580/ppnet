 package test4
 import scala.concurrent.duration._
 
 import io.gatling.core.Predef._
 import io.gatling.http.Predef._
 import io.gatling.jdbc.Predef._
 
 import Trait._
object Privileged2 extends Trait{
	val privileged2=exec(http("Info Privileged")
			.options("/_matrix/client/r0/rooms/${tables}%3Amatrix.allmende.io/state/m.room.power_levels/?access_token=${token}")
			.headers(headers_13)
			.resources(http("Chose Privileged")
			.put("/_matrix/client/r0/rooms/${tables}%3Amatrix.allmende.io/state/m.room.power_levels/?access_token=${token}")
			.headers(headers_16)
			.body(RawFileBody("RecordedSimulateCreatePrivateRoomVector_0055_request.txt"))
			.check(status.is(200)),
            http("Setting Image")
			.get("http://" + uri1 + ":8081/img/settings.svg")
			.headers(headers_26)
			.check(status.is(304)),
            http("leave image")
			.get("http://" + uri1 + ":8081/img/leave.svg")
			.headers(headers_42)
			.check(status.is(304)),
            http("search image")
			.get("http://" + uri1 + ":8081/img/search.svg")
			.headers(headers_31)
			.check(status.is(304)),
            http("Presence User")
			.get("/_matrix/client/r0/sync?filter=2&timeout=30000&since=s1539_1237_764_7_1_2&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(18)
}
