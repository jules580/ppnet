 package tai.matrix
 
 import scala.concurrent.duration._
 
 import io.gatling.core.Predef._
 import io.gatling.http.Predef._
 import io.gatling.jdbc.Predef._
 import Trait_Matrix._
 
object CreateRoom_Matrix2 extends Trait_Matrix{
val createroom_matrix2=exec(http("Create Room")
			.post("${url}/_matrix/client/api/v1/createRoom?access_token=${token}")

			.body(RawFileBody("RecordedSimulatepublicroom_0015_request.txt"))
			/*.check(status.is(200).saveAs("Teststatus"))
			.check( currentLocation.saveAs("CurrentLocation"))
			.check(responseTimeInMillis.saveAs("ReponseTime"))
			.check(regex("""https://(.*)//.*""").count.saveAs("Https"))*/
			.check(jsonPath("$.room_id").transform(_.split(":")(0).toString).saveAs("Room_Id"))
			.resources(
			http("Room connected")
			.get("${url}/_matrix/client/api/v1/rooms/${Room_Id}%3Amatrix.allmende.io/initialSync?access_token=${token}&limit=30")
			.check(status.is(200)),
            http("Event1")
			.get("${url}/_matrix/client/api/v1/events?access_token=${token}&from=s81_218_18_1_1_1&timeout=30000")
			.check(status.is(200)),
            http("Event2")
			.get("${url}/_matrix/client/api/v1/events?access_token=${token}&from=s83_218_18_1_1_1&timeout=30000")
			.check(status.is(200)),
            http("in the room")
			.get("${url}/_matrix/client/api/v1/rooms/${Room_Id}%3Amatrix.allmende.io/initialSync?access_token=${token}&limit=30")
			.check(status.is(200)),
            http("Room page")
			.get("${url}/_matrix/client/app/room/room.html")
			.check(status.is(200)),
            http("picture keyboard")
			.get("${url}/_matrix/client/img/keyboard.png")
			.check(status.is(200)),
            http("picture filetype")
			.get("${url}/_matrix/client/img/icons/filetype-gif.png")
			.check(status.is(200)),
            http("picture p25")
			.get("${url}/_matrix/client/img/p/p25.png")
			.check(status.is(200)),
            http("Picture of user ")
			.get("${url}/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.check(status.is(404)),
            http("request_25")
			.get("${url}/_matrix/media/v1/identicon/%40${login}%3Amatrix.allmende.io?width=96&height=96")
			.check(status.is(200)),
            http("picture voice")
			.get("${url}/_matrix/client/img/voice.png")
			.check(status.is(200)),
            http("picture video")
			.get("${url}/_matrix/client/img/video.png")
			.check(status.is(200)),
            http("picture setting")
			.get("${url}/_matrix/client/img/settings.png")
			.check(status.is(200)),
            http("picture attach")
			.get("${url}/_matrix/client/img/attach.png")
			.check(status.is(200)),
           http("Back to the room")
			.get("${url}/_matrix/client/api/v1/rooms/${Room_Id}%3Amatrix.allmende.io/messages?access_token=${token}&from=t1-79_218_18_1_1_1&limit=30")
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session =>{
			println("session"+session)
			session
		}
		)
		.doIfOrElse(_.contains("Room_Id")){
			exec(session => {
				println("Success create room")
				session
			}
			)
		}{
			exec(session => {
				println("Fail create room")
				session
			}
		)
	}
}

