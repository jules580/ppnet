package default

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulationh2g2 extends Simulation {

	val httpProtocol = http
		.baseURL("http://ping.chartbeat.net")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.ico"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.contentTypeHeader("")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:47.0) Gecko/20100101 Firefox/47.0")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Origin" -> "http://tpc.googlesyndication.com")

	val headers_1 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Cache-Control" -> "max-age=0",
		"If-None-Match" -> "8a0abb16371ae7cc58e02bf9c715db46")

	val headers_2 = Map(
		"Cache-Control" -> "max-age=0",
		"If-None-Match" -> "97eb2f391887a79b10304b3682065a77")

	val headers_3 = Map(
		"Cache-Control" -> "max-age=0",
		"If-None-Match" -> "3dce5dd06e1b84a09e5bf98c88312790565a8572")

	val headers_4 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Mon, 27 Jun 2016 13:54:06 GMT",
		"If-None-Match" -> "2da-53642da8d7b80")

	val headers_5 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Fri, 01 Jul 2016 01:15:18 GMT",
		"If-None-Match" -> "414eb6a7392d648087ffc09484704d00")

	val headers_6 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Thu, 30 Jun 2016 12:46:34 GMT",
		"If-None-Match" -> "56fb270389878f073e57586f7d57f234")

	val headers_7 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Thu, 30 Jun 2016 14:01:44 GMT",
		"If-None-Match" -> "f55e44b9850f884b2ed203b6804a2d8a")

	val headers_8 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Thu, 30 Jun 2016 09:28:05 GMT",
		"If-None-Match" -> "c6a8e29df5d1addd10551e05fe56d64f")

	val headers_9 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Fri, 01 Jul 2016 00:37:35 GMT",
		"If-None-Match" -> "c1588e92e243ed0cd6443675e6f916ea")

	val headers_10 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 19 Mar 2014 15:02:55 GMT",
		"If-None-Match" -> "1e8-4f4f6f28865c0")

	val headers_11 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 19 Mar 2014 15:02:55 GMT",
		"If-None-Match" -> "24f-4f4f6f28865c0")

	val headers_12 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 19 Mar 2014 15:02:55 GMT",
		"If-None-Match" -> "118-4f4f6f28865c0")

	val headers_13 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Thu, 30 Jun 2016 13:27:55 GMT",
		"If-None-Match" -> "f0f587d4d53f1ef7d912ea63ea343a84")

	val headers_14 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Thu, 30 Jun 2016 11:33:55 GMT",
		"If-None-Match" -> "4387f4c45e9f9459540b716a218735ac")

	val headers_15 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 29 Jun 2016 15:19:39 GMT",
		"If-None-Match" -> "df5e1096f350a261f0f61a5080ea6006")

	val headers_16 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Tue, 28 Jun 2016 07:12:44 GMT",
		"If-None-Match" -> "b5a25eb00b0f7246de8195ac80869634")

	val headers_17 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Wed, 29 Jun 2016 11:46:17 GMT",
		"If-None-Match" -> "0b2d3f691927c5b550bf9b8e38e00230")

	val headers_19 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Mon, 06 Jun 2016 11:39:48 GMT",
		"If-None-Match" -> "989-5349a87974900")

	val headers_20 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Mon, 27 Jun 2016 13:54:06 GMT",
		"If-None-Match" -> "52-53642da8d7b80")

	val headers_21 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Thu, 30 Jun 2016 10:49:31 GMT",
		"If-None-Match" -> "99c8398fcfe5e954dcf16ea9641240b6")

	val headers_22 = Map(
		"Cache-Control" -> "max-age=0",
		"If-None-Match" -> "654bf7cc3cdcdfd9469e5b865a92c4b1")

	val headers_23 = Map(
		"Cache-Control" -> "max-age=0",
		"If-None-Match" -> "01644dc43be9b3e17b8fd7490da9b986")

	val headers_25 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Thu, 23 Jun 2016 00:41:47 GMT",
		"If-None-Match" -> "726d287890a4d2c520d4a7a450e210ea")

	val headers_26 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

	val headers_27 = Map("Accept-Encoding" -> "gzip, deflate, br")

	val headers_35 = Map("Cache-Control" -> "max-age=0")

	val headers_45 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Thu, 30 Jun 2016 14:01:42 GMT",
		"If-None-Match" -> "74a4b58b648e56f9d4f68416abc9d063")

	val headers_66 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Mon, 27 Jun 2016 13:54:06 GMT",
		"If-None-Match" -> "2df-53642da8d7b80")

	val headers_73 = Map(
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Mon, 14 Feb 2011 11:09:26 GMT",
		"If-None-Match" -> "fc94fb0c3ed8a8f909dbc7630a0987ff")

	val headers_74 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"X-Moz" -> "prefetch")

    val uri01 = "tpc.googlesyndication.com"
    val uri02 = "http://www.bbc.com"
    val uri03 = "http://beacon.krxd.net"
    val uri04 = "http://ichef.bbci.co.uk/wwhp"
    val uri05 = "http://ping.chartbeat.net/ping"
    val uri06 = "http://ps.eyeota.net/match"
    val uri07 = "http://bs.serving-sys.com/BurstingPipe/adServer.bs"
    val uri08 = "https://ad.adlegend.com"
    val uri09 = "http://adadvisor.net/adscores/g.js"
    val uri10 = "https://data46.adlooxtracking.com/ads/ic.php"
    val uri11 = "http://open.live.bbc.co.uk/wurfldemi/network.jsonp"
    val uri12 = "http://sa.bbc.co.uk/bbc/bbc/s"
    val uri13 = "http://optimized-by.rubiconproject.com/a/12198/52926"
    val uri14 = "http://www.bbc.co.uk"
    val uri15 = "https://ad.atdmt.com"
    val uri16 = "https://adx.g.doubleclick.net/pagead/adview"
    val uri17 = "http://c.betrad.com"
    val uri18 = "http://r.bbci.co.uk/e/mediaplayout/-/bumpv3/3.17.0/-/-/http~www~bbc~com~/smp.player.page/-~-/-~-/err/6010"
    val uri19 = "http://load.s3.amazonaws.com/pixel.gif"
    val uri20 = "http://static.bbci.co.uk"
    val uri21 = "https://securepubads.g.doubleclick.net/gampad/ads"
    val uri22 = "http://cdn.krxd.net"
    val uri23 = "http://pagead2.googlesyndication.com"
    val uri24 = "http://b.scorecardresearch.com/b"
    val uri25 = "http://s.effectivemeasure.net"
    val uri26 = "http://l.betrad.com/ct/0_0_0_1964/fr/0/1/0/0/0/0/300/250/242/650/0/pixel.gif"
    val uri27 = "https://secure-ams.adnxs.com"
    val uri28 = "http://loadm.exelator.com/load"
    val uri29 = "http://static.bbc.co.uk/id/0.35.26/svg/icon-sprite.svg"
    val uri30 = "http://nav.files.bbci.co.uk/searchbox/1.0.0-102/img/gel-icon-search-dark.svg"
    val uri31 = "https://cdn.atlassbx.com/FB/11297200839199/JL_INT-300x250-ClearanceSS15-Generic_FR.jpg"

	val scn = scenario("RecordedSimulationh2g2")
		.exec(http("request_0")
			.post(uri27 + "/vevent?e=wqT_3QLRCvBMUQUAAAMA1gAFAQjgp9i7BRDn0t7J_v-XnSwYgZexy6DSyJJ-IAEqLQnYo3A9Ctf_PxHXo3A9Ctf_PxnD9Shcj8IiQCEAAAAAAAAEQCkFCLAABEAwmOqxAzi1AUDoAUgCUPy-iRZYxLE9YABo7exUeMDsA4ABAYoBA1VTRJIFBvA8mAGsAqAB-gGoAQGwAQC4AQLAAQXIAQDQAQDYAQDgAQDqAfMDaHR0cHM6Ly9hZGNsaWNrLmcuZG91YmxlYwUO9CICbmV0L2FjbGs_c2E9bCZhaT1DZjZCNDN4TjJWOERWSWN1X1dJdk1odGdFaDhuaHlnWFBfZlRhR01DTnR3RVFBU0FBWVB2Ui1JS0lDb0lCRjJOaExYQjFZaTB5T0RVMU1ETTBORGcyT0RJd05qSXhvQUdmdWIzckE4Z0JDZUFDQUtnREFhb0VvZ0ZQMEh3NlZNTEptZmppZmJ5WS1sdXpRS2tVcVVZRDN1Sm5VNmhTYmdXeTNjcmNncUsxV25aTElQR1RlUlVrZjc2Zy11SV9iYkdsNzZGc2d3bUdNUGxaU29MUTRfeC00eXdXcENkbFF2djl6RTN3SWNadmhyZnk3aXlyVi1OcHNPdUo1VmtqZ2ZkeXJJWDNFSjRtcXJQd1RVeDdXNGV3WFFJLTlJSVBUbWpCbVNFQ0Z5YlVzR21IaDlFTFQzT1RBWEgzVG9WUVkwT3R2RkFrWF9vMnpMemV5aGpnQkFHQUJ1cmF1WXZXLXRqM0ZhQUdJYWdIcHI0YjJBY0EmbnVtPTEmc2lnPUFPRDY0XzBrNnZXdDZ0emthX3RqWjI3amt3am1aVVN2UWcmY2xpZW50PWNhLXB1Yi0yODU1MDM0NDg2ODIwNjIxJmFkdXJsPfABAPoBEjEwMDAwMDAtNDE1OTU0MTM2NooCkgF1ZignYScsIDEwMDA0ODEsIDE0NjczNTYxMjgpO3VmKCdyJywgNDYyOTI4NjAsIDE0NjIeAEBjJywgMTMwMzcyNzcsIDE0NjIeAChnJywgMjk5ODAzNEYdACBpJywgMzI3Mzg6VwDwZpIC-QEhRURNczJRamQzWnNHRVB5LWlSWVlBQ0RFc1Qwd0FEZ0FRQUJJNkFGUW1PcXhBMWdBWU1rSGFBQndIbmlhRDRBQkxJZ0JtZy1RQVFHWUFRR2dBUUdvQVFPd0FRQzVBUUFBQUEBAxBSQXdRRQEJAQFARVFNa0JjNEY2ZGFjVzV6X1oVKChQQV80QUhVX1JQMQkUXENBQWdDSUF2anNKNGdDdmM2X0FwQUNBWgEEHGdDaW9UVU1xRc4gQ0FhZ0NBTFVDAWEIQUwwCQiYTkFDTE5nQ21nX2dBZ0RvQWdENEFnQ0FBd0UumgIlITh3amdad2pkLvwAHHhMRTlJQUFvBVyIZy4u2ALwBuACwPAx6gIHYmJjLmNvbfICEQoGQURWX0lEEgctzwUUCENQRwUULYoBFAgFQ1ABEwAIMbsQ8gIOCggBPPCKRlJFURICMjLyAg0KCFJFTV9VU0VSEgEwgAMBiAMAkAMAmAMJoAMBqgMAsAMAuAMAwAOsAsgDANgD-KMx4AMA6AMA-AMDgAQAkgQEL2FkeJgEAKIEDDE5NC43OS4xNDcuMKgEpsQFsgQICAAQABgAIAC4BADABADIBADSBAkxMC4yLjg1LjbaBAIIAQ..&s=28a4d26329de461e2f54c89ffe0f100aa6471d68&referrer=bbc.com&type=nv&nvt=3&jm=144|145|146&pd=18.82&d=18.81&ud=0&id=0&ic=0&d0=0&d25=0&d50=0&d75=0&d100=0&px=559&py=6202&bw=300&bh=250&sf=0&sid=1467356129256661726&sw=1366&sh=768&pw=300&ph=254&ww=300&wh=250&ft=3&sv=42&tv=view5-1s&ua=gecko40&pl=linux&x=1467356129256661726,429999,v,linux,gecko40,view5-1s,90,,3")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri02 + "/")
			.headers(headers_1)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0001_response.txt"))),
            http("request_2")
			.get(uri14 + "/wwscripts/flag")
			.headers(headers_2)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0002_response.txt"))),
            http("request_3")
			.get(uri22 + "/controltag?confid=JA8mItOH")
			.headers(headers_3)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0003_response.txt"))),
            http("request_4")
			.get(uri20 + "/frameworks/barlesque/3.20.0/orb/4/img/bbc-blocks-light.png")
			.headers(headers_4)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0004_response.txt"))),
            http("request_5")
			.get(uri04 + "/144/cpsprodpb/BF3D/production/_90175984_theresamay_reuters.jpg")
			.headers(headers_5)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0005_response.txt"))),
            http("request_6")
			.get(uri04 + "/144/cpsprodpb/11662/production/_90166217_mediaitem90166216.jpg")
			.headers(headers_6)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0006_response.txt"))),
            http("request_7")
			.get(uri04 + "/144/cpsprodpb/10866/production/_90168676_777a48bf-5c4c-48e0-a4c4-4219d48e335c.jpg")
			.headers(headers_7)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0007_response.txt"))),
            http("request_8")
			.get(uri04 + "/144/ibroadcast/images/live/p0/3z/yz/p03zyzvz.jpg")
			.headers(headers_8)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0008_response.txt"))),
            http("request_9")
			.get(uri04 + "/144/cpsprodpb/CCDE/production/_90164425_epblurryde34.jpg")
			.headers(headers_9)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0009_response.txt"))),
            http("request_10")
			.get(uri20 + "/weather/0.5.284/images/icons/individual_56_icons/en_on_light_bg/12.gif")
			.headers(headers_10)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0010_response.txt"))),
            http("request_11")
			.get(uri20 + "/weather/0.5.284/images/icons/individual_56_icons/en_on_light_bg/3.gif")
			.headers(headers_11)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0011_response.txt"))),
            http("request_12")
			.get(uri20 + "/weather/0.5.284/images/icons/individual_56_icons/en_on_light_bg/7.gif")
			.headers(headers_12)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0012_response.txt"))),
            http("request_13")
			.get(uri04 + "/144/cpsprodpb/CBE4/production/_90169125_gettyimages-80457874.jpg")
			.headers(headers_13)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0013_response.txt"))),
            http("request_14")
			.get(uri04 + "/144/cpsprodpb/18296/production/_90166989_lindstrom_sara.jpg")
			.headers(headers_14)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0014_response.txt"))),
            http("request_15")
			.get(uri04 + "/144/cpsprodpb/1ADB/production/_90157860_hi033784648.jpg")
			.headers(headers_15)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0015_response.txt"))),
            http("request_16")
			.get(uri04 + "/144/cpsprodpb/14E9D/production/_90016658_1024-jarhead-c-universal-we.jpg")
			.headers(headers_16)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0016_response.txt"))),
            http("request_17")
			.get(uri04 + "/144/cpsprodpb/86E7/production/_90153543_full-sized-promo-124.jpg")
			.headers(headers_17)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0017_response.txt"))),
            http("request_18")
			.get(uri24 + "?c1=2&c2=19293874&b_ad_enabled=1&b_app_name=homepage%7Cweb&b_app_type=web&b_is_app=0&b_edition=international&b_imp_src=gnl&b_imp_ver=1.24.0&b_site_channel=homepage&b_vs_un=bc&name=homepage.home&ns_c=UTF-8&ns_site=bbc&ns_alias=c6486af7-c29b-45e7-b66f-b5c72eae6f94&test_group=b&b_page_type=idx%7Cna&c7=http%3A%2F%2Fwww.bbc.com%2F&c8=BBC%20-%20Homepage&c9=http%3A%2F%2Fwww.bbc.co.uk%2F"),
            http("request_19")
			.get(uri29 + "")
			.headers(headers_19)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0019_response.txt"))),
            http("request_20")
			.get(uri20 + "/frameworks/barlesque/3.20.0/orb/4/img/orb-sprite.gif")
			.headers(headers_20)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0020_response.txt"))),
            http("request_21")
			.get(uri30 + "")
			.headers(headers_21)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0021_response.txt"))),
            http("request_22")
			.get(uri14 + "/idcta/config?callback&locale=en-GB&ptrt=http://www.bbc.com/")
			.headers(headers_22)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0022_response.txt"))),
            http("request_23")
			.get(uri14 + "/idcta/translations?callback&locale=en-GB")
			.headers(headers_23)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0023_response.txt"))),
            http("request_24")
			.get(uri12 + "?name=SET-COUNTER.page&ml_name=webmodule&ml_version=50&pal_route=index&app_type=responsive&language=en-GB&pal_webapp=wwhp&blq_s=4d&blq_r=3.5&blq_v=default&blq_e=pal&bbc_mc=ad1ps1pf1&screen_resolution=1366x768&bbc_site=&ns_ti=BBC%20-%20Homepage&ns_c=UTF-8&ns__t=1467356149345&ns_jspageurl=http%3A%2F%2Fwww.bbc.com%2F&legacyInvoke=1&ns_referrer=http%3A%2F%2Fwww.bbc.co.uk%2F")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0024_response.txt"))),
            http("request_25")
			.get(uri22 + "/ctjs/controltag.js.726d287890a4d2c520d4a7a450e210ea")
			.headers(headers_25)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0025_response.txt"))),
            http("request_26")
			.get(uri25 + "/html/frame_2.3.4.html")
			.headers(headers_26)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0026_response.txt"))),
            http("request_27")
			.get(uri21 + "?gdfp_req=1&correlator=3333335976795723&output=json_html&callback=callbackProxy&impl=fifs&json_a=1&eid=108809080&sc=0&sfv=1-0-4&iu_parts=4817%2Cbbccom.live.site.www%2Cbbc_homepage_int&enc_prev_ius=%2F0%2F1%2F2%2C%2F0%2F1%2F2%2C%2F0%2F1%2F2%2C%2F0%2F1%2F2%2C%2F0%2F1%2F2%2C%2F0%2F1%2F2%2C%2F0%2F1%2F2%2C%2F0%2F1%2F2%2C%2F0%2F1%2F2&prev_iu_szs=976x400%2C728x90%7C970x300%7C970x250%7C970x90%7C970x66%7C940x230%2C10x10%2C300x250%7C300x600%2C300x251%2C88x31%2C88x31%2C300x251%2C1x1&ists=1&prev_scp=slot%3Dparallax%7Cslot%3Dleaderboard%7Cslot%3Dnative%7Cslot%3Dmpu%7Cslot%3Dmpu_middle%7Cslot%3Dmodule_feature-1%7Cslot%3Dmodule_feature-2%7Cslot%3Dmpu_bottom%7Cslot%3Dinterstitial&cust_params=frd%3D1%26channel%3Dhomepage%26domain%3Dwww.bbc.com%26ctype%3Dindex%26asset_type%3Dindex%26referrer_domain%3Dwww.bbc.co.uk%26esi%3D0%26kuid%3Dqou248qez%26khost%3Dwww.bbc.com&cookie=ID%3De70514803683e598%3AT%3D1467356127%3AS%3DALNI_MZ-DQmqe6rRn0ERTeg0Yym9NzY_-Q&lmt=1467356124&dt=1467356150241&cc=100&frm=20&biw=1287&bih=421&oid=3&adks=646957834%2C1473563476%2C2928542910%2C983873362%2C1934112023%2C1660709396%2C1660709397%2C4159541366%2C2157453196&gut=v2&ifi=1&u_tz=120&u_his=2&u_java=true&u_h=768&u_w=1366&u_ah=744&u_aw=1301&u_cd=24&u_nplug=6&u_nmime=84&u_sd=1&flash=0&url=http%3A%2F%2Fwww.bbc.com%2F&ref=http%3A%2F%2Fwww.bbc.co.uk%2F&dssz=86&icsg=2251799813685248&std=5&vrg=90&vrp=90&ga_vid=1168751621.1467356150&ga_sid=1467356150&ga_hid=1887130731")
			.headers(headers_27)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0027_response.txt"))),
            http("request_28")
			.get(uri25 + "/d/6/p?pu=http%3A%2F%2Fwww.bbc.com%2F&ru=http%3A%2F%2Fwww.bbc.co.uk%2F&tz=2&fv=60631e356cfc3542ca6b0207d0e4577613df446ee4-37396236577613df&ft=2f01df8b1b7ed590a01dcc451dcd577613df446ef8-64675488577613df&fc=true&ii=false&ua=Mozilla%2F5.0%20(X11%3B%20Ubuntu%3B%20Linux%20x86_64%3B%20rv%3A47.0)%20Gecko%2F20100101%20Firefox%2F47.0&ftm=false&tc=true")
			.headers(headers_26)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0028_response.txt"))),
            http("request_29")
			.get(uri04 + "/624/cpsprodpb/BF3D/production/_90175984_theresamay_reuters.jpg")
			.headers(headers_5)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0029_response.txt"))),
            http("request_30")
			.get(uri04 + "/304/cpsprodpb/11662/production/_90166217_mediaitem90166216.jpg")
			.headers(headers_6)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0030_response.txt"))),
            http("request_31")
			.get(uri04 + "/304/cpsprodpb/10866/production/_90168676_777a48bf-5c4c-48e0-a4c4-4219d48e335c.jpg")
			.headers(headers_7)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0031_response.txt"))),
            http("request_32")
			.get(uri04 + "/304/ibroadcast/images/live/p0/3z/yz/p03zyzvz.jpg")
			.headers(headers_8)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0032_response.txt"))),
            http("request_33")
			.get(uri04 + "/304/cpsprodpb/CCDE/production/_90164425_epblurryde34.jpg")
			.headers(headers_9)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0033_response.txt"))),
            http("request_34")
			.get("https://" + uri01 + "/pagead/imgad?id=CICAgKDT64DvSBABGAEyCHiwLN7jQfr8")
			.headers(headers_27)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0034_response.txt"))),
            http("request_35")
			.get(uri23 + "/pagead/expansion_embed.js?source=safeframe")
			.headers(headers_35)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0035_response.txt"))),
            http("request_36")
			.get("http://" + uri01 + "/safeframe/1-0-4/html/container.html")
			.headers(headers_26)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0036_response.txt"))),
            http("request_37")
			.get("http://" + uri01 + "/safeframe/1-0-4/html/container.html")
			.headers(headers_26)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0037_response.txt"))),
            http("request_38")
			.get(uri13 + "/242928-2.js?&cb=0.7621850330720602&tk_st=1&rf=http%3A//www.bbc.com/&rp_s=c&tg_i.slot=leaderboard&p_pos=atf&p_screen_res=1366x768&ad_slot=52926_2")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0038_response.txt"))),
            http("request_39")
			.get(uri07 + "?cn=rsb&c=28&pli=18137946&PluID=0&w=88&h=31&ncu=$$https://adclick.g.doubleclick.net/pcs/click?xai=AKAOjstehijZsTl2nkuot7t6-TfgjSaavbRHrFvgtX4lRFFjAnBQ7f5x4-3IqccG1tkn3DeheDFp_n7Bm7WeBY9UxN-eM8_nOKLX3jbCO9qDQ8LVC4vKGDL1z9vzy2xHOOnuigbtnmaOw4h05VU1oPelELye5q9DC4LfjWhkiaz9FtOn1pDu6bsO4Ssa_m696WWIDd6T5FLOHFeQ-u-LA6WHql_sVcfp&sai=AMfl-YShjLqG0Y3EZ0QCZbyxZjyIg5a0vAjUop8m2SuATA4JjyrX4dlnZdV5hzgNVr3_FnLfIZGS6eoHPg&sig=Cg0ArKJSzGCF-uxcmVoCEAE&urlfix=1&adurl=$$&ord=1881246005&ucm=true")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0039_response.txt"))),
            http("request_40")
			.get(uri16 + "?ai=CujCC9hN2V9SHGpW3Wu78j4ALlq6zogKu15m1H8CNtwEQASAAYPvR-IKICoIBF2NhLXB1Yi0yODU1MDM0NDg2ODIwNjIxyAEJ4AIAqAMBqgSiAU_QtJU5miHAf-eMHU5E_cc5ditnVf_2jfX4fECT9U3aNGauJBXhoVCXm8t0yL0vw6cR0xMfIyVh1er7hbYsYsKgEMy7ddPCuB_pgNwRAk7ozABFevw_mFZYkaBAFmsg9taoWt4SapevbU7flvjP6zS9iAFztoyIPBzit93rtUKE-Ma8wBTzNQd9P7yF1aN3--OYj3uQDMQVsi6T0IfuQZWr_OAEAYAGivXQucfd3J4SoAYhqAemvhvYBwA&sigh=uInSv-gvQx8&vis=1")
			.headers(headers_27),
            http("request_41")
			.get(uri27 + "/ab?e=wqT_3QLfBfBE3wIAAAMA1gAFAQj3p9i7BRDbxa6QvsLFhxEYgZexy6DSyJJ-IAEqLQlVcC_YXMT_PxFVcC_YXMT_PxnD9Shcj8IiQCFVDRIAKREkqDCY6rEDOLUBQOEBSAJQ-saDF1jLsT1gAGjt7FR4wIcEgAEBigEDVVNEkgEBBqCYAawCoAH6AagBAbABALgBAsABBcgBANABANgBAOABAPABAPoBEjEwMAECYC00MTU5NTQxMzY2igJVdWYoJ2EnLCAxNDABBSQ2NzM1NjE1MSk7ARkocicsIDQ4MjkyNzNKHgAAYwE3FDM1NDM4NjoeAPCZkgLhASFVVERMWHdpMDA3b0dFUHJHZ3hjWUFDRExzVDB3QURnQVFBQkk0UUZRbU9xeEExZ0FZTWtIYUFCd0FIZ0FnQUVBaUFFQWtBRUJtQUVCb0FFQnFBRURzQUVBdVFFQUFBQUFBQUQ0UDhFQlZYQXYyRnpFX3pfSkFhWmVqQk5NSF9RXzJRR1RHQVJXRGkzb1AtQUJBUFVCQQE5qElBQ0FZZ0NzcDRYaUFLMW5oZVFBZ0tZQW9xRTNMSUJvQUlBcUFJQ3RRSUEBLwR2UQkIZDRBSUE2QUlBLUFJQWdBTUKaAiUhY0FseWNBNuQA6Hk3RTlJQUFvaW9UY3NnRS7YAvAG4ALA8DHqAgdiYmMuY29t8gINCgZBRFZfSUQSAzE0MPICEAoGQ1BHARA0BjUzNTg5NvICEQoFQ1ABEgAIMWXwc4ADAYgDAZADAJgDCaADAaoDALADALgDAMADrALIAwDYA_ijMeADAOgDAPgDA4AEAJIEBC9hZHiYBACiBAwxOTQuNzkuMTQ3LjCoBKbEBbIECAgAEAAYACAAuAQAwAQAyAQA0gQKMTAuMi44Ny4yMtoEAggB&s=d28efa69bdb3ea848c8d7901cebb09d9af1256f5&referrer=bbc.com&pp=V3YT9gAGg9QKFpuVAAP-boCxjRnKKVb2Fejh6Q&pubclick=https://adclick.g.doubleclick.net/aclk%3Fsa%3DL%26ai%3DCujCC9hN2V9SHGpW3Wu78j4ALlq6zogKu15m1H8CNtwEQASAAYPvR-IKICoIBF2NhLXB1Yi0yODU1MDM0NDg2ODIwNjIxyAEJ4AIAqAMBqgSiAU_QtJU5miHAf-eMHU5E_cc5ditnVf_2jfX4fECT9U3aNGauJBXhoVCXm8t0yL0vw6cR0xMfIyVh1er7hbYsYsKgEMy7ddPCuB_pgNwRAk7ozABFevw_mFZYkaBAFmsg9taoWt4SapevbU7flvjP6zS9iAFztoyIPBzit93rtUKE-Ma8wBTzNQd9P7yF1aN3--OYj3uQDMQVsi6T0IfuQZWr_OAEAYAGivXQucfd3J4SoAYhqAemvhvYBwA%26num%3D1%26sig%3DAOD64_0U6aWmQ42Hne-_aFnekYuLYy95kg%26client%3Dca-pub-2855034486820621%26adurl%3D")
			.headers(headers_27)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0041_response.txt"))),
            http("request_42")
			.get(uri13 + "/242928-15.js?&cb=0.47884246617702975&tk_st=1&rf=http%3A//www.bbc.com/&rp_s=c&tg_i.slot=mpu&p_pos=atf&p_screen_res=1366x768&ad_slot=52926_15")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0042_response.txt"))),
            http("request_43")
			.get(uri13 + "/243884-15.js?&cb=0.5084923608358535&tk_st=1&rf=http%3A//www.bbc.com/&rp_s=c&tg_i.slot=mpu_middle&p_pos=atf&p_screen_res=1366x768&ad_slot=52926_15")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0043_response.txt"))),
            http("request_44")
			.get(uri11 + "?callback=bumpDemiNetwork")
			.headers(headers_35)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0044_response.txt"))),
            http("request_45")
			.get(uri04 + "/800/cpsprodpb/9FC0/production/_90169804_mediaitem90169803.jpg")
			.headers(headers_45)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0045_response.txt"))),
            http("request_46")
			.get(uri15 + "/i/a.js;p=11297200837936;idfa=;idfa_lat=;aaid=;aaid_lat=;qpb=1;cache=1967327997?&tmad=c&tmcampid=77&s_dscid=DSINF_P5_48292730_C_13543860&click=http%3A%2F%2Fad.adlegend.com%2Fclick.ng%3Fspacedesc%3D21746486_21746484_1x1_21746485_21746486%26af%3D21746448%26ml_pbi%3D-21746486%26ml_camp%3D21746447%26ml_crid%3D21746541%26x_pubid%3Diapn%26x_cmpid%3D13543860%26x_stuffid%3Daid_1229225497948037851%26x_crid%3D48292730%26click%3Dhttps%3A%2F%2Fsecure-ams.adnxs.com%2Fclick%3FuB6F61G4-j-4HoXrUbj6P8P1KFyPwiJAVXAv2FzE_z9VcC_YXMT_P9uiC-ITFg8RgUtsCZIiJX73E3ZXAAAAABh1bAC1AAAA4QAAAAIAAAB64-ACy1gPAAAAAQBVU0QAVVNEACwB-gBtNgAAAAABAgUAAQAAAKoAziYt7AAAAAA.%2Fcnd%3D%2521cAlycAi007oGEPrGgxcYy7E9IAAoioTcsgE.%2Fbn%3D66496%2Freferrer%3Dbbc.com%2Fclickenc%3Dhttps%253A%252F%252Fadclick.g.doubleclick.net%252Faclk%253Fsa%253DL%2526ai%253DCujCC9hN2V9SHGpW3Wu78j4ALlq6zogKu15m1H8CNtwEQASAAYPvR-IKICoIBF2NhLXB1Yi0yODU1MDM0NDg2ODIwNjIxyAEJ4AIAqAMBqgSiAU_QtJU5miHAf-eMHU5E_cc5ditnVf_2jfX4fECT9U3aNGauJBXhoVCXm8t0yL0vw6cR0xMfIyVh1er7hbYsYsKgEMy7ddPCuB_pgNwRAk7ozABFevw_mFZYkaBAFmsg9taoWt4SapevbU7flvjP6zS9iAFztoyIPBzit93rtUKE-Ma8wBTzNQd9P7yF1aN3--OYj3uQDMQVsi6T0IfuQZWr_OAEAYAGivXQucfd3J4SoAYhqAemvhvYBwA%2526num%253D1%2526sig%253DAOD64_0U6aWmQ42Hne-_aFnekYuLYy95kg%2526client%253Dca-pub-2855034486820621%2526adurl%253D")
			.headers(headers_27)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0046_response.txt"))),
            http("request_47")
			.get(uri17 + "/surly.js?;ad_wxh=300x250;coid=650;nid=1964;")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0047_response.txt"))),
            http("request_48")
			.get(uri27 + "/rd_log?e=wqT_3QKWCfB-lgQAAAMA1gAFAQj3p9i7BRDbxa6QvsLFhxEYgZexy6DSyJJ-IAEqLQm4HoXrUbj6PxG4HoXrUbj6PxnD9Shcj8IiQCFVcC_YXMT_PylVcC_YXMT_PzCY6rEDOLUBQOEBSAJQ-saDF1jLsT1gAGjt7FR4wIcEgAEBigEDVVNEkgUG8DyYAawCoAH6AagBAbABALgBAsABBcgBANABANgBAOABAOoB6gNodHRwczovL2FkY2xpY2suZy5kb3VibGVjBQ70EAJuZXQvYWNsaz9zYT1MJmFpPUN1akNDOWhOMlY5U0hHcFczV3U3OGo0QUxscTZ6b2dLdTE1bTFIOENOdHdFUUFTQUFZUHZSLUlLSUNvSUJGMk5oTFhCMVlpMHlPRFUxTURNME5EZzJPREl3TmpJeHlBRUo0QUlBcUFNQnFnU2lBVV9RdEpVNW1pSEFmLWVNSFU1RV9jYzVkaXRuVmZfMmpmWDRmRUNUOVUzYU5HYXVKQlhob1ZDWG04dDB5TDB2dzZjUjB4TWZJeVZoMWVyN2hiWXNZc0tnRU15N2RkUEN1Ql9wZ053UkFrN296QUJGZXZ3X21GWllrYUJBRm1zZzl0YW9XdDRTYXBldmJVN2ZsdmpQNnpTOWlBRnp0b3lJUEJ6aXQ5M3J0VUtFLU1hOHdCVHpOUWQ5UDd5RjFhTjMtLU9ZajN1UURNUVZzaTZUMElmdVFaV3JfT0FFQVlBR2l2WFF1Y2ZkM0o0U29BWWhxQWVtdmh2WUJ3QSZudW09MSZzaWc9QU9ENjRfMFU2YVdtUTQySG5lLV9hRm5la1l1TFl5OTVrZyZjbGllbnQ9Y2EtcHViLTI4NTUwMzQ0ODY4MjA2MjEmYWR1cmw98AEA-gESMTAwMDAwMC00MTU5NTQxMzY2igJVdWYoJ2EnLCAxNDAsIDE0NjczNTYxNTEpO3VmKCdyJywgNDgyOTI3MzAsQh4ALGMnLCAxMzU0Mzg2MAFBCDY3Mw088JmSAuEBIVVURExYd2kwMDdvR0VQckdneGNZQUNETHNUMHdBRGdBUUFCSTRRRlFtT3F4QTFnQVlNa0hhQUJ3QUhnQWdBRUFpQUVBa0FFQm1BRUJvQUVCcUFFRHNBRUF1UUVBQUFBQUFBRDRQOEVCVlhBdjJGekVfel9KQWFaZWpCTk1IX1FfMlFHVEdBUldEaTNvUC1BQkFQVUJBATmoSUFDQVlnQ3NwNFhpQUsxbmhlUUFnS1lBb3FFM0xJQm9BSUFxQUlDdFFJQQEvBHZRCQhkNEFJQTZBSUEtQUlBZ0FNQpoCJSFjQWx5Y0E25ADwlnk3RTlJQUFvaW9UY3NnRS7YAvAG4ALA8DHqAgdiYmMuY29tgAMBiAMAkAMAmAMJoAMBqgMAsAMAuAMAwAOsAsgDANgD-KMx4AMA6AMA-AMDgAQAkgQEL2FkeJgEAKIEDDE5NC43OS4xNDcuMKgEpsQFsgQICAAQABgAIAC4BADABADIBADSBAoxMC4yLjg3LjIy2gQCCAE.&s=942704ee63ff4a8c04b09d2a85e4e81a23f54bcd&referrer=bbc.com&bdref=http%3A%2F%2Fwww.bbc.com%2F&bdtop=true&bdifs=1&bstk=http%3A%2F%2Fwww.bbc.com%2F,http%3A%2F%2Ftpc.googlesyndication.com%2Fsafeframe%2F1-0-4%2Fhtml%2Fcontainer.html%23xpc%3Dsf-gdn-exp-2%26p%3Dhttp%253A%2F%2Fwww.bbc.com&")
			.headers(headers_27),
            http("request_49")
			.get(uri08 + "/image?spacedesc=21746486_21746484_1x1_21746485_21746486&x_pubid=iapn&x_cmpid=13543860&x_crid=48292730&x_stuffid=aid_1229225497948037851&random=2047904749")
			.headers(headers_27),
            http("request_50")
			.get(uri31 + "")
			.headers(headers_27)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0050_response.txt"))),
            http("request_51")
			.get(uri15 + "/d/img;p=11297200837936;as=0;a=11297200837925;crs=11297200837891;cr=11297200839199")
			.headers(headers_27)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0051_response.txt"))),
            http("request_52")
			.get(uri23 + "/activeview?avi=BrwkJ9hN2V4y0FYKpbKCRuJADAAAAABABOAHIAQnAAgLgAgDgBAGgBhY&cid=CAASFeRoEyDeeKyTjPjWU-EnBE2dBfgT3A&id=osdim&ti=1&adk=1473563476&p=0,0,0,0&tos=0,0,0,0,0&mtos=0,0,0,0,0&rs=3&ht=0&mc=0&lte=-1&bas=0&bac=0&fp=correlator%3D3333335976795723%26eid%3D108809080%26iu%3D%252F4817%252Fbbccom.live.site.www%252Fbbc_homepage_int%26oid%3D3%26url%3Dhttp%253A%252F%252Fwww.bbc.com%252F&afp=%26output%3Djson_html%26impl%3Dfif%26dt%3D1467356150256%26adx%3D0%26ady%3D0%26ifi%3D3%26flash%3D0&r=u&bs=1287,421&bos=1301,744&ps=1287,7734&ss=1366,768&tt=1184&pt=-1&deb=1-0-6-4-6--1&tvt=835&uc=1&tgt=nf&cl=0")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0052_response.txt"))),
            http("request_53")
			.get(uri10 + "?adloox_transaction_id=1229225497948037851&bp=1.98544&visite_id=31308024582&client=infectiousmedia_adnxs&id_editeur=769724_ADLOOX_ID_13543860_ADLOOX_ID_48292730_ADLOOX_ID_300x250_ADLOOX_ID_7107864_ADLOOX_ID_140_ADLOOX_ID_181_ADLOOX_ID_535896&type=regie_quotidienne&banniere=ban_infectiousmedia_adnxs&campagne=cmp_infectiousmedia_adnxs&adv=140&os=&navigateur=&appname=Netscape&timezone=-120&fai=SafeFrame%20Container&alerte=&alerte_desc=&data=-2070850623tttttttftffffffttfffffffffffttfff&js=undefined&fw=1&version=2&iframe=1&hadnxs=9089709433535875969&plat=12&ua=Mozilla/5.0%20%28X11%3B%20Ubuntu%3B%20Linux%20x86_64%3B%20rv%3A47.0%29%20Gecko/20100101%20Firefox/47.0&url_referrer=http%3A//www.bbc.com/&referer2=debug1http%3A//tpc.googlesyndication.com/safeframe/1-0-4/html/container.html%23xpc%3Dsf-gdn-exp-2%26p%3Dhttp%253A//www.bbc.com&fake=001000&errors=")
			.headers(headers_27)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0053_response.txt"))),
            http("request_54")
			.get(uri18 + "")
			.headers(headers_35),
            http("request_55")
			.get(uri23 + "/activeview?avi=BOoSX9hN2V460FYKpbKCRuJADAAAAABABOAHIAQnAAgLgAgDgBAGgBhY&cid=CAASFeRotWKTqjKlaXaaAJUAaCIj5JXv7g&id=osdim&ti=1&adk=983873362&p=0,0,0,0&tos=0,0,0,0,0&mtos=0,0,0,0,0&rs=3&ht=0&mc=0&lte=-1&bas=0&bac=0&fp=correlator%3D3333335976795723%26eid%3D108809080%26iu%3D%252F4817%252Fbbccom.live.site.www%252Fbbc_homepage_int%26oid%3D3%26url%3Dhttp%253A%252F%252Fwww.bbc.com%252F&afp=%26output%3Djson_html%26impl%3Dfif%26dt%3D1467356150263%26adx%3D0%26ady%3D0%26ifi%3D5%26flash%3D0&r=u&bs=1287,421&bos=1301,744&ps=1287,7734&ss=1366,768&tt=1537&pt=-1&deb=1-0-6-5-7--1&tvt=1188&uc=1&tgt=nf&cl=0")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0055_response.txt"))),
            http("request_56")
			.get(uri23 + "/activeview?avi=BLih49hN2V4-0FYKpbKCRuJADAAAAABABOAHIAQnAAgLgAgDgBAGgBhY&cid=CAASFeRoE-AcaaISuKtOjk08zYSVDCXFqg&id=osdim&ti=1&adk=1934112023&p=0,0,0,0&tos=0,0,0,0,0&mtos=0,0,0,0,0&rs=3&ht=0&mc=0&lte=-1&bas=0&bac=0&fp=correlator%3D3333335976795723%26eid%3D108809080%26iu%3D%252F4817%252Fbbccom.live.site.www%252Fbbc_homepage_int%26oid%3D3%26url%3Dhttp%253A%252F%252Fwww.bbc.com%252F&afp=%26output%3Djson_html%26impl%3Dfif%26dt%3D1467356150266%26adx%3D0%26ady%3D0%26ifi%3D6%26flash%3D0&r=u&bs=1287,421&bos=1301,744&ps=1287,7734&ss=1366,768&tt=1537&pt=-1&deb=1-0-6-5-7--1&tvt=1188&uc=1&tgt=nf&cl=0")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0056_response.txt"))),
            http("request_57")
			.get(uri17 + "/ba.html?d803588")
			.headers(headers_26)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0057_response.txt"))),
            http("request_58")
			.post(uri27 + "/vevent?e=wqT_3QLNCfB-zQQAAAMA1gAFAQj3p9i7BRDbxa6QvsLFhxEYgZexy6DSyJJ-IAEqLQm4HoXrUbj6PxG4HoXrUbj6PxnD9Shcj8IiQCFVcC_YXMT_PylVcC_YXMT_PzCY6rEDOLUBQOEBSAJQ-saDF1jLsT1gAGjt7FR4wIcEgAEBigEDVVNEkgUG8DyYAawCoAH6AagBAbABALgBAsABBcgBANABANgBAOABAOoB6gNodHRwczovL2FkY2xpY2suZy5kb3VibGVjBQ70EAJuZXQvYWNsaz9zYT1MJmFpPUN1akNDOWhOMlY5U0hHcFczV3U3OGo0QUxscTZ6b2dLdTE1bTFIOENOdHdFUUFTQUFZUHZSLUlLSUNvSUJGMk5oTFhCMVlpMHlPRFUxTURNME5EZzJPREl3TmpJeHlBRUo0QUlBcUFNQnFnU2lBVV9RdEpVNW1pSEFmLWVNSFU1RV9jYzVkaXRuVmZfMmpmWDRmRUNUOVUzYU5HYXVKQlhob1ZDWG04dDB5TDB2dzZjUjB4TWZJeVZoMWVyN2hiWXNZc0tnRU15N2RkUEN1Ql9wZ053UkFrN296QUJGZXZ3X21GWllrYUJBRm1zZzl0YW9XdDRTYXBldmJVN2ZsdmpQNnpTOWlBRnp0b3lJUEJ6aXQ5M3J0VUtFLU1hOHdCVHpOUWQ5UDd5RjFhTjMtLU9ZajN1UURNUVZzaTZUMElmdVFaV3JfT0FFQVlBR2l2WFF1Y2ZkM0o0U29BWWhxQWVtdmh2WUJ3QSZudW09MSZzaWc9QU9ENjRfMFU2YVdtUTQySG5lLV9hRm5la1l1TFl5OTVrZyZjbGllbnQ9Y2EtcHViLTI4NTUwMzQ0ODY4MjA2MjEmYWR1cmw98AEA-gESMTAwMDAwMC00MTU5NTQxMzY2igJVdWYoJ2EnLCAxNDAsIDE0NjczNTYxNTEpO3VmKCdyJywgNDgyOTI3MzAsQh4ALGMnLCAxMzU0Mzg2MAFBCDY3Mw088JmSAuEBIVVURExYd2kwMDdvR0VQckdneGNZQUNETHNUMHdBRGdBUUFCSTRRRlFtT3F4QTFnQVlNa0hhQUJ3QUhnQWdBRUFpQUVBa0FFQm1BRUJvQUVCcUFFRHNBRUF1UUVBQUFBQUFBRDRQOEVCVlhBdjJGekVfel9KQWFaZWpCTk1IX1FfMlFHVEdBUldEaTNvUC1BQkFQVUJBATmoSUFDQVlnQ3NwNFhpQUsxbmhlUUFnS1lBb3FFM0xJQm9BSUFxQUlDdFFJQQEvBHZRCQhkNEFJQTZBSUEtQUlBZ0FNQpoCJSFjQWx5Y0E25ADoeTdFOUlBQW9pb1Rjc2dFLtgC8AbgAsDwMeoCB2JiYy5jb23yAg0KBkFEVl9JRBIDMTQw8gIQCgZDUEcBEDQGNTM1ODk28gIRCgVDUAESAAgxZfBzgAMBiAMAkAMAmAMJoAMBqgMAsAMAuAMAwAOsAsgDANgD-KMx4AMA6AMA-AMDgAQAkgQEL2FkeJgEAKIEDDE5NC43OS4xNDcuMKgEpsQFsgQICAAQABgAIAC4BADABADIBADSBAoxMC4yLjg3LjIy2gQCCAE.&s=d5af71f4ff89b95d9bafc6432f85ae7b1b22f7b6&referrer=bbc.com&type=nv&nvt=5&sid=1467356153617286705&sw=1366&sh=768&pw=300&ph=250&ww=300&wh=250&ft=3&sv=42&tv=view5-1s&ua=gecko40&pl=linux&x=1467356153617286705,429999,v,linux,gecko40,view5-1s,0,,3")
			.headers(headers_0),
            http("request_59")
			.get(uri08 + "/xl/PROD/21746447/creatives.14197/txt.gif")
			.headers(headers_27)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0059_response.txt"))),
            http("request_60")
			.get(uri17 + "/icon/c_90_us.png")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0060_response.txt"))),
            http("request_61")
			.get(uri26 + "?v=d803588_1&ttid=2&d=tpc.googlesyndication.com&r=0.11622543269776386"),
            http("request_62")
			.get(uri03 + "/optout_check?callback=Krux.ns._default.kxjsonp_optOutCheck")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0062_response.txt"))),
            http("request_63")
			.get(uri22 + "/userdata/get?pub=5d7aaa39-eeed-454f-bb7d-ecea38d770fc&callback=Krux.ns._default.kxjsonp_userdata")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0063_response.txt"))),
            http("request_64")
			.get(uri06 + "?bid=i0r4o4v&uid=KhdvKBQp")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0064_response.txt"))),
            http("request_65")
			.get(uri09 + "?sid=9212244187&_kdpid=2111c0af-fc3a-446f-ab07-63aa74fbde8e")
			.headers(headers_35),
            http("request_66")
			.get(uri20 + "/frameworks/barlesque/3.20.0/orb/4/img/bbc-blocks-dark.png")
			.headers(headers_66)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0066_response.txt"))),
            http("request_67")
			.get(uri22 + "/partnerjs/xdi/proxy.7026386e19f2b43fb687c0f795a87794.html")
			.headers(headers_26)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0067_response.txt"))),
            http("request_68")
			.get(uri28 + "?_kdpid=e4942ff0-4070-4896-a7ef-e6a5a30ce9f9&buid=KhdvKBQp&p=204&g=270&j=0")
			.headers(headers_35),
            http("request_69")
			.get(uri03 + "/pixel.gif?source=smarttag&fired=user_data_timeout&confid=JA8mItOH&_kpid=5d7aaa39-eeed-454f-bb7d-ecea38d770fc&_kcp_s=BBC.com%20Homepage&_kcp_d=www.bbc.com&_knifr=14&_kpref_=http%3A%2F%2Fwww.bbc.co.uk%2F&_kua_kx_tz=-120&geo_country=FR&geo_dma=0&_kua_kx_lang=fr&_kua_kx_tech_browser_language=fr&_kua_kx_geo_country=FR&_kua_kx_geo_dma=0&_kua_kx_tech_browser=Firefox%204&_kua_kx_tech_manufacturer=Other&_kua_kx_tech_device=Computer&_kua_kx_tech_os=Linux&_kua_kx_whistle=0&_kpa_cb_title=Homepage%20-%20international&_kpa_cb_path=%2F%3Finternational&t_navigation_type=1&t_dns=0&t_tcp=0&t_http_request=-1&t_http_response=0&t_content_ready=1982&t_window_load=6392&t_redirect=0&interchange_ran=true&store_user=qou248qez&userdata_was_requested=true&userdata_did_respond=true&store_user_after=qou248qez&userdata_user=KhdvKBQp%2Cqou248qez&sview=2&kplt0=67842&kplt2=34358&kplt3=29292&kplt4=29293&kplt5=29294&kplt6=35500&kplt7=43697&kplt8=59095&kplt9=49625&kplt10=48940&kplt11=43732&jsonp_requests=%2F%2Fbeacon.krxd.net%2Foptout_check%2C377%2C%2F%2Fcdn.krxd.net%2Fuserdata%2Fget%2C384"),
            http("request_70")
			.get(uri22 + "/controltag?confid=JA8mItOH")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0070_response.txt"))),
            http("request_71")
			.get(uri03 + "/data.gif?_kdpid=2111c0af-fc3a-446f-ab07-63aa74fbde8e&_kua_seg=000&_kua_zip=&_kua_age=&_kua_gender=&_k_adadvisor_key=164361101959000178230")
			.headers(headers_35),
            http("request_72")
			.get(uri22 + "/ctjs/controltag.js.726d287890a4d2c520d4a7a450e210ea")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0072_response.txt"))),
            http("request_73")
			.get(uri19 + "")
			.headers(headers_73)
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0073_response.txt"))),
            http("request_74")
			.get("http://" + uri01 + "/safeframe/1-0-4/html/container.html")
			.headers(headers_74)))
		.pause(28)
		.exec(http("request_75")
			.get("/ping?h=bbc.co.uk&p=%2F%3Finternational&u=DkzkGIBPyR22lisnA&d=bbc.com&g=50924&g0=Homepage%2C%20Homepage%20-%20international&n=1&f=00001&c=0.5&x=0&m=0&y=7765&o=1287&w=421&j=60&R=0&W=0&I=1&E=0&e=0&r=http%3A%2F%2Fwww.bbc.co.uk%2F&b=5815&t=DX6FdUCyYlrlCeSJ-CCYa3u1VGs4h&V=79&tz=-120&sn=2&EE=0&_")
			.check(bodyBytes.is(RawFileBody("RecordedSimulationh2g2_0075_response.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}