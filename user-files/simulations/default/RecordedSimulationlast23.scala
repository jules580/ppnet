
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulationlast23 extends Simulation {

	val httpProtocol = http
		.baseURL("http://0.0.0.0:3030")
		.inferHtmlResources(WhiteList(), BlackList())
		.acceptHeader("application/json, text/plain, */*")
		.acceptEncodingHeader("gzip, deflate, sdch")
		.acceptLanguageHeader("fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:47.0) Gecko/20100101 Firefox/47.0")

	val headers_0 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Header-RootMe-Admin" -> "true",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_2 = Map("Header-RootMe-Admin" -> "true")

	val headers_3 = Map(
		"Content-Type" -> "application/json;charset=UTF-8",
		"Header-RootMe-Admin" -> "true",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_12 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Header-RootMe-Admin" -> "true")

	val headers_15 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Content-Type" -> "image/png",
		"Header-RootMe-Admin" -> "true",
		"Origin" -> "http://0.0.0.0:3030")

	val headers_26 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-fr",
		"Connection" -> "keep-alive",
		"User-Agent" -> "%C2%B5Torrent/41986 CFNetwork/673.2.1 Darwin/13.1.0 (x86_64) (MacBookAir6%2C2)")

	val headers_27 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "fr-fr",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:47.0) Gecko/20100101 Firefox/47.0")

    val uri1 = "http://0.0.0.0:3030/_matrix"
    val uri2 = "http://cdn.bitmedianetwork.com/network/index-mac-ut.html"
    val uri3 = "http://utclient.utorrent.com/offers/mac-ut-adfree/i18n/en/offer.json"

	val scn = scenario("RecordedSimulationlast23")
		.exec(http("request_0")
			.post("/_matrix/client/v2_alpha/register")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulationlast23_0000_request.txt"))
			.resources(http("request_1")
			.post("/_matrix/client/v2_alpha/register")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulationlast23_0001_request.txt")),
            http("request_2")
			.get("/_matrix/client/api/v1/initialSync?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo&limit=8")
			.headers(headers_2),
            http("request_3")
			.put("/_matrix/client/api/v1/profile/%40test55%3Atest/displayname?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulationlast23_0003_request.txt")),
            http("request_4")
			.get("/_matrix/client/api/v1/profile/%40test55%3Atest/avatar_url?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo")
			.headers(headers_2),
            http("request_5")
			.get("/_matrix/client/api/v1/profile/%40test55%3Atest/displayname?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo")
			.headers(headers_2),
            http("request_6")
			.get("/_matrix/client/api/v1/events?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo&from=s24_12_2_1_1_1&timeout=30000")
			.headers(headers_2),
            http("request_7")
			.get("/_matrix/client/api/v1/voip/turnServer?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo")
			.headers(headers_2),
            http("request_8")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_2),
            http("request_9")
			.get("/_matrix/client/api/v1/events?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo&from=s24_13_2_1_1_1&timeout=30000")
			.headers(headers_2),
            http("request_10")
			.get("/_matrix/client/api/v1/events?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo&from=s26_13_2_1_1_1&timeout=30000")
			.headers(headers_2),
            http("request_11")
			.get("/_matrix/client/api/v1/rooms/!kWITIPoJibyzWtboAC%3Atest/initialSync?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo&limit=30")
			.headers(headers_2))
			.check(status.is(401)))
		.pause(1)
		.exec(http("request_12")
			.get("/_matrix/media/v1/identicon/%40test55%3Atest?width=96&height=96")
			.headers(headers_12)
			.resources(http("request_13")
			.get("/_matrix/client/img/p/p%7B%7B%20member.power_level_norm%20%7D%7D.png")
			.headers(headers_12)
			.check(status.is(404)),
            http("request_14")
			.get("/_matrix/client/api/v1/rooms/!kWITIPoJibyzWtboAC%3Atest/messages?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo&dir=b&from=t1-24_14_2_1_1_1&limit=30")
			.headers(headers_2)))
		.pause(4)
		.exec(http("request_15")
			.post("/_matrix/media/v1/upload?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo&filename=Sans+titre.png")
			.headers(headers_15)
			.body(RawFileBody("RecordedSimulationlast23_0015_request.txt"))
			.resources(http("request_16")
			.get("/_matrix/client/api/v1/events?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo&from=s29_14_2_1_1_1&timeout=30000")
			.headers(headers_2),
            http("request_17")
			.put("/_matrix/client/api/v1/rooms/!kWITIPoJibyzWtboAC%3Atest/send/m.room.message/m1467705502886?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulationlast23_0017_request.txt")),
            http("request_18")
			.get("/_matrix/media/v1/thumbnail/test/QRShTyUfKrEtHlIugQdFmeGN?width=320&height=320")
			.headers(headers_12),
            http("request_19")
			.get("/_matrix/client/api/v1/events?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo&from=s30_14_2_1_1_1&timeout=30000")
			.headers(headers_2),
            http("request_20")
			.put("/_matrix/client/api/v1/rooms/!kWITIPoJibyzWtboAC%3Atest/typing/%40test55%3Atest?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulationlast23_0020_request.txt")),
            http("request_21")
			.get("/_matrix/client/api/v1/events?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo&from=s30_14_3_1_1_1&timeout=30000")
			.headers(headers_2),
            http("request_22")
			.put("/_matrix/client/api/v1/rooms/!kWITIPoJibyzWtboAC%3Atest/typing/%40test55%3Atest?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulationlast23_0022_request.txt")),
            http("request_23")
			.put("/_matrix/client/api/v1/rooms/!kWITIPoJibyzWtboAC%3Atest/send/m.room.message/m1467705507993?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulationlast23_0023_request.txt")),
            http("request_24")
			.get("/_matrix/client/api/v1/events?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo&from=s30_14_4_1_1_1&timeout=30000")
			.headers(headers_2),
            http("request_25")
			.put("/_matrix/client/api/v1/rooms/!kWITIPoJibyzWtboAC%3Atest/typing/%40test55%3Atest?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulationlast23_0025_request.txt")),
            http("request_26")
			.get(uri3 + "")
			.headers(headers_26),
            http("request_27")
			.get(uri2 + "")
			.headers(headers_27),
            http("request_28")
			.get("/_matrix/client/api/v1/events?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo&from=s31_14_4_1_1_1&timeout=30000")
			.headers(headers_2),
            http("request_29")
			.get(uri2 + "")
			.headers(headers_27),
            http("request_30")
			.put("/_matrix/client/api/v1/rooms/!kWITIPoJibyzWtboAC%3Atest/typing/%40test55%3Atest?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulationlast23_0030_request.txt")),
            http("request_31")
			.put("/_matrix/client/api/v1/rooms/!kWITIPoJibyzWtboAC%3Atest/send/m.room.message/m1467705509785?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulationlast23_0031_request.txt")),
            http("request_32")
			.get("/_matrix/client/api/v1/events?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo&from=s31_14_5_1_1_1&timeout=30000")
			.headers(headers_2),
            http("request_33")
			.get("/_matrix/client/api/v1/events?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo&from=s31_14_6_1_1_1&timeout=30000")
			.headers(headers_2)))
		.pause(1)
		.exec(http("request_34")
			.get("/_matrix/client/api/v1/profile/%40test55%3Atest/avatar_url?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo")
			.headers(headers_2)
			.resources(http("request_35")
			.get("/_matrix/client/api/v1/publicRooms")
			.headers(headers_2),
            http("request_36")
			.get("/_matrix/client/api/v1/profile/%40test55%3Atest/displayname?access_token=MDAxMmxvY2F0aW9uIHRlc3QKMDAxM2lkZW50aWZpZXIga2V5CjAwMTBjaWQgZ2VuID0gMQowMDFmY2lkIHVzZXJfaWQgPSBAdGVzdDU1OnRlc3QKMDAxNmNpZCB0eXBlID0gYWNjZXNzCjAwMWRjaWQgdGltZSA8IDE0Njc3MDkwNzY3NDEKMDAyZnNpZ25hdHVyZSA_K6aabTJ6FymTGJZ94-AV1ljDpnvjf1S1GiG3JZ7yqQo")
			.headers(headers_2)))
		.pause(2)
		.exec(http("request_37")
			.put("/_matrix/client/undefined/_matrix/client/api/v1/presence/undefined/status")
			.headers(headers_3)
			.body(RawFileBody("RecordedSimulationlast23_0037_request.txt"))
			.check(status.is(404)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
