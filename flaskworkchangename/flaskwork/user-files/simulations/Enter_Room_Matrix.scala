package tai.matrix
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Matrix._
object Enter_Room_Matrix2 extends Trait_Matrix{
		val feeder=csv("login.csv").random
			val enter_room_matrix2=exec(feed(feeder))
			.exec(http("Join Room")
			.get("${url}/_matrix/client/app/room/room.html")
			
			.resources(http("Keyboard image")
			.get("${url}/_matrix/client/img/keyboard.png")
			
			.check(status.is(200)),
            http("Member powerlevel")
			.get("${url}/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.check(status.is(404)),
            http("filetype image")
			.get("${url}/_matrix/client/img/icons/filetype-gif.png")
			
			.check(status.is(200)),
            http("icon identity")
			.get("${url}/_matrix/media/v1/identicon/%40${login}%3Amatrix.allmende.io?width=96&height=96")
			
			.check(status.is(200)),
            http("p0 image")
			.get("${url}/_matrix/client/img/p/p0.png")
		
			.check(status.is(200)),
            http("icons identity")
			.get("${url}/_matrix/media/v1/identicon/%40${login}%3Amatrix.allmende.io?width=96&height=96")
			
			.check(status.is(200)),
            http("p25 image")
			.get("${url}/_matrix/client/img/p/p25.png")
			
			.check(status.is(200)),
            http("voice image")
			.get("${url}/_matrix/client/img/voice.png")
		
			.check(status.is(200)),
            http("video image")
			.get("${url}/_matrix/client/img/video.png")
			
			.check(status.is(200)),
            http("setting image")
			.get("${url}/_matrix/client/img/settings.png")
			
			.check(status.is(200)),
            http("attach image")
			.get("${url}/_matrix/client/img/attach.png")
		
			.check(status.is(200)),
            http("Rooms infos")
			.get("${url}/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/messages?access_token=${token}&dir=b&from=t3-9026_3231_1186_77_1_2&limit=30")
			
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(6)
}
