package controllers

import play.api._
import play.api.mvc._

/**
 * Created by a13180 on 2015/11/06.
 */
object TemplateController extends Controller {

  def show = Action {
    val list = List[String]("lemon","mikan","nanao")
    Ok(views.html.show("Hello Scala Templates!",list))

  }

}
