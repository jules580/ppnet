package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulatepublicHelloPrivate2 extends Simulation {

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
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_4 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

	val headers_5 = Map(
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

	val scn = scenario("RecordedSimulatepublicHelloPrivate2")
		.exec(http("request_0")
			.get("/_matrix/client/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/_matrix/client/app/login/login.html")
			.headers(headers_1)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0001_response.txt"))),
            http("request_2")
			.get("/_matrix/client/img/logo.png")
			.headers(headers_2)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0002_response.txt"))))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0000_response.txt"))))
		.pause(6)
		.exec(http("request_3")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulatepublicHelloPrivate2_0003_request.txt"))
			.resources(http("request_4")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK&limit=8")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0004_response.txt"))),
            http("request_5")
			.put("/_matrix/client/api/v1/presence/%40test04%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatepublicHelloPrivate2_0005_request.txt"))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0005_response.txt"))),
            http("request_6")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0006_response.txt"))),
            http("request_7")
			.get("/_matrix/client/app/home/home.html")
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0007_response.txt"))),
            http("request_8")
			.get("/_matrix/client/img/logo-small.png")
			.headers(headers_8)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0008_response.txt"))),
            http("request_9")
			.get("/_matrix/client/api/v1/profile/%40test04%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0009_response.txt"))),
            http("request_10")
			.get("/_matrix/client/api/v1/profile/%40test04%3Amatrix.allmende.io/avatar_url?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0010_response.txt"))),
            http("request_11")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0011_response.txt"))),
            http("request_12")
			.get("/_matrix/client/app/recents/recents.html")
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0012_response.txt"))),
            http("request_13")
			.get("/_matrix/client/img/close.png")
			.headers(headers_8)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0013_response.txt"))),
            http("request_14")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK&from=s1197_357_30_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0014_response.txt"))),
            http("request_15")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK&from=s1197_358_30_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0015_response.txt"))))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0003_response.txt"))))
		.pause(7)
		.exec(http("request_16")
			.get("/_matrix/client/app/room/room.html")
			.resources(http("request_17")
			.get("/_matrix/client/img/keyboard.png")
			.headers(headers_8)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0017_response.txt"))),
            http("request_18")
			.get("/_matrix/client/img/icons/filetype-gif.png")
			.headers(headers_8)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0018_response.txt"))),
            http("request_19")
			.post("/_matrix/client/api/v1/join/!RtLuZjBtZOUzciQuzE%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulatepublicHelloPrivate2_0019_request.txt"))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0019_response.txt"))),
            http("request_20")
			.get("/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.headers(headers_8)
			.check(status.is(404))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0020_response.txt"))),
            http("request_21")
			.get("/_matrix/client/img/voice.png")
			.headers(headers_8)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0021_response.txt"))),
            http("request_22")
			.get("/_matrix/client/img/video.png")
			.headers(headers_8)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0022_response.txt"))),
            http("request_23")
			.get("/_matrix/client/img/settings.png")
			.headers(headers_8)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0023_response.txt"))),
            http("request_24")
			.get("/_matrix/client/img/attach.png")
			.headers(headers_8)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0024_response.txt"))),
            http("request_25")
			.get("/_matrix/client/api/v1/rooms/!RtLuZjBtZOUzciQuzE%3Amatrix.allmende.io/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK&limit=30")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0025_response.txt"))),
            http("request_26")
			.get("/_matrix/media/v1/identicon/%40test04%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_8)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0026_response.txt"))),
            http("request_27")
			.get("/_matrix/client/img/p/p0.png")
			.headers(headers_8)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0027_response.txt"))),
            http("request_28")
			.get("/_matrix/media/v1/identicon/%40test454%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_8)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0028_response.txt"))),
            http("request_29")
			.get("/_matrix/client/img/p/p25.png")
			.headers(headers_8)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0029_response.txt"))),
            http("request_30")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK&from=s1198_358_30_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0030_response.txt"))),
            http("request_31")
			.get("/_matrix/client/api/v1/rooms/!RtLuZjBtZOUzciQuzE%3Amatrix.allmende.io/messages?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK&dir=b&from=t1-958_358_30_1_1_1&limit=30")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0031_response.txt"))))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0016_response.txt"))))
		.pause(2)
		.exec(http("request_32")
			.put("/_matrix/client/api/v1/rooms/!RtLuZjBtZOUzciQuzE%3Amatrix.allmende.io/typing/%40test04%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatepublicHelloPrivate2_0032_request.txt"))
			.resources(http("request_33")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK&from=s1198_358_31_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0033_response.txt"))))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0032_response.txt"))))
		.pause(1)
		.exec(http("request_34")
			.put("/_matrix/client/api/v1/rooms/!RtLuZjBtZOUzciQuzE%3Amatrix.allmende.io/typing/%40test04%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatepublicHelloPrivate2_0034_request.txt"))
			.resources(http("request_35")
			.put("/_matrix/client/api/v1/rooms/!RtLuZjBtZOUzciQuzE%3Amatrix.allmende.io/send/m.room.message/m1467795728397?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatepublicHelloPrivate2_0035_request.txt"))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0035_response.txt"))),
            http("request_36")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDQ6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3Nzk5MzE1MTA1CjAwMmZzaWduYXR1cmUgR0_9LSAOdq-tspDydYpostiC2OtTXVPR98SeyGiknLwK&from=s1198_358_32_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0036_response.txt"))))
			.check(bodyBytes.is(RawFileBody("RecordedSimulatepublicHelloPrivate2_0034_response.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}