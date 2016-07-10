import scala.concurrent.duration._
import java.util.concurrent.ThreadLocalRandom
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class computesale18 extends Simulation {

	val httpProtocol = http
		.baseURL("http://computer-database.gatling.io")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.ico"""), WhiteList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate, sdch")
		.acceptLanguageHeader("fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")

	val headers_0 = Map(
		"Header-RootMe-Admin" -> "true",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_3 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Header-RootMe-Admin" -> "true",
		"Origin" -> "http://computer-database.gatling.io",
		"Upgrade-Insecure-Requests" -> "1")

	object Search{
		// Pour justement en soit directement la partir justement sur le json qui est mise en place et la partie sur le map  oiu justement en soit directement la partie sur l'array, on a justement que si nos données sont justement du même tyoe on a justement en soit directement la mise en place justement d'un indice en plus justement à prendre justement en compte
	//val feeder = jsonFile("foo.json").random

 val feeder = csv("search.csv").random // 1, 2
 // si on a justement en soit la mise en pace justement de la partie sur le json ou sur les différent arry on a justement en sit que le système va justement rajouer un inddice justement à chaque fois c'est justement pour cela que la méthode justelent de csv est justelent en soit un e méthode ui est justement ieux et qui est justement et diretdment plus adpater
//val feeder = Iterator.continually(Map("searchCriterion"->"Macbook","searchComputerName"->"MacBook Pro","searchCriterion"->"eee","searchComputerName"->"ASUS Eee PC 1005PE"))

     val percentage1=95.0
val percentage2=5.0
 val chain1 = 

 exec(session => {
	            println("test")
	            session
	            }
	            )
	            .exec(session => {
					println("test2")
					session
				}
				)
			

val chain2 = exec(session => {
	         println("test3")
	         session
		 }
		 ).
		 exec(session => {
			 println("test4")
			 session 
		 }
		 )
		
  val search = 
  repeat(1,"m"){
 exec(http("Home")
    .get("/"))
  
    .pause(1)
    .feed(feeder) // 3
    .exec(http("Search ${m}")
    .get("/computers?f=${searchCriterion}") 
    .check(css("a:contains('${searchComputerName}')", "href").saveAs("computerURL"))
    .check(status.is(200).saveAs("teststatus"))
    .check (currentLocation.saveAs("currentLocation"))
    //.check (header("true").saveAs("Header"))
    .check(responseTimeInMillis.saveAs("ReponseTime"))
    .check(substring("CPC").count.saveAs("Substring"))
    .check(status.is(200))
    .check(regex("""https://(.*)/.*"""").count.saveAs("Https"))
    
    //.check(bodyString.saveAs("bodystring"))
    //.check(bodyBytes.saveAs("bodybytes")))
    )
	 .exec(http("Select")
    .get("${computerURL}")) // 
	   .pause(1)		 
	 .roundRobinSwitch(
	 //tryMax(5,"test"){
chain1,
//},
  chain2

   )
 	
 
	.exec( session =>{
	
	println("test:" +session)
	println("test5':"+session("searchComputerName").as[String])


	session
	})
}


   
		
	}

		object Browse{
			
		val browse = 
		repeat(5,"n"){
			exec(http("Page ${n}")
			.get("/computers?p=${n}"))
			
			.pause(1)
}

		}
	object Edit{
		val edit = exec(http("Edite")
			.get("/computers/new"))
		.pause(1)
		.exec(http("Post")
			.post("/computers")
			.headers(headers_3)
			.formParam("name", "amstrad cpc")
			.formParam("introduced", "1985-10-08")
			.formParam("discontinued", "1990-10-09")
			.formParam("company", "38"))

	}	
	
  val admins = scenario("Admins").exec(Search.search, Browse.browse, Edit.edit)
   

/*	setUp(
	admins.inject(rampUsers(500) over (10 seconds)).throttle(reachRps(10) in (10 seconds), holdFor(10 seconds))
	).protocols(httpProtocol)*/
	
setUp(
	admins.inject(
	rampUsers(10) over (5 seconds)) 
	)
.assertions(
	global.responseTime.max.lessThan(50),
	forAll.failedRequests.count.lessThan(5),
	details("Edite").successfulRequests.percent.greaterThan(90)
	)
	.protocols(httpProtocol)
	

	
	
	
}
