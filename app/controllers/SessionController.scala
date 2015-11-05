package controllers

import play.api.mvc.{Action, Controller}

/**
 * Created by a13180 on 2015/11/05.
 */
object SessionController extends Controller {

  // セッション
  def setSession = Action { implicit request =>
    Ok("save session.").withSession(session + ("date" -> new java.util.Date().toString))
  }

  def getSesstion = Action { implicit request =>
    session.get("date").map { date =>
      Ok("save session page access time:" + date)
    }.getOrElse {
      Ok("you have naver access in save session page.")
    }
  }

  // フラッシュスコープ
  def getFlash = Action { implicit request =>
    Ok {
      flash.get("msg").getOrElse("no msg!")
    }
  }

  def setFlash = Action {
    Redirect("/readFlash").flashing(
      "msg" -> "save Flash!"
    )
  }
}
