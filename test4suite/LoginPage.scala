 package test4
 
 import scala.concurrent.duration._
 
 import io.gatling.core.Predef._
 import io.gatling.http.Predef._
 import io.gatling.jdbc.Predef._
 import Trait._
 
 object LoginPage2 extends Trait{
	 val loginpage2=exec(http("Login PageBack")
			.get(url+"/_matrix/client/r0/login?")
			.headers(headers_14)
			.check(status.is(200)))
		}
 
