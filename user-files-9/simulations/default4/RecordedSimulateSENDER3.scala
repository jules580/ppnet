package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulateSENDER3 extends Simulation {

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

	val headers_21 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

    val uri1 = "http://0.0.0.0:3030/_matrix"

	val scn = scenario("RecordedSimulateSENDER3")
		.exec(http("request_0")
			.get("/_matrix/client/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/_matrix/client/api/v1/pushrules/?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK")
			.headers(headers_1)
			.check(status.is(200)),
            http("request_2")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK&limit=8")
			.headers(headers_1)
			.check(status.is(200)),
            http("request_3")
			.put("/_matrix/client/api/v1/presence/%40test04%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulateSENDER3_0003_request.txt"))
			.check(status.is(200)),
            http("request_4")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK")
			.headers(headers_1)
			.check(status.is(200)),
            http("request_5")
			.get("/_matrix/client/app/room/room.html")
			.headers(headers_5)
			.check(status.is(304)),
            http("request_6")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK&from=s1369_952_102_1_1_1&timeout=30000")
			.headers(headers_1)
			.check(status.is(200)),
            http("request_7")
			.get("/_matrix/client/img/logo-small.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("request_8")
			.get("/_matrix/client/img/keyboard.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("request_9")
			.get("/_matrix/client/img/icons/filetype-gif.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("request_10")
			.get("/_matrix/media/v1/identicon/%40test04%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_10)
			.check(status.is(200)),
            http("request_11")
			.get("/_matrix/client/img/p/p0.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("request_12")
			.get("/_matrix/media/v1/identicon/%40test01%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_10)
			.check(status.is(200)),
            http("request_13")
			.get("/_matrix/client/img/p/p25.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("request_14")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_14)
			.check(status.is(304)),
            http("request_15")
			.get("/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.headers(headers_10)
			.check(status.is(404)),
            http("request_16")
			.get("/_matrix/client/img/voice.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("request_17")
			.get("/_matrix/client/img/video.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("request_18")
			.get("/_matrix/client/img/settings.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("request_19")
			.get("/_matrix/client/img/attach.png")
			.check(status.is(200)),
            http("request_20")
			.get("/_matrix/client/img/close.png")
			.headers(headers_7)
			.check(status.is(304)))
			.check(status.is(304)))
		.pause(1)
		.exec(http("request_21")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK&from=s1369_952_103_1_1_1&timeout=30000")
			.headers(headers_21)
			.check(status.is(200)))
		.pause(4)
		.exec(http("request_22")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK&from=s1369_952_104_1_1_1&timeout=30000")
			.headers(headers_21)
			.resources(http("request_23")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK&from=s1370_952_104_1_1_1&timeout=30000")
			.headers(headers_21)
			.check(status.is(200)),
            http("request_24")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK&from=s1370_952_105_1_1_1&timeout=30000")
			.headers(headers_21)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(5)
		.exec(http("request_25")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4MzEwMjE0NjU3CjAwMmZzaWduYXR1cmUgQL4zZJqIXTB9uQs9Vh2XOJkjF4J6JDLBE9gLUGUwGGwK&from=s1370_952_106_1_1_1&timeout=30000")
			.headers(headers_21)
			.check(status.is(200)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
