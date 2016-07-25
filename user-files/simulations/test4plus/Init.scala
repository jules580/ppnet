package test4plus
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._

object Init2 extends Trait{
	val init2=exec(http("init page")
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

