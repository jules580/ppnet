package tai.vector

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._
import Init2._
import Login2._
import Join2._
import Leave_Room2._

class LeaveRoomVector extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

	

	object LeaveRoom{
		
}

	setUp(AdminsLeaveRoom.admin.inject(rampUsers(1) over(10 seconds))).protocols(httpProtocol)
}
