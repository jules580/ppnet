package test4
 
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._
object SendMessage2 extends Trait {

			val feeder=csv("answer.csv").random
			val sendmessage2=exec(feed(feeder))
			.exec(http("Wait Message")
			.options("/_matrix/client/r0/rooms/${table}%3Amatrix.allmende.io/send/m.room.message/m1468424657926.0?access_token=${token}")
			.headers(headers_13)
			.resources(http("Message Send ")
			.put("/_matrix/client/r0/rooms/${table}%3Amatrix.allmende.io/send/m.room.message/m1468424657926.0?access_token=${token}")
			.headers(headers_16)
			.body(StringBody("""{"msgtype":"m.text","body":"${answer}"}"""))
			.check(status.is(200)),
            http("End Typing")
			.put("/_matrix/client/r0/rooms/${table}%3Amatrix.allmende.io/typing/%40${login}%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_16)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0068_request.txt"))
			.check(status.is(200)),
            http("Event message")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1548_1239_766_7_1_2&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session =>{
				println("session"+session)
				session
			})
		}
