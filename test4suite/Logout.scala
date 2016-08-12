package test4
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._

object Logout2 extends Trait{
		val feeder=csv("login.csv").random
			val logout2=exec(feed(feeder))
			.exec(http("Profile Use")
			.get(url+"/_matrix/client/r0/profile/%40test01%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_14)
			.resources(http("Access account")
			.get(url+"/_matrix/client/r0/account/3pid?access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("Proile user3")
			.get(url+"/_matrix/client/r0/profile/%40${login}%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("Push rule")
			.get(url+"/_matrix/client/r0/pushrules/?access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("Pusher access")
			.get(url+"/_matrix/client/r0/pushers?access_token=${token}")
			.headers(headers_14)
			.check(status.is(400)))
            /*http("Camera Image")
			.get("http://" + uri1 + ":8081/img/camera.svg")
			.headers(headers_41)
			.check(status.is(304)))*/
			.check(status.is(200)))
		.pause(6)
		.exec(session =>{
			println("session"+session)
			session
			}
		)
}
