 package tai.vector
 import scala.concurrent.duration._
 
 import io.gatling.core.Predef._
 import io.gatling.http.Predef._
 import io.gatling.jdbc.Predef._
 
 import Trait._
object SendInvitation2 extends Trait{
	val feeder=csv("login2.csv").random

		val sendinvitation2=exec(feed(feeder))
		.exec(
		http("Rooms Infos")
			.options(url+"/_matrix/client/r0/rooms/${tables}%3Amatrix.allmende.io/invite?access_token=${token}")
			.headers(headers_11)
			.resources(http("Send Invitation")
			.post(url+"/_matrix/client/r0/rooms/${tables}%3Amatrix.allmende.io/invite?access_token=${token}")
			.headers(headers_12)
			.body(StringBody("""{"user_id":"${invite}"}"""))
			.check(status.is(200)),
           /* http("f4c371 image")
			.get("http://" + uri1 + ":8081/img/f4c371.png")
			.headers(headers_63)
			.check(status.is(304))*/
				http("Send Invitation2")
			.post(url+"/_matrix/client/r0/rooms/${tables}%3Amatrix.allmende.io/invite?access_token=${token}")
			.headers(headers_12)
			.body(StringBody("""{"user_id":"${login}:matrix.allmende.io"}"""))
			.check(jsonPath("$.error").saveAs("error")))
			
			.check(status.is(200)))
			
			.exec(session =>{
				println("Session 36":+session)
				session
			})
			.doIfOrElse(_.contains("errror")){
				exec(session =>{
					println("Fail")
					session
				})
			}{
				exec(session =>{
					println("Success")
					session
				})
			}
		}
		
