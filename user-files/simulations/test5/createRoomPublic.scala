 package test5
 
 import scala.concurrent.duration._
 
 import io.gatling.core.Predef._
 import io.gatling.http.Predef._
 import io.gatling.jdbc.Predef._
 import Trait_Matrix._
 
object CreateRoom_Matrix2 extends Trait_Matrix{
val createroom_matrix2=exec(http("Create Room")
			.post("/_matrix/client/api/v1/createRoom?access_token=${token}")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulatepublicroom_0015_request.txt"))
			.check(status.is(200).saveAs("Teststatus"))
			.check( currentLocation.saveAs("CurrentLocation"))
			.check(responseTimeInMillis.saveAs("ReponseTime"))
			.check(regex("""https://(.*)//.*""").count.saveAs("Https"))
			.resources(
			/*http("Room connected")
			.get("/_matrix/client/api/v1/rooms/!GHJPyXvsuUsEsSLVun%3Amatrix.allmende.io/initialSync?access_token=${token}&limit=30")
			.headers(headers_4)
			.check(status.is(200)),*/
            http("Event1")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s81_218_18_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
            http("Event2")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s83_218_18_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
           /* http("in the room")
			.get("/_matrix/client/api/v1/rooms/!GHJPyXvsuUsEsSLVun%3Amatrix.allmende.io/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzM1NTQwMTk2CjAwMmZzaWduYXR1cmUg4g9_ijgnd8BqtT66CBXZpSWGk8L21TPzgsJn8zdwE-MK&limit=30")
			.headers(headers_4)
			.check(status.is(200)),*/
            http("Room page")
			.get("/_matrix/client/app/room/room.html")
			.headers(headers_1)
			.check(status.is(200)),
            http("picture keyboard")
			.get("/_matrix/client/img/keyboard.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("picture filetype")
			.get("/_matrix/client/img/icons/filetype-gif.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("picture p25")
			.get("/_matrix/client/img/p/p25.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("Picture of user ")
			.get("/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.headers(headers_8)
			.check(status.is(404)),
            http("request_25")
			.get("/_matrix/media/v1/identicon/%40test04%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_8)
			.check(status.is(200)),
            http("picture voice")
			.get("/_matrix/client/img/voice.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("picture video")
			.get("/_matrix/client/img/video.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("picture setting")
			.get("/_matrix/client/img/settings.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("picture attach")
			.get("/_matrix/client/img/attach.png")
			.headers(headers_8)
			.check(status.is(200)))
          /*  http("Back to the room")
			.get("/_matrix/client/api/v1/rooms/!GHJPyXvsuUsEsSLVun%3Amatrix.allmende.io/messages?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzM1NTQwMTk2CjAwMmZzaWduYXR1cmUg4g9_ijgnd8BqtT66CBXZpSWGk8L21TPzgsJn8zdwE-MK&dir=b&from=t1-79_218_18_1_1_1&limit=30")
			.headers(headers_4)
			.check(status.is(200)))*/
			.check(status.is(200)))
			.exec(session =>{
			println("test"+session)
			session
		})
	}
