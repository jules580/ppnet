package tai.vector
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Init2._
import Login2._
import Join2._
import Leave_Room2._
import Trait._

object AdminsLeaveRoom{
	val admin=scenario("Admin").exec(init2,login2,join2,leave_room2)
}
