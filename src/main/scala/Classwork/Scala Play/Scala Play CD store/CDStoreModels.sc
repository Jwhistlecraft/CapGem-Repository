package models

import play.api.data._
import play.api.data.Forms._

import scala.collection.mutable.ArrayBuffer

case class CD(index:Option[Int],
              title: String,
              genre:String,
              artist:String,
              starRating:Int,
              price: Int)

//case class SelectCD(title:String)

object CD {

  val createCDForm = Form(
    mapping(
      "index" -> optional(number),
      "title" -> nonEmptyText,
      "genre" -> nonEmptyText,
      "artist" -> nonEmptyText,
      "starRating" -> number(min = 0, max = 5),
      "price" -> number(min = 0, max = 1000)
    )
    (CD.apply)(CD.unapply)
  )

  val cds: ArrayBuffer[CD] = ArrayBuffer[CD]()

}
