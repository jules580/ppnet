
package test4
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Init2._
import Login2._
import CreatePublicRoom2._
import Trait._
import Join2._
import Visible2._
import Param3._
import Communicate2._
import Typing2._
import SendMessage2._
object AdminsSendMessageVector{
	val admin=scenario("Admins").exec(init2,login2,join2,visible2,param2,communicate2,typing2,sendmessage2)
}
