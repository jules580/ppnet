package test4plus

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._
import Init2._
import Login2._
import Logout2._
import LoginPage2._

object AdminsLogout{
	val admin= scenario("Admin").exec(init2,login2,logout2,loginpage2)
}
