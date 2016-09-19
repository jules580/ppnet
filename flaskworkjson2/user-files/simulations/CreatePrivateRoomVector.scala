package tai.vector

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Init._
import Init2._
import Login2._
import Visible2._
import Parameter2._
import Privileged2._
import Invite2._
import SendInvitation2._

import AdminsRooms._



class CreatePrivateRoomVector extends Simulation {

	val httpProtocol = http
		//.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")



    
before{
	println("creation of the private room will begin")
}

	
	after{
		println("Private room is created")
	}

	setUp(AdminsRooms.admin.inject(
    rampUsers(2) over (10 seconds)))
   //.throttle(reachRps(40) in (30 seconds)))
	.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5))
    
	
	.protocols(httpProtocol)
}
