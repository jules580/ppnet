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


object AdminsLeaveRoom{
	val admin=scenario("admins").exec(init_matrix2,login_matrix2,sync_matrix2,enter_room_matrix2,leave_room_matrix2)
}
