package computepackage

import scala.concurrent.duration._
import java.util.concurrent.ThreadLocalRandom
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class computesale13 extends Simulation {

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

	

val chain1 = exec( http("test").get("/"))
	.exec( session =>{
	println("test54")
	session
	})

val chain2 = exec(http("test3").get("/"))
		 .exec(session =>{
	println("test5")
	session
	})
val percentage1=25.0
val percentage2=75.0
val test=exec(http("test65").get("/"))
.randomSwitch(
percentage1 -> chain1,
percentage2 -> chain2
 )
			
val admins = scenario("Admins").exec(test)
	setUp(
	admins.inject(rampUsers(2) over (10 seconds))
	).protocols(httpProtocol)
}
