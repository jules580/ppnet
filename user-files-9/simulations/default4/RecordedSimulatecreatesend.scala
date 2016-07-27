package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulatecreatesend extends Simulation {

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
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

	val headers_4 = Map("Accept" -> "*/*")

	val headers_6 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_9 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_17 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

	val headers_40 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "image/png",
		"Origin" -> "http://0.0.0.0:3030")

    val uri1 = "http://0.0.0.0:3030/_matrix"
    val uri2 = "https://www.google.com/recaptcha/api.js"
    val uri3 = "https://www.gstatic.com/recaptcha/api2/r20160615154650/recaptcha__fr.js"

	val scn = scenario("RecordedSimulatecreatesend")
		.exec(http("request_0")
			.get("/_matrix/client/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/_matrix/client/app/login/login.html")
			.headers(headers_1)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0001_response.txt"))),
            http("request_2")
			.get("/_matrix/client/img/logo.png")
			.headers(headers_2)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0002_response.txt"))))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0000_response.txt"))))
		.pause(68)
		.exec(http("request_3")
			.get("/_matrix/client/app/login/register.html")
			.headers(headers_3)
			.resources(http("request_4")
			.get(uri2 + "?render=explicit&_=1467709018601")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0004_response.txt"))),
            http("request_5")
			.get(uri3 + "")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0005_response.txt"))))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0003_response.txt"))))
		.pause(34)
		.exec(http("request_6")
			.post("/_matrix/client/v2_alpha/register")
			.headers(headers_6)
			.body(RawFileBody("RecordedSimulatecreatesend_0006_request.txt"))
			.resources(http("request_7")
			.post("/_matrix/client/v2_alpha/register")
			.headers(headers_6)
			.body(RawFileBody("RecordedSimulatecreatesend_0007_request.txt"))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0007_response.txt"))),
            http("request_8")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&limit=8")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0008_response.txt"))),
            http("request_9")
			.put("/_matrix/client/api/v1/presence/%40testre%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK")
			.headers(headers_9)
			.body(RawFileBody("RecordedSimulatecreatesend_0009_request.txt"))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0009_response.txt"))),
            http("request_10")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0010_response.txt"))),
            http("request_11")
			.put("/_matrix/client/api/v1/profile/%40testre%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK")
			.headers(headers_9)
			.body(RawFileBody("RecordedSimulatecreatesend_0011_request.txt"))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0011_response.txt"))),
            http("request_12")
			.get("/_matrix/client/app/home/home.html")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0012_response.txt"))),
            http("request_13")
			.get("/_matrix/client/api/v1/profile/%40testre%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0013_response.txt"))),
            http("request_14")
			.get("/_matrix/client/api/v1/profile/%40testre%3Amatrix.allmende.io/avatar_url?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0014_response.txt"))),
            http("request_15")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0015_response.txt"))),
            http("request_16")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0016_response.txt"))),
            http("request_17")
			.get("/_matrix/client/img/logo-small.png")
			.headers(headers_17)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0017_response.txt"))),
            http("request_18")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&from=s8_3_2_1_1_1&timeout=30000")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0018_response.txt"))),
            http("request_19")
			.get("/_matrix/client/img/close.png")
			.headers(headers_17)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0019_response.txt"))),
            http("request_20")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&from=s8_4_2_1_1_1&timeout=30000")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0020_response.txt"))))
			.check(status.is(401))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0006_response.txt"))))
		.pause(28)
		.exec(http("request_21")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&from=s8_4_2_1_1_1&timeout=30000")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0021_response.txt"))))
		.pause(32)
		.exec(http("request_22")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&from=s8_4_2_1_1_1&timeout=30000")
			.headers(headers_3)
			.resources(http("request_23")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&from=s8_5_2_1_1_1&timeout=30000")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0023_response.txt"))))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0022_response.txt"))))
		.pause(24)
		.exec(http("request_24")
			.post("/_matrix/client/api/v1/createRoom?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK")
			.headers(headers_6)
			.body(RawFileBody("RecordedSimulatecreatesend_0024_request.txt"))
			.resources(http("request_25")
			.get("/_matrix/client/api/v1/rooms/!RnQPPkoZAZTXjfbhoQ%3Amatrix.allmende.io/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&limit=30")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0025_response.txt"))),
            http("request_26")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&from=s10_5_2_1_1_1&timeout=30000")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0026_response.txt"))),
            http("request_27")
			.get("/_matrix/client/api/v1/rooms/!RnQPPkoZAZTXjfbhoQ%3Amatrix.allmende.io/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&limit=30")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0027_response.txt"))),
            http("request_28")
			.get("/_matrix/client/app/room/room.html")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0028_response.txt"))),
            http("request_29")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&from=s13_5_2_1_1_1&timeout=30000")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0029_response.txt"))),
            http("request_30")
			.get("/_matrix/client/img/keyboard.png")
			.headers(headers_17)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0030_response.txt"))),
            http("request_31")
			.get("/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.headers(headers_17)
			.check(status.is(404))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0031_response.txt"))),
            http("request_32")
			.get("/_matrix/client/img/icons/filetype-gif.png")
			.headers(headers_17)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0032_response.txt"))),
            http("request_33")
			.get("/_matrix/media/v1/identicon/%40testre%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_17)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0033_response.txt"))),
            http("request_34")
			.get("/_matrix/client/img/p/p25.png")
			.headers(headers_17)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0034_response.txt"))),
            http("request_35")
			.get("/_matrix/client/img/voice.png")
			.headers(headers_17)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0035_response.txt"))),
            http("request_36")
			.get("/_matrix/client/img/video.png")
			.headers(headers_17)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0036_response.txt"))),
            http("request_37")
			.get("/_matrix/client/img/settings.png")
			.headers(headers_17)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0037_response.txt"))),
            http("request_38")
			.get("/_matrix/client/img/attach.png")
			.headers(headers_17)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0038_response.txt"))),
            http("request_39")
			.get("/_matrix/client/api/v1/rooms/!RnQPPkoZAZTXjfbhoQ%3Amatrix.allmende.io/messages?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&dir=b&from=t1-8_5_2_1_1_1&limit=30")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0039_response.txt"))))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0024_response.txt"))))
		.pause(26)
		.exec(http("request_40")
			.post("/_matrix/media/v1/upload?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&filename=Capture+d%27%C3%A9cran+2016-06-28+14:54:42.png")
			.headers(headers_40)
			.resources(http("request_41")
			.put("/_matrix/client/api/v1/rooms/!RnQPPkoZAZTXjfbhoQ%3Amatrix.allmende.io/send/m.room.message/m1467709235104?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK")
			.headers(headers_9)
			.body(RawFileBody("RecordedSimulatecreatesend_0041_request.txt"))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0041_response.txt"))),
            http("request_42")
			.get("/_matrix/media/v1/thumbnail/matrix.allmende.io/lPnCMDrkTpUNnFwboPBHBzpq?width=320&height=320")
			.headers(headers_17)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0042_response.txt"))),
            http("request_43")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&from=s14_5_2_1_1_1&timeout=30000")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0043_response.txt"))),
            http("request_44")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&from=s14_6_2_1_1_1&timeout=30000")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0044_response.txt"))))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0040_response.txt"))))
		.pause(25)
		.exec(http("request_45")
			.put("/_matrix/client/api/v1/rooms/!RnQPPkoZAZTXjfbhoQ%3Amatrix.allmende.io/typing/%40testre%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK")
			.headers(headers_9)
			.body(RawFileBody("RecordedSimulatecreatesend_0045_request.txt"))
			.resources(http("request_46")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&from=s14_6_3_1_1_1&timeout=30000")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0046_response.txt"))),
            http("request_47")
			.put("/_matrix/client/api/v1/rooms/!RnQPPkoZAZTXjfbhoQ%3Amatrix.allmende.io/typing/%40testre%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK")
			.headers(headers_9)
			.body(RawFileBody("RecordedSimulatecreatesend_0047_request.txt"))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0047_response.txt"))),
            http("request_48")
			.put("/_matrix/client/api/v1/rooms/!RnQPPkoZAZTXjfbhoQ%3Amatrix.allmende.io/send/m.room.message/m1467709261315?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK")
			.headers(headers_9)
			.body(RawFileBody("RecordedSimulatecreatesend_0048_request.txt"))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0048_response.txt"))),
            http("request_49")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEyNzIyNDI0CjAwMmZzaWduYXR1cmUgOxhZLQzYw8DK9HPSEBK_iwci6VQFuaa3s6D0N4DcV1cK&from=s14_6_4_1_1_1&timeout=30000")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0049_response.txt"))))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatecreatesend_0045_response.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}