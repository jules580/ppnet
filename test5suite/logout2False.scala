package test5

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Init_Matrix2._
import Login_Matrix2._
import Logout_Matrix2._
import AdminsLogout._
import Trait_Matrix._

class logout2 extends Simulation {

	val httpProtocol = http
		//.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")




	setUp(AdminsLogout.admin.inject(atOnceUsers(1)))
	.assertions(
	global.responseTime.max.lessThan(60),
	forAll.failedRequests.count.lessThan(5),
	details("Send Message").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
}
