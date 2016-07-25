package test4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._
object Invite2 extends Trait{
	val invite2=exec(http("Invite Guest")
			.get("/_matrix/client/r0/sync?filter=2&timeout=30000&since=s1539_1238_764_7_1_2&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)))
		.pause(8)
	}
