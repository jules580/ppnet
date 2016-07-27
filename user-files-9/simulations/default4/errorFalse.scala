package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class errorFalse extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.acceptHeader("application/json, text/plain, */*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4")
		.contentTypeHeader("application/json;charset=UTF-8")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

	val headers_0 = Map("Origin" -> "http://0.0.0.0:3030")

    val uri1 = "http://0.0.0.0:3030/_matrix/client/api/v1/createRoom"

	val scn = scenario("errorFalse")
		.exec(http("request_0")
			.post("/_matrix/client/api/v1/createRoom?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmVjaWQgdXNlcl9pZCA9IEB0ZXN0cmVzOm1hdHJpeC5hbGxtZW5kZS5pbwowMDE2Y2lkIHR5cGUgPSBhY2Nlc3MKMDAxZGNpZCB0aW1lIDwgMTQ2OTUzNDIyMzg4NwowMDJmc2lnbmF0dXJlIH9YVvdhz-JMMuFWEYuGjEEJXCyq8yzhj4ZW759_mtV9Cg")
			.headers(headers_0)
			.body(RawFileBody("errorFalse_0000_request.txt"))
			.check(status.is(400))
			.check(bodyBytes.is(RawFileBody("errorFalse_0000_response.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}