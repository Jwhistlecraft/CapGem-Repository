package controllers

import javax.inject.Inject

import models.CD
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._

class Application @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def listCDs = Action { implicit request =>
    Ok(views.html.listCDs(CD.cds, CD.createCDForm))
  }

  def editCD(index: Int):  Action[AnyContent] = Action { implicit request =>
    val cd = CD.cds(index)
    val cdData = CD(Some(index),
      cd.title,
      cd.genre,
      cd.artist,
      cd.starRating,
      cd.price)
    Ok(views.html.listCDs(CD.cds, CD.createCDForm.fill(cdData)))
  }

  def createCD = Action { implicit request =>
    val postAction = request.body.asFormUrlEncoded.get("action").head
    val formValidationResult = CD.createCDForm.bindFromRequest
    formValidationResult.fold({ formWithErrors =>
      BadRequest(views.html.listCDs(CD.cds, formWithErrors)) //form with errors
    }, { cdData =>
      println("postAction is " + postAction)
      if (cdData.index.get != -1 && postAction == "save") {
        println("in edit")
        CD.cds.update(cdData.index.get, cdData)
      } else if (cdData.index.get != -1 && postAction == "delete") {
        println("in delete")
        CD.cds.remove(cdData.index.get)
      } else {
        println("in create")
        CD.cds.append(cdData)
      }

      Redirect(routes.Application.listCDs)
    })
  }


}
