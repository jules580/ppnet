package computepackage

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class computesale extends Simulation {

	val httpProtocol = http
		.baseURL("http://computer-database.gatling.io")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.ico"""), WhiteList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate, sdch")
		.acceptLanguageHeader("fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")

	val headers_0 = Map(
		"Header-RootMe-Admin" -> "true",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_3 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Header-RootMe-Admin" -> "true",
		"Origin" -> "http://computer-database.gatling.io",
		"Upgrade-Insecure-Requests" -> "1")



	val scn = scenario("computesale")
		.exec(http("request_0")
			.get("/computers")
			.headers(headers_0))
		.pause(5)
		.exec(http("request_1")
			.get("/computers?f=macbook")
			.headers(headers_0))
		.pause(2)
		.exec(http("request_2")
			.get("/computers/6")
			.headers(headers_0))
		.pause(2)
		.exec(http("request_3")
			.post("/computers/6")
			.headers(headers_3)
			.formParam("name", "MacBook Pro")
			.formParam("introduced", "2006-01-10")
			.formParam("discontinued", "")
			.formParam("company", "1"))
		.pause(3)
		.exec(http("request_4")
			.get("/computers?p=1")
			.headers(headers_0)
			.resources(http("request_5")
			.get("/computers?p=2")
			.headers(headers_0),
            http("request_6")
			.get("/computers?p=3")
			.headers(headers_0),
            http("request_7")
			.get("/computers?p=4")
			.headers(headers_0)))
		.pause(2)
		.exec(http("request_8")
			.get("/computers/new")
			.headers(headers_0))
		.pause(31)
		.exec(http("request_9")
			.post("/computers")
			.headers(headers_3)
			.formParam("name", "amstrad cpc")
			.formParam("introduced", "1985-10-08")
			.formParam("discontinued", "1990-10-09")
			.formParam("company", "38"))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}