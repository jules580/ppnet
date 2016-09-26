package tai.matrix
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Matrix._
object Join_Matrix2 extends Trait_Matrix{
	val feeder=csv("login.csv").random
		val join_matrix2=exec(feed(feeder))
		.exec(http("Room")
			.get("${url}/_matrix/client/app/room/room.html")
			.resources(http("KeyBoard")
			.get("${url}/_matrix/client/img/keyboard.png")
	
			.check(status.is(200)),
			http("filetype")
			.get("${url}/_matrix/client/img/icons/filetype-gif.png")

			.check(status.is(200)),
            http("renter room")
			.post("${url}/_matrix/client/api/v1/join/${table}%3Amatrix.allmende.io?access_token=${token}")
		//	.post("/_matrix/client/api/v1/join/!xjDFtDYRXcwztHXcpz%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDc6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NjExMTE1MTgxCjAwMmZzaWduYXR1cmUgaZSeKJWpyVMwy6jsIV_b2ShC6v-WPh0D5G89zG5Yyx4K")

			.body(RawFileBody("RecordedSimulatePrivate_0018_request.txt"))
		 //   .check(jsonPath("$.room_id").saveAs("Room_Id"))
		//	.check(jsonPath("$.error").saveAs("Error"))
			.check(status.is(200)),
            http("logo user")
			.get("${url}/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
		
			.check(status.is(404)),
			
            http("voice")
			.get("${url}/_matrix/client/img/voice.png")
			
			.check(status.is(200)),
            http("video")
			.get("${url}/_matrix/client/img/video.png")
	
			.check(status.is(200)),
            http("settings")
			.get("${url}/_matrix/client/img/settings.png")
	
			.check(status.is(200)),
            http("attach")
			.get("${url}/_matrix/client/img/attach.png")
	
			.check(status.is(200)),
            http("enter the room")
			.get("${url}/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/initialSync?access_token=${token}&limit=30")
	
			.check(status.is(200)),
            http("Event")
			.get("${url}/_matrix/client/api/v1/events?access_token=${token}&from=s171_256_20_1_1_1&timeout=30000")
	
			.check(status.is(200)),
            http("identity icon")
			.get("${url}/_matrix/media/v1/identicon/%40${login}%3Amatrix.allmende.io?width=96&height=96")
			
			.check(status.is(200)),
            http("p0")
			.get("${url}/_matrix/client/img/p/p0.png")
		
			.check(status.is(200)),
            http("identity icon")
			.get("${url}/_matrix/media/v1/identicon/%40${login}%3Amatrix.allmende.io?width=96&height=96")
	
			.check(status.is(200)),
            http("p25")
			.get("${url}/_matrix/client/img/p/p25.png")
	
			.check(status.is(200)),
            http("enter the room")
			.get("${url}/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/messages?access_token=${token}&dir=b&from=t1-158_256_20_1_1_1&limit=30")
	
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(4)
		.exec(session=>{
			println("session"+session)
			session
		})
		}
