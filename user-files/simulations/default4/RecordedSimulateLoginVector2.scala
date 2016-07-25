package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulateLoginVector2 extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.acceptEncodingHeader("gzip, deflate, sdch")
		.acceptLanguageHeader("fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

	val headers_0 = Map(
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json")

	val headers_4 = Map(
		"Accept" -> "*/*",
		"Access-Control-Request-Headers" -> "accept, content-type",
		"Access-Control-Request-Method" -> "POST",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_5 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Content-Type" -> "application/json",
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json",
		"content-type" -> "application/json")

	val headers_6 = Map(
		"Accept" -> "*/*",
		"Access-Control-Request-Headers" -> "accept, content-type",
		"Access-Control-Request-Method" -> "PUT",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_9 = Map(
		"Content-Type" -> "application/json",
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json",
		"content-type" -> "application/json")

	val headers_13 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385007-1351-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_14 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_15 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385008-2586-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_16 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385022-1185-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_18 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385009-5057-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_20 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385051-2432-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_21 = Map("Accept" -> "image/webp,image/*,*/*;q=0.8")

    val uri1 = "0.0.0.0"
    val uri2 = "https://matrix.org/_matrix/client/r0/login"
before{
	println("Login will begin")
}
object Init{
		val init=exec(http("matrix page")
			.get(uri2 + "?")
			.headers(headers_0)
			.check(status.is(200)))
		.pause(15)
	
		.exec(http("matrix page2")
			.get(uri2 + "?")
			.headers(headers_0)
			.resources(http("matrix page 3")
			.get(uri2 + "?")
			.headers(headers_0)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(18)
		.exec(http("login page")
			.get("/_matrix/client/r0/login?")
			.headers(headers_0)
			.check(status.is(200)))
		.pause(7)
	}
		object Login{
			val feeder=csv("login.csv").random
			val login=exec(feed(feeder))
			.exec(http("Login user")
			.options("/_matrix/client/r0/login?")
			.headers(headers_4)
			.resources(http("Login request")
			.post("/_matrix/client/r0/login?")
			.headers(headers_5)
						.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.check(status.is(200)),
            http("Presence Users")
			.options("/_matrix/client/r0/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
			.headers(headers_6)
			.check(status.is(200)),
            http("Turn Server")
			.get("/_matrix/client/r0/voip/turnServer?access_token=${token}")
			.headers(headers_0)
			.check(status.is(200)),
            http("Push rules")
			.get("/_matrix/client/r0/pushrules/?access_token=${token}")
			.headers(headers_0)
			.check(status.is(200)),
            http("Presence user")
			.put("/_matrix/client/r0/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
			.headers(headers_9)
			.body(RawFileBody("RecordedSimulateLoginVector_0009_request.txt"))
			.check(status.is(200)),
            http("User filter")
			.options("/_matrix/client/r0/user/%40${login}%3Amatrix.allmende.io/filter?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("User Filter 2")
			.post("/_matrix/client/r0/user/%40${login}%3Amatrix.allmende.io/filter?access_token=${token}")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulateLoginVector_0011_request.txt"))
			.check(status.is(200)),
            http("User filter 3")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&_cacheBuster=1468423904986&access_token=${token}")
			.headers(headers_0)
			.check(status.is(200)),
            http("Icon image")
			.get("http://" + uri1 + ":8081/img/icons-create-room.svg")
			.headers(headers_13)
			.check(status.is(304)),
            http("Setting image")
			.get("http://" + uri1 + ":8081/img/settings.svg")
			.headers(headers_14)
			.check(status.is(200)),
            http("Directory image")
			.get("http://" + uri1 + ":8081/img/icons-directory.svg")
			.headers(headers_15)
			.check(status.is(304)),
            http("minimise image")
			.get("http://" + uri1 + ":8081/img/minimise.svg")
			.headers(headers_16)
			.check(status.is(304)),
            http("search image")
			.get("http://" + uri1 + ":8081/img/search.svg")
			.headers(headers_14)
			.check(status.is(200)),
            http("setting image")
			.get("http://" + uri1 + ":8081/img/icons-settings.svg")
			.headers(headers_18)
			.check(status.is(304)),
            http("members image")
			.get("http://" + uri1 + ":8081/img/members.svg")
			.headers(headers_14)
			.check(status.is(200)),
            http("search image")
			.get("http://" + uri1 + ":8081/img/right_search.svg")
			.headers(headers_20)
			.check(status.is(304)),
            http("cancel image")
			.get("http://" + uri1 + ":8081/img/cancel.svg")
			.headers(headers_21)
			.check(status.is(200)),
            http("plus image")
			.get("http://" + uri1 + ":8081/img/plus.svg")
			.headers(headers_21)
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session =>{
				println("session"+session)
				session
			})
		.pause(4)
		.exec(http("Member cheveron")
			.get("http://" + uri1 + ":8081/img/member_chevron.png")
			.headers(headers_21)
			.check(status.is(200)))
}
after{
	println("Login is finish")
}
val admins=scenario("Admin").exec(Init.init,Login.login)
	setUp(admins.inject(
	rampUsers(10) over (30 seconds),
	constantUsersPerSec(2) during (5 seconds) randomized)
	.throttle(reachRps(10) in (10 seconds), holdFor(15 seconds)))
	.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5),
	details("Send Message").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
}
