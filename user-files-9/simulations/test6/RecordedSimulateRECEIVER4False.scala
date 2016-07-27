package test6

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Init_Latency2._
import Login_Latency2._
import Enter_Room_Latency2._
import Typing_Latency2._
import Message_Latency2._
import Message_Receive_Latency2._
class RecordedSimulateRECEIVER4False extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

    val uri1 = "http://0.0.0.0:3030/_matrix"
before{
	println("this will receive a message")
}
	/*object Init{
		val init=exec(http("Init Page")
			.get("/_matrix/client/")
			.headers(headers_0)
			.resources(http("Login Page")
			.get("/_matrix/client/app/login/login.html")
			.headers(headers_1)
			.check(status.is(304)),
            http("Logo Image")
			.get("/_matrix/client/img/logo.png")
			.headers(headers_2)
			.check(status.is(304)))
			.check(status.is(304)))
			.pause(22)
		}
	
		object Login{
			val feeder= csv("login.csv").random
		val login=exec(feed(feeder))
		     .exec(http("Try Login")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_3)
			.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.resources(http("Initial Sync")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODI1NjIyCjAwMmZzaWduYXR1cmUgi4BDngqWq6voYaDCuC-NdpB6mjsnzpbqel_ECFDM9aUK&limit=8")
			.headers(headers_4)
			.check(status.is(200)),
            http("Presence User")
			.put("/_matrix/client/api/v1/presence/%40test04%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODI1NjIyCjAwMmZzaWduYXR1cmUgi4BDngqWq6voYaDCuC-NdpB6mjsnzpbqel_ECFDM9aUK")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulateRECEIVER4_0005_request.txt"))
			.check(status.is(200)),
            http("Turn Server")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODI1NjIyCjAwMmZzaWduYXR1cmUgi4BDngqWq6voYaDCuC-NdpB6mjsnzpbqel_ECFDM9aUK")
			.headers(headers_4)
			.check(status.is(200)),
            http("Home Page")
			.get("/_matrix/client/app/home/home.html")
			.headers(headers_7)
			.check(status.is(200)),
            http("Logo small")
			.get("/_matrix/client/img/logo-small.png")
			.check(status.is(200)),
            http("profile infos")
			.get("/_matrix/client/api/v1/profile/%40test04%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODI1NjIyCjAwMmZzaWduYXR1cmUgi4BDngqWq6voYaDCuC-NdpB6mjsnzpbqel_ECFDM9aUK")
			.headers(headers_4)
			.check(status.is(200)),
            http("profile infos 2")
			.get("/_matrix/client/api/v1/profile/%40test04%3Amatrix.allmende.io/avatar_url?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODI1NjIyCjAwMmZzaWduYXR1cmUgi4BDngqWq6voYaDCuC-NdpB6mjsnzpbqel_ECFDM9aUK")
			.headers(headers_4)
			.check(status.is(200)),
            http("Public Room")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_4)
			.check(status.is(200)),
            http("Recent Infos")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_7)
			.check(status.is(200)),
            http("Event Access")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODI1NjIyCjAwMmZzaWduYXR1cmUgi4BDngqWq6voYaDCuC-NdpB6mjsnzpbqel_ECFDM9aUK&from=s1380_1053_36_2_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
            http("Close Image")
			.get("/_matrix/client/img/close.png")
		.check(status.is(200)))
			.check(status.is(200)))
		.pause(9)
	}
		object EnterRoom{
			
		val enterroom=exec(http("Room Page")
			.get("/_matrix/client/app/room/room.html")
			.headers(headers_7)
			.resources(http("Keyboard Image")
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
			.get("/_matrix/media/v1/identicon/%40test04%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_16)
			.check(status.is(200)),
            http("Image P0")
			.get("/_matrix/client/img/p/p0.png")
			.headers(headers_16)
			.check(status.is(200)),
            http("Identity Icon2")
			.get("/_matrix/media/v1/identicon/%40test01%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_16)
			.check(status.is(200)),
            http("p25 image")
			.get("/_matrix/client/img/p/p25.png")
			.headers(headers_16)
			.check(status.is(200)),
            http("voice image")
			.get("/_matrix/client/img/voice.png")
			.headers(headers_16)
			.check(status.is(200)),
            http("video image")
			.get("/_matrix/client/img/video.png")
			.headers(headers_16)
			.check(status.is(200)),
            http("setting image")
			.get("/_matrix/client/img/settings.png")
			.headers(headers_16)
			.check(status.is(200)),
            http("attach image")
			.get("/_matrix/client/img/attach.png")
			.headers(headers_16)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(5)
	}
	object Typing{
		
		val typing=exec(http("Typing sender")
			.get("/_matrix/client/api/v1/rooms/!LBUHjLWWKeNcqdhAJu%3Amatrix.allmende.io/messages?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODI1NjIyCjAwMmZzaWduYXR1cmUgi4BDngqWq6voYaDCuC-NdpB6mjsnzpbqel_ECFDM9aUK&dir=b&from=t35-1372_1053_36_2_1_1&limit=30")
			.headers(headers_4)
			.check(status.is(200)))
		.pause(11)
	}
	object Message{
		
		val message=exec(http("Receive Message")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODI1NjIyCjAwMmZzaWduYXR1cmUgi4BDngqWq6voYaDCuC-NdpB6mjsnzpbqel_ECFDM9aUK&from=s1380_1053_37_2_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
		.pause(5)
	}
	object MessageReceive{
		val messagereceive=exec(http("Message Receive")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODI1NjIyCjAwMmZzaWduYXR1cmUgi4BDngqWq6voYaDCuC-NdpB6mjsnzpbqel_ECFDM9aUK&from=s1380_1053_38_2_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.exec(session => {
				println("test"+session)
				session
				})
}*/
after{
	println("message is receive")
}

	setUp(AdminsReceiveMessage.admin.inject(
	rampUsers(10) over (10 seconds)))
	.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5),
	details("Login").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
}
