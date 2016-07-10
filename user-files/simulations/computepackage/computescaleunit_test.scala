package io.gatling.funspec.example


import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.funspec.GatlingHttpFunSpec
import io.gatling.funspec.example.GatlingFunSpecExample._
import scala.util.Random

class GatlingFunSpecExample extends GatlingHttpFunSpec{
	val baseURL = "http://computer-database.gatling.io"
 override def httpConf = super.httpConf.header("MyHeader", "MyValue")	
	
	spec {
		http("Example index.html test")
		.get("/")
		//.check(h1.exists)
		/*.check(status.is(200))
		.check(substring("CPC").count.saveAs("Substring"))
		.check(currentLocation.saveAs("currentLocation"))
		.check(regex("""https://(.*)/.*"""").count.saveAs("Https")*/
		//)
		
	}
	
	

		spec{
		http("Catalogue2")
		.get("/computers")
		.check(status.exists)
	

	}
	
}

object GatlingFunSpecExample{
	
	def h1= css("h1")


}
