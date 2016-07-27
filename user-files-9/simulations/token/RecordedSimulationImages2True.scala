package token 
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulationImages2True extends Simulation {


	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

	

	val headers_0 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Header-RootMe-Admin" -> "true",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_1 = Map("Header-RootMe-Admin" -> "true")

	val headers_7 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Header-RootMe-Admin" -> "true")

	val headers_9 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Content-Type" -> "image/png",
		"Header-RootMe-Admin" -> "true",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_10 = Map(
		"Content-Type" -> "application/json;charset=UTF-8",
		"Header-RootMe-Admin" -> "true",
		"Origin" -> "http://0.0.0.0:3030")

    val uri1 = "http://0.0.0.0:3030/_matrix"

	object Login{
		val feeder=csv("login.csv").random
		val login=exec(feed(feeder))
		.exec(http("request_0")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_0)
		.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.resources(http("request_1")
			.get("/_matrix/client/api/v1/initialSync?access_token=${token}&limit=8")
			.headers(headers_1),
            http("request_2")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=${token}")
			.headers(headers_1),
            http("request_3")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/avatar_url?access_token=${token}")
			.headers(headers_1),
            http("request_4")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/displayname?access_token=${token}")
			.headers(headers_1),
			 http("request_5")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_1),
            http("request_6")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s128_72_0_1_1_1&timeout=30000")
			.headers(headers_1)))
		.pause(4)
		.exec(http("request_7")
			.get("/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.headers(headers_7)
			.resources(http("request_8")
			.get("/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/messages?access_token=${token}&dir=b&from=t1-14_72_0_1_1_1&limit=30")
			.headers(headers_1))
			.check(status.is(404)))
		.pause(9)
	}
		object SendPicture{
			val feeder=csv("image.csv").random

			val sendpicture=exec(feed(feeder))
			.exec(http("request_9")
			.post("/_matrix/media/v1/upload?access_token=${token}&filename=${images}")
			.headers(headers_9)
			.body(RawFileBody("RecordedSimulationImages2_0009_request.txt"))
			.resources(http("request_10")
			.put("/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/send/m.room.message/m1468955175195?access_token=${token}")
			.headers(headers_10)
			.body(StringBody("""{"url":"mxc://matrix.allmende.io/NWeIzvRArVFPtnBDgWpmOuNN","msgtype":"m.image","body":"${images}","info":{"size":125023,"w":710,"h":501,"mimetype":"image/png"}}""")),
            http("request_11")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s128_73_0_1_1_1&timeout=30000")
			.headers(headers_1),
            http("request_12")
			.get("/_matrix/media/v1/thumbnail/matrix.allmende.io/NWeIzvRArVFPtnBDgWpmOuNN?width=320&height=320")
			.headers(headers_7)))
			.exec(session =>{
				println("session"+session)
				session
				})
		}
val admin=scenario("Admins").exec(Login.login,SendPicture.sendpicture)
	setUp(admin.inject(atOnceUsers(10))).protocols(httpProtocol)
}
