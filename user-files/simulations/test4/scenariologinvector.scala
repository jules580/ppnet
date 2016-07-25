package test4
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Init2._
import Login2._
import Trait._


object AdminsLogin{
	val admin=scenario("Admins").exec(init2,login2)
 }
