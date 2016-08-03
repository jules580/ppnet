package test4
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Init2._
import Login2._
import Visible2._
import Parameter2._
import Privileged2._
import Invite2._
import CreatePrivateRoom2._
import SendInvitation2._
object AdminsRooms{
	val admin=scenario("Admins").exec(init2,login2,createprivateroom2,visible2,parameter2,privileged2,invite2,sendinvitation2)
}
