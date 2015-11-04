package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    println("--------- START!!")
    Ok(views.html.index("Hello Play 2.0."))
  }

}