package tai.matrix

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Init_Matrix2._
import Login_Matrix2._
import CreateRoom_Matrix2._

import Trait_Matrix._
import AdminsLoginMatrix._
class RecordedSimulatepublicroomFalse extends Simulation {
val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")


before{
	println("Simulation Public Room is about to Start")
}
	

	


		
			

after{
	println("Simualtion about Public Room is finished")
}


	setUp(AdminsPublicRoom.admin.inject(
     rampUsers(2) over (5 seconds)))
    //.throttle(reachRps(40) in (30 seconds)))
     .assertions(
     global.responseTime.max.lessThan(50),
     forAll.failedRequests.count.lessThan(5),
details("Login Request").successfulRequests.percent.greaterThan(90),
global.responseTime.mean.greaterThan(100),
details("Create Room").requestsPerSec.between(100,1000),
details("Create Room").failedRequests.percent.is(0),
details("Create Room").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
}
