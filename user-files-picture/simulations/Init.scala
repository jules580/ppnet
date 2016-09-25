package test4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import Trait._

	
	object Init2 extends Trait{
		
// Si cela ne fonctionne pas le boolean est directement au niveau de la console qui envoie une connexion refuse
		val init2=exec(http("matrix page")
			.get(uri2 + "?")
			.headers(headers_0)
			.check(jsonPath("$..type").saveAs("Sucess")))
		.pause(15)
	
		.exec(http("matrix page2")
			.get(uri2 + "?")
			.headers(headers_0)
			.resources(http("matrix page 3")
			.get(uri2 + "?")
			.headers(headers_0)
			.check(status.is(200)))
			.check(status.is(200)))
		.pause(18)
		.exec(http("login page")
			.get(url+"/_matrix/client/r0/login?")
			.headers(headers_0)
			.check(status.is(200)))
		.pause(7)
		}
