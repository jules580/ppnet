package test5plus
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Matrix._
import Init_Matrix2._
import Login_Matrix2._
import Logout_Matrix2._

object AdminsLogout{
	val admin=scenario("Admins").exec(init_matrix2,login_matrix2,logout_matrix2)
}
