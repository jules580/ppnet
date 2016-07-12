package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulatePrivateImages extends Simulation {

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

	val headers_20 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

	val headers_29 = Map("Accept" -> "image/webp,image/*,*/*;q=0.8")

	val headers_32 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "image/png",
		"Origin" -> "http://0.0.0.0:3030")

    val uri1 = "http://0.0.0.0:3030/_matrix"

	val scn = scenario("RecordedSimulatePrivateImages")
		.exec(http("request_0")
			.get("/_matrix/client/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/_matrix/client/app/login/login.html")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_2")
			.get("/_matrix/client/img/logo.png")
			.headers(headers_2)
			.check(status.is(304)))
			.check(status.is(304)))
		.pause(6)
		.exec(http("request_3")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulatePrivateImages_0003_request.txt"))
			.resources(http("request_4")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDY6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3ODAzOTU3NTI1CjAwMmZzaWduYXR1cmUgz8SliNoBC3wUK0_kagLmhzWn5kg4mdpmLTFkk8fnIbkK&limit=8")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_5")
			.put("/_matrix/client/api/v1/presence/%40test06%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDY6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3ODAzOTU3NTI1CjAwMmZzaWduYXR1cmUgz8SliNoBC3wUK0_kagLmhzWn5kg4mdpmLTFkk8fnIbkK")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatePrivateImages_0005_request.txt"))
			.check(status.is(200)),
            http("request_6")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDY6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3ODAzOTU3NTI1CjAwMmZzaWduYXR1cmUgz8SliNoBC3wUK0_kagLmhzWn5kg4mdpmLTFkk8fnIbkK")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_7")
			.get("/_matrix/client/app/home/home.html")
			.headers(headers_7)
			.check(status.is(200)),
            http("request_8")
			.get("/_matrix/client/img/logo-small.png")
			.check(status.is(200)),
            http("request_9")
			.get("/_matrix/client/api/v1/profile/%40test06%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDY6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3ODAzOTU3NTI1CjAwMmZzaWduYXR1cmUgz8SliNoBC3wUK0_kagLmhzWn5kg4mdpmLTFkk8fnIbkK")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_10")
			.get("/_matrix/client/api/v1/profile/%40test06%3Amatrix.allmende.io/avatar_url?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDY6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3ODAzOTU3NTI1CjAwMmZzaWduYXR1cmUgz8SliNoBC3wUK0_kagLmhzWn5kg4mdpmLTFkk8fnIbkK")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_11")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_12")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_7)
			.check(status.is(200)),
            http("request_13")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDY6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3ODAzOTU3NTI1CjAwMmZzaWduYXR1cmUgz8SliNoBC3wUK0_kagLmhzWn5kg4mdpmLTFkk8fnIbkK&from=s1239_404_62_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_14")
			.get("/_matrix/client/img/close.png")
			.check(status.is(200)),
            http("request_15")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDY6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3ODAzOTU3NTI1CjAwMmZzaWduYXR1cmUgz8SliNoBC3wUK0_kagLmhzWn5kg4mdpmLTFkk8fnIbkK&from=s1239_405_62_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(6)
		.exec(http("request_16")
			.get("/_matrix/client/app/room/room.html")
			.headers(headers_7)
			.resources(http("request_17")
			.get("/_matrix/client/img/keyboard.png")
			.check(status.is(200)),
            http("request_18")
			.get("/_matrix/client/img/icons/filetype-gif.png")
			.check(status.is(200)),
            http("request_19")
			.post("/_matrix/client/api/v1/join/!mfRliRUkRaBGJjFfTB%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDY6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3ODAzOTU3NTI1CjAwMmZzaWduYXR1cmUgz8SliNoBC3wUK0_kagLmhzWn5kg4mdpmLTFkk8fnIbkK")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulatePrivateImages_0019_request.txt"))
			.check(status.is(200)),
            http("request_20")
			.get("/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.headers(headers_20)
			.check(status.is(404)),
            http("request_21")
			.get("/_matrix/client/img/voice.png")
			.check(status.is(200)),
            http("request_22")
			.get("/_matrix/client/img/video.png")
			.check(status.is(200)),
            http("request_23")
			.get("/_matrix/client/img/settings.png")
			.check(status.is(200)),
            http("request_24")
			.get("/_matrix/client/img/attach.png")
			.check(status.is(200)),
            http("request_25")
			.get("/_matrix/client/api/v1/rooms/!mfRliRUkRaBGJjFfTB%3Amatrix.allmende.io/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDY6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3ODAzOTU3NTI1CjAwMmZzaWduYXR1cmUgz8SliNoBC3wUK0_kagLmhzWn5kg4mdpmLTFkk8fnIbkK&limit=30")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_26")
			.get("/_matrix/client/img/p/p0.png")
			.check(status.is(200)),
            http("request_27")
			.get("/_matrix/media/v1/identicon/%40test454%3Amatrix.allmende.io?width=96&height=96")
			.check(status.is(200)),
            http("request_28")
			.get("/_matrix/client/img/p/p25.png")
			.check(status.is(200)),
            http("request_29")
			.get("/_matrix/media/v1/identicon/%40test06%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_29)
			.check(status.is(200)),
            http("request_30")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDY6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3ODAzOTU3NTI1CjAwMmZzaWduYXR1cmUgz8SliNoBC3wUK0_kagLmhzWn5kg4mdpmLTFkk8fnIbkK&from=s1240_405_62_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_31")
			.get("/_matrix/client/api/v1/rooms/!mfRliRUkRaBGJjFfTB%3Amatrix.allmende.io/messages?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDY6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3ODAzOTU3NTI1CjAwMmZzaWduYXR1cmUgz8SliNoBC3wUK0_kagLmhzWn5kg4mdpmLTFkk8fnIbkK&dir=b&from=t1-812_405_62_1_1_1&limit=30")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(3)
		.exec(http("request_32")
			.post("/_matrix/media/v1/upload?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDY6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3ODAzOTU3NTI1CjAwMmZzaWduYXR1cmUgz8SliNoBC3wUK0_kagLmhzWn5kg4mdpmLTFkk8fnIbkK&filename=Capture+d%27%C3%A9cran+2016-06-27+17:08:01.png")
			.headers(headers_32)
			.resources(http("request_33")
			.put("/_matrix/client/api/v1/rooms/!mfRliRUkRaBGJjFfTB%3Amatrix.allmende.io/send/m.room.message/m1467800368467?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDY6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3ODAzOTU3NTI1CjAwMmZzaWduYXR1cmUgz8SliNoBC3wUK0_kagLmhzWn5kg4mdpmLTFkk8fnIbkK")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatePrivateImages_0033_request.txt"))
			.check(status.is(200)),
            http("request_34")
			.get("/_matrix/media/v1/thumbnail/matrix.allmende.io/ciRdOsXVLnncOwCmjJFqZrUx?width=320&height=320")
			.headers(headers_20)
			.check(status.is(200)))
			.check(status.is(200)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
