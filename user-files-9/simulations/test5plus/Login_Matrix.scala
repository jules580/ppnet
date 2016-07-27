package test5plus
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

import Trait_Matrix._

object Login_Matrix2 extends Trait_Matrix{
		val feeder=csv("login.csv").random
			val login_matrix2=exec(feed(feeder))
			.exec(http("Login Request")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_3)
	.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
				.resources(http("initial Sync")
			.get("/_matrix/client/api/v1/initialSync?access_token=${token}&limit=8")
			.headers(headers_4)
			.check(status.is(200)),
            http("Presence User")
			.put("/_matrix/client/api/v1/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
			.headers(headers_5)
			.body(RawFileBody("logout2_0005_request.txt"))
			.check(status.is(200)),
            http("Turn server")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("Home page")
			.get("/_matrix/client/app/home/home.html")
			.headers(headers_7)
			.check(status.is(200)),
            http("logo small")
			.get("/_matrix/client/img/logo-small.png")
			.check(status.is(200)),
            http("Profile Username")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/displayname?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("Profile Avatar")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/avatar_url?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("list public room")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_4)
			.check(status.is(200)),
            http("recents events")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_7)
			.check(status.is(200)),
            http("close")
			.get("/_matrix/client/img/close.png")
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(15)
		.exec(session => {
			println("session"+session)
			session
		})
	}
