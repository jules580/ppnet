package tai.matrix
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Matrix._


object Init_Matrix2 extends Trait_Matrix{
	val feeder=csv("login.csv").random
	val url2=System.getenv("Jsonpoint")
	val init_matrix2=exec(feed(feeder))
		.exec(http("Get")
		.get(url2)
		.check(jsonPath("$.url").saveAs("url"))
	)
		.exec(http("Init")
			.get("${url}/_matrix/client/")
			
			.resources(http("Acces api")
			.get("${url}/_matrix/client/api/v1/pushrules/?access_token=${token}")
	
			.check(status.is(200)),
            http("Access sync")
			.get("${url}/_matrix/client/api/v1/initialSync?access_token=${token}&limit=8")
		
			.check(status.is(200)),
            http("presence")
			.put("${url}/_matrix/client/api/v1/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
		
			.body(RawFileBody("RecordedSimulatelogin_0003_request.txt"))
			.check(status.is(200)),
            http("turnServer")
			.get("${url}/_matrix/client/api/v1/voip/turnServer?access_token=${token}")
	
			.check(status.is(200))
			.check(jsonPath("$.ttl").saveAs("ttl")),
            http("Login page")
			.get("${url}/_matrix/client/app/login/login.html")
	
			.check(status.is(200)),
            http("list event")
			.get("${url}/_matrix/client/api/v1/events?access_token=${token}&from=s20_10_4_1_1_1&timeout=30000")
	
			.check(status.is(200)),
            http("logo picture")
			.get("${url}/_matrix/client/img/logo.png")
			
			.check(status.is(200)),
            http("event")
			.get("${url}/_matrix/client/api/v1/events?access_token=${token}&from=s20_11_5_1_1_1&timeout=30000")
			.headers(headers_1)
			.check(status.is(200)))
			.check(status.is(200)))
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
