package tai.matrix

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Init_Matrix2._
import Login_Matrix2._
import CreatePrivateRoom_Matrix2._
import Trait_Matrix._
import AdminsPrivateRoom._

class RecordedSimulatepublicroomtrue extends Simulation {
		val httpProtocol = http
		//.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.acceptHeader("application/json, text/plain, */*")
		.acceptEncodingHeader("gzip, deflate, sdch")
		.acceptLanguageHeader("fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")


before{
	println("Simulation of private room is about to start")
}





			

after{
	println("Simulation about private room is finished")
}

	setUp(AdminsPrivateRoom.admin.inject(
	//nothingFor(4 seconds),
	rampUsers(2) over(30 seconds)))
	//.throttle(reachRps(20) in (30  seconds)))
	.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5),
	details("Login").successfulRequests.percent.greaterThan(90))
	
	
	.protocols(httpProtocol)
	
}

