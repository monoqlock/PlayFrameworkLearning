package controllers

import play.api._
import play.api.libs.iteratee.Enumerator
import play.api.mvc._

/**
 * Created by a13180 on 2015/11/04.
 */
object SampleController extends Controller {

  def sample1 = Action {
    Ok(views.html.index("Sample Controller#sample1"))
  }

//  def sample1 = Action {
//    SimpleResult(
//      header = ResponseHeader(200, Map(CONTENT_TYPE -> "text/html")),
//      body = Enumerator(views.html.index("Sample Controller#sample1"))
//    )
//  }

  def sample2 = Action {
    Ok(views.html.index("Sample Contoroller#sample2"))
  }

  def redirect1 = Action {
    Redirect("/sample1")
  }

  def redirect2 = Action {
    Redirect("http://www.atmarkit.co.jp/")
  }

  def sample3(id: Long) = Action {
    Ok(views.html.index("id:" + id))
  }

  def sample4(path: String) = Action {
    Ok(views.html.index(path))
  }

}
