package test6

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Latency._
import Init_Latency2._
import Login_Latency2._
import Enter_Room_Latency2._
import List_Message_Latency2._
import Typing_Latency2._
import SendMessage_Latency2._

class RecordedSimulateSENDER4False extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")


    val uri1 = "http://0.0.0.0:3030/_matrix"
before{
	println("this will send a message")
}


		after{
			println("A message is send")
		}
	
	setUp(AdminsSendMessage.admin.inject(
	
	rampUsers(10) over (10 seconds)))
	.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5),
	details("Send Message").successfulRequests.percent.greaterThan(90))
	.protocols(httpProtocol)
}

