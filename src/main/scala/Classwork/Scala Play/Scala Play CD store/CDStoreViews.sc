@(cds: Seq[CD], form: Form[CD])(implicit messages: Messages)



@main("CDs") {


  <h1>CDs</h1>
    <table>
      <thead>
        <tr><th>Title </th><th>Genre </th><th>Artist </th><th>Star Rating </th><th>Price(£) </th></tr>
      </thead>
      <td>
        @for((cd, index) <- cds.zipWithIndex) {
        <tr><td>@cd.title </td><td>@cd.genre </td><td>@cd.artist </td><td>@cd.starRating </td><td>@cd.price </td><td><a href="@routes.Application.editCD(index)">edit</a></td></tr>

        }
      </tbody>
      </table>




      <hr/>


      @helper.form(routes.Application.createCD()) {
      <input type="hidden" name="index" value="@form.data.getOrElse("index", -1)"/>
  @helper.inputText(form("title"), '_label -> "title", '_showConstraints -> false)
  @helper.inputText(form("genre"), '_label -> "genre", '_showConstraints -> false)
  @helper.inputText(form("artist"), '_label -> "artist", '_showConstraints -> false)
  @helper.inputText(form("starRating"), '_label -> "star rating", '_showConstraints -> false)
  @helper.inputText(form("price"), '_label -> "Price" , '_showConstraints -> false)
  <button type="submit" name="action" value="save">save</button>
    <button type="submit" name="action" value="delete">delete</button>


  }



  }
