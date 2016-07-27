package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class logout extends Simulation {

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
            http("Logo image")
			.get("/_matrix/client/img/logo.png")
			.headers(headers_2)
			.check(status.is(304)))
			.check(status.is(304)))
		.pause(6)
	}
	object Login{
		val feeder=csv("login.csv").random
		
		val login=exec(feed(feeder))
		.exec(http("Login Request")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_3)
.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.resources(http("Inial Acces")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDM2NzAxNDYxCjAwMmZzaWduYXR1cmUgBYYEZFUVj9nt5bQmM-E5EihWoxzPJ16NOKB_crFc8sEK&limit=8")
			.headers(headers_4)
			.check(status.is(200)),
            http("Presence User")
			.put("/_matrix/client/api/v1/presence/%40test01%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDM2NzAxNDYxCjAwMmZzaWduYXR1cmUgBYYEZFUVj9nt5bQmM-E5EihWoxzPJ16NOKB_crFc8sEK")
			.headers(headers_5)
			.body(RawFileBody("logout_0005_request.txt"))
			.check(status.is(200)),
            http("Turn Server")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDM2NzAxNDYxCjAwMmZzaWduYXR1cmUgBYYEZFUVj9nt5bQmM-E5EihWoxzPJ16NOKB_crFc8sEK")
			.headers(headers_4)
			.check(status.is(200)),
            http("Home page")
			.get("/_matrix/client/app/home/home.html")
			.headers(headers_7)
			.check(status.is(200)),
            http("Logo small")
			.get("/_matrix/client/img/logo-small.png")
			.check(status.is(200)),
            http("Profile Username")
			.get("/_matrix/client/api/v1/profile/%40test01%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDM2NzAxNDYxCjAwMmZzaWduYXR1cmUgBYYEZFUVj9nt5bQmM-E5EihWoxzPJ16NOKB_crFc8sEK")
			.headers(headers_4)
			.check(status.is(200)),
            http("Profile UserAvatar")
			.get("/_matrix/client/api/v1/profile/%40test01%3Amatrix.allmende.io/avatar_url?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDM2NzAxNDYxCjAwMmZzaWduYXR1cmUgBYYEZFUVj9nt5bQmM-E5EihWoxzPJ16NOKB_crFc8sEK")
			.headers(headers_4)
			.check(status.is(200)),
            http("Public Rooms")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_4)
			.check(status.is(200)),
            http("Recents Events")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_7)
			.check(status.is(200)),
            http("Image close")
			.get("/_matrix/client/img/close.png")
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(3)
	}
	object Logout{
		val logout=exec(http("Check Logout")
			.put("/_matrix/client/undefined/_matrix/client/api/v1/presence/undefined/status")
			.headers(headers_5)
			.body(RawFileBody("logout_0014_request.txt"))
			
			.check(status.is(404)))
		}
val admins=scenario("Admins").exec(Init.init,Login.login,Logout.logout)
	setUp(admins.inject(atOnceUsers(1)))
	.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5),
	details("Login Request").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
}
