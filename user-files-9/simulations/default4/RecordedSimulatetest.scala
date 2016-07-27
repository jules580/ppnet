package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulatetest extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:8081")
		.inferHtmlResources(WhiteList(), BlackList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.contentTypeHeader("")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:47.0) Gecko/20100101 Firefox/47.0")

	val headers_0 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385103-3498-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:31:35 GMT",
		"If-None-Match" -> "5403396-100327-Wed Jul 13 2016 09:31:35 GMT+0200 (CEST)")

	val headers_2 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384957-1143-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_3 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:31:33 GMT",
		"If-None-Match" -> "5403395-4284974-Wed Jul 13 2016 09:31:33 GMT+0200 (CEST)")

	val headers_4 = Map(
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "PUT",
		"Cache-Control" -> "max-age=0",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_5 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385137-15086-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_6 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385063-34411-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_7 = Map(
		"Accept" -> "application/json",
		"Cache-Control" -> "max-age=0",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_8 = Map(
		"Accept" -> "application/json",
		"Cache-Control" -> "max-age=0",
		"Content-Type" -> "application/json",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_10 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385082-1263-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_11 = Map(
		"Accept" -> "application/json",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_16 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384980-1032-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_17 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385015-716-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_18 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384967-146-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_19 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384968-966-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_20 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384996-146-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_21 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385013-716-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_22 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384970-1596-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_23 = Map(
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385051-2432-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_24 = Map(
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385022-1185-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_25 = Map(
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385007-1351-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_26 = Map(
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385008-2586-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_27 = Map(
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385009-5057-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_28 = Map(
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385061-4709-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_29 = Map(
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385011-1213-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_30 = Map(
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385056-1446-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_31 = Map(
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385070-2491-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_32 = Map(
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385077-4048-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_33 = Map(
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384973-1433-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_34 = Map(
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385020-2867-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_35 = Map(
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385002-1749-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_38 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384993-460-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_39 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385052-1806-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_41 = Map("Accept" -> "*/*")

	val headers_42 = Map(
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_43 = Map(
		"Content-Type" -> "image/png",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_46 = Map(
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "PUT",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_47 = Map(
		"Accept" -> "application/json",
		"Content-Type" -> "application/json",
		"Origin" -> "http://0.0.0.0:8081")

    val uri1 = "0.0.0.0"

	val scn = scenario("RecordedSimulatetest")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/bundle.css")
			.headers(headers_1)
			.check(status.is(200)),
            http("request_2")
			.get("/fonts/OpenSans.css")
			.headers(headers_2)
			.check(status.is(200)),
            http("request_3")
			.get("/bundle.js")
			.headers(headers_3)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(1)
		.exec(http("request_4")
			.options("http://" + uri1 + ":3030/_matrix/client/r0/presence/%40test01%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4Mzk4NzYxNzE0CjAwMmZzaWduYXR1cmUgGbokRpc33ZuBS4j31IbJSeFXzJLoZpIIDdnMTuU1MfoK")
			.headers(headers_4)
			.resources(http("request_5")
			.get("/vector-icons/favicon.ico")
			.headers(headers_5)
			.check(status.is(200)),
            http("request_6")
			.get("/img/spinner.gif")
			.headers(headers_6)
			.check(status.is(200)),
            http("request_7")
			.get("http://" + uri1 + ":3030/_matrix/client/r0/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4Mzk4NzYxNzE0CjAwMmZzaWduYXR1cmUgGbokRpc33ZuBS4j31IbJSeFXzJLoZpIIDdnMTuU1MfoK")
			.headers(headers_7)
			.check(status.is(200)),
            http("request_8")
			.put("http://" + uri1 + ":3030/_matrix/client/r0/presence/%40test01%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4Mzk4NzYxNzE0CjAwMmZzaWduYXR1cmUgGbokRpc33ZuBS4j31IbJSeFXzJLoZpIIDdnMTuU1MfoK")
			.headers(headers_8)
			.body(RawFileBody("RecordedSimulatetest_0008_request.txt"))
			.check(status.is(200)),
            http("request_9")
			.get("http://" + uri1 + ":3030/_matrix/client/r0/pushrules/?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4Mzk4NzYxNzE0CjAwMmZzaWduYXR1cmUgGbokRpc33ZuBS4j31IbJSeFXzJLoZpIIDdnMTuU1MfoK")
			.headers(headers_7)
			.check(status.is(200)),
            http("request_10")
			.get("/img/warning.svg")
			.headers(headers_10)
			.check(status.is(200)),
            http("request_11")
			.get("http://" + uri1 + ":3030/_matrix/client/r0/user/%40test01%3Amatrix.allmende.io/filter/0?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4Mzk4NzYxNzE0CjAwMmZzaWduYXR1cmUgGbokRpc33ZuBS4j31IbJSeFXzJLoZpIIDdnMTuU1MfoK")
			.headers(headers_11)
			.check(status.is(200)),
            http("request_12")
			.get("/version?ts=1468596245048")
			.check(status.is(404)),
            http("request_13")
			.get("http://" + uri1 + ":3030/_matrix/client/r0/sync?filter=0&timeout=30000&_cacheBuster=1468596245089&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4Mzk4NzYxNzE0CjAwMmZzaWduYXR1cmUgGbokRpc33ZuBS4j31IbJSeFXzJLoZpIIDdnMTuU1MfoK")
			.headers(headers_11)
			.check(status.is(200)),
            http("request_14")
			.get("http://" + uri1 + ":3030/_matrix/client/r0/rooms/!LBUHjLWWKeNcqdhAJu%3Amatrix.allmende.io/context/%241468310363261Qlnvh%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4Mzk4NzYxNzE0CjAwMmZzaWduYXR1cmUgGbokRpc33ZuBS4j31IbJSeFXzJLoZpIIDdnMTuU1MfoK")
			.headers(headers_11)
			.check(status.is(200)),
            http("request_15")
			.get("http://" + uri1 + ":3030/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1666_1341_878_8_1_2&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4Mzk4NzYxNzE0CjAwMmZzaWduYXR1cmUgGbokRpc33ZuBS4j31IbJSeFXzJLoZpIIDdnMTuU1MfoK")
			.headers(headers_11)
			.check(status.is(200)),
            http("request_16")
			.get("/img/cancel.svg")
			.headers(headers_16)
			.check(status.is(200)),
            http("request_17")
			.get("/img/list-open.svg")
			.headers(headers_17)
			.check(status.is(200)),
            http("request_18")
			.get("/img/50e2c2.png")
			.headers(headers_18)
			.check(status.is(200)),
            http("request_19")
			.get("/img/76cfa6.png")
			.headers(headers_19)
			.check(status.is(200)),
            http("request_20")
			.get("/img/f4c371.png")
			.headers(headers_20)
			.check(status.is(200)),
            http("request_21")
			.get("/img/list-close.svg")
			.headers(headers_21)
			.check(status.is(200)),
            http("request_22")
			.get("/img/admin.svg")
			.headers(headers_22)
			.check(status.is(200)),
            http("request_23")
			.get("/img/right_search.svg")
			.headers(headers_23)
			.check(status.is(200)),
            http("request_24")
			.get("/img/minimise.svg")
			.headers(headers_24)
			.check(status.is(200)),
            http("request_25")
			.get("/img/icons-create-room.svg")
			.headers(headers_25)
			.check(status.is(200)),
            http("request_26")
			.get("/img/icons-directory.svg")
			.headers(headers_26)
			.check(status.is(200)),
            http("request_27")
			.get("/img/icons-settings.svg")
			.headers(headers_27)
			.check(status.is(200)),
            http("request_28")
			.get("/img/settings.svg")
			.headers(headers_28)
			.check(status.is(200)),
            http("request_29")
			.get("/img/leave.svg")
			.headers(headers_29)
			.check(status.is(200)),
            http("request_30")
			.get("/img/search.svg")
			.headers(headers_30)
			.check(status.is(200)),
            http("request_31")
			.get("/img/upload.svg")
			.headers(headers_31)
			.check(status.is(200)),
            http("request_32")
			.get("/img/voice.svg")
			.headers(headers_32)
			.check(status.is(200)),
            http("request_33")
			.get("/img/call.svg")
			.headers(headers_33)
			.check(status.is(200)),
            http("request_34")
			.get("/img/members.svg")
			.headers(headers_34)
			.check(status.is(200)),
            http("request_35")
			.get("/img/files.svg")
			.headers(headers_35)
			.check(status.is(200)),
            http("request_36")
			.get("http://" + uri1 + ":3030/_matrix/client/r0/rooms/!LBUHjLWWKeNcqdhAJu%3Amatrix.allmende.io/messages?from=t21-1359_1341_878_8_1_2&limit=20&dir=f&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4Mzk4NzYxNzE0CjAwMmZzaWduYXR1cmUgGbokRpc33ZuBS4j31IbJSeFXzJLoZpIIDdnMTuU1MfoK")
			.headers(headers_11)
			.check(status.is(200)),
            http("request_37")
			.get("http://" + uri1 + ":3030/_matrix/client/r0/rooms/!LBUHjLWWKeNcqdhAJu%3Amatrix.allmende.io/messages?from=t15-1352_1341_878_8_1_2&limit=20&dir=b&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4Mzk4NzYxNzE0CjAwMmZzaWduYXR1cmUgGbokRpc33ZuBS4j31IbJSeFXzJLoZpIIDdnMTuU1MfoK")
			.headers(headers_11)
			.check(status.is(200)),
            http("request_38")
			.get("/img/edit.png")
			.headers(headers_38)
			.check(status.is(200)),
            http("request_39")
			.get("/img/scrolldown.svg")
			.headers(headers_39)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(6)
		.exec(http("request_40")
			.get("/img/files.svg")
			.headers(headers_35)
			.check(status.is(200)))
		.pause(1)
		.exec(http("request_41")
			.get("/img/fileicon.png")
			.headers(headers_41)
			.resources(http("request_42")
			.options("http://" + uri1 + ":3030/_matrix/media/v1/upload?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4Mzk4NzYxNzE0CjAwMmZzaWduYXR1cmUgGbokRpc33ZuBS4j31IbJSeFXzJLoZpIIDdnMTuU1MfoK&filename=test.png")
			.headers(headers_42)
			.check(status.is(200)),
            http("request_43")
			.post("http://" + uri1 + ":3030/_matrix/media/v1/upload?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4Mzk4NzYxNzE0CjAwMmZzaWduYXR1cmUgGbokRpc33ZuBS4j31IbJSeFXzJLoZpIIDdnMTuU1MfoK&filename=test.png")
			.headers(headers_43)
			.body(RawFileBody("RecordedSimulatetest_0043_request.txt"))
			.check(status.is(200)),
            http("request_44")
			.get("http://" + uri1 + ":3030/_matrix/media/v1/thumbnail/matrix.allmende.io/wKoOONNwPnCaUxytHAGUMoTS?width=800&height=600")
			.headers(headers_41)
			.check(status.is(200)),
            http("request_45")
			.get("/img/download.svg")
			.check(status.is(200)),
            http("request_46")
			.options("http://" + uri1 + ":3030/_matrix/client/r0/rooms/!LBUHjLWWKeNcqdhAJu%3Amatrix.allmende.io/send/m.room.message/m1468596255791.0?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4Mzk4NzYxNzE0CjAwMmZzaWduYXR1cmUgGbokRpc33ZuBS4j31IbJSeFXzJLoZpIIDdnMTuU1MfoK")
			.headers(headers_46)
			.check(status.is(200)),
            http("request_47")
			.put("http://" + uri1 + ":3030/_matrix/client/r0/rooms/!LBUHjLWWKeNcqdhAJu%3Amatrix.allmende.io/send/m.room.message/m1468596255791.0?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4Mzk4NzYxNzE0CjAwMmZzaWduYXR1cmUgGbokRpc33ZuBS4j31IbJSeFXzJLoZpIIDdnMTuU1MfoK")
			.headers(headers_47)
			.body(RawFileBody("RecordedSimulatetest_0047_request.txt"))
			.check(status.is(200)))
			.check(status.is(200)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
