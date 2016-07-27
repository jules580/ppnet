package test6

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Latency._
object Message_Latency2 extends Trait_Latency{
 val message_latency2=exec(http("Receive Message")
			.get("/_matrix/client/api/v1/events?access_token=${tokens}&from=s1380_1053_37_2_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
		.pause(5)
}
