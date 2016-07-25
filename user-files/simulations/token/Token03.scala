package token

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Token03 extends Simulation {

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

	val scn = scenario("Token03")
		.exec(http("request_0")
			.get("/_matrix/client/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/_matrix/client/app/login/login.html")
			.headers(headers_1)
			.check(bodyBytes.is(RawFileBody("Token03_0001_response.txt"))),
            http("request_2")
			.get("/_matrix/client/img/logo.png")
			.headers(headers_2)
			.check(bodyBytes.is(RawFileBody("Token03_0002_response.txt"))))
			.check(bodyBytes.is(RawFileBody("Token03_0000_response.txt"))))
		.pause(6)
		.exec(http("request_3")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_3)
			.body(RawFileBody("Token03_0003_request.txt"))
			.resources(http("request_4")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDM6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTI5ODE0MTYzCjAwMmZzaWduYXR1cmUgqPsvxSrw-jCqaiXImqTX8g2asmXOe5DVyvVJdMAf2soK&limit=8")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("Token03_0004_response.txt"))),
            http("request_5")
			.put("/_matrix/client/api/v1/presence/%40test03%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDM6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTI5ODE0MTYzCjAwMmZzaWduYXR1cmUgqPsvxSrw-jCqaiXImqTX8g2asmXOe5DVyvVJdMAf2soK")
			.headers(headers_5)
			.body(RawFileBody("Token03_0005_request.txt"))
			.check(bodyBytes.is(RawFileBody("Token03_0005_response.txt"))),
            http("request_6")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDM6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTI5ODE0MTYzCjAwMmZzaWduYXR1cmUgqPsvxSrw-jCqaiXImqTX8g2asmXOe5DVyvVJdMAf2soK")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("Token03_0006_response.txt"))),
            http("request_7")
			.get("/_matrix/client/app/home/home.html")
			.headers(headers_7)
			.check(bodyBytes.is(RawFileBody("Token03_0007_response.txt"))),
            http("request_8")
			.get("/_matrix/client/img/logo-small.png")
			.check(bodyBytes.is(RawFileBody("Token03_0008_response.txt"))),
            http("request_9")
			.get("/_matrix/client/api/v1/profile/%40test03%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDM6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTI5ODE0MTYzCjAwMmZzaWduYXR1cmUgqPsvxSrw-jCqaiXImqTX8g2asmXOe5DVyvVJdMAf2soK")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("Token03_0009_response.txt"))),
            http("request_10")
			.get("/_matrix/client/api/v1/profile/%40test03%3Amatrix.allmende.io/avatar_url?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDM6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTI5ODE0MTYzCjAwMmZzaWduYXR1cmUgqPsvxSrw-jCqaiXImqTX8g2asmXOe5DVyvVJdMAf2soK")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("Token03_0010_response.txt"))),
            http("request_11")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("Token03_0011_response.txt"))),
            http("request_12")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_7)
			.check(bodyBytes.is(RawFileBody("Token03_0012_response.txt"))),
            http("request_13")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDM6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTI5ODE0MTYzCjAwMmZzaWduYXR1cmUgqPsvxSrw-jCqaiXImqTX8g2asmXOe5DVyvVJdMAf2soK&from=s3069_1640_910_22_1_2&timeout=30000")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("Token03_0013_response.txt"))),
            http("request_14")
			.get("/_matrix/client/img/close.png")
			.check(bodyBytes.is(RawFileBody("Token03_0014_response.txt"))))
			.check(bodyBytes.is(RawFileBody("Token03_0003_response.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}