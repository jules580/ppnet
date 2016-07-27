package test5
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Matrix._
object Join_Matrix2 extends Trait_Matrix{
	val feeder=csv("login.csv").random
		val join_matrix2=exec(feed(feeder))
		.exec(http("Room")
			.get("/_matrix/client/app/room/room.html")
			.resources(http("KeyBoard")
			.get("/_matrix/client/img/keyboard.png")
			.headers(headers_8)
			.check(status.is(200)),
			http("filetype")
			.get("/_matrix/client/img/icons/filetype-gif.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("renter room")
			.post("/_matrix/client/api/v1/join/${table}%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulatePrivate_0018_request.txt"))
			.check(status.is(200)),
            http("logo user")
			.get("/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.headers(headers_8)
			.check(status.is(404)),
			
            http("voice")
			.get("/_matrix/client/img/voice.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("video")
			.get("/_matrix/client/img/video.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("settings")
			.get("/_matrix/client/img/settings.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("attach")
			.get("/_matrix/client/img/attach.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("enter the room")
			.get("/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/initialSync?access_token=${token}&limit=30")
			.headers(headers_4)
			.check(status.is(200)),
            http("Event")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s171_256_20_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
            http("identity icon")
			.get("/_matrix/media/v1/identicon/%40${login}%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_8)
			.check(status.is(200)),
            http("p0")
			.get("/_matrix/client/img/p/p0.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("identity icon")
			.get("/_matrix/media/v1/identicon/%40${login}%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_8)
			.check(status.is(200)),
            http("p25")
			.get("/_matrix/client/img/p/p25.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("enter the room")
			.get("/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/messages?access_token=${token}&dir=b&from=t1-158_256_20_1_1_1&limit=30")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(4)
	}
