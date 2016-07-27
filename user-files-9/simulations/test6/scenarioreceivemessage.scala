 package test6
 
 import scala.concurrent.duration._
 
 import io.gatling.core.Predef._
 import io.gatling.http.Predef._
 import io.gatling.jdbc.Predef._
 import Trait_Latency._
 import Init_Latency2._
 import Login_Latency2._
 import Enter_Room_Latency2._
 import Typing_Latency2._
 import Message_Latency2._
 import Message_Receive_Latency2._
 
 object AdminsReceiveMessage{
	 val admin=scenario("Admins").exec(init_latency2,login_latency2,enter_room_latency2,typing_latency2,message_latency2,message_receive_latency2)
}
