package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulatehello extends Simulation {

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

	val headers_1 = Map("Accept" -> "application/json, text/plain, */*")

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

	val headers_9 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

    val uri1 = "http://0.0.0.0:3030/_matrix"

	val scn = scenario("RecordedSimulatehello")
		.exec(http("request_0")
			.get("/_matrix/client/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/_matrix/client/app/login/login.html")
			.headers(headers_1)
			.check(status.is(200)),
            http("request_2")
			.get("/_matrix/client/img/logo.png")
			.check(status.is(200)))
			.check(status.is(304)))
		.pause(6)
		.exec(http("request_3")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulatehello_0003_request.txt"))
			.resources(http("request_4")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg&limit=8")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_5")
			.put("/_matrix/client/api/v1/presence/%40test454%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatehello_0005_request.txt"))
			.check(status.is(200)),
            http("request_6")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_7")
			.get("/_matrix/client/app/home/home.html")
			.headers(headers_1)
			.check(status.is(200)),
            http("request_8")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg&from=s46_72_6_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_9")
			.get("/_matrix/client/img/logo-small.png")
			.headers(headers_9)
			.check(status.is(200)),
            http("request_10")
			.get("/_matrix/client/api/v1/profile/%40test454%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_11")
			.get("/_matrix/client/api/v1/profile/%40test454%3Amatrix.allmende.io/avatar_url?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_12")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_13")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_1)
			.check(status.is(200)),
            http("request_14")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_15")
			.get("/_matrix/client/api/v1/rooms/!ooUfKnmhGKvrWEFFgr%3Amatrix.allmende.io/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg&limit=30")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_16")
			.get("/_matrix/client/img/close.png")
			.headers(headers_9)
			.check(status.is(200)),
            http("request_17")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg&from=s52_73_8_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(12)
		.exec(http("request_18")
			.get("/_matrix/client/api/v1/rooms/!dyHzGOvpxvavsQOcWN%3Amatrix.allmende.io/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg&limit=30")
			.headers(headers_4)
			.resources(http("request_19")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg&from=s54_73_8_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_20")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg&from=s56_73_8_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)),
            http("request_21")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg&from=s57_73_8_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(6)
		.exec(http("request_22")
			.get("/_matrix/client/app/room/room.html")
			.headers(headers_1)
			.resources(http("request_23")
			.get("/_matrix/client/img/keyboard.png")
			.headers(headers_9)
			.check(status.is(200)),
            http("request_24")
			.get("/_matrix/client/img/icons/filetype-gif.png")
			.headers(headers_9)
			.check(status.is(200)),
            http("request_25")
			.get("/_matrix/media/v1/identicon/%40test454%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_9)
			.check(status.is(200)),
            http("request_26")
			.get("/_matrix/client/img/p/p25.png")
			.headers(headers_9)
			.check(status.is(200)),
            http("request_27")
			.get("/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.headers(headers_9)
			.check(status.is(404)),
            http("request_28")
			.get("/_matrix/client/img/voice.png")
			.headers(headers_9)
			.check(status.is(200)),
            http("request_29")
			.get("/_matrix/client/img/video.png")
			.headers(headers_9)
			.check(status.is(200)),
            http("request_30")
			.get("/_matrix/client/img/settings.png")
			.headers(headers_9)
			.check(status.is(200)),
            http("request_31")
			.get("/_matrix/client/img/attach.png")
			.headers(headers_9)
			.check(status.is(200)),
            http("request_32")
			.get("/_matrix/client/api/v1/rooms/!dyHzGOvpxvavsQOcWN%3Amatrix.allmende.io/messages?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg&dir=b&from=t1-52_73_8_1_1_1&limit=30")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(1)
		.exec(http("request_33")
			.put("/_matrix/client/api/v1/rooms/!dyHzGOvpxvavsQOcWN%3Amatrix.allmende.io/typing/%40test454%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatehello_0033_request.txt"))
			.resources(http("request_34")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg&from=s57_73_9_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(3)
		.exec(http("request_35")
			.put("/_matrix/client/api/v1/rooms/!dyHzGOvpxvavsQOcWN%3Amatrix.allmende.io/typing/%40test454%3Amatrix.allmende.io?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatehello_0035_request.txt"))
			.resources(http("request_36")
			.put("/_matrix/client/api/v1/rooms/!dyHzGOvpxvavsQOcWN%3Amatrix.allmende.io/send/m.room.message/m1467719571856?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulatehello_0036_request.txt"))
			.check(status.is(200)),
            http("request_37")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0NDU0Om1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2NzcyMzE0NzE2NQowMDJmc2lnbmF0dXJlIHnOAp7J_d9oLzSfNkMOy5x846k5MRLANUzgj5JpVp7lCg&from=s57_73_10_1_1_1&timeout=30000")
			.headers(headers_4)
			.check(status.is(200)))
			.check(status.is(200)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
