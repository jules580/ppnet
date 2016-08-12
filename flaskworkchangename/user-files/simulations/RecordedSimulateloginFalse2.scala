package tai.matrix

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Init_Matrix2._
import Login_Matrix2._
import Trait_Matrix._
import AdminsLoginMatrix._
class RecordedSimulateloginFalse2 extends Simulation {
		val httpProtocol = http
		//.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.acceptHeader("application/json, text/plain, */*")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

before{
	println("Simulation about login will begin")
}
	

	

after{
	println("Simulation about login is finished")
}

	setUp(AdminsLoginMatrix.admin.inject(
	rampUsers(2) over (5 seconds)))
   // .throttle(reachRps(40) in (15 seconds), holdFor(15 seconds))
	.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5),
	details("Login").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
	
}
