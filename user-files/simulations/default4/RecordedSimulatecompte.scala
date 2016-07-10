package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulatecompte extends Simulation {

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

	val headers_4 = Map("Accept" -> "*/*")

	val headers_6 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_8 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

	val headers_9 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_13 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

    val uri1 = "http://0.0.0.0:3030/_matrix/client"
    val uri2 = "https://www.google.com/recaptcha/api.js"
    val uri3 = "https://www.gstatic.com/recaptcha/api2/r20160615154650/recaptcha__fr.js"

	val scn = scenario("RecordedSimulatecompte")
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
		.pause(1)
		.exec(http("request_3")
			.get("/_matrix/client/app/login/register.html")
			.resources(http("request_4")
			.get(uri2 + "?render=explicit&_=1467717510666")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_5")
			.get(uri3 + "")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(16)
		.exec(http("request_6")
			.post("/_matrix/client/v2_alpha/register")
			.headers(headers_6)
			.body(RawFileBody("RecordedSimulatecompte_0006_request.txt"))
			.resources(http("request_7")
			.post("/_matrix/client/v2_alpha/register")
			.headers(headers_6)
			.body(RawFileBody("RecordedSimulatecompte_0007_request.txt"))
			.check(status.is(200)),
            http("request_8")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMTEyOTY5NQowMDJmc2lnbmF0dXJlIIUfwRXe7ENKnoazCPnSk_48fmocs_KI06Py9rxPXfM0Cg&limit=8")
			.headers(headers_8)
			.check(status.is(200)),
            http("request_9")
			.put("/_matrix/client/api/v1/presence/%40test454%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMTEyOTY5NQowMDJmc2lnbmF0dXJlIIUfwRXe7ENKnoazCPnSk_48fmocs_KI06Py9rxPXfM0Cg")
			.headers(headers_9)
			.body(RawFileBody("RecordedSimulatecompte_0009_request.txt"))
			.check(status.is(200)),
            http("request_10")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMTEyOTY5NQowMDJmc2lnbmF0dXJlIIUfwRXe7ENKnoazCPnSk_48fmocs_KI06Py9rxPXfM0Cg")
			.headers(headers_8)
			.check(status.is(200)),
            http("request_11")
			.put("/_matrix/client/api/v1/profile/%40test454%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMTEyOTY5NQowMDJmc2lnbmF0dXJlIIUfwRXe7ENKnoazCPnSk_48fmocs_KI06Py9rxPXfM0Cg")
			.headers(headers_9)
			.body(RawFileBody("RecordedSimulatecompte_0011_request.txt"))
			.check(status.is(200)),
            http("request_12")
			.get("/_matrix/client/app/home/home.html")
			.check(status.is(200)),
            http("request_13")
			.get("/_matrix/client/img/logo-small.png")
			.headers(headers_13)
			.check(status.is(200)),
            http("request_14")
			.get("/_matrix/client/api/v1/profile/%40test454%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMTEyOTY5NQowMDJmc2lnbmF0dXJlIIUfwRXe7ENKnoazCPnSk_48fmocs_KI06Py9rxPXfM0Cg")
			.headers(headers_8)
			.check(status.is(200)),
            http("request_15")
			.get("/_matrix/client/api/v1/profile/%40test454%3Amatrix.allmende.io/avatar_url?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMTEyOTY5NQowMDJmc2lnbmF0dXJlIIUfwRXe7ENKnoazCPnSk_48fmocs_KI06Py9rxPXfM0Cg")
			.headers(headers_8)
			.check(status.is(200)),
            http("request_16")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_8)
			.check(status.is(200)),
            http("request_17")
			.get("/_matrix/client/app/recents/recents.html")
			.check(status.is(200)),
            http("request_18")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMTEyOTY5NQowMDJmc2lnbmF0dXJlIIUfwRXe7ENKnoazCPnSk_48fmocs_KI06Py9rxPXfM0Cg&from=s46_51_6_1_1_1&timeout=30000")
			.headers(headers_8)
			.check(status.is(200)),
            http("request_19")
			.get("/_matrix/client/img/close.png")
			.headers(headers_13)
			.check(status.is(200)))
			.check(status.is(400)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
