package tai.matrix
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Matrix._

object Typing_Matrix2 extends Trait_Matrix{
	val feeder=csv("login.csv").random
	val typing_matrix2=	exec(feed(feeder))
		.exec(http("Typing")
			.put("${url}/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/typing/%40${login}%3Amatrix.allmende.io?access_token=${token}")
			.body(RawFileBody("RecordedSimulatePrivate_0031_request.txt"))
			.resources(http("Typing event")
			.get("${url}/_matrix/client/api/v1/events?access_token=${token}&from=s171_256_21_1_1_1&timeout=30000")
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(1)
	}
