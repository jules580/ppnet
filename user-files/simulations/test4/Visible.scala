package test4
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._

object Visible2 extends Trait{
val visible2=exec(http("Visibility room")
			.get("/_matrix/client/r0/directory/list/room/${table}%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_14)
			.resources(http("camera image")
			.get("http://" + uri1 + ":8081/img/camera.svg")
			.headers(headers_51)
			.check(status.is(304)),
            http("tick image")
			.get("http://" + uri1 + ":8081/img/tick.svg")
			.headers(headers_52)
			.check(status.is(304)))
			.check(status.is(200)))
		.pause(8)
	}
	
