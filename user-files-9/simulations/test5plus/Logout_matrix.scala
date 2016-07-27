package test5plus
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object Logout_Matrix2 extends Trait_Matrix{
		val logout_matrix2=exec(http("Logout page")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s9084_3240_1186_77_1_2&timeout=30000")
			.headers(headers_4)
		.resources(http("check Logout")
			.put("/_matrix/client/undefined/_matrix/client/api/v1/presence/undefined/status")
			.headers(headers_5)
			.body(RawFileBody("logout2_0015_request.txt"))
			.check(status.is(404)))
			.check(status.is(200)))
			}

