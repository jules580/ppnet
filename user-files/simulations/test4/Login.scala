
package test4

import scala.concurrent.duration

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._
        object Login2 extends Trait{
	val feeder=csv("login.csv").random
		val login2=exec(feed(feeder))
			.exec(http("Login user")
			.options("/_matrix/client/r0/login?")
			.headers(headers_4)
			.resources(http("Login request")
			.post("/_matrix/client/r0/login?")
			.headers(headers_5)
						.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.check(status.is(200)),
            http("Presence Users")
			.options("/_matrix/client/r0/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
			.headers(headers_6)
			.check(status.is(200)),
            http("Turn Server")
			.get("/_matrix/client/r0/voip/turnServer?access_token=${token}")
			.headers(headers_0)
			.check(status.is(200)),
            http("Push rules")
			.get("/_matrix/client/r0/pushrules/?access_token=${token}")
			.headers(headers_0)
			.check(status.is(200)),
            http("Presence user")
			.put("/_matrix/client/r0/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
			.headers(headers_9)
			.body(RawFileBody("RecordedSimulateLoginVector_0009_request.txt"))
			.check(status.is(200)),
            http("User filter")
			.options("/_matrix/client/r0/user/%40${login}%3Amatrix.allmende.io/filter?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("User Filter 2")
			.post("/_matrix/client/r0/user/%40${login}%3Amatrix.allmende.io/filter?access_token=${token}")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulateLoginVector_0011_request.txt"))
			.check(status.is(200)),
            http("User filter 3")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&_cacheBuster=1468423904986&access_token=${token}")
			.headers(headers_0)
			.check(status.is(200)),
            http("Icon image")
			.get("http://" + uri1 + ":8081/img/icons-create-room.svg")
			.headers(headers_13)
			.check(status.is(304)),
            http("Setting image")
			.get("http://" + uri1 + ":8081/img/settings.svg")
			.headers(headers_14)
			.check(status.is(200)),
            http("Directory image")
			.get("http://" + uri1 + ":8081/img/icons-directory.svg")
			.headers(headers_15)
			.check(status.is(304)),
            http("minimise image")
			.get("http://" + uri1 + ":8081/img/minimise.svg")
			.headers(headers_16)
			.check(status.is(304)),
            http("search image")
			.get("http://" + uri1 + ":8081/img/search.svg")
			.headers(headers_14)
			.check(status.is(200)),
            http("setting image")
			.get("http://" + uri1 + ":8081/img/icons-settings.svg")
			.headers(headers_18)
			.check(status.is(304)),
            http("members image")
			.get("http://" + uri1 + ":8081/img/members.svg")
			.headers(headers_14)
			.check(status.is(200)),
            http("search image")
			.get("http://" + uri1 + ":8081/img/right_search.svg")
			.headers(headers_20)
			.check(status.is(304)),
            http("cancel image")
			.get("http://" + uri1 + ":8081/img/cancel.svg")
			.headers(headers_21)
			.check(status.is(200)),
            http("plus image")
			.get("http://" + uri1 + ":8081/img/plus.svg")
			.headers(headers_21)
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session =>{
				println("session"+session)
				session
			})
		.pause(4)
		.exec(http("Member cheveron")
			.get("http://" + uri1 + ":8081/img/member_chevron.png")
			.headers(headers_21)
			.check(status.is(200)))
	}
