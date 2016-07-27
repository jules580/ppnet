package test5plus
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Matrix._
object Enter_Room_Matrix2 extends Trait_Matrix{
		val feeder=csv("login.csv").random
			val enter_room_matrix2=exec(feed(feeder))
			.exec(http("Join Room")
			.get("/_matrix/client/app/room/room.html")
			.headers(headers_10)
			.resources(http("Keyboard image")
			.get("/_matrix/client/img/keyboard.png")
			.headers(headers_19)
			.check(status.is(200)),
            http("Member powerlevel")
			.get("/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.headers(headers_20)
			.check(status.is(404)),
            http("filetype image")
			.get("/_matrix/client/img/icons/filetype-gif.png")
			.headers(headers_19)
			.check(status.is(200)),
            http("icon identity")
			.get("/_matrix/media/v1/identicon/%40${login}%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_20)
			.check(status.is(200)),
            http("p0 image")
			.get("/_matrix/client/img/p/p0.png")
			.headers(headers_19)
			.check(status.is(200)),
            http("icons identity")
			.get("/_matrix/media/v1/identicon/%40${login}%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_20)
			.check(status.is(200)),
            http("p25 image")
			.get("/_matrix/client/img/p/p25.png")
			.headers(headers_19)
			.check(status.is(200)),
            http("voice image")
			.get("/_matrix/client/img/voice.png")
			.headers(headers_19)
			.check(status.is(200)),
            http("video image")
			.get("/_matrix/client/img/video.png")
			.headers(headers_19)
			.check(status.is(200)),
            http("setting image")
			.get("/_matrix/client/img/settings.png")
			.headers(headers_19)
			.check(status.is(200)),
            http("attach image")
			.get("/_matrix/client/img/attach.png")
			.headers(headers_19)
			.check(status.is(200)),
            http("Rooms infos")
			.get("/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/messages?access_token=${token}&dir=b&from=t3-9026_3231_1186_77_1_2&limit=30")
			.headers(headers_9)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(6)
}
