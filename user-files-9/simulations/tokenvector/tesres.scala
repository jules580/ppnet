package tokenvector

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class tesres extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:8081")
		.inferHtmlResources(WhiteList(), BlackList())
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385103-3498-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_4 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385137-15086-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_5 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385063-34411-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_6 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Access-Control-Request-Headers" -> "accept, content-type",
		"Access-Control-Request-Method" -> "PUT",
		"Connection" -> "keep-alive",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_7 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json")

	val headers_9 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json",
		"content-type" -> "application/json")

	val headers_12 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

	val headers_13 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384980-1032-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_14 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385015-716-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_15 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384967-146-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_16 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385013-716-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_17 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384996-146-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_18 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384968-966-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_19 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385061-4709-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_20 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385056-1446-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_21 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385017-987-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_22 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385007-1351-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_23 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385009-5057-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_24 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385008-2586-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_25 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385020-2867-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_26 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385050-912-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_27 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385018-271-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

    val uri1 = "0.0.0.0"

	val scn = scenario("tesres")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/fonts/opensans/v13/cJZKeOuBrn4kERxqtaUH3ZBw1xU1rKptJj_0jans920.woff2")
			.check(bodyBytes.is(RawFileBody("tesres_0001_response.txt"))),
            http("request_2")
			.get("/fonts/opensans/v13/MTP_ySUJH_bn48VBG8sNShampu5_7CjHW5spxoeN3Vs.woff2")
			.check(bodyBytes.is(RawFileBody("tesres_0002_response.txt"))),
            http("request_3")
			.get("/fonts/opensans/v13/k3k702ZOKiLJc3WVjuplzBampu5_7CjHW5spxoeN3Vs.woff2")
			.check(bodyBytes.is(RawFileBody("tesres_0003_response.txt"))))
			.check(bodyBytes.is(RawFileBody("tesres_0000_response.txt"))))
		.pause(1)
		.exec(http("request_4")
			.get("/vector-icons/favicon.ico")
			.headers(headers_4)
			.resources(http("request_5")
			.get("/img/spinner.gif")
			.headers(headers_5)
			.check(bodyBytes.is(RawFileBody("tesres_0005_response.txt"))),
            http("request_6")
			.options("http://" + uri1 + ":3030/_matrix/client/r0/presence/%40testres%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0cmVzOm1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2OTAwNzk0MDE0OQowMDJmc2lnbmF0dXJlIGRUE9vAYQhJCFwcIjajtpnnAIZIE4Gg2KR7SbMhPMvJCg")
			.headers(headers_6)
			.check(bodyBytes.is(RawFileBody("tesres_0006_response.txt"))),
            http("request_7")
			.get("http://" + uri1 + ":3030/_matrix/client/r0/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0cmVzOm1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2OTAwNzk0MDE0OQowMDJmc2lnbmF0dXJlIGRUE9vAYQhJCFwcIjajtpnnAIZIE4Gg2KR7SbMhPMvJCg")
			.headers(headers_7)
			.check(bodyBytes.is(RawFileBody("tesres_0007_response.txt"))),
            http("request_8")
			.get("http://" + uri1 + ":3030/_matrix/client/r0/pushrules/?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0cmVzOm1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2OTAwNzk0MDE0OQowMDJmc2lnbmF0dXJlIGRUE9vAYQhJCFwcIjajtpnnAIZIE4Gg2KR7SbMhPMvJCg")
			.headers(headers_7)
			.check(bodyBytes.is(RawFileBody("tesres_0008_response.txt"))),
            http("request_9")
			.put("http://" + uri1 + ":3030/_matrix/client/r0/presence/%40testres%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0cmVzOm1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2OTAwNzk0MDE0OQowMDJmc2lnbmF0dXJlIGRUE9vAYQhJCFwcIjajtpnnAIZIE4Gg2KR7SbMhPMvJCg")
			.headers(headers_9)
			.body(RawFileBody("tesres_0009_request.txt"))
			.check(bodyBytes.is(RawFileBody("tesres_0009_response.txt"))),
            http("request_10")
			.get("http://" + uri1 + ":3030/_matrix/client/r0/user/%40testres%3Amatrix.allmende.io/filter/1?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0cmVzOm1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2OTAwNzk0MDE0OQowMDJmc2lnbmF0dXJlIGRUE9vAYQhJCFwcIjajtpnnAIZIE4Gg2KR7SbMhPMvJCg")
			.headers(headers_7)
			.check(bodyBytes.is(RawFileBody("tesres_0010_response.txt"))),
            http("request_11")
			.get("http://" + uri1 + ":3030/_matrix/client/r0/sync?filter=1&timeout=30000&_cacheBuster=1469004515313&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0cmVzOm1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2OTAwNzk0MDE0OQowMDJmc2lnbmF0dXJlIGRUE9vAYQhJCFwcIjajtpnnAIZIE4Gg2KR7SbMhPMvJCg")
			.headers(headers_7)
			.check(bodyBytes.is(RawFileBody("tesres_0011_response.txt"))),
            http("request_12")
			.get("/version?ts=1469004515414")
			.headers(headers_12)
			.check(status.is(404)),
            http("request_13")
			.get("/img/cancel.svg")
			.headers(headers_13)
			.check(bodyBytes.is(RawFileBody("tesres_0013_response.txt"))),
            http("request_14")
			.get("/img/list-open.svg")
			.headers(headers_14)
			.check(bodyBytes.is(RawFileBody("tesres_0014_response.txt"))),
            http("request_15")
			.get("/img/50e2c2.png")
			.headers(headers_15)
			.check(bodyBytes.is(RawFileBody("tesres_0015_response.txt"))),
            http("request_16")
			.get("/img/list-close.svg")
			.headers(headers_16)
			.check(bodyBytes.is(RawFileBody("tesres_0016_response.txt"))),
            http("request_17")
			.get("/img/f4c371.png")
			.headers(headers_17)
			.check(bodyBytes.is(RawFileBody("tesres_0017_response.txt"))),
            http("request_18")
			.get("/img/76cfa6.png")
			.headers(headers_18)
			.check(bodyBytes.is(RawFileBody("tesres_0018_response.txt"))),
            http("request_19")
			.get("/img/settings.svg")
			.headers(headers_19)
			.check(bodyBytes.is(RawFileBody("tesres_0019_response.txt"))),
            http("request_20")
			.get("/img/search.svg")
			.headers(headers_20)
			.check(bodyBytes.is(RawFileBody("tesres_0020_response.txt"))),
            http("request_21")
			.get("/img/maximise.svg")
			.headers(headers_21)
			.check(bodyBytes.is(RawFileBody("tesres_0021_response.txt"))),
            http("request_22")
			.get("/img/icons-create-room.svg")
			.headers(headers_22)
			.check(bodyBytes.is(RawFileBody("tesres_0022_response.txt"))),
            http("request_23")
			.get("/img/icons-settings.svg")
			.headers(headers_23)
			.check(bodyBytes.is(RawFileBody("tesres_0023_response.txt"))),
            http("request_24")
			.get("/img/icons-directory.svg")
			.headers(headers_24)
			.check(bodyBytes.is(RawFileBody("tesres_0024_response.txt"))),
            http("request_25")
			.get("/img/members.svg")
			.headers(headers_25)
			.check(bodyBytes.is(RawFileBody("tesres_0025_response.txt"))),
            http("request_26")
			.get("/img/plus.svg")
			.headers(headers_26)
			.check(bodyBytes.is(RawFileBody("tesres_0026_response.txt"))))
			.check(bodyBytes.is(RawFileBody("tesres_0004_response.txt"))))
		.pause(1)
		.exec(http("request_27")
			.get("/img/member_chevron.png")
			.headers(headers_27)
			.check(bodyBytes.is(RawFileBody("tesres_0027_response.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}