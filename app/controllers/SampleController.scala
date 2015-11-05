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
//    Ok(views.html.index("Sample Contoroller#sample2"))
    Redirect(routes.SampleController.sample1)
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

  // 引数に定数をとる
  def sample5(fixedValue: String) = Action {
    println("fixedValue=" + fixedValue)
    Ok(views.html.index("fixedValue: " + fixedValue))
  }

  // 引数にデフォルト値をとる
  def sample6(defaultValue: Int) = Action {
    println("defaultValue=" + defaultValue)
    Ok(views.html.index("defaultValue: " + defaultValue))
  }

  def sample7(optValue: Option[String]) = Action {
    println("OptionValue=" + optValue)
    val res = optValue match {
      case Some(opt) => opt
      case None => "nothing"
    }
    Ok(views.html.index("optValue: " + res))
  }

}
