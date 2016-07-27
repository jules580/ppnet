package test4plus
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._
object Login2 extends Trait{
	val feeder=csv("login.csv").random
			
			val login2=exec(feed(feeder))
			.exec(http("Login truepage")
			.options("/_matrix/client/r0/login?")
			.headers(headers_11)
			.resources(http("Login request")
			.post("/_matrix/client/r0/login?")
			.headers(headers_12)
			.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.check(status.is(200)),
            http("Presence user")
			.options("/_matrix/client/r0/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
			.headers(headers_13)
			.check(status.is(200)),
            http("Turn Server")
			.get("/_matrix/client/r0/voip/turnServer?access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("Push rules")
			.get("/_matrix/client/r0/pushrules/?access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("Presence User")
			.put("/_matrix/client/r0/presence/%40${login}%3Amatrix.allmende.io/status?access_token=${token}")
			.headers(headers_16)
			.body(RawFileBody("logoutVector_0016_request.txt"))
			.check(status.is(200)),
            http("Filter access")
			.options("/_matrix/client/r0/user/%40${login}%3Amatrix.allmende.io/filter?access_token=${token}")
			.headers(headers_11)
			.check(status.is(200)),
            http("filteraccess2")
			.post("/_matrix/client/r0/user/%40${login}%3Amatrix.allmende.io/filter?access_token=${token}")
			.headers(headers_12)
			.body(RawFileBody("logoutVector_0018_request.txt"))
			.check(status.is(200)),
            http("Sync filter")
			.get("/_matrix/client/r0/sync?filter=217&timeout=30000&_cacheBuster=1469444286243&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDE6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY5NDQ3ODg2MTIxCjAwMmZzaWduYXR1cmUgIZcGiUIy---nBmDoeaJvF5Ppbjl5UJqYDPe2E6J0uSIK")
			.headers(headers_14)
			.check(status.is(200)),
            http("Search image")
			.get("http://" + uri1 + ":8081/img/search.svg")
			.headers(headers_20)
			.check(status.is(304)),
            http("icon image")
			.get("http://" + uri1 + ":8081/img/icons-settings.svg")
			.headers(headers_21)
			.check(status.is(304)),
            http("room image")
			.get("http://" + uri1 + ":8081/img/icons-create-room.svg")
			.headers(headers_22)
			.check(status.is(304)),
            http("setting image")
			.get("http://" + uri1 + ":8081/img/settings.svg")
			.headers(headers_23)
			.check(status.is(304)),
            http("directory image")
			.get("http://" + uri1 + ":8081/img/icons-directory.svg")
			.headers(headers_24)
			.check(status.is(304)),
            http("right search")
			.get("http://" + uri1 + ":8081/img/right_search.svg")
			.headers(headers_25)
			.check(status.is(304)),
            http("minimise image")
			.get("http://" + uri1 + ":8081/img/minimise.svg")
			.headers(headers_26)
			.check(status.is(304)),
            http("member image")
			.get("http://" + uri1 + ":8081/img/members.svg")
			.headers(headers_27)
			.check(status.is(304)),
            http("cancel image")
			.get("http://" + uri1 + ":8081/img/cancel.svg")
			.headers(headers_28)
			.check(status.is(304)),
            http("list open")
			.get("http://" + uri1 + ":8081/img/list-open.svg")
			.headers(headers_29)
			.check(status.is(304)),
            http("76cfa6 image")
			.get("http://" + uri1 + ":8081/img/76cfa6.png")
			.headers(headers_30)
			.check(status.is(304)),
            http("f4c371 image")
			.get("http://" + uri1 + ":8081/img/f4c371.png")
			.headers(headers_31)
			.check(status.is(304)),
            http("50e2C2 image")
			.get("http://" + uri1 + ":8081/img/50e2c2.png")
			.headers(headers_32)
			.check(status.is(304)),
            http("close image")
			.get("http://" + uri1 + ":8081/img/list-close.svg")
			.headers(headers_33)
			.check(status.is(304)),
            http("member cheveron")
			.get("http://" + uri1 + ":8081/img/member_chevron.png")
			.headers(headers_34)
			.check(status.is(304)),
            http("plus image")
			.get("http://" + uri1 + ":8081/img/plus.svg")
			.headers(headers_35)
			.check(status.is(304)))
			.check(status.is(200)))
		
		.pause(4)
}
