package default4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class logoutVector extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385103-3498-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_4 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json")

	val headers_5 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385016-5177-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_6 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Access-Control-Request-Headers" -> "accept, content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_7 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385063-34411-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_8 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json",
		"content-type" -> "application/json")

	val headers_10 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive")

	val headers_11 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Access-Control-Request-Headers" -> "accept, content-type",
		"Access-Control-Request-Method" -> "POST",
		"Connection" -> "keep-alive",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_12 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json",
		"content-type" -> "application/json")

	val headers_13 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Access-Control-Request-Headers" -> "accept, content-type",
		"Access-Control-Request-Method" -> "PUT",
		"Connection" -> "keep-alive",
		"Origin" -> "http://0.0.0.0:8081")

	val headers_14 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json")

	val headers_16 = Map(
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "http://0.0.0.0:8081",
		"accept" -> "application/json",
		"content-type" -> "application/json")

	val headers_20 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385056-1446-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_21 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385009-5057-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_22 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385007-1351-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_23 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385061-4709-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_24 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385008-2586-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_25 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385051-2432-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_26 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385022-1185-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_27 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385020-2867-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_28 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384980-1032-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_29 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385015-716-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_30 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384968-966-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_31 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384996-146-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_32 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384967-146-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_33 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385013-716-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_34 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385018-271-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_35 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5385050-912-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

	val headers_41 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 13 Jul 2016 07:02:30 GMT",
		"If-None-Match" -> "5384974-2450-Wed Jul 13 2016 09:02:30 GMT+0200 (CEST)")

    val uri1 = "0.0.0.0"

 object Init {
		val init=exec(http("init page")
			.get("http://" + uri1 + ":8081/")
			.headers(headers_0)
			.resources(http("Opensans 1")
			.get("http://" + uri1 + ":8081/fonts/opensans/v13/cJZKeOuBrn4kERxqtaUH3ZBw1xU1rKptJj_0jans920.woff2")
			.check(status.is(200)),
            http("Opensans 2")
			.get("http://" + uri1 + ":8081/fonts/opensans/v13/MTP_ySUJH_bn48VBG8sNShampu5_7CjHW5spxoeN3Vs.woff2")
			.check(status.is(200)),
            http("Opensans 3")
			.get("http://" + uri1 + ":8081/fonts/opensans/v13/k3k702ZOKiLJc3WVjuplzBampu5_7CjHW5spxoeN3Vs.woff2")
			.check(status.is(200)),
            http("Login Page")
			.get("/_matrix/client/r0/login?")
			.headers(headers_4)
			.check(status.is(200)),
            http("Logo image")
			.get("http://" + uri1 + ":8081/img/logo.png")
			.headers(headers_5)
			.check(status.is(304)),
            http("Register Guest")
			.options("/_matrix/client/r0/register?kind=guest")
			.headers(headers_6)
			.check(status.is(200)),
            http("Spinner image")
			.get("http://" + uri1 + ":8081/img/spinner.gif")
			.headers(headers_7)
			.check(status.is(304)),
            http("Register Guest")
			.post("/_matrix/client/r0/register?kind=guest")
			.headers(headers_8)
			.body(RawFileBody("logoutVector_0008_request.txt"))
			.check(status.is(403)),
            http("Login page2")
			.get("/_matrix/client/r0/login?")
			.headers(headers_4)
			.check(status.is(200)),
            http("Version uri")
			.get("http://" + uri1 + ":8081/version?ts=1469444280445")
			.headers(headers_10)
			.check(status.is(404)))
			.check(status.is(200)))
			.pause(5)
		}
		
		object Login{
			val feeder=csv("login.csv").random
			
			val login=exec(feed(feeder))
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
		object Logout{
			val feeder=csv("login.csv").random
			val logout=exec(feed(feeder))
			.exec(http("Profile Use")
			.get("/_matrix/client/r0/profile/%40test01%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_14)
			.resources(http("Access account")
			.get("/_matrix/client/r0/account/3pid?access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("Proile user3")
			.get("/_matrix/client/r0/profile/%40${login}%3Amatrix.allmende.io?access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("Push rule")
			.get("/_matrix/client/r0/pushrules/?access_token=${token}")
			.headers(headers_14)
			.check(status.is(200)),
            http("Pusher access")
			.get("/_matrix/client/r0/pushers?access_token=${token}")
			.headers(headers_14)
			.check(status.is(400)),
            http("Camera Image")
			.get("http://" + uri1 + ":8081/img/camera.svg")
			.headers(headers_41)
			.check(status.is(304)))
			.check(status.is(200)))
		.pause(6)
		.exec(session =>{
		println("session"+session)
		session
})
	}
	object LoginPage{
		val loginpage=exec(http("Login PageBack")
			.get("/_matrix/client/r0/login?")
			.headers(headers_14)
			.check(status.is(200)))
		}
	
val admin=scenario("Admins").exec(Init.init,Login.login,Logout.logout,LoginPage.loginpage)
	setUp(admin.inject(atOnceUsers(1))).protocols(httpProtocol)
}
