
package test4

import scala.concurrent.duration

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait2._
        
	object Login3 extends Trait2{
		val feeder=csv("login.csv").random
		val login3=exec(feed(feeder))
		.exec(http("Login user")
			.options("/_matrix/client/r0/login?")
			.headers(headers_11)
			.resources(http("Login Request")
			.post("/_matrix/client/r0/login?")
			.headers(headers_12)
			.body(StringBody("""{"user":"${login}","password":"${password}","type":"m.login.password"}"""))
			.check(status.is(200)),
            http("Presence Users")
			.options("/_matrix/client/r0/presence/%40test09%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_13)
			.check(status.is(200)),
            http("Turn Server")
			.get("/_matrix/client/r0/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)),
            http("Push rules")
			.get("/_matrix/client/r0/pushrules/?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)),
            http("Presence User")
			.put("/_matrix/client/r0/presence/%40test09%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_16)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0016_request.txt"))
			.check(status.is(200)),
            http("filter acces 1")
			.options("/_matrix/client/r0/user/%40test09%3Amatrix.allmende.io/filter?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_11)
			.check(status.is(200)),
            http("filter access 2")
			.post("/_matrix/client/r0/user/%40test09%3Amatrix.allmende.io/filter?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_12)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0018_request.txt"))
			.check(status.is(200)),
            http("filter access 3")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&_cacheBuster=1468424606158&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)),
            http("directory image")
			.get("http://" + uri1 + ":8081/img/icons-directory.svg")
			.headers(headers_20)
			.check(status.is(304)),
            http("members image")
			.get("http://" + uri1 + ":8081/img/members.svg")
			.headers(headers_21)
			.check(status.is(304)),
            http("icon room")
			.get("http://" + uri1 + ":8081/img/icons-create-room.svg")
			.headers(headers_22)
			.check(status.is(304)),
            http("setting image")
			.get("http://" + uri1 + ":8081/img/settings.svg")
			.headers(headers_23)
			.check(status.is(304)),
            http("search image")
			.get("http://" + uri1 + ":8081/img/search.svg")
			.headers(headers_24)
			.check(status.is(304)),
            http("icons settings")
			.get("http://" + uri1 + ":8081/img/icons-settings.svg")
			.headers(headers_25)
			.check(status.is(304)),
            http("right search")
			.get("http://" + uri1 + ":8081/img/right_search.svg")
			.headers(headers_26)
			.check(status.is(304)),
            http("minimise image")
			.get("http://" + uri1 + ":8081/img/minimise.svg")
			.headers(headers_27)
			.check(status.is(304)),
            http("sync filter")
			.get("/_matrix/client/r0/sync?filter=0&timeout=30000&since=s1540_1239_764_7_1_2&access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MDk6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4NDI4MjA2MDU2CjAwMmZzaWduYXR1cmUgBQGM8CyAqBPp-he2008p0kl8hVjwadjzbGvZ_GtO3T8K")
			.headers(headers_14)
			.check(status.is(200)),
            http("cancel image")
			.get("http://" + uri1 + ":8081/img/cancel.svg")
			.headers(headers_29)
			.check(status.is(304)),
            http("open image")
			.get("http://" + uri1 + ":8081/img/list-open.svg")
			.headers(headers_30)
			.check(status.is(304)),
            http("50e2c2 image")
			.get("http://" + uri1 + ":8081/img/50e2c2.png")
			.headers(headers_31)
			.check(status.is(304)),
            http("76cfa6 image")
			.get("http://" + uri1 + ":8081/img/76cfa6.png")
			.headers(headers_32)
			.check(status.is(304)),
            http("close image")
			.get("http://" + uri1 + ":8081/img/list-close.svg")
			.headers(headers_33)
			.check(status.is(304)),
            http("plus image")
			.get("http://" + uri1 + ":8081/img/plus.svg")
			.headers(headers_34)
			.check(status.is(304)))
			.check(status.is(200)))
			.exec(session=>{
				println("session"+session)
				session
			})
		.pause(6)
	}
