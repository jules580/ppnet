package test5

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Matrix._

object CreatePrivateRoom_Matrix2 extends Trait_Matrix{
	val feeder=csv("login2.csv").random
	val createprivateroom_matrix2= exec(feed(feeder))
		.exec(http("CreateRoom")
			.post("/_matrix/client/api/v1/createRoom?access_token=${token}")
			.headers(headers_0)
			//.body(RawFileBody("RecordedSimulatepublicroomtrue_0008_request.txt"))
			.body(StringBody("""{"visibility":"true","invite":["${invite}"]}"""))
			.check(responseTimeInMillis.saveAs("ReponseTime"))
			.check(currentLocation.saveAs("CurrentLocation"))
			.check(status.is(200).saveAs("teststatus"))
			.check(regex("""https://(.*)/.*""").count.saveAs("Https"))
			.resources(//http("acces Room")
			//.get("/_matrix/client/api/v1/rooms/!hhYFDErHCDGoMIPUNU%3Amatrix.allmende.io/initialSync?access_token=${token}&limit=30")
			//.check(status.is(200)),
            http("Event from the room")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s166_250_20_1_1_1&timeout=30000")
			.check(status.is(200)),
            http("Event form the room 2")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s167_251_20_1_1_1&timeout=30000")
			.check(status.is(200)),
            http("Event from the room3")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s168_251_20_1_1_1&timeout=30000")
			.check(status.is(200)),
            http("Event form the room4")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s169_251_20_1_1_1&timeout=30000")
			.check(status.is(200)),
          /*  http("access Room2")
			.get("/_matrix/client/api/v1/rooms/!hhYFDErHCDGoMIPUNU%3Amatrix.allmende.io/initialSync?access_token=${token}&limit=30")
			.check(status.is(200)),*/
            http("request_15")
			.get("/_matrix/client/api/v1/events?access_token=${token}&from=s170_251_20_1_1_1&timeout=30000")
			.check(status.is(200)),
            http("Infos identity")
			.get("/_matrix/media/v1/identicon/%40${login}%3Amatrix.allmende.io?width=96&height=96")
			.headers(headers_16)
			.check(status.is(200)),
            http("Logo user")
			.get("/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.headers(headers_16)
			.check(status.is(404)))
           // http("Infos room")
			//.get("/_matrix/client/api/v1/rooms/!hhYFDErHCDGoMIPUNU%3Amatrix.allmende.io/messages?access_token=${token}&dir=b&from=t1-164_251_20_1_1_1&limit=30")
			//.check(status.is(200)))
			.check(status.is(200)))
			.exec(session => {
				
				println("test: "+session)
			
				session
			})
}
