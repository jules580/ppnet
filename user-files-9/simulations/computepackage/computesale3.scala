package computepackage

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class computesale3 extends Simulation {

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

	object Search{
		val search = exec(http("Search")
			.get("/computers")
			.headers(headers_0))
		.pause(5)
		.exec(http("Select")
			.get("/computers?f=macbook")
			.headers(headers_0))
		.pause(2)

		val complete = exec(http("Complete")
			.get("/computers/6")
			.headers(headers_0))
		.pause(2)
		.exec(http("Form")
			.post("/computers/6")
			.headers(headers_3)
			.formParam("name", "MacBook Pro")
			.formParam("introduced", "2006-01-10")
			.formParam("discontinued", "")
			.formParam("company", "1"))
		.pause(3)
	}

		object Browse{
		val browse = exec(http("Browse 1")
			.get("/computers?p=1")
			.headers(headers_0)
			.resources(http("Browse 2")
			.get("/computers?p=2")
			.headers(headers_0),
            http("Browse 3")
			.get("/computers?p=3")
			.headers(headers_0),
            http("Browse 4")
			.get("/computers?p=4")
			.headers(headers_0)))
		.pause(2)


		}
	object Edit{
		val edit = exec(http("Edite")
			.get("/computers/new")
			.headers(headers_0))
		.pause(31)
		.exec(http("Create")
			.post("/computers")
			.headers(headers_3)
			.formParam("name", "amstrad cpc")
			.formParam("introduced", "1985-10-08")
			.formParam("discontinued", "1990-10-09")
			.formParam("company", "38"))
	}	

   val users = scenario("Users").exec(Search.search,Search.complete, Browse.browse)
   val admins = scenario("Admins").exec(Search.search, Search.complete, Browse.browse, Edit.edit)
	setUp(
	users.inject(rampUsers(10) over (10 seconds)),
	admins.inject(rampUsers(2) over (10 seconds))
	).protocols(httpProtocol)
}
