package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class leaveroom extends Simulation {

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
		"Connection" -> "keep-alive")

	val headers_3 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_5 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 Sep 2015 18:01:31 GMT")

	val headers_7 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 Sep 2015 18:01:31 GMT")

	val headers_8 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_9 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

	val headers_10 = Map("Accept" -> "application/json, text/plain, */*")

	val headers_19 = Map("Accept" -> "image/webp,image/*,*/*;q=0.8")

	val headers_20 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

    val uri1 = "http://0.0.0.0:3030/_matrix"

	object Init{
		val init=exec(http("Init page")
			.get("/_matrix/client/")
			.headers(headers_0)
			.resources(/*http("Push rules")
			.get("/_matrix/client/api/v1/pushrules/?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDM2NzE5ODM4CjAwMmZzaWduYXR1cmUgEg26IPTJKEupY79Fyz7sJda9S44TqOYSQTQYota9RwwK")
			.headers(headers_1)
			.check(status.is(200)),
            http("Initial Sync")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDM2NzE5ODM4CjAwMmZzaWduYXR1cmUgEg26IPTJKEupY79Fyz7sJda9S44TqOYSQTQYota9RwwK&limit=8")
			.headers(headers_1)
			.check(status.is(200)),
            http("Presence User")
			.put("/_matrix/client/api/v1/presence/%40test01%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDM2NzE5ODM4CjAwMmZzaWduYXR1cmUgEg26IPTJKEupY79Fyz7sJda9S44TqOYSQTQYota9RwwK")
			.headers(headers_3)
			.body(RawFileBody("leaveroom_0003_request.txt"))
			.check(status.is(200)),
            http("Turn Server")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDM2NzE5ODM4CjAwMmZzaWduYXR1cmUgEg26IPTJKEupY79Fyz7sJda9S44TqOYSQTQYota9RwwK")
			.headers(headers_1)
			.check(status.is(200)),*/
            http("Login page")
			.get("/_matrix/client/app/login/login.html")
			.headers(headers_5)
			.check(status.is(304)),
           /* http("Event access")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDM2NzE5ODM4CjAwMmZzaWduYXR1cmUgEg26IPTJKEupY79Fyz7sJda9S44TqOYSQTQYota9RwwK&from=s9083_3231_1186_77_1_2&timeout=30000")
			.headers(headers_1)
			.check(status.is(200)),*/
            http("Logo image")
			.get("/_matrix/client/img/logo.png")
			.headers(headers_7)
			.check(status.is(304)))
			.check(status.is(304)))
		.pause(6)
	}
		object Login{
			val feeder=csv("login.csv").random
			val login=exec(feed(feeder))
			.exec(http("Login Page")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_8)
	.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.resources(http("Turn Server")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=${token}")
			.headers(headers_9)
			.check(status.is(200)),
            http("Home Page")
			.get("/_matrix/client/app/home/home.html")
			.headers(headers_10)
			.check(status.is(200)),
            http("Logo small")
			.get("/_matrix/client/img/logo-small.png")
			.check(status.is(200)),
            http("Profile Username")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/displayname?access_token=${token}")
			.headers(headers_9)
			.check(status.is(200)),
            http("Profile Avatar")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/avatar_url?access_token=${token}")
			.headers(headers_9)
			.check(status.is(200)),
            http("Public Rooms")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_9)
			.check(status.is(200)),
            http("Recents Page")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_10)
			.check(status.is(200)),
            http("Close image")
			.get("/_matrix/client/img/close.png")
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(5)
	}
	object Sync{
		val feeder=csv("login.csv").random
		val sync=exec(feed(feeder))
		.exec(http("List Event")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s9083_3232_1186_77_1_2&timeout=30000")
			.headers(headers_9)
			.check(status.is(200)))
		.pause(1)
	}
		object EnterRoom{
			val feeder=csv("login.csv").random
			val enterroom=exec(feed(feeder))
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
	object LeaveRoom{
		val feeder=csv("login.csv").random
		val leaveroom=exec(feed(feeder))
		.exec(http("Rooms infos")
			.post("/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/leave?access_token=${token}")
			.headers(headers_8)
			.body(RawFileBody("leaveroom_0031_request.txt"))
			.resources(http("profiles displayname")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/displayname?access_token=${token}")
			.headers(headers_9)
			.check(status.is(200)),
            http("profiles avatar_url")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/avatar_url?access_token=${token}")
			.headers(headers_9)
			.check(status.is(200)),
            http("public Rooms")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_9)
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session =>{
				println("session"+session)
				session 
			})
		}
val admins=scenario("Admins").exec(Init.init,Login.login,Sync.sync,EnterRoom.enterroom,LeaveRoom.leaveroom)
	setUp(admins.inject(atOnceUsers(1))).protocols(httpProtocol)
}
