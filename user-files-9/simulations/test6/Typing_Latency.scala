package test6
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

import Trait_Latency._

object Typing_Latency2 extends Trait_Latency{
val typing_latency2=exec(http("Typing Begin")
			.put("/_matrix/client/api/v1/rooms/${tables}%3Amatrix.allmende.io/typing/%40${login}%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulateSENDER4_0029_request.txt"))
			.resources(http("Typing ok")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s1380_1053_37_2_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(5)

}
