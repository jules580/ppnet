package tokenvector

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class EmptyRoom extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:8081")
		.inferHtmlResources(WhiteList(), BlackList())
		.acceptEncodingHeader("gzip, deflate, sdch")
		.acceptLanguageHeader("fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385061-4709-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385070-2491-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384973-1433-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_3 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385077-4048-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_4 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385056-1446-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_5 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385011-1213-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_6 = Map(
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json")

    val uri1 = "0.0.0.0"

	val scn = scenario("EmptyRoom")
		.exec(http("request_0")
			.get("/img/settings.svg")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/img/upload.svg")
			.headers(headers_1)
			.check(bodyBytes.is(RawFileBody("EmptyRoom_0001_response.txt"))),
            http("request_2")
			.get("/img/call.svg")
			.headers(headers_2)
			.check(bodyBytes.is(RawFileBody("EmptyRoom_0002_response.txt"))),
            http("request_3")
			.get("/img/voice.svg")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("EmptyRoom_0003_response.txt"))),
            http("request_4")
			.get("/img/search.svg")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("EmptyRoom_0004_response.txt"))),
            http("request_5")
			.get("/img/leave.svg")
			.headers(headers_5)
			.check(bodyBytes.is(RawFileBody("EmptyRoom_0005_response.txt"))),
            http("request_6")
			.get("http://" + uri1 + ":3030/_matrix/client/r0/rooms/!AsbjslrccrHPoQxsUn%3Amatrix.allmende.io/messages?from=s5218_2610_964_28_1_2&limit=20&dir=b&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTA6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTQ3MjM4OTY0CjAwMmZzaWduYXR1cmUg5KKfm_PyiR414pgapAMdQKi2aP_iPtsTrMc5oFseF3wK")
			.headers(headers_6)
			.check(bodyBytes.is(RawFileBody("EmptyRoom_0006_response.txt"))),
            http("request_7")
			.get("http://" + uri1 + ":3030/_matrix/client/r0/rooms/!AsbjslrccrHPoQxsUn%3Amatrix.allmende.io/messages?from=t1-4965_2610_964_28_1_2&limit=20&dir=b&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTA6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTQ3MjM4OTY0CjAwMmZzaWduYXR1cmUg5KKfm_PyiR414pgapAMdQKi2aP_iPtsTrMc5oFseF3wK")
			.headers(headers_6)
			.check(bodyBytes.is(RawFileBody("EmptyRoom_0007_response.txt"))))
			.check(bodyBytes.is(RawFileBody("EmptyRoom_0000_response.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}