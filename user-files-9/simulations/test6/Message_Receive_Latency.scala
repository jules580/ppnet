package test6
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object Message_Receive_Latency2 extends Trait_Latency{
val message_receive_latency2=exec(http("Message Receive")
			.get("/_matrix/client/api/v1/events?access_token=${tokens}&from=s1380_1053_38_2_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.exec(session => {
				println("test"+session)
				session
				})
				}
