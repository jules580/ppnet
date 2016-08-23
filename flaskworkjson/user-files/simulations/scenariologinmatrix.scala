  package tai.matrix
  import scala.concurrent.duration._
  import io.gatling.core.Predef._
  import io.gatling.http.Predef._
  import io.gatling.jdbc.Predef._
  import Init_Matrix2._
  import Login_Matrix2._
  import Trait_Matrix._
  object AdminsLoginMatrix{
	  val admin=scenario("Admin").exec(init_matrix2,login_matrix2)
  }
