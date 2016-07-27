package computepackage

import scala.concurrent.duration._
import java.util.concurrent.ThreadLocalRandom
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class computesale7 extends Simulation {

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
	
  val feeder = csv("search.csv").random // 1, 2

  val search = exec(http("Home")
    .get("/"))
    .pause(1)
    .feed(feeder) // 3
    .exec(http("Search")
    .get("/computers?f=${searchCriterion}") // 4
    .check(css("a:contains('${searchComputerName}')", "href").saveAs("computerURL"))) // 5
    .pause(1)
    .exec(http("Select")
    .get("${computerURL}")) // 6
    .pause(1)
		
	}

		object Browse{
			
		val browse = repeat(5,"n"){
			exec(http("Page ${n}")
			.get("/computers?p=${n}"))
			.pause(1)
}

		}
	object Edit{
		val edit = exec(http("Edite")
			.get("/computers/new"))
		.pause(1)
		.exec(http("Post")
			.post("/computers")
			.check(status.is(session => 200 + ThreadLocalRandom.current.nextInt(2)))
			.headers(headers_3)
			.formParam("name", "amstrad cpc")
			.formParam("introduced", "1985-10-08")
			.formParam("discontinued", "1990-10-09")
			.formParam("company", "38"))
	val tryMaxEdit = tryMax(2) { // 1
  exec(edit)
}.exitHereIfFailed //
			
	}	

   val users = scenario("Users").exec(Search.search, Browse.browse)
   val admins = scenario("Admins").exec(Search.search, Browse.browse, Edit.tryMaxEdit)
	setUp(
	users.inject(rampUsers(10) over (10 seconds)),
	admins.inject(rampUsers(2) over (10 seconds))
	).protocols(httpProtocol)
}
