package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models._

/**
 * Created by a13180 on 2015/11/06.
 */
object UserController extends Controller {

  // Form定義
  val userForm = Form(
    mapping(
      "name" -> nonEmptyText,
      "email" -> text,
      "age" -> number
    )(User.apply)(User.unapply)
  )

  // 初期画面関数
  def entryInit = Action {
    val filedForm = userForm.fill(User("user name", "email address", 1))
    Ok(views.html.user.entry(filedForm))
  }

  // ユーザー登録関数
  def entrySubmit = Action { implicit request =>
//    val user = userForm.bindFromRequest.get
//    println(user)
//    Ok(views.html.user.entrySubmit())
    userForm.bindFromRequest.fold(
    errors => {
      println("ERROR")
      BadRequest(views.html.user.entry(errors))
    },
    success => {
      println("ENTRY SUCCESS!!")
      Ok(views.html.user.entrySubmit())
    })
  }
}
