
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
			.options(url+"/_matrix/client/r0/login?")
			.headers(headers_4)
			.resources(http("Login request")
			.post(url+"/_matrix/client/r0/login?")
			.headers(headers_5)
						.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.check(status.is(200))
			.check(jsonPath("$.access_token").saveAs("Acess_Token"))
			.check(jsonPath("$.home_server").saveAs("Home_Server"))
			.check(jsonPath("$.user_id").saveAs("User_id")),
            http("Presence Users")
			.options(url+"/_matrix/client/r0/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
			.headers(headers_6)
			.check(status.is(200)),
            http("Turn Server")
			.get(url+"/_matrix/client/r0/voip/turnServer?access_token=${token}")
			.headers(headers_0)
			.check(status.is(200)),
            http("Push rules")
			.get(url+"/_matrix/client/r0/pushrules/?access_token=${token}")
			.headers(headers_0)
			.check(status.is(200)),
            http("Presence user")
			.put(url+"/_matrix/client/r0/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
			.headers(headers_9)
			.body(RawFileBody("RecordedSimulateLoginVector_0009_request.txt"))
			.check(status.is(200)),
            http("User filter")
			.options(url+"/_matrix/client/r0/user/%40${login}%3Amatrix.allmende.io/filter?access_token=${token}")
			.headers(headers_4)
			.check(status.is(200)),
            http("User Filter 2")
			.post(url+"/_matrix/client/r0/user/%40${login}%3Amatrix.allmende.io/filter?access_token=${token}")
			.headers(headers_5)
			.body(RawFileBody("RecordedSimulateLoginVector_0011_request.txt"))
			.check(status.is(200)),
            http("User filter 3")
			.get(url+"/_matrix/client/r0/sync?filter=0&timeout=30000&_cacheBuster=1468423904986&access_token=${token}")
			.headers(headers_0)
			.check(status.is(200)))
            /*http("Icon image")
			.get( url2 + "/img/icons-create-room.svg")
			.headers(headers_13)
			.check(status.is(200)),
            http("Setting image")
			.get( url2 + "/img/settings.svg")
			.headers(headers_14)
			.check(status.is(200)),
            http("Directory image")
			.get(url2 + "/img/icons-directory.svg")
			.headers(headers_15)
			.check(status.is(304)),
            http("minimise image")
			.get(url2 + "/img/minimise.svg")
			.headers(headers_16)
			.check(status.is(200)),
            http("search image")
			.get(ur12 + "/img/search.svg")
			.headers(headers_14)
			.check(status.is(200)),
            http("setting image")
			.get(ur12 + "/img/icons-settings.svg")
			.headers(headers_18)
			.check(status.is(304)),
            http("members image")
			.get( url2 + "/img/members.svg")
			.headers(headers_14)
			.check(status.is(200)),
            http("search image")
			.get(ur12 + "/img/right_search.svg")
			.headers(headers_20)
			.check(status.is(304)),
            http("cancel image")
			.get(ur12 + "/img/cancel.svg")
			.headers(headers_21)
			.check(status.is(304)),
            http("plus image")
			.get(ur12 + "/img/plus.svg")
			.headers(headers_21)
			.check(status.is(304)))*/
			
			.check(status.is(200)))
			.exec(session =>{
			println("session"+session)
				session
			})
		.pause(4)
		/*.exec(http("Member cheveron")
			.get(url"+/img/member_chevron.png")
			.headers(headers_21)
			.check(status.is(304)))*/
			.doIfOrElse(_.contains("Acess_Token")){
				exec(session =>{
					println("Success")
					session
				})
			}
			{
				exec(session=>{
					println("Fail")
					session
				})
			}
			
			
	}
