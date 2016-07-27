package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulateSENDER4 extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
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
		"Accept" -> "application/json, text/plain, */*",
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
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_4 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

	val headers_5 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_7 = Map("Accept" -> "application/json, text/plain, */*")

	val headers_16 = Map("Accept" -> "image/webp,image/*,*/*;q=0.8")

	val headers_17 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

    val uri1 = "http://0.0.0.0:3030/_matrix"
before{
	println("this will send a message")
}
	object Init{
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
		.pause(11)
	}
		object Login{
			val feeder=csv("login.csv").random
		val login=exec(feed(feeder))
		.exec(http("Give Login")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_3)
			.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
						//.body(RawFileBody("RecordedSimulateSENDER4_0003_request.txt"))

			.resources(http("Inital Sync")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODE4MTYxCjAwMmZzaWduYXR1cmUgIqACuVdgXpx_2tLKHeO9DApP_l-_JDkzrrrrI3f8QPsK&limit=8")
			.headers(headers_4)
			.check(status.is(200)),
            http("Presence User")
			.put("/_matrix/client/api/v1/presence/%40test01%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODE4MTYxCjAwMmZzaWduYXR1cmUgIqACuVdgXpx_2tLKHeO9DApP_l-_JDkzrrrrI3f8QPsK")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulateSENDER4_0005_request.txt"))
			.check(status.is(200)),
            http("Turn Server")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODE4MTYxCjAwMmZzaWduYXR1cmUgIqACuVdgXpx_2tLKHeO9DApP_l-_JDkzrrrrI3f8QPsK")
			.headers(headers_4)
			.check(status.is(200)),
            http("Home page")
			.get("/_matrix/client/app/home/home.html")
			.headers(headers_7)
			.check(status.is(200)),
            http("Event Acess")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODE4MTYxCjAwMmZzaWduYXR1cmUgIqACuVdgXpx_2tLKHeO9DApP_l-_JDkzrrrrI3f8QPsK&from=s1380_1053_36_2_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
            http("Logo small")
			.get("/_matrix/client/img/logo-small.png")
			.check(status.is(200)),
            http("Profil User")
			.get("/_matrix/client/api/v1/profile/%40test01%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODE4MTYxCjAwMmZzaWduYXR1cmUgIqACuVdgXpx_2tLKHeO9DApP_l-_JDkzrrrrI3f8QPsK")
			.headers(headers_4)
			.check(status.is(200)),
            http("Profile Infos")
			.get("/_matrix/client/api/v1/profile/%40test01%3Amatrix.allmende.io/avatar_url?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODE4MTYxCjAwMmZzaWduYXR1cmUgIqACuVdgXpx_2tLKHeO9DApP_l-_JDkzrrrrI3f8QPsK")
			.headers(headers_4)
			.check(status.is(200)),
            http("Public Rooms")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_4)
			.check(status.is(200)),
            http("Recents Infos")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_7)
			.check(status.is(200)),
            http("Image Close")
			.get("/_matrix/client/img/close.png")
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session =>{
				println("test :"+session)
				session
			})
		.pause(14)
	}
		object EnterRoom{
			val enterroom=exec(http("Room Page")
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
			.get("/_matrix/media/v1/identicon/%40test01%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_16)
			.check(status.is(200)),
            http("P25 image")
			.get("/_matrix/client/img/p/p25.png")
			.headers(headers_16)
			.check(status.is(200)),
            http("Identity Icon2")
			.get("/_matrix/media/v1/identicon/%40test04%3Amatrix.allmende.io?width=96&height=96")
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
		object ListMessage{
			val listmessage=exec(http("All Message")
			.get("/_matrix/client/api/v1/rooms/!LBUHjLWWKeNcqdhAJu%3Amatrix.allmende.io/messages?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODE4MTYxCjAwMmZzaWduYXR1cmUgIqACuVdgXpx_2tLKHeO9DApP_l-_JDkzrrrrI3f8QPsK&dir=b&from=t35-1372_1053_36_2_1_1&limit=30")
			.headers(headers_4)
			.resources(http("Event Access")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODE4MTYxCjAwMmZzaWduYXR1cmUgIqACuVdgXpx_2tLKHeO9DApP_l-_JDkzrrrrI3f8QPsK&from=s1380_1053_36_2_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(2)
	}
		object Typing{
		val typing=exec(http("Typing Begin")
			.put("/_matrix/client/api/v1/rooms/!LBUHjLWWKeNcqdhAJu%3Amatrix.allmende.io/typing/%40test01%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODE4MTYxCjAwMmZzaWduYXR1cmUgIqACuVdgXpx_2tLKHeO9DApP_l-_JDkzrrrrI3f8QPsK")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulateSENDER4_0029_request.txt"))
			.resources(http("Typing ok")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODE4MTYxCjAwMmZzaWduYXR1cmUgIqACuVdgXpx_2tLKHeO9DApP_l-_JDkzrrrrI3f8QPsK&from=s1380_1053_37_2_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(5)
	}
		object SendMessage{
		val feeder=csv("answer.csv").random
			
			val sendmessage=exec(feed(feeder))
			.exec(http("Send Message")
			.put("/_matrix/client/api/v1/rooms/!LBUHjLWWKeNcqdhAJu%3Amatrix.allmende.io/typing/%40test01%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODE4MTYxCjAwMmZzaWduYXR1cmUgIqACuVdgXpx_2tLKHeO9DApP_l-_JDkzrrrrI3f8QPsK")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulateSENDER4_0031_request.txt"))
			
			.resources(http("Message send")
			.put("/_matrix/client/api/v1/rooms/!LBUHjLWWKeNcqdhAJu%3Amatrix.allmende.io/send/m.room.message/m1468400258565?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODE4MTYxCjAwMmZzaWduYXR1cmUgIqACuVdgXpx_2tLKHeO9DApP_l-_JDkzrrrrI3f8QPsK")
			.headers(headers_5)
			//.body(RawFileBody("RecordedSimulateSENDER4_0032_request.txt"))
			.body(StringBody("""{"msgtype":"m.text","body":"${answer}"}"""))
			.check(status.is(200)),
            http("Infos Message")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDAzODE4MTYxCjAwMmZzaWduYXR1cmUgIqACuVdgXpx_2tLKHeO9DApP_l-_JDkzrrrrI3f8QPsK&from=s1380_1053_38_2_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session =>{
			println("Answer"+session("answer").as[String])
			session
			})
           
		}
		after{
			println("A message is send")
		}
		val admins=scenario("admins").exec(Init.init,Login.login,EnterRoom.enterroom,ListMessage.listmessage,Typing.typing,SendMessage.sendmessage)
	setUp(admins.inject(
	
	rampUsers(10) over (10 seconds))
	.throttle(reachRps(10) in (10 seconds),holdFor(15 seconds),jumpToRps(50),holdFor(10 seconds)))
	.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5),
	details("Send Message").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
}
