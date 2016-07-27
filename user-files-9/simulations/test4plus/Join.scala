package test4plus
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object Join2 extends Trait{
	val feeder=csv("login.csv").random
	 val join2=exec(feed(feeder))
		.exec(http("edit image")
			.get("http://" + uri1 + ":8081/img/edit.png")
			.headers(headers_37)
			.resources(http("search image")
			.get("http://" + uri1 + ":8081/img/search.svg")
			.headers(headers_29)
			.check(status.is(304)),
            http("setting image")
			.get("http://" + uri1 + ":8081/img/settings.svg")
			.headers(headers_27)
			.check(status.is(304)),
            http("upload image")
			.get("http://" + uri1 + ":8081/img/upload.svg")
			.headers(headers_40)
			.check(status.is(304)),
            http("leave image")
			.get("http://" + uri1 + ":8081/img/leave.svg")
			.headers(headers_41)
			.check(status.is(304)),
            http("call image")
			.get("http://" + uri1 + ":8081/img/call.svg")
			.headers(headers_42)
			.check(status.is(304)),
            http("voice image")
			.get("http://" + uri1 + ":8081/img/voice.svg")
			.headers(headers_43)
			.check(status.is(304)),
            http("Rooms infos")
			.get("/_matrix/client/r0/rooms/${table}%3Amatrix.allmende.io/messages?from=s9146_3412_0_77_1_2&limit=20&dir=b&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("admin image")
			.get("http://" + uri1 + ":8081/img/admin.svg")
			.headers(headers_45)
			.check(status.is(304)),
            http("access token")
			.get("/_matrix/client/r0/rooms/${table}%3Amatrix.allmende.io/messages?from=t1-3107_3412_0_77_1_2&limit=20&dir=b&access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)))
			.check(status.is(304)))
		.pause(3)
}
