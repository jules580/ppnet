package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulateloginFalse extends Simulation {
before{
	println("Simulation about login will begin")
}

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
		"Connection" -> "keep-alive")

	val headers_3 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_5 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 Sep 2015 18:01:31 GMT")

	val headers_7 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 Sep 2015 18:01:31 GMT")

	val headers_9 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_11 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

	val headers_12 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

    val uri1 = test
//"http://0.0.0.0:3030/_matrix/client"

	object Index{
		val index=exec(http("Init")
			.get("/_matrix/client/")
			.headers(headers_0)
			.resources(http("Acces api")
			.get("/_matrix/client/api/v1/pushrules/?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEzNDU5NzczCjAwMmZzaWduYXR1cmUgk-KH11UPLq7RDpDYOuebPksAl4PqvHHAHXbC3Xn0iWwK")
			.headers(headers_1)
			.check(status.is(200)),
            http("Access sync")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEzNDU5NzczCjAwMmZzaWduYXR1cmUgk-KH11UPLq7RDpDYOuebPksAl4PqvHHAHXbC3Xn0iWwK&limit=8")
			.headers(headers_1)
			.check(status.is(200)),
            http("presence")
			.put("/_matrix/client/api/v1/presence/%40testre%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEzNDU5NzczCjAwMmZzaWduYXR1cmUgk-KH11UPLq7RDpDYOuebPksAl4PqvHHAHXbC3Xn0iWwK")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulatelogin_0003_request.txt"))
			.check(status.is(200)),
            http("turnServer")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEzNDU5NzczCjAwMmZzaWduYXR1cmUgk-KH11UPLq7RDpDYOuebPksAl4PqvHHAHXbC3Xn0iWwK")
			.headers(headers_1)
			.check(status.is(200)),
            http("Login page")
			.get("/_matrix/client/app/login/login.html")
			.headers(headers_5)
			.check(status.is(304)),
            http("list event")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEzNDU5NzczCjAwMmZzaWduYXR1cmUgk-KH11UPLq7RDpDYOuebPksAl4PqvHHAHXbC3Xn0iWwK&from=s20_10_4_1_1_1&timeout=30000")
			.headers(headers_1)
			.check(status.is(200)),
            http("logo picture")
			.get("/_matrix/client/img/logo.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("event")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEzNDU5NzczCjAwMmZzaWduYXR1cmUgk-KH11UPLq7RDpDYOuebPksAl4PqvHHAHXbC3Xn0iWwK&from=s20_11_5_1_1_1&timeout=30000")
			.headers(headers_1)
			.check(status.is(200)))
			.check(status.is(304)))
			.pause(7)
		}
		object Login{
			 val feeder =csv("login.csv").random
			
		val login= exec(feed(feeder))
		.exec(http("login")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_9) 
			.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.passwor"}"""))
			.resources(http("Home user")
			.get("/_matrix/client/app/home/home.html")
			.check(status.is(200)),
        
            http("Logo-small")
			.get("/_matrix/client/img/logo-small.png")
			.headers(headers_11)
			.check(status.is(200)),
            http("TurnServer Access")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEzNDk5Nzc3CjAwMmZzaWduYXR1cmUghKHurGRshGS0dpwu2WqEV3C8Pshl-KoZEs_wGWHzx-8K")
			.headers(headers_12)
			.check(status.is(200)),
            http("DisplayName")
			.get("/_matrix/client/api/v1/profile/%40testre%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEzNDk5Nzc3CjAwMmZzaWduYXR1cmUghKHurGRshGS0dpwu2WqEV3C8Pshl-KoZEs_wGWHzx-8K")
			.headers(headers_12)
			.check(status.is(200)),
            http("Get public Room")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_12)
			.check(status.is(200)),
            http("profile info")
			.get("/_matrix/client/api/v1/profile/%40testre%3Amatrix.allmende.io/avatar_url?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0cmU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY3NzEzNDk5Nzc3CjAwMmZzaWduYXR1cmUghKHurGRshGS0dpwu2WqEV3C8Pshl-KoZEs_wGWHzx-8K")
			.headers(headers_12)
			.check(status.is(200)),
            http("Info recent event")
			.get("/_matrix/client/app/recents/recents.html")
			.check(status.is(200))
			.check(currentLocation.saveAs("ccurrentLocation"))
			.check(responseTimeInMillis.saveAs("responseTime"))
			.check(regex("""https://(.*)/.*""").count.saveAs("Https")),
			//.check(bodyString.saveAs("bodystring"))
			//.check(bodyBytes.saveAs("bodybytes")),
            http("Close picture")
			.get("/_matrix/client/img/close.png")
			.headers(headers_11)
			.check(status.is(200)))
			.check(status.is(200)))
			
			.exec(session => {
				println("test"+session)
				session
			})

}
after{
	println("Simulation about login is finished")
}
val admins=scenario("Admins").exec(Index.index,Login.login)
	setUp(admins.inject(
	rampUsers(10) over (10 seconds))
	.throttle(reachRps(10) in (10 seconds), holdFor(15 seconds),jumpToRps(50),holdFor(10 seconds)))
	.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5),
	details("Login").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
	
}
