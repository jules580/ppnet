package test5plus
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait_Matrix._
object Leave_Room_Matrix2 extends Trait_Matrix{
	val feeder=csv("login.csv").random
		val leave_room_matrix2=exec(feed(feeder))
		.exec(http("Rooms infos")
			.post("/_matrix/client/api/v1/rooms/${table}%3Amatrix.allmende.io/leave?access_token=${token}")
			.headers(headers_8)
			.body(RawFileBody("leaveroom_0031_request.txt"))
			.resources(http("profiles displayname")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/displayname?access_token=${token}")
			.headers(headers_9)
			.check(status.is(200)),
            http("profiles avatar_url")
			.get("/_matrix/client/api/v1/profile/%40${login}%3Amatrix.allmende.io/avatar_url?access_token=${token}")
			.headers(headers_9)
			.check(status.is(200)),
            http("public Rooms")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_9)
			.check(status.is(200)))
			.check(status.is(200)))
			.exec(session =>{
				println("session"+session)
				session 
			})
		}
	

	
