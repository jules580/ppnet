package token

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Token10 extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.acceptHeader("application/json, text/plain, */*")
		.acceptEncodingHeader("gzip, deflate, sdch")
		.acceptLanguageHeader("fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

	val headers_0 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

    val uri1 = "http://0.0.0.0:3030/_matrix/client/api/v1"

	val scn = scenario("Token10")
		.exec(http("request_0")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_0)
			.body(RawFileBody("Token10_0000_request.txt"))
			.resources(http("request_1")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTA6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNDMyMjQ5CjAwMmZzaWduYXR1cmUgUsfUN-9Q5OB31_58292jc1DJj2RC24YrcqCqNOFBzxMK&limit=8")
			.check(bodyBytes.is(RawFileBody("Token10_0001_response.txt"))),
            http("request_2")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTA6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNDMyMjQ5CjAwMmZzaWduYXR1cmUgUsfUN-9Q5OB31_58292jc1DJj2RC24YrcqCqNOFBzxMK")
			.check(bodyBytes.is(RawFileBody("Token10_0002_response.txt"))),
            http("request_3")
			.get("/_matrix/client/api/v1/profile/%40test10%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTA6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNDMyMjQ5CjAwMmZzaWduYXR1cmUgUsfUN-9Q5OB31_58292jc1DJj2RC24YrcqCqNOFBzxMK")
			.check(bodyBytes.is(RawFileBody("Token10_0003_response.txt"))),
            http("request_4")
			.get("/_matrix/client/api/v1/profile/%40test10%3Amatrix.allmende.io/avatar_url?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTA6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNDMyMjQ5CjAwMmZzaWduYXR1cmUgUsfUN-9Q5OB31_58292jc1DJj2RC24YrcqCqNOFBzxMK")
			.check(bodyBytes.is(RawFileBody("Token10_0004_response.txt"))),
            http("request_5")
			.get("/_matrix/client/api/v1/publicRooms")
			.check(bodyBytes.is(RawFileBody("Token10_0005_response.txt"))),
            http("request_6")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTA6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNDMyMjQ5CjAwMmZzaWduYXR1cmUgUsfUN-9Q5OB31_58292jc1DJj2RC24YrcqCqNOFBzxMK&from=s3069_1656_910_22_1_2&timeout=30000")
			.check(bodyBytes.is(RawFileBody("Token10_0006_response.txt"))))
			.check(bodyBytes.is(RawFileBody("Token10_0000_response.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}