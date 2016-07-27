package test5
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Matrix._

object SendMessage_Matrix2 extends Trait_Matrix{
	val feeder=csv("answer.csv").random
	val sendmessage_matrix2=exec(feed(feeder))
		.exec(http("Not typing")
			.put("/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/typing/%40${login}%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatePrivate_0033_request.txt"))
			.resources(http("Send message")
			.put("/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/send/m.room.message/m1467735171633?access_token=${token}")
			.headers(headers_5)
			.body(StringBody("""{"msgtype":"m.text","body":"${answer}"}"""))
			.check(status.is(200)),
            http("Message send")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s171_256_22_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session=>{
			println("test:"+session)
			session
			})
} 
