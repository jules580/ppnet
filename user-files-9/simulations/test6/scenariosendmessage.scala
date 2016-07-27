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



object AdminsSendMessage{
	val admin=scenario("Admins").exec(init_latency2,login_latency2,enter_room_latency2,list_message_latency2,typing_latency2,sendmessage_latency2)
}
