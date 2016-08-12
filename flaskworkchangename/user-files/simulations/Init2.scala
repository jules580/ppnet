package test4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait2._

	
	  object Init3 extends Trait2{
			val init3=exec(http("Connect url")
			.get("http://" + uri1 + ":8081/")
			.headers(headers_0)
			.resources(http("Open sans 1")
			.get("http://" + uri1 + ":8081/fonts/opensans/v13/cJZKeOuBrn4kERxqtaUH3ZBw1xU1rKptJj_0jans920.woff2")
			.check(status.is(200)),
            http("Open sans 2")
			.get("http://" + uri1 + ":8081/fonts/opensans/v13/MTP_ySUJH_bn48VBG8sNShampu5_7CjHW5spxoeN3Vs.woff2")
			.check(status.is(200)),
            http("Open sans 3")
			.get("http://" + uri1 + ":8081/fonts/opensans/v13/k3k702ZOKiLJc3WVjuplzBampu5_7CjHW5spxoeN3Vs.woff2")
			.check(status.is(200)),
            http("Login Page")
			.get("/_matrix/client/r0/login?")
			.headers(headers_4)
			.check(status.is(200)),
            http("logo image")
			.get("http://" + uri1 + ":8081/img/logo.png")
			.headers(headers_5)
			.check(status.is(304)),
            http("register page")
			.options("/_matrix/client/r0/register?kind=guest")
			.headers(headers_6)
			.check(status.is(200)),
            http("spinner image")
			.get("http://" + uri1 + ":8081/img/spinner.gif")
			.headers(headers_7)
			.check(status.is(304)),
            http("register guest")
			.post("/_matrix/client/r0/register?kind=guest")
			.headers(headers_8)
			.body(RawFileBody("RecordedSimulateSendMessageVector_0008_request.txt"))
			.check(status.is(403)),
            http("login pages")
			.get("/_matrix/client/r0/login?")
			.headers(headers_4)
			.check(status.is(200)),
            http("version page")
			.get("http://" + uri1 + ":8081/version?ts=1468424596723")
			.headers(headers_10)
			.check(status.is(404))))

		.pause(8)
	}
