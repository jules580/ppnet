package tai.matrix

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Matrix._
import Init_Matrix2._
import Login_Matrix2._
import Sync_Matrix2._
import Enter_Room_Matrix2._
import Leave_Room_Matrix2._
import AdminsLeaveRoom._
class leaveroomFalse extends Simulation {

	val httpProtocol = http
		//.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

	

	


	setUp(AdminsLeaveRoom.admin.inject(rampUsers(1) over (10 seconds))).protocols(httpProtocol)
}
