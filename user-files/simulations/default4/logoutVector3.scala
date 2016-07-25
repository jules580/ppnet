package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class logoutVector3 extends Simulation {

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
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385103-3498-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_4 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json")

	val headers_5 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385016-5177-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_6 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Access-Control-Request-Headers" -> "accept, content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_7 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385063-34411-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_8 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json",
		"content-type" -> "application/json")

	val headers_10 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive")

	val headers_11 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Access-Control-Request-Headers" -> "accept, content-type",
		"Access-Control-Request-Method" -> "POST",
		"Connection" -> "keep-alive",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_12 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json",
		"content-type" -> "application/json")

	val headers_13 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Access-Control-Request-Headers" -> "accept, content-type",
		"Access-Control-Request-Method" -> "PUT",
		"Connection" -> "keep-alive",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_14 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json")

	val headers_16 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json",
		"content-type" -> "application/json")

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
		"If-None-Match" -> "5385009-5057-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
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
		"If-None-Match" -> "5385061-4709-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
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
		"If-None-Match" -> "5385051-2432-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_26 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385022-1185-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_27 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385020-2867-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_28 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384980-1032-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_29 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385015-716-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_30 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384968-966-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_31 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384996-146-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_32 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384967-146-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_33 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385013-716-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_34 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385018-271-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_35 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385050-912-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_41 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384974-2450-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

    val uri1 = "0.0.0.0"

	val scn = scenario("logoutVector3")
		.exec(http("request_0")
			.get("http://" + uri1 + ":8081/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("http://" + uri1 + ":8081/fonts/opensans/v13/cJZKeOuBrn4kERxqtaUH3ZBw1xU1rKptJj_0jans920.woff2")
			.check(bodyBytes.is(RawFileBody("logoutVector3_0001_response.txt"))),
            http("request_2")
			.get("http://" + uri1 + ":8081/fonts/opensans/v13/MTP_ySUJH_bn48VBG8sNShampu5_7CjHW5spxoeN3Vs.woff2")
			.check(bodyBytes.is(RawFileBody("logoutVector3_0002_response.txt"))),
            http("request_3")
			.get("http://" + uri1 + ":8081/fonts/opensans/v13/k3k702ZOKiLJc3WVjuplzBampu5_7CjHW5spxoeN3Vs.woff2")
			.check(bodyBytes.is(RawFileBody("logoutVector3_0003_response.txt"))),
            http("request_4")
			.get("/_matrix/client/r0/login?")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0004_response.txt"))),
            http("request_5")
			.get("http://" + uri1 + ":8081/img/logo.png")
			.headers(headers_5)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0005_response.txt"))),
            http("request_6")
			.options("/_matrix/client/r0/register?kind=guest")
			.headers(headers_6)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0006_response.txt"))),
            http("request_7")
			.get("http://" + uri1 + ":8081/img/spinner.gif")
			.headers(headers_7)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0007_response.txt"))),
            http("request_8")
			.post("/_matrix/client/r0/register?kind=guest")
			.headers(headers_8)
			.body(RawFileBody("logoutVector3_0008_request.txt"))
			.check(status.is(403))
			.check(bodyBytes.is(RawFileBody("logoutVector3_0008_response.txt"))),
            http("request_9")
			.get("/_matrix/client/r0/login?")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0009_response.txt"))),
            http("request_10")
			.get("http://" + uri1 + ":8081/version?ts=1469444280445")
			.headers(headers_10)
			.check(status.is(404)))
			.check(bodyBytes.is(RawFileBody("logoutVector3_0000_response.txt"))))
		.pause(5)
		.exec(http("request_11")
			.options("/_matrix/client/r0/login?")
			.headers(headers_11)
			.resources(http("request_12")
			.post("/_matrix/client/r0/login?")
			.headers(headers_12)
			.body(RawFileBody("logoutVector3_0012_request.txt"))
			.check(bodyBytes.is(RawFileBody("logoutVector3_0012_response.txt"))),
            http("request_13")
			.options("/_matrix/client/r0/presence/%40test01%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDQ3ODg2MTIxCjAwMmZzaWduYXR1cmUgIZcGiUIy---nBmDoeaJvF5Ppbjl5UJqYDPe2E6J0uSIK")
			.headers(headers_13)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0013_response.txt"))),
            http("request_14")
			.get("/_matrix/client/r0/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDQ3ODg2MTIxCjAwMmZzaWduYXR1cmUgIZcGiUIy---nBmDoeaJvF5Ppbjl5UJqYDPe2E6J0uSIK")
			.headers(headers_14)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0014_response.txt"))),
            http("request_15")
			.get("/_matrix/client/r0/pushrules/?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDQ3ODg2MTIxCjAwMmZzaWduYXR1cmUgIZcGiUIy---nBmDoeaJvF5Ppbjl5UJqYDPe2E6J0uSIK")
			.headers(headers_14)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0015_response.txt"))),
            http("request_16")
			.put("/_matrix/client/r0/presence/%40test01%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDQ3ODg2MTIxCjAwMmZzaWduYXR1cmUgIZcGiUIy---nBmDoeaJvF5Ppbjl5UJqYDPe2E6J0uSIK")
			.headers(headers_16)
			.body(RawFileBody("logoutVector3_0016_request.txt"))
			.check(bodyBytes.is(RawFileBody("logoutVector3_0016_response.txt"))),
            http("request_17")
			.options("/_matrix/client/r0/user/%40test01%3Amatrix.allmende.io/filter?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDQ3ODg2MTIxCjAwMmZzaWduYXR1cmUgIZcGiUIy---nBmDoeaJvF5Ppbjl5UJqYDPe2E6J0uSIK")
			.headers(headers_11)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0017_response.txt"))),
            http("request_18")
			.post("/_matrix/client/r0/user/%40test01%3Amatrix.allmende.io/filter?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDQ3ODg2MTIxCjAwMmZzaWduYXR1cmUgIZcGiUIy---nBmDoeaJvF5Ppbjl5UJqYDPe2E6J0uSIK")
			.headers(headers_12)
			.body(RawFileBody("logoutVector3_0018_request.txt"))
			.check(bodyBytes.is(RawFileBody("logoutVector3_0018_response.txt"))),
            http("request_19")
			.get("/_matrix/client/r0/sync?filter=217&timeout=30000&_cacheBuster=1469444286243&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDQ3ODg2MTIxCjAwMmZzaWduYXR1cmUgIZcGiUIy---nBmDoeaJvF5Ppbjl5UJqYDPe2E6J0uSIK")
			.headers(headers_14)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0019_response.txt"))),
            http("request_20")
			.get("http://" + uri1 + ":8081/img/search.svg")
			.headers(headers_20)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0020_response.txt"))),
            http("request_21")
			.get("http://" + uri1 + ":8081/img/icons-settings.svg")
			.headers(headers_21)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0021_response.txt"))),
            http("request_22")
			.get("http://" + uri1 + ":8081/img/icons-create-room.svg")
			.headers(headers_22)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0022_response.txt"))),
            http("request_23")
			.get("http://" + uri1 + ":8081/img/settings.svg")
			.headers(headers_23)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0023_response.txt"))),
            http("request_24")
			.get("http://" + uri1 + ":8081/img/icons-directory.svg")
			.headers(headers_24)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0024_response.txt"))),
            http("request_25")
			.get("http://" + uri1 + ":8081/img/right_search.svg")
			.headers(headers_25)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0025_response.txt"))),
            http("request_26")
			.get("http://" + uri1 + ":8081/img/minimise.svg")
			.headers(headers_26)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0026_response.txt"))),
            http("request_27")
			.get("http://" + uri1 + ":8081/img/members.svg")
			.headers(headers_27)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0027_response.txt"))),
            http("request_28")
			.get("http://" + uri1 + ":8081/img/cancel.svg")
			.headers(headers_28)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0028_response.txt"))),
            http("request_29")
			.get("http://" + uri1 + ":8081/img/list-open.svg")
			.headers(headers_29)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0029_response.txt"))),
            http("request_30")
			.get("http://" + uri1 + ":8081/img/76cfa6.png")
			.headers(headers_30)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0030_response.txt"))),
            http("request_31")
			.get("http://" + uri1 + ":8081/img/f4c371.png")
			.headers(headers_31)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0031_response.txt"))),
            http("request_32")
			.get("http://" + uri1 + ":8081/img/50e2c2.png")
			.headers(headers_32)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0032_response.txt"))),
            http("request_33")
			.get("http://" + uri1 + ":8081/img/list-close.svg")
			.headers(headers_33)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0033_response.txt"))),
            http("request_34")
			.get("http://" + uri1 + ":8081/img/member_chevron.png")
			.headers(headers_34)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0034_response.txt"))),
            http("request_35")
			.get("http://" + uri1 + ":8081/img/plus.svg")
			.headers(headers_35)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0035_response.txt"))))
			.check(bodyBytes.is(RawFileBody("logoutVector3_0011_response.txt"))))
		.pause(4)
		.exec(http("request_36")
			.get("/_matrix/client/r0/profile/%40test01%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDQ3ODg2MTIxCjAwMmZzaWduYXR1cmUgIZcGiUIy---nBmDoeaJvF5Ppbjl5UJqYDPe2E6J0uSIK")
			.headers(headers_14)
			.resources(http("request_37")
			.get("/_matrix/client/r0/account/3pid?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDQ3ODg2MTIxCjAwMmZzaWduYXR1cmUgIZcGiUIy---nBmDoeaJvF5Ppbjl5UJqYDPe2E6J0uSIK")
			.headers(headers_14)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0037_response.txt"))),
            http("request_38")
			.get("/_matrix/client/r0/profile/%40test01%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDQ3ODg2MTIxCjAwMmZzaWduYXR1cmUgIZcGiUIy---nBmDoeaJvF5Ppbjl5UJqYDPe2E6J0uSIK")
			.headers(headers_14)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0038_response.txt"))),
            http("request_39")
			.get("/_matrix/client/r0/pushrules/?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDQ3ODg2MTIxCjAwMmZzaWduYXR1cmUgIZcGiUIy---nBmDoeaJvF5Ppbjl5UJqYDPe2E6J0uSIK")
			.headers(headers_14)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0039_response.txt"))),
            http("request_40")
			.get("/_matrix/client/r0/pushers?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDQ3ODg2MTIxCjAwMmZzaWduYXR1cmUgIZcGiUIy---nBmDoeaJvF5Ppbjl5UJqYDPe2E6J0uSIK")
			.headers(headers_14)
			.check(status.is(400))
			.check(bodyBytes.is(RawFileBody("logoutVector3_0040_response.txt"))),
            http("request_41")
			.get("http://" + uri1 + ":8081/img/camera.svg")
			.headers(headers_41)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0041_response.txt"))))
			.check(bodyBytes.is(RawFileBody("logoutVector3_0036_response.txt"))))
		.pause(6)
		.exec(http("request_42")
			.get("/_matrix/client/r0/login?")
			.headers(headers_14)
			.check(bodyBytes.is(RawFileBody("logoutVector3_0042_response.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}