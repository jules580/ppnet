package test4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Init._
import Init2._
import Login2._
import CreatePublicRoom2._
import Trait._
import AdminsPublicRoomVector._

class RecordedSimulateCreatePublicroomVectorFalse extends Simulation {
 
	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

	
before{
	println("simulation of creation of room will begin")
}
    
	
	
	
		after{
			println("Simulation of creation of public room is end")
		}

    
	setUp(AdminsPublicRoomVector.admin.inject(
	rampUsers(10) over (20 seconds)))
	//.throttle(reachRps(30) in (10 seconds), holdFor(20 seconds)))
	
	
	.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5),
	details("Login user").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
}


