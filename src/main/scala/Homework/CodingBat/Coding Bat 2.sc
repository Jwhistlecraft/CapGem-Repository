/* Return true if the given string contains between 1 and 3 'e' chars.*/

def stringE(string:String): Unit = {
  val countE = string.count(_ == 'e')
  if (countE > 0 && countE < 4) println(countE)
  else println("either too many or too few e's")
}

stringE("Hello")
stringE("Heelle")
stringE("Heelele")

/* Given a non-empty string and an int N, return the string made starting with char 0,
and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.*/

def everyNth(stringy:String, stepAmount:Int): Unit ={
  def iter(currentPos: Int) : String = currentPos match{
    case a if currentPos >= stringy.length => ""//do nothing
    case _ => stringy(currentPos) + iter(currentPos+stepAmount) //string(i) returns the char from string at position i
  }
  println(iter(0))
}

everyNth("Miracle", 2)
everyNth("abcdefg", 2)
everyNth("abcdefg", 3)

/* We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.*/

def monkeyTrouble(aSmile:Boolean, bSmile:Boolean): Boolean ={
  if ((aSmile && bSmile) || (!aSmile && !bSmile)) true
  else false
}

monkeyTrouble(true, true)
monkeyTrouble(false, false)
monkeyTrouble(true, false) /*note for future if i have more parameters that can be cleanly assessed using if/else
                            use a pattern match.*/

/*
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.*/

def parrotTrouble(naughty:Boolean, time: Int): Boolean = {
  (naughty, time) match {
    case x if (naughty == true && time < 7)  => true
    case y if (naughty == true && time > 20) => true
    case _ => false
  }
}

parrotTrouble(true, 6)
parrotTrouble(true, 7)
parrotTrouble(false, 6)
parrotTrouble(true, 22)

/*
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.*/

def posNeg(intA:Int, intB: Int, negative: Boolean): Boolean ={
  (intA, intB, negative) match {
    case a if ((intA < 0) && (intB > 0) && (!negative)) => true
    case b if ((intA > 0) && (intB < 0) && (!negative)) => true
    case c if ((intA < 0) && (intB < 0) && (negative)) => true
    case _ => false
  }
}

posNeg(1, -1, false)
posNeg(-1, 1, false)
posNeg(-4, -5, true)


/* Given a string, return a new string where the first and last chars have been exchanged.*/

def frontBack(string:String): Unit = {
  val front = string(0)
  val back = string(string.length-1)
  val middle = if (string.length > 3) string.substring(1,string.length-1) else "" // else "" is returning an empty string

  if (string.length > 3) println(back + middle + front)
  else println(back + front)

}
frontBack("code")
frontBack("a")
frontBack("ab")


/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
 se the % "mod" operator -- see Introduction to Mod*/

def or35(int:Int): Boolean={
  if (int %3 ==0 || int %5 == 5) true
  else false
}

or35(3)
or35(10)
or35(8)


/*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 given 2 int values, return true if one or the other is teen, but not both.*/

def loneTeen(intA:Int, intB:Int): Boolean ={
  (intA,intB) match {
    case x if intA >= 12 && intA <= 19 => true
    case y if intB >= 12 && intB <= 19 => true
    case _ => false
  }
}

loneTeen(13, 99)
loneTeen(21, 19)
loneTeen(13, 13)


/*Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z',
so "ozymandias" yields "oz".*/

def startOz(str: String): Unit ={
  var result = ""
  if (str.length >= 1 && str.charAt(0) == 'o') println(result + str.charAt(0))
  if (str.length >= 2 && str.charAt(1) == 'z') println(result + str.charAt(1))
}
startOz("ozymandias")
startOz("bzoo")
startOz("oxx")