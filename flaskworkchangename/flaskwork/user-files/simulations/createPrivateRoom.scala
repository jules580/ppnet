package tai.vector
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

import Trait._
object CreatePrivateRoom2 extends Trait{
	val createprivateroom2=exec(http("create Rooms")
			.options(url+"/_matrix/client/r0/createRoom?access_token=${token}")
			.headers(headers_11)
			.resources(http("Rooms request")
			.post(url+"/_matrix/client/r0/createRoom?access_token=${token}")
			.headers(headers_12)
			.body(RawFileBody("RecordedSimulateCreatePrivateRoomVector_0036_request.txt"))
			.check(jsonPath("$.room_id").transform(_.split(':')(0).toString).saveAs("tables")),
            http("Sync filter1")
			.get(url+"/_matrix/client/r0/sync?filter=2&timeout=30000&since=s1534_1236_764_7_1_2&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("Sync Filter2")
			.get(url+"/_matrix/client/r0/sync?filter=2&timeout=30000&since=s1537_1236_764_7_1_2&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)))
            /*http("admin image")
			.get("http://" + uri1 + ":8081/img/admin.svg")
			.headers(headers_39)
			.check(status.is(304)),
            http("edit image")
			.get("http://" + uri1 + ":8081/img/edit.png")
			.headers(headers_40)
			.check(status.is(304)),
            http("upload image")
			.get("http://" + uri1 + ":8081/img/upload.svg")
			.headers(headers_41)
			.check(status.is(304)),
            http("leave image")
			.get("http://" + uri1 + ":8081/img/leave.svg")
			.headers(headers_42)
			.check(status.is(304)),
            http("voice image")
			.get("http://" + uri1 + ":8081/img/voice.svg")
			.headers(headers_43)
			.check(status.is(304)),
            http("setting image")
			.get("http://" + uri1 + ":8081/img/settings.svg")
			.headers(headers_26)
			.check(status.is(304)),
            http("search image")
			.get("http://" + uri1 + ":8081/img/search.svg")
			.headers(headers_31)
			.check(status.is(304)),
            http("call image")
			.get("http://" + uri1 + ":8081/img/call.svg")
			.headers(headers_46)
			//.check(status.is(304)))
*/
			.check(status.is(200)))
			.exec(session =>{
				
			println("session"+session("tables").as[String])
				session
			})
			
		.pause(2)
	}
