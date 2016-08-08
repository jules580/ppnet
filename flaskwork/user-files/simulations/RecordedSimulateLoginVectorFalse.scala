
package test4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Init2._
import Login2._
import AdminsLogin._

class RecordedSimulateLoginVectorFalse extends Simulation {
 
	val httpProtocol =
           http
	   // .baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.acceptEncodingHeader("gzip, deflate, sdch")
		.acceptLanguageHeader("fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")


   
    val uri2 = "https://matrix.org/_matrix/client/r0/login"
before{
	println("Login will begin")
}

after{
	println("Login is finish")
}

	setUp(AdminsLogin.admin.inject(
	rampUsers(2) over (10 seconds)
	))
	
	.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5),
	details("Send Message").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
}
