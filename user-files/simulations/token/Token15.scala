package token

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Token15 extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/50.0.2661.102 Chrome/50.0.2661.102 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 Sep 2015 18:02:07 GMT")

	val headers_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 Sep 2015 18:01:31 GMT")

	val headers_3 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 Sep 2015 18:01:31 GMT")

	val headers_19 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive")

	val headers_54 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 Sep 2015 18:01:31 GMT")

	val headers_55 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 Sep 2015 18:01:31 GMT")

	val headers_57 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_58 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive")

	val headers_59 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Accept-Language" -> "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_61 = Map("Accept" -> "application/json, text/plain, */*")

    val uri1 = "http://0.0.0.0:3030/_matrix/client"

	val scn = scenario("Token15")
		.exec(http("request_0")
			.get("/_matrix/client/app/app.css")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/_matrix/client/app/mobile.css")
			.headers(headers_1)
			.check(bodyBytes.is(RawFileBody("Token15_0001_response.txt"))),
            http("request_2")
			.get("/_matrix/client/app/bootstrap.css")
			.headers(headers_1)
			.check(bodyBytes.is(RawFileBody("Token15_0002_response.txt"))),
            http("request_3")
			.get("/_matrix/client/lib/jquery-2.1.3.min.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0003_response.txt"))),
            http("request_4")
			.get("/_matrix/client/lib/angular.min.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0004_response.txt"))),
            http("request_5")
			.get("/_matrix/client/lib/angular-dialog-service-5.2.6/dialogs.min.css")
			.headers(headers_1)
			.check(bodyBytes.is(RawFileBody("Token15_0005_response.txt"))),
            http("request_6")
			.get("/_matrix/client/lib/angular-route.min.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0006_response.txt"))),
            http("request_7")
			.get("/_matrix/client/lib/angular-sanitize.min.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0007_response.txt"))),
            http("request_8")
			.get("/_matrix/client/lib/angular-spinner.min.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0008_response.txt"))),
            http("request_9")
			.get("/_matrix/client/lib/angular-file-upload.min.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0009_response.txt"))),
            http("request_10")
			.get("/_matrix/client/lib/spin.min.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0010_response.txt"))),
            http("request_11")
			.get("/_matrix/client/lib/matrix.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0011_response.txt"))),
            http("request_12")
			.get("/_matrix/client/lib/ui-bootstrap-tpls-0.11.2.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0012_response.txt"))),
            http("request_13")
			.get("/_matrix/client/lib/ng-infinite-scroll-matrix.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0013_response.txt"))),
            http("request_14")
			.get("/_matrix/client/lib/autofill-event.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0014_response.txt"))),
            http("request_15")
			.get("/_matrix/client/lib/elastic.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0015_response.txt"))),
            http("request_16")
			.get("/_matrix/client/lib/marked.min.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0016_response.txt"))),
            http("request_17")
			.get("/_matrix/client/lib/angular-dialog-service-5.2.6/dialogs.min.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0017_response.txt"))),
            http("request_18")
			.get("/_matrix/client/app/app.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0018_response.txt"))),
            http("request_19")
			.get("/_matrix/client/config.js")
			.headers(headers_19)
			.check(status.is(404)),
            http("request_20")
			.get("/_matrix/client/app/app-controller.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0020_response.txt"))),
            http("request_21")
			.get("/_matrix/client/app/app-directive.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0021_response.txt"))),
            http("request_22")
			.get("/_matrix/client/app/app-filter.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0022_response.txt"))),
            http("request_23")
			.get("/_matrix/client/app/home/home-controller.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0023_response.txt"))),
            http("request_24")
			.get("/_matrix/client/app/login/login-controller.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0024_response.txt"))),
            http("request_25")
			.get("/_matrix/client/app/login/register-controller.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0025_response.txt"))),
            http("request_26")
			.get("/_matrix/client/app/login/reset-password-controller.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0026_response.txt"))),
            http("request_27")
			.get("/_matrix/client/app/recents/recents-controller.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0027_response.txt"))),
            http("request_28")
			.get("/_matrix/client/app/recents/recents-filter.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0028_response.txt"))),
            http("request_29")
			.get("/_matrix/client/app/room/room-controller.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0029_response.txt"))),
            http("request_30")
			.get("/_matrix/client/app/room/room-directive.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0030_response.txt"))),
            http("request_31")
			.get("/_matrix/client/app/settings/settings-controller.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0031_response.txt"))),
            http("request_32")
			.get("/_matrix/client/app/payment/payment-controller.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0032_response.txt"))),
            http("request_33")
			.get("/_matrix/client/app/payment/payment-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0033_response.txt"))),
            http("request_34")
			.get("/_matrix/client/app/user/user-controller.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0034_response.txt"))),
            http("request_35")
			.get("/_matrix/client/app/components/matrix/matrix-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0035_response.txt"))),
            http("request_36")
			.get("/_matrix/client/app/components/matrix/matrix-filter.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0036_response.txt"))),
            http("request_37")
			.get("/_matrix/client/app/components/matrix/webrtc-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0037_response.txt"))),
            http("request_38")
			.get("/_matrix/client/app/components/matrix/matrix-call.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0038_response.txt"))),
            http("request_39")
			.get("/_matrix/client/app/components/matrix/matrix-phone-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0039_response.txt"))),
            http("request_40")
			.get("/_matrix/client/app/components/matrix/event-stream-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0040_response.txt"))),
            http("request_41")
			.get("/_matrix/client/app/components/matrix/event-handler-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0041_response.txt"))),
            http("request_42")
			.get("/_matrix/client/app/components/matrix/event-reaper-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0042_response.txt"))),
            http("request_43")
			.get("/_matrix/client/app/components/matrix/notification-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0043_response.txt"))),
            http("request_44")
			.get("/_matrix/client/app/components/matrix/recents-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0044_response.txt"))),
            http("request_45")
			.get("/_matrix/client/app/components/matrix/commands-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0045_response.txt"))),
            http("request_46")
			.get("/_matrix/client/app/components/matrix/model-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0046_response.txt"))),
            http("request_47")
			.get("/_matrix/client/app/components/matrix/presence-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0047_response.txt"))),
            http("request_48")
			.get("/_matrix/client/app/components/matrix/typing-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0048_response.txt"))),
            http("request_49")
			.get("/_matrix/client/app/components/matrix/version-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0049_response.txt"))),
            http("request_50")
			.get("/_matrix/client/app/components/dialogs/dialog-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0050_response.txt"))),
            http("request_51")
			.get("/_matrix/client/app/components/fileInput/file-input-directive.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0051_response.txt"))),
            http("request_52")
			.get("/_matrix/client/app/components/fileUpload/file-upload-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0052_response.txt"))),
            http("request_53")
			.get("/_matrix/client/app/components/utilities/utilities-service.js")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("Token15_0053_response.txt"))))
			.check(bodyBytes.is(RawFileBody("Token15_0000_response.txt"))))
		.pause(1)
		.exec(http("request_54")
			.get("/_matrix/client/img/green_phone.png")
			.headers(headers_54)
			.resources(http("request_55")
			.get("/_matrix/client/app/login/login.html")
			.headers(headers_55)
			.check(bodyBytes.is(RawFileBody("Token15_0055_response.txt"))),
            http("request_56")
			.get("/_matrix/client/img/logo.png")
			.headers(headers_54)
			.check(bodyBytes.is(RawFileBody("Token15_0056_response.txt"))))
			.check(bodyBytes.is(RawFileBody("Token15_0054_response.txt"))))
		.pause(6)
		.exec(http("request_57")
			.post("/_matrix/client/api/v1/login")
			.headers(headers_57)
			.body(RawFileBody("Token15_0057_request.txt"))
			.resources(http("request_58")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNTgzNzc3CjAwMmZzaWduYXR1cmUgWIKnsAE41T-4ouqvZWUwRY3Tes3oXt7qHAirgcLGPaUK&limit=8")
			.headers(headers_58)
			.check(bodyBytes.is(RawFileBody("Token15_0058_response.txt"))),
            http("request_59")
			.put("/_matrix/client/api/v1/presence/%40test15%3Amatrix.allmende.io/status?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNTgzNzc3CjAwMmZzaWduYXR1cmUgWIKnsAE41T-4ouqvZWUwRY3Tes3oXt7qHAirgcLGPaUK")
			.headers(headers_59)
			.body(RawFileBody("Token15_0059_request.txt"))
			.check(bodyBytes.is(RawFileBody("Token15_0059_response.txt"))),
            http("request_60")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNTgzNzc3CjAwMmZzaWduYXR1cmUgWIKnsAE41T-4ouqvZWUwRY3Tes3oXt7qHAirgcLGPaUK")
			.headers(headers_58)
			.check(bodyBytes.is(RawFileBody("Token15_0060_response.txt"))),
            http("request_61")
			.get("/_matrix/client/app/home/home.html")
			.headers(headers_61)
			.check(bodyBytes.is(RawFileBody("Token15_0061_response.txt"))),
            http("request_62")
			.get("/_matrix/client/api/v1/events?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNTgzNzc3CjAwMmZzaWduYXR1cmUgWIKnsAE41T-4ouqvZWUwRY3Tes3oXt7qHAirgcLGPaUK&from=s3069_1664_910_22_1_2&timeout=30000")
			.headers(headers_58)
			.check(bodyBytes.is(RawFileBody("Token15_0062_response.txt"))),
            http("request_63")
			.get("/_matrix/client/img/logo-small.png")
			.check(bodyBytes.is(RawFileBody("Token15_0063_response.txt"))),
            http("request_64")
			.get("/_matrix/client/api/v1/profile/%40test15%3Amatrix.allmende.io/displayname?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNTgzNzc3CjAwMmZzaWduYXR1cmUgWIKnsAE41T-4ouqvZWUwRY3Tes3oXt7qHAirgcLGPaUK")
			.headers(headers_58)
			.check(bodyBytes.is(RawFileBody("Token15_0064_response.txt"))),
            http("request_65")
			.get("/_matrix/client/api/v1/profile/%40test15%3Amatrix.allmende.io/avatar_url?access_token=MDAyMGxvY2F0aW9uIG1hdHJpeC5hbGxtZW5kZS5pbwowMDEzaWRlbnRpZmllciBrZXkKMDAxMGNpZCBnZW4gPSAxCjAwMmRjaWQgdXNlcl9pZCA9IEB0ZXN0MTU6bWF0cml4LmFsbG1lbmRlLmlvCjAwMTZjaWQgdHlwZSA9IGFjY2VzcwowMDFkY2lkIHRpbWUgPCAxNDY4OTMwNTgzNzc3CjAwMmZzaWduYXR1cmUgWIKnsAE41T-4ouqvZWUwRY3Tes3oXt7qHAirgcLGPaUK")
			.headers(headers_58)
			.check(bodyBytes.is(RawFileBody("Token15_0065_response.txt"))),
            http("request_66")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_58)
			.check(bodyBytes.is(RawFileBody("Token15_0066_response.txt"))),
            http("request_67")
			.get("/_matrix/client/app/recents/recents.html")
			.headers(headers_61)
			.check(bodyBytes.is(RawFileBody("Token15_0067_response.txt"))),
            http("request_68")
			.get("/_matrix/client/img/close.png")
			.check(bodyBytes.is(RawFileBody("Token15_0068_response.txt"))))
			.check(bodyBytes.is(RawFileBody("Token15_0057_response.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}