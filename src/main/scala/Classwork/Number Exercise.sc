package Classwork.JavaScript.Scala

/**
  * Created by j_whi on 25/07/2017.
  */


/*Convert large numbers into sequences which contain the names for the numbers, for example ;
10,100,100 = 10 million 100 thousand and 100. Then convert these statements into the longer form
 french naming system
Coding quality review :
                          Codacy - A with 94%
                          Wart remover - 0 errors
                          Test coverage - 100% with no errors
                          Scala Style - 0 errors, 4 style warnings
Test suite is avaiable in my ScalaQuality repository at https://github.com/Jwhistlecraft/ScalaQuality.git
Personal note, after completing the program I became aware of how to do this recursively with less
repeated code. This is something I will be attempting to produce in my own time. Also, another method to reduce repeats
are helper functions, which I will also be looking into.
*/

object NumExercise extends App {

  def bigNum(bNum: Long): String = {
    val numStr = bNum.toString.reverse

    val ZERO = 0
    val THREE = 3
    val SIX = 6
    val NINE = 9
    val TWELVE = 12
    val FIFTEEN = 15
    val EIGHTEEN = 18
    val TWENTYONE = 21

    bNum match {

      case thousand if numStr.length > THREE & numStr.length <= SIX =>
        val thou = (numStr.substring (ZERO, THREE) + " dnasuoht " + numStr.substring (THREE, numStr.length)).reverse
        /*the above string(dnasouht) is thousand written backwards due to
         the string being reveresed.*/

        val thouFrench = thou.replace ("thousand", "mille")
        "English: " + thou + ", French: " + thouFrench


      case million if numStr.length > SIX & numStr.length <= NINE =>
        val mill = (numStr.substring (ZERO, THREE) + " dnasuoht " + numStr.substring (THREE, SIX) + " noillim " +
          numStr.substring (SIX, numStr.length) ).reverse

        val millFrench = mill.replace ("thousand", "mille")
        "English: " + mill + ", French: " + millFrench


      case billion if numStr.length > NINE & numStr.length <= TWELVE =>
        val bill = (numStr.substring (ZERO, THREE) + " dnasuoht " + numStr.substring (THREE, SIX) + " noillim " +
          numStr.substring (SIX, NINE) + " noillib " + numStr.substring (NINE, numStr.length)).reverse

        val billFrench = bill.replace ("thousand", "mille").replace ("billion", "milliard")
        "English: " + bill + ", French: " + billFrench


      case trillion if numStr.length > TWELVE & numStr.length <= FIFTEEN =>
        val trill = (numStr.substring (ZERO, THREE) + " dnasuoht " + numStr.substring (THREE, SIX) + " noillim " +
          numStr.substring (SIX, NINE) + " noillib " + numStr.substring (NINE, TWELVE) +
          " noillirt " + numStr.substring (TWELVE, numStr.length) ).reverse

        val trillFrench = trill.replace ("thousand", "mille").replace("billion", "milliard")
          .replace("trillion", "billion")
        "English: " + trill + ", French: " + trillFrench


      case quadrillion if numStr.length > FIFTEEN & numStr.length <= EIGHTEEN =>
        val quad = (numStr.substring(ZERO, THREE) + " dnasuoht " + numStr.substring (THREE, SIX) + " noillim " +
          numStr.substring (SIX, NINE) + " noillib " + numStr.substring (NINE, TWELVE) + " noillirt " +
          numStr.substring (TWELVE, FIFTEEN) + " noillirdauq " + numStr.substring (FIFTEEN, numStr.length)).reverse

        val quadFrench = quad.replace("thousand", "mille").replace("billion", "milliard").replace("trillion", "billion")
          .replace ("quadrillion", "billiard")
        "English: " + quad + ", French: " + quadFrench


      case quintillion if numStr.length > EIGHTEEN & numStr.length <= TWENTYONE =>
        val quin = (numStr.substring (ZERO, THREE) + " dnasuoht " + numStr.substring (THREE, SIX) + " noillim " +
          numStr.substring (SIX, NINE) + " noillib " + numStr.substring (NINE, TWELVE) + " noillirt " +
          numStr.substring (TWELVE, FIFTEEN) + " noillirdauq " + numStr.substring(FIFTEEN, EIGHTEEN) + " noillitniuq " +
          numStr.substring (EIGHTEEN, numStr.length) ).reverse

        val quinFrench = quin.replace ("thousand", "mille").replace ("billion", "milliard").replace("trillion", "billion")
          .replace ("quadrillion", "billiard").replace("quintillion", "trillion")
        "English: " + quin + ", French: " + quinFrench


      case _ => "invalid input"
    }
  }
}