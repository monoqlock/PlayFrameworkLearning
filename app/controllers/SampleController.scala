package controllers

import play.api._
import play.api.mvc._

/**
 * Created by a13180 on 2015/11/04.
 */
object SampleController extends Controller {

  def sample1 = Action {
    Ok(views.html.index("Sample Controller#sample1"))
  }

  def sample2 = Action {
    Ok(views.html.index("Sample Contoroller#sample2"))
  }
}
