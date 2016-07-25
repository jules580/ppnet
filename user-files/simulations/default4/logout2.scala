package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class logout2 extends Simulation {

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

    val uri1 = "http://0.0.0.0:3030/_matrix/client"

	object Init{
		val init=exec(http("Init Page")
			.get("/_matrix/client/")
			.headers(headers_0)
			.resources(http("Login Page")
			.get("/_matrix/client/app/login/login.html")
			.headers(headers_1)
			.check(status.is(304)),
            http("logo image")
			.get("/_matrix/client/img/logo.png")
			.headers(headers_2)
			.check(status.is(304)))
			.check(status.is(304)))
		.pause(5)
	}
		object Login{
			val feeder=csv("login.csv").random
			val login=exec(feed(feeder))
			.exec(http("Login Request")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_3)
	.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
				.resources(http("initial Sync")
			.get("/_matrix/client/api/v1/initialSync?access_token=${token}&limit=8")
			.headers(headers_4)
			.check(status.is(200)),
            http("Presence User")
			.put("/_matrix/client/api/v1/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
			.headers(headers_5)
			.body(RawFileBody("logout2_0005_request.txt"))
			.check(status.is(200)),
            http("Turn server")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("Home page")
			.get("/_matrix/client/app/home/home.html")
			.headers(headers_7)
			.check(status.is(200)),
            http("logo small")
			.get("/_matrix/client/img/logo-small.png")
			.check(status.is(200)),
            http("Profile Username")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/displayname?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("Profile Avatar")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/avatar_url?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("list public room")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_4)
			.check(status.is(200)),
            http("recents events")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_7)
			.check(status.is(200)),
            http("close")
			.get("/_matrix/client/img/close.png")
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(15)
		.exec(session => {
			println("session"+session)
			session
		})
	}
		object Logout{
		val logout=exec( 
		http("Logout page")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s9084_3240_1186_77_1_2&timeout=30000")
			.headers(headers_4)
		.resources(http("check Logout")
			.put("/_matrix/client/undefined/_matrix/client/api/v1/presence/undefined/status")
			.headers(headers_5)
			.body(RawFileBody("logout2_0015_request.txt"))
			.check(status.is(404)))
			.check(status.is(200)))
		
}
val admin=scenario("Admins").exec(Init.init,Login.login,Logout.logout)
	setUp(admin.inject(atOnceUsers(1)))
	.assertions(
	global.responseTime.max.lessThan(60),
	forAll.failedRequests.count.lessThan(5),
	details("Send Message").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
}
