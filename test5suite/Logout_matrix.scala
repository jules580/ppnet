package test5
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object Logout_Matrix2 extends Trait_Matrix{
		val logout_matrix2=exec(http("Logout page")
			.get("${url}/_matrix/client/api/v1/events?access_token=${token}&from=s9084_3240_1186_77_1_2&timeout=30000")
		.resources(http("check Logout")
			.put("${url}/_matrix/client/undefined/_matrix/client/api/v1/presence/undefined/status")
			.body(RawFileBody("logout2_0015_request.txt"))
			.check(status.is(404)))
			.check(status.is(200)))
			}

