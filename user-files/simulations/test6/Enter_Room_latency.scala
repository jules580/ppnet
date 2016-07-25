 
package test6
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object Enter_Room_Latency2 extends Trait_Latency{
	val enter_room_latency2=exec(http("Room Page")
			.get("/_matrix/client/app/room/room.html")
			.headers(headers_7)
			.resources(http("KeyBoard Images")
			.get("/_matrix/client/img/keyboard.png")
			.headers(headers_16)
			.check(status.is(200)),
            http("Member Image")
			.get("/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.headers(headers_17)
			.check(status.is(404)),
            http("Filetype Image")
			.get("/_matrix/client/img/icons/filetype-gif.png")
			.headers(headers_16)
			.check(status.is(200)),
            http("Identity Icon")
			.get("/_matrix/media/v1/identicon/%40${login}%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_16)
			.check(status.is(200)),
            http("P25 image")
			.get("/_matrix/client/img/p/p25.png")
			.headers(headers_16)
			.check(status.is(200)),
            http("Identity Icon2")
			.get("/_matrix/media/v1/identicon/%40${login}%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_16)
			.check(status.is(200)),
            http("p0 Image")
			.get("/_matrix/client/img/p/p0.png")
			.headers(headers_16)
			.check(status.is(200)),
            http("Voice Image")
			.get("/_matrix/client/img/voice.png")
			.headers(headers_16)
			.check(status.is(200)),
            http("Video Image")
			.get("/_matrix/client/img/video.png")
			.headers(headers_16)
			.check(status.is(200)),
            http("Settings Image")
			.get("/_matrix/client/img/settings.png")
			.headers(headers_16)
			.check(status.is(200)),
            http("Attach Image")
			.get("/_matrix/client/img/attach.png")
			.headers(headers_16)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(16)
}
