package tai.vector

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._
object Join2 extends Trait {




    val feeder=csv("login.csv").random
    
	val join2 = exec(feed(feeder))
		.exec(http("Join Possibility")
			.options(url+"/_matrix/client/r0/createRoom?access_token=${token}")
			.headers(headers_11)
			.resources(http("Can join")
			.post(url+"/_matrix/client/r0/createRoom?access_token=${token}")
			.headers(headers_12)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0036_request.txt"))
			.check(status.is(200))
			.check(jsonPath("$.room_id").transform(_.split(':')(0).toString).saveAs("RoomId")),
		      http("filter sync ")
			.get(url+"/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1546_1239_764_7_1_2&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
			//.check(status.is(200)))
          http("search")
			.get(url2 + "/img/search.svg")
			.headers(headers_4)
			.check(status.is(200)),
            http("voice")
			.get(url2 + "/img/voice.svg")
			.headers(headers_4)
			.check(status.is(200)),
            http("setting")
			.get(url2 + "/img/settings.svg")
			.headers(headers_5)
			.check(status.is(200)),
            http("leave")
			.get(url2 + "/img/leave.svg")
			.headers(headers_6)
			.check(status.is(200)),
            http("upload")
			.get(url2 + "/img/upload.svg")
			.headers(headers_7)
			.check(status.is(200)),
            http("call")
			.get(url2 + "/img/call.svg")
			.headers(headers_8)
			.check(status.is(200)))
			.check(status.is(200)))
            		.pause(1)
			.exec(session=>{
				println("session"+session)
				session
				})
			.pause(2)
		.exec(http("Infos rooms")
			.get(url+"/_matrix/client/r0/rooms/${table}%3Amatrix.allmende.io/messages?from=s11333_4446_6_82_1_2&limit=20&dir=b&access_token=${token}")
			.headers(headers_14)
            .resources(http("time_enter")
			.get(url+"/_matrix/client/r0/rooms/${table}%3Amatrix.allmende.io/messages?from=t1-11332_4446_6_82_1_2&limit=20&dir=b&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)))
			.check(status.is(200)))
        
			.doIfOrElse(_.contains("RoomId")){
					exec(session => {
						println("Success Join")
						session
					})
				}{
					exec(session =>{
						println("Fail join")
						session
					})
				}
}
