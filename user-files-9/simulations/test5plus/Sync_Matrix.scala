package test5plus
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Matrix._
object Sync_Matrix2 extends Trait_Matrix{
		val feeder=csv("login.csv").random
		val sync_matrix2=exec(feed(feeder))
		.exec(http("List Event")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s9083_3232_1186_77_1_2&timeout=30000")
			.headers(headers_9)
			.check(status.is(200)))
		.pause(1)
}
