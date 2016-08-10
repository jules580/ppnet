package test4
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._

object Communicate2 extends Trait{
	val communicate2=exec(http("List Guest")
			.options(url+"/_matrix/client/r0/rooms/${table}%3Amatrix.allmende.io/invite?access_token=${token}")
			.headers(headers_11)
			.resources(http("Invite Guest")
			.post(url+"/_matrix/client/r0/rooms/${table}%3Amatrix.allmende.io/invite?access_token=${token}")
			.headers(headers_12)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0061_request.txt"))
			.check(status.is(200)),
            http("Event communication")
			.get(url+"/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1548_1239_764_7_1_2&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200))
				.check(jsonPath("$.rooms.join..ephemeral.events").saveAs("User_Id_Receiver")))
			.check(status.is(200)))
		.pause(5)
		.exec(session =>{
			println("Session"+session)
			session
		})
	}
