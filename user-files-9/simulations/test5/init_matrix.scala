package test5
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Matrix._


object Init_Matrix2 extends Trait_Matrix{
	val feeder=csv("login.csv").random
	val init_matrix2=exec(feed(feeder))
		.exec(http("Init")
			.get("/_matrix/client/")
			.headers(headers_0)
			.resources(http("Acces api")
			.get("/_matrix/client/api/v1/pushrules/?access_token=${token}")
			.headers(headers_1)
			.check(status.is(200)),
            http("Access sync")
			.get("/_matrix/client/api/v1/initialSync?access_token=${token}&limit=8")
			.headers(headers_1)
			.check(status.is(200)),
            http("presence")
			.put("/_matrix/client/api/v1/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulatelogin_0003_request.txt"))
			.check(status.is(200)),
            http("turnServer")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=${token}")
			.headers(headers_1)
			.check(status.is(200))
			.check(jsonPath("$.ttl").saveAs("ttl")),
            http("Login page")
			.get("/_matrix/client/app/login/login.html")
			.headers(headers_5)
			.check(status.is(304)),
            http("list event")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s20_10_4_1_1_1&timeout=30000")
			.headers(headers_1)
			.check(status.is(200)),
            http("logo picture")
			.get("/_matrix/client/img/logo.png")
			.headers(headers_7)
			.check(status.is(304)),
            http("event")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s20_11_5_1_1_1&timeout=30000")
			.headers(headers_1)
			.check(status.is(200)))
			.check(status.is(304)))
			.pause(7)
			.doIfOrElse(_.contains("ttl")){
				exec(session=>{
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
			.exec(session =>{
			//	println("session"+session)
				session
			})
}
