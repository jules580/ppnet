package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulatepublicroom extends Simulation {
before{
	println("Simulation Public Room is about to Start")
}
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

	val headers_1 = Map("Accept" -> "application/json, text/plain, */*")

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

	val headers_8 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

    val uri1 = "http://0.0.0.0:3030/_matrix"

object Index{
		val index = exec(http("Index home")
			.get("/_matrix/client/")
			.headers(headers_0)
			.resources(http("Login page")
			.get("/_matrix/client/app/login/login.html")
			.headers(headers_1)
			.check(status.is(200)),
            http("Logo Image")
			.get("/_matrix/client/img/logo.png")
			.check(status.is(200)))
			.check(status.is(304)))
			.pause(7)
		}
object Login{
	val feeder= csv("login.csv").random
		val login=exec(feed(feeder))
		.exec(http("Login Request")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_3)
			.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.resources(http("request_4")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzM1NTQwMTk2CjAwMmZzaWduYXR1cmUg4g9_ijgnd8BqtT66CBXZpSWGk8L21TPzgsJn8zdwE-MK&limit=8")
			.headers(headers_4)
			.check(status.is(200)),
            http("Presence")
			.put("/_matrix/client/api/v1/presence/%40test04%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzM1NTQwMTk2CjAwMmZzaWduYXR1cmUg4g9_ijgnd8BqtT66CBXZpSWGk8L21TPzgsJn8zdwE-MK")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatepublicroom_0005_request.txt"))
			.check(status.is(200)),
            http("TurnServer")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzM1NTQwMTk2CjAwMmZzaWduYXR1cmUg4g9_ijgnd8BqtT66CBXZpSWGk8L21TPzgsJn8zdwE-MK")
			.headers(headers_4)
			.check(status.is(200)),
            http("Home Users")
			.get("/_matrix/client/app/home/home.html")
			.headers(headers_1)
			.check(status.is(200)),
            http("Logo-small")
			.get("/_matrix/client/img/logo-small.png")
			.headers(headers_8)
			.check(status.is(200)),
            http("Info profil")
			.get("/_matrix/client/api/v1/profile/%40test04%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzM1NTQwMTk2CjAwMmZzaWduYXR1cmUg4g9_ijgnd8BqtT66CBXZpSWGk8L21TPzgsJn8zdwE-MK")
			.headers(headers_4)
			.check(status.is(200)),
            http("Infos profile 2")
			.get("/_matrix/client/api/v1/profile/%40test04%3Amatrix.allmende.io/avatar_url?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzM1NTQwMTk2CjAwMmZzaWduYXR1cmUg4g9_ijgnd8BqtT66CBXZpSWGk8L21TPzgsJn8zdwE-MK")
			.headers(headers_4)
			.check(status.is(200)),
            http("Check publicRoom")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_4)
			.check(status.is(200)),
            http("List recent event")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_1)
			.check(status.is(200)),
            http("Check event")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzM1NTQwMTk2CjAwMmZzaWduYXR1cmUg4g9_ijgnd8BqtT66CBXZpSWGk8L21TPzgsJn8zdwE-MK&from=s79_218_18_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
            http("Close Picture")
			.get("/_matrix/client/img/close.png")
			.headers(headers_8)
			.check(status.is(200)))
			.check(status.is(200)))
		}
	object CreateRoom{
		val createroom=exec(http("Create Room")
			.post("/_matrix/client/api/v1/createRoom?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzM1NTQwMTk2CjAwMmZzaWduYXR1cmUg4g9_ijgnd8BqtT66CBXZpSWGk8L21TPzgsJn8zdwE-MK")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulatepublicroom_0015_request.txt"))
			.check(status.is(200).saveAs("Teststatus"))
			.check( currentLocation.saveAs("CurrentLocation"))
			.check(responseTimeInMillis.saveAs("ReponseTime"))
			.check(regex("""https://(.*)//.*""").count.saveAs("Https"))
			.resources(http("Room connected")
			.get("/_matrix/client/api/v1/rooms/!GHJPyXvsuUsEsSLVun%3Amatrix.allmende.io/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzM1NTQwMTk2CjAwMmZzaWduYXR1cmUg4g9_ijgnd8BqtT66CBXZpSWGk8L21TPzgsJn8zdwE-MK&limit=30")
			.headers(headers_4)
			.check(status.is(200)),
            http("Event1")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzM1NTQwMTk2CjAwMmZzaWduYXR1cmUg4g9_ijgnd8BqtT66CBXZpSWGk8L21TPzgsJn8zdwE-MK&from=s81_218_18_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
            http("Event2")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzM1NTQwMTk2CjAwMmZzaWduYXR1cmUg4g9_ijgnd8BqtT66CBXZpSWGk8L21TPzgsJn8zdwE-MK&from=s83_218_18_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
            http("in the room")
			.get("/_matrix/client/api/v1/rooms/!GHJPyXvsuUsEsSLVun%3Amatrix.allmende.io/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzM1NTQwMTk2CjAwMmZzaWduYXR1cmUg4g9_ijgnd8BqtT66CBXZpSWGk8L21TPzgsJn8zdwE-MK&limit=30")
			.headers(headers_4)
			.check(status.is(200)),
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
			.check(status.is(200)),
            http("Back to the room")
			.get("/_matrix/client/api/v1/rooms/!GHJPyXvsuUsEsSLVun%3Amatrix.allmende.io/messages?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzM1NTQwMTk2CjAwMmZzaWduYXR1cmUg4g9_ijgnd8BqtT66CBXZpSWGk8L21TPzgsJn8zdwE-MK&dir=b&from=t1-79_218_18_1_1_1&limit=30")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session =>{
			println("test"+session)
			session
		})
}
after{
	println("Simualtion about Public Room is finished")
}

val admins= scenario("Admins").exec(Index.index,Login.login,CreateRoom.createroom)
	setUp(admins.inject(
     rampUsers(10) over (5 seconds)).throttle(reachRps(10) in (10 seconds), holdFor(15 seconds),jumpToRps(50),holdFor(10 seconds)))
     .assertions(
     global.responseTime.max.lessThan(50),
     forAll.failedRequests.count.lessThan(5),
details("Login Request").successfulRequests.percent.greaterThan(90),
global.responseTime.mean.greaterThan(100),
details("Create Room").requestsPerSec.between(100,1000),
details("Create Room").failedRequests.percent.is(0),
details("Create Room").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
}
