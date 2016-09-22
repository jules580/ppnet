package tai.vector
import scala.concurrent.duration
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._

    object CreatePublicRoom2 extends Trait{
	val createpublicroom2=exec(http("create room")
			.options(url+"/_matrix/client/r0/createRoom?access_token=${token}")
			.headers(headers_11)
			.resources(http("Guest Join")
			.post(url+"/_matrix/client/r0/createRoom?access_token=${token}")
			.headers(headers_12)
			.body(RawFileBody("RecordedSimulateCreatePublicroom_0038_request.txt"))
			.check(status.is(200))
			 .check(jsonPath("$.room_id").transform(_.split(':')(0).toString).saveAs("roomid")),
            http("Infos event")
			.get(url+"/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1511_1233_764_7_1_1&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
			//.check(status.is(200)))
            http("Voice image")
			.get( url2+ "/img/voice.svg")
			.headers(headers_40)
			.check(status.is(200)),
			//.check(status.is(200)))
            http("search image")
			.get( url2 + "/img/search.svg")
			.headers(headers_25)
			.check(status.is(304)),
			//.check(status.is(200)))
            http("setting image")
			.get( url2 + "/img/settings.svg")
			.headers(headers_27)
			.check(status.is(200)),
            http("leave image")
			.get( url2 + "/img/leave.svg")
			.headers(headers_43)
			.check(status.is(200)),
            http("upload image")
			.get( url2 + "/img/upload.svg")
			.headers(headers_44)
			.check(status.is(200)),
            http("call image")
			.get(url2 +"/img/call.svg")
			.headers(headers_45)
			.check(status.is(200)))
			.check(status.is(200)))
			
			.pause(2)
          .exec(http("Info user")
			.get(url+"/_matrix/client/r0/rooms/${roomid}%3Amatrix.allmende.io/messages?from=s1510_1233_764_7_1_1&limit=20&dir=b&access_token=${token}")
			.headers(headers_14)
			
			
            /*http("edit image")
			.get("http://" + uri1 + ":8081/img/edit.png")
			.headers(headers_47)
			.check(status.is(304)),*/
          .resources(http(" Time Room")
			.get(url+"/_matrix/client/r0/rooms/${roomid}%3Amatrix.allmende.io/messages?from=t1-1509_1233_764_7_1_1&limit=20&dir=b&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
           http("admin image")
			.get(url2 + "/img/admin.svg")
			.headers(headers_34)
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session =>{
			println("session"+session)
				session
			})
			.doIfOrElse(_.contains("roomid")){
				exec(session=>{
					println("Sucess")
					session
				})
			}{
			 exec(session=>{
					println("Fail")
					session
				})
			}
			
		
		
}
