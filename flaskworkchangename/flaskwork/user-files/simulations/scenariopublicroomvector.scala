
package tai.vector

import scala.concurrent.duration

import io.gatling.core.Predef._
//import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._
import Init2._
import Login2._
import CreatePublicRoom2._
object AdminsPublicRoomVector{
		val admin=scenario("Admins").exec(init2,login2,createpublicroom2)
}
