package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulatePrivate2 extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.acceptHeader("application/json, text/plain, */*")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 Sep 2015 18:01:31 GMT",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 Sep 2015 18:01:31 GMT")

	val headers_2 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 Sep 2015 18:01:31 GMT")

	val headers_3 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_4 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

	val headers_5 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_8 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

    val uri1 = "http://0.0.0.0:3030/_matrix"

	object Index{
		val index=exec(http("Index")
			.get("/_matrix/client/")
			.headers(headers_0)
			.resources(http("Login page")
			.get("/_matrix/client/app/login/login.html")
			.headers(headers_1)
			.check(status.is(304)),
            http("logo")
			.get("/_matrix/client/img/logo.png")
			.headers(headers_2)
			.check(status.is(304)))
			.check(status.is(304)))
		.pause(6)
	}
	object Login{
		val feeder=csv("login.csv").random
		val login=exec(feed(feeder))
		.exec(http("login")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_3)
			.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.resources(http("initialSync")
			.get("/_matrix/client/api/v1/initialSync?access_token=${token}&limit=8")
			.headers(headers_4)
			.check(status.is(200)),
            http("presence")
			.put("/_matrix/client/api/v1/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatePrivate_0005_request.txt"))
			.check(status.is(200)),
            http("voip")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("home")
			.get("/_matrix/client/app/home/home.html")
			.check(status.is(200)),
            http("logo-small")
			.get("/_matrix/client/img/logo-small.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("profile")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/displayname?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("profile2")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/avatar_url?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("publicRooms")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_4)
			.check(status.is(200)),
            http("List Recent action")
			.get("/_matrix/client/app/recents/recents.html")
			.check(status.is(200)),
            http("Eve,et")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s170_256_20_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
            http("close")
			.get("/_matrix/client/img/close.png")
			.headers(headers_8)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(6)
	}
	object JoinRoom {
		val feeder=csv("login.csv").random
		val joinroom=exec(feed(feeder))
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
		object Typing {
			val feeder= csv("login.csv").random
		val typing=exec(feed(feeder))
		.exec(http("Typing")
			.put("/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/typing/%40${login}%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatePrivate_0031_request.txt"))
			.resources(http("Typing event")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s171_256_21_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(1)
	}
	object SendMessage{
		val feeder=csv("answer.csv").random
		
		val sendmessage=exec(feed(feeder))
		.exec(http("Not typing")
			.put("/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/typing/%40${login}%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatePrivate_0033_request.txt"))
			.resources(http("Send message")
			.put("/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/send/m.room.message/m1467735171633?access_token=${token}")
			.headers(headers_5)
			.body(StringBody("""{"msgtype":"m.text","body":"${answer}"}"""))
			.check(status.is(200)),
            http("Message send")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s171_256_22_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session=>{
			println("test:"+session)
			session
			})
}
val admins=scenario("admins").exec(Index.index,Login.login,JoinRoom.joinroom,Typing.typing,SendMessage.sendmessage)
	setUp(admins.inject(
	rampUsers(10) over (10 seconds)))
	.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5),
	details("Send Message").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
}
