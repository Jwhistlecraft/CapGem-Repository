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

      val hasId = cdData.index.get != -1
      postAction match {
        case "save" if hasId => CD.cds.update(cdData.index.get, cdData)
        case "delete" if hasId => CD.cds.remove(cdData.index.get)
        case _ =>  CD.cds.append(cdData)
      }

      Redirect(routes.Application.listCDs)
    })
  }


}
