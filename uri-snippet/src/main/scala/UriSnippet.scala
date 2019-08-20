import akka.http.scaladsl.model.Uri
import akka.http.scaladsl.model.Uri.{Authority, Host, Query}

object UriSnippet extends App {
  val uri: Uri = Uri("http://example.pigumer.com/foo?bar=baz")
  println(uri)
  val authority = Authority(Host("test.pigumer.com"), 443)
  val uri2 = uri.withScheme("https").withAuthority(authority).withQuery(Query("hoge" -> "fuga"))
  println(uri2)
}
