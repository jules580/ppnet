package test6
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Latency._

object SendMessage_Latency2 extends Trait_Latency{
	val feeder=csv("answer.csv").random
			
	val sendmessage_latency2=exec(feed(feeder))
			.exec(http("Send Message")
			.put("/_matrix/client/api/v1/rooms/${tables}%3Amatrix.allmende.io/typing/%40${login}%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulateSENDER4_0031_request.txt"))
			
			.resources(http("Message send")
			.put("/_matrix/client/api/v1/rooms/${tables}%3Amatrix.allmende.io/send/m.room.message/m1468400258565?access_token=${token}")
			.headers(headers_5)
			//.body(RawFileBody("RecordedSimulateSENDER4_0032_request.txt"))
			.body(StringBody("""{"msgtype":"m.text","body":"${answer}"}"""))
			.check(status.is(200)),
            http("Infos Message")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s1380_1053_38_2_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session =>{
			println("Answer"+session("answer").as[String])
			println("Session"+session)
			session
			})
		}
           
	
