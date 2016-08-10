package test4
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._
object Typing2 extends Trait{
	val typing2=exec(http("Typing ?")
			.options(url+"/_matrix/client/r0/rooms/${table}%3Amatrix.allmende.io/typing/%40{login}%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_13)
			.resources(http("Typing ok")
			.put(url+"/_matrix/client/r0/rooms/${table}%3Amatrix.allmende.io/typing/%40${login}%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_16)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0064_request.txt"))
			.check(status.is(200)),
            http("Typing event")
			.get(url+"/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1548_1239_765_7_1_2&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200))
			.check(jsonPath("$.rooms.join..ephemeral.events").saveAs("type")))
			.check(status.is(200)))
		.pause(2)
		.exec(session =>{
			println("session"+session)
			session
		})
		
	}
