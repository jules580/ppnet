package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulateSendMessageVector extends Simulation {

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
		"If-None-Match" -> "5385008-2586-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_21 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385020-2867-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
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
		"If-None-Match" -> "5385056-1446-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_25 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385009-5057-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_26 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385051-2432-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_27 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385022-1185-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_29 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384980-1032-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_30 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385015-716-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_31 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384967-146-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_32 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384968-966-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

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
		"If-None-Match" -> "5385050-912-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_38 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384973-1433-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_40 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385077-4048-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_42 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385011-1213-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_43 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385070-2491-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_45 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384996-146-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_46 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384993-460-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_49 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384970-1596-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_51 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384974-2450-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_52 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385064-846-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_59 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385018-271-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

    val uri1 = "0.0.0.0"
before{
	println("a message will be send")
	
}
    object Init{
		val init=exec(http("Connect url")
			.get("http://" + uri1 + ":8081/")
			.headers(headers_0)
			.resources(http("Open sans 1")
			.get("http://" + uri1 + ":8081/fonts/opensans/v13/cJZKeOuBrn4kERxqtaUH3ZBw1xU1rKptJj_0jans920.woff2")
			.check(status.is(200)),
            http("Open sans 2")
			.get("http://" + uri1 + ":8081/fonts/opensans/v13/MTP_ySUJH_bn48VBG8sNShampu5_7CjHW5spxoeN3Vs.woff2")
			.check(status.is(200)),
            http("Open sans 3")
			.get("http://" + uri1 + ":8081/fonts/opensans/v13/k3k702ZOKiLJc3WVjuplzBampu5_7CjHW5spxoeN3Vs.woff2")
			.check(status.is(200)),
            http("Login Page")
			.get("/_matrix/client/r0/login?")
			.headers(headers_4)
			.check(status.is(200)),
            http("logo image")
			.get("http://" + uri1 + ":8081/img/logo.png")
			.headers(headers_5)
			.check(status.is(304)),
            http("register page")
			.options("/_matrix/client/r0/register?kind=guest")
			.headers(headers_6)
			.check(status.is(200)),
            http("spinner image")
			.get("http://" + uri1 + ":8081/img/spinner.gif")
			.headers(headers_7)
			.check(status.is(304)),
            http("register guest")
			.post("/_matrix/client/r0/register?kind=guest")
			.headers(headers_8)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0008_request.txt"))
			.check(status.is(403)),
            http("login pages")
			.get("/_matrix/client/r0/login?")
			.headers(headers_4)
			.check(status.is(200)),
            http("version page")
			.get("http://" + uri1 + ":8081/version?ts=1468424596723")
			.headers(headers_10)
			.check(status.is(404))))

		.pause(8)
	}
	object Login{
		val feeder=csv("login.csv").random
		val login=exec(feed(feeder))
		.exec(http("Login user")
			.options("/_matrix/client/r0/login?")
			.headers(headers_11)
			.resources(http("Login Request")
			.post("/_matrix/client/r0/login?")
			.headers(headers_12)
			.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.check(status.is(200)),
            http("Presence Users")
			.options("/_matrix/client/r0/presence/%40test09%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_13)
			.check(status.is(200)),
            http("Turn Server")
			.get("/_matrix/client/r0/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)),
            http("Push rules")
			.get("/_matrix/client/r0/pushrules/?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)),
            http("Presence User")
			.put("/_matrix/client/r0/presence/%40test09%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_16)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0016_request.txt"))
			.check(status.is(200)),
            http("filter acces 1")
			.options("/_matrix/client/r0/user/%40test09%3Amatrix.allmende.io/filter?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_11)
			.check(status.is(200)),
            http("filter access 2")
			.post("/_matrix/client/r0/user/%40test09%3Amatrix.allmende.io/filter?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_12)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0018_request.txt"))
			.check(status.is(200)),
            http("filter access 3")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&_cacheBuster=1468424606158&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)),
            http("directory image")
			.get("http://" + uri1 + ":8081/img/icons-directory.svg")
			.headers(headers_20)
			.check(status.is(304)),
            http("members image")
			.get("http://" + uri1 + ":8081/img/members.svg")
			.headers(headers_21)
			.check(status.is(304)),
            http("icon room")
			.get("http://" + uri1 + ":8081/img/icons-create-room.svg")
			.headers(headers_22)
			.check(status.is(304)),
            http("setting image")
			.get("http://" + uri1 + ":8081/img/settings.svg")
			.headers(headers_23)
			.check(status.is(304)),
            http("search image")
			.get("http://" + uri1 + ":8081/img/search.svg")
			.headers(headers_24)
			.check(status.is(304)),
            http("icons settings")
			.get("http://" + uri1 + ":8081/img/icons-settings.svg")
			.headers(headers_25)
			.check(status.is(304)),
            http("right search")
			.get("http://" + uri1 + ":8081/img/right_search.svg")
			.headers(headers_26)
			.check(status.is(304)),
            http("minimise image")
			.get("http://" + uri1 + ":8081/img/minimise.svg")
			.headers(headers_27)
			.check(status.is(304)),
            http("sync filter")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1540_1239_764_7_1_2&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)),
            http("cancel image")
			.get("http://" + uri1 + ":8081/img/cancel.svg")
			.headers(headers_29)
			.check(status.is(304)),
            http("open image")
			.get("http://" + uri1 + ":8081/img/list-open.svg")
			.headers(headers_30)
			.check(status.is(304)),
            http("50e2c2 image")
			.get("http://" + uri1 + ":8081/img/50e2c2.png")
			.headers(headers_31)
			.check(status.is(304)),
            http("76cfa6 image")
			.get("http://" + uri1 + ":8081/img/76cfa6.png")
			.headers(headers_32)
			.check(status.is(304)),
            http("close image")
			.get("http://" + uri1 + ":8081/img/list-close.svg")
			.headers(headers_33)
			.check(status.is(304)),
            http("plus image")
			.get("http://" + uri1 + ":8081/img/plus.svg")
			.headers(headers_34)
			.check(status.is(304)))
			.check(status.is(200)))
			.exec(session=>{
				println("session"+session)
				session
			})
		.pause(6)
	}
	object Join{
		val join=exec(http("Join Possibility")
			.options("/_matrix/client/r0/createRoom?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_11)
			.resources(http("Can join")
			.post("/_matrix/client/r0/createRoom?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_12)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0036_request.txt"))
			.check(status.is(200)),
            http("")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1542_1239_764_7_1_2&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)),
            http("call image")
			.get("http://" + uri1 + ":8081/img/call.svg")
			.headers(headers_38)
			.check(status.is(304)),
            http("search image")
			.get("http://" + uri1 + ":8081/img/search.svg")
			.headers(headers_24)
			.check(status.is(304)),
            http("voice image")
			.get("http://" + uri1 + ":8081/img/voice.svg")
			.headers(headers_40)
			.check(status.is(304)),
            http("setting image")
			.get("http://" + uri1 + ":8081/img/settings.svg")
			.headers(headers_23)
			.check(status.is(304)),
            http("leave image")
			.get("http://" + uri1 + ":8081/img/leave.svg")
			.headers(headers_42)
			.check(status.is(304)),
            http("upload image")
			.get("http://" + uri1 + ":8081/img/upload.svg")
			.headers(headers_43)
			.check(status.is(304)),
            http("Infos room")
			.get("/_matrix/client/r0/rooms/!BgUjAJRcsCqJwfjbUw%3Amatrix.allmende.io/messages?from=s1541_1239_764_7_1_2&limit=20&dir=b&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)),
            http("f4c371 image")
			.get("http://" + uri1 + ":8081/img/f4c371.png")
			.headers(headers_45)
			.check(status.is(304)),
            http("edit image")
			.get("http://" + uri1 + ":8081/img/edit.png")
			.headers(headers_46)
			.check(status.is(304)),
            http("filter sync ")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1546_1239_764_7_1_2&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)),
            http("time enter")
			.get("/_matrix/client/r0/rooms/!BgUjAJRcsCqJwfjbUw%3Amatrix.allmende.io/messages?from=t1-1540_1239_764_7_1_2&limit=20&dir=b&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)),
            http("admin image")
			.get("http://" + uri1 + ":8081/img/admin.svg")
			.headers(headers_49)
			.check(status.is(304)))
			.check(status.is(200)))
		.pause(1)
	}
	object Visible{
		val visible=exec(http("Visibility room")
			.get("/_matrix/client/r0/directory/list/room/!BgUjAJRcsCqJwfjbUw%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.resources(http("camera image")
			.get("http://" + uri1 + ":8081/img/camera.svg")
			.headers(headers_51)
			.check(status.is(304)),
            http("tick image")
			.get("http://" + uri1 + ":8081/img/tick.svg")
			.headers(headers_52)
			.check(status.is(304)))
			.check(status.is(200)))
		.pause(8)
	}
	object Param{
		val param=exec(http("Param initial")
			.options("/_matrix/client/r0/rooms/!BgUjAJRcsCqJwfjbUw%3Amatrix.allmende.io/state/m.room.power_levels/?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_13)
			.resources(http("Set Param")
			.put("/_matrix/client/r0/rooms/!BgUjAJRcsCqJwfjbUw%3Amatrix.allmende.io/state/m.room.power_levels/?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_16)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0054_request.txt"))
			.check(status.is(200)),
            http("setting image")
			.get("http://" + uri1 + ":8081/img/settings.svg")
			.headers(headers_23)
			.check(status.is(304)),
            http("leave image")
			.get("http://" + uri1 + ":8081/img/leave.svg")
			.headers(headers_42)
			.check(status.is(304)),
            http("search image")
			.get("http://" + uri1 + ":8081/img/search.svg")
			.headers(headers_24)
			.check(status.is(304)),
            http("Liste event")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1547_1239_764_7_1_2&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)),
            http("member image")
			.get("http://" + uri1 + ":8081/img/member_chevron.png")
			.headers(headers_59)
			.check(status.is(304)))
			.check(status.is(200)))
		.pause(24)
	}
	object Communicate{
		val communicate=exec(http("List Guest")
			.options("/_matrix/client/r0/rooms/!BgUjAJRcsCqJwfjbUw%3Amatrix.allmende.io/invite?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_11)
			.resources(http("Invite Guest")
			.post("/_matrix/client/r0/rooms/!BgUjAJRcsCqJwfjbUw%3Amatrix.allmende.io/invite?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_12)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0061_request.txt"))
			.check(status.is(200)),
            http("Event communication")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1548_1239_764_7_1_2&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(5)
	}
		object Typing{
			val typing=exec(http("Typing ?")
			.options("/_matrix/client/r0/rooms/!BgUjAJRcsCqJwfjbUw%3Amatrix.allmende.io/typing/%40test09%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_13)
			.resources(http("Typing ok")
			.put("/_matrix/client/r0/rooms/!BgUjAJRcsCqJwfjbUw%3Amatrix.allmende.io/typing/%40test09%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_16)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0064_request.txt"))
			.check(status.is(200)),
            http("Typing event")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1548_1239_765_7_1_2&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(2)
	}
		object SendMessage{
			val feeder=csv("answer.csv").random
			val sendmessage=exec(feed(feeder))
			.exec(http("Wait Message")
			.options("/_matrix/client/r0/rooms/!BgUjAJRcsCqJwfjbUw%3Amatrix.allmende.io/send/m.room.message/m1468424657926.0?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_13)
			.resources(http("Message Send ")
			.put("/_matrix/client/r0/rooms/!BgUjAJRcsCqJwfjbUw%3Amatrix.allmende.io/send/m.room.message/m1468424657926.0?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_16)
			.body(StringBody("""{"msgtype":"m.text","body":"${answer}"}"""))
			.check(status.is(200)),
            http("End Typing")
			.put("/_matrix/client/r0/rooms/!BgUjAJRcsCqJwfjbUw%3Amatrix.allmende.io/typing/%40test09%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_16)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0068_request.txt"))
			.check(status.is(200)),
            http("Event message")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1548_1239_766_7_1_2&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session =>{
				println("session"+session)
				session
			})
		}
		after{
			println("the message is send")
		}
val admins=scenario("admins").exec(Init.init,Login.login,Join.join,Visible.visible,Param.param,Communicate.communicate,Typing.typing,SendMessage.sendmessage)
	setUp(admins.inject(atOnceUsers(20)))

	//.throttle(reachRps(10) in (10 seconds), holdFor(15 seconds)))
	.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5),
	details("Login user").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
}
