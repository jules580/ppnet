package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulateSENDER2 extends Simulation {

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
		"If-Modified-Since" -> "Wed, 10 Feb 2016 16:03:15 GMT")

	val headers_7 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 Sep 2015 18:01:31 GMT")

	val headers_10 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive")

	val headers_14 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 Sep 2015 18:01:31 GMT")

	val headers_22 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_23 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

    val uri1 = "http://0.0.0.0:3030/_matrix"

object Init{
	val init=exec(http("Init Page")
			.get("/_matrix/client/")
			.headers(headers_0)
			.resources(http("Push Rules")
			.get("/_matrix/client/api/v1/pushrules/?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK")
			.headers(headers_1)
			.check(status.is(200)),
            http("Initial Sync")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK&limit=8")
			.headers(headers_1)
			.check(status.is(200)),
            http("Presence Users")
			.put("/_matrix/client/api/v1/presence/%40test04%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulateSENDER2_0003_request.txt"))
			.check(status.is(200)),
            http("Turn Server")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK")
			.headers(headers_1)
			.check(status.is(200)),
            http("Room Page")
			.get("/_matrix/client/app/room/room.html")
			.headers(headers_5)
			.check(status.is(304)),
            http("Event access")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK&from=s1362_883_48_1_1_1&timeout=30000")
			.headers(headers_1)
			.check(status.is(200)),
            http("logo small")
			.get("/_matrix/client/img/logo-small.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("keyboard Image")
			.get("/_matrix/client/img/keyboard.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("fileType image")
			.get("/_matrix/client/img/icons/filetype-gif.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("request_10")
			.get("/_matrix/media/v1/identicon/%40test04%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_10)
			.check(status.is(200)),
            http("P0 Image")
			.get("/_matrix/client/img/p/p0.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("Identity Icon")
			.get("/_matrix/media/v1/identicon/%40test01%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_10)
			.check(status.is(200)),
            http("image p25")
			.get("/_matrix/client/img/p/p25.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("Recent event")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_14)
			.check(status.is(304)),
            http("Member image")
			.get("/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.headers(headers_10)
			.check(status.is(404)),
            http("Voice image")
			.get("/_matrix/client/img/voice.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("Video image")
			.get("/_matrix/client/img/video.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("Setting image")
			.get("/_matrix/client/img/settings.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("Attach image")
			.get("/_matrix/client/img/attach.png")
			.check(status.is(200)),
            http("close image")
			.get("/_matrix/client/img/close.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("event acces2")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK&from=s1362_889_48_1_1_1&timeout=30000")
			.headers(headers_1)
			.check(status.is(200)))
			.check(status.is(304)))
		.pause(3)
	}
	object Typing{
		val typing=exec(http("Typing Message")
			.put("/_matrix/client/api/v1/rooms/!LBUHjLWWKeNcqdhAJu%3Amatrix.allmende.io/typing/%40test04%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK")
			.headers(headers_22)
			.body(RawFileBody("RecordedSimulateSENDER2_0022_request.txt"))
			.resources(http("Typing ok")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK&from=s1362_889_49_1_1_1&timeout=30000")
			.headers(headers_23)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(23)
	}
		object Send{
			val send=exec(http("Send Message")
			.put("/_matrix/client/api/v1/rooms/!LBUHjLWWKeNcqdhAJu%3Amatrix.allmende.io/typing/%40test04%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK")
			.headers(headers_22)
			.body(RawFileBody("RecordedSimulateSENDER2_0024_request.txt"))
			.resources(http("Message send")
			.put("/_matrix/client/api/v1/rooms/!LBUHjLWWKeNcqdhAJu%3Amatrix.allmende.io/send/m.room.message/m1468315601213?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK")
			.headers(headers_22)
			.body(RawFileBody("RecordedSimulateSENDER2_0025_request.txt"))
			.check(status.is(200)),
            http("Infos event")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK&from=s1362_889_50_1_1_1&timeout=30000")
			.headers(headers_23)
			.check(status.is(200)))
			.check(status.is(200)))
}
val admin=scenario("Admin").exec(Init.init,Typing.typing,Send.send)
	setUp(admin.inject(atOnceUsers(1))).protocols(httpProtocol)
}
