import scala.xml._
import java.net._
import scala.io.Source

val theUrl = "https://query.yahooapis.com/v1/public/yql?q=select+*+from+weather.forecast+where+woeid=12770744&format=xml"

val xmlString = Source.fromURL(new URL(theUrl)).mkString

println(xmlString)
