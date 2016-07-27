package test6
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Latency._

object List_Message_Latency2 extends Trait_Latency{
	val list_message_latency2=exec(http("All Message")
			.get("/_matrix/client/api/v1/rooms/${tables}%3Amatrix.allmende.io/messages?access_token=${token}&dir=b&from=t35-1372_1053_36_2_1_1&limit=30")
			.headers(headers_4)
			.resources(http("Event Access")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s1380_1053_36_2_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(2)
	}

