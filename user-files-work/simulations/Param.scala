package tai.vector
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._
object Param2 extends Trait{
	val param2= exec(http("Enter Room")
				 .get(url+"/_matrix/client/r0/rooms/${tables}%3Amatrix.allmende.io/messages?from=s1533_1236_764_7_1_2&limit=20&dir=b&access_token=${token}")
		.headers(headers_14)
		
			.resources(
            http("Event Room")
			.get(url+"/_matrix/client/r0/sync?filter=2&timeout=30000&since=s1538_1236_764_7_1_2&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("Time Room")
			.get(url+"/_matrix/client/r0/rooms/${tables}%3Amatrix.allmende.io/messages?from=t1-1532_1236_764_7_1_2&limit=20&dir=b&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
			http("Camera Image")
			.get(url2+ "/img/camera.svg")
			.headers(headers_50)
			.check(status.is(200)),
			http("Visibility ")
			.get(url+"/_matrix/client/r0/directory/list/room/${tables}%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("tick image")
			.get(url2 + "/img/tick.svg")
			.headers(headers_52)
			.check(status.is(200)))
			.check(status.is(200)))
		
			
		
		.pause(17)
	}
