package test4
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._


object Join2 extends Trait{
	val join2=exec(http("Join Possibility")
			.options("/_matrix/client/r0/createRoom?access_token=${token}")
			.headers(headers_11)
			.resources(http("Can join")
			.post("/_matrix/client/r0/createRoom?access_token=${token}")
			.headers(headers_12)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0036_request.txt"))
			.check(status.is(200))
			.check(jsonPath("$.room_id").transform(_.split(':')(0).toString).saveAs("Room_Id")),
            http("")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1542_1239_764_7_1_2&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("call image")
			.get("http://" + uri1 + ":8081/img/call.svg")
			.headers(headers_38)
			.check(status.is(304)),
            http("search image")
			.get("http://" + uri1 + ":8081/img/search.svg")
			.headers(headers_24)
			.check(status.is(304)),
            http("voice image")
			.get("http://" + uri1 + ":8081/img/voice.svg")
			.headers(headers_40)
			.check(status.is(304)),
            http("setting image")
			.get("http://" + uri1 + ":8081/img/settings.svg")
			.headers(headers_23)
			.check(status.is(304)),
            http("leave image")
			.get("http://" + uri1 + ":8081/img/leave.svg")
			.headers(headers_42)
			.check(status.is(304)),
            http("upload image")
			.get("http://" + uri1 + ":8081/img/upload.svg")
			.headers(headers_43)
			.check(status.is(304)),
            http("Infos room")
			.get("/_matrix/client/r0/rooms/${table}%3Amatrix.allmende.io/messages?from=s1541_1239_764_7_1_2&limit=20&dir=b&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("f4c371 image")
			.get("http://" + uri1 + ":8081/img/f4c371.png")
			.headers(headers_45)
			.check(status.is(304)),
            http("edit image")
			.get("http://" + uri1 + ":8081/img/edit.png")
			.headers(headers_46)
			.check(status.is(304)),
            http("filter sync ")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1546_1239_764_7_1_2&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("time enter")
			.get("/_matrix/client/r0/rooms/${table}%3Amatrix.allmende.io/messages?from=t1-1540_1239_764_7_1_2&limit=20&dir=b&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("admin image")
			.get("http://" + uri1 + ":8081/img/admin.svg")
			.headers(headers_49)
			.check(status.is(304)))
			.check(status.is(200)))
			.exec(session =>{
				//println("session 38"+session)
				session
			})
			.doIfOrElse(_.contains("Room_id")){
					exec(session=>{
					println("Success Join")
					session}
				)
				}{
					exec(session =>{
						println("Fail Join")
						session
					})
					
				}
		.pause(1)
	}

