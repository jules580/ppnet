package test4plus

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._
import Init2._
import Login2._
import Logout2._
import LoginPage2._
import AdminsLogout._
class logoutVector extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")




		
	
	

	setUp(AdminsLogout.admin.inject(atOnceUsers(1))).protocols(httpProtocol)
}
