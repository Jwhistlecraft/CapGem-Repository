/*Given two temperatures, return true if one is less than 0,
and the other is greater than 100. */

def icyHot(temp1:Int, temp2:Int): Boolean = {
  (temp1, temp2) match {
    case a if (temp1 < 0 && temp2 >100) => true
    case b if (temp1 > 0 && temp2 <100) => true
    case _  => false
  }
}

icyHot(120, -1)
icyHot(-1, 120)
icyHot(2, 120)


/*Given 2 int values, return true if they are both in the range 30..40 inclusive,
 or they are both in the range 40..50 inclusive.*/

def in3050(int1:Int, int2:Int): Boolean = {
  (int1, int2) match {
    case a if (int1 >= 30 && int1 <= 40 && int2 >= 30 && int2 <= 40 ) => true
    case b if (int1 >= 40 && int1 <= 50 && int2 >= 40 && int2 <= 50 ) => true
    case _ => false
  }

}

in3050(30, 31)
in3050(30, 41)
in3050(40, 50)


/*Given two non-negative int values, return true if they have the same last digit,
such as with 27 and 57. Note that the % "mod" operator computes remainders,
so 17 % 10 is 7. */

def lastDigit(int1:Int, int2:Int):Boolean ={
  var int1ToString = int1.toString
  var int2ToString= int2.toString

  if (int1ToString.last == int2ToString.last) true
  else false

}

lastDigit(7, 17)
lastDigit(6, 17)
lastDigit(3, 113)

/*Given two int values, return their sum. Unless the two values are the same,
then return double their sum.*/

def sumDouble(int1:Int, int2:Int):Unit ={
  (int1, int2) match {
    case a if (int1 == int2) => println((int1 + int2) * 2)
    case b if (int1 != int2) => println(int1 + int2)
    case _ => println("something went wrong")
  }
}

sumDouble(1, 2)
sumDouble(3, 2)
sumDouble(2, 2)

/* Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.*/

def makes10(intA:Int, intB:Int):Boolean ={
  if (intA == 10 || intB == 10) true
  else if ( intA + intB == 10) true
  else false
}

makes10(9, 10)
makes10(9, 9)
makes10(1, 9)

/*Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged.
Note: use .equals() to compare 2 strings.*/

def notString(nStr:String): Unit = {
  if ((nStr.length() >= 3 && nStr.substring(0, 3).equals("not"))) println(nStr)
  else println("not " + nStr)
}

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"


/*Given a string, we'll say that the front is the first 3 chars of the string.
if the string length is less than 3, the front is whatever is there.
return a new string which is 3 copies of the front.*/

def front3(inString:String): Unit ={
  var start = ""
  if (inString.length >= 3) {
    start = inString.substring(0,3)
  }
  else start = inString
  println(start + start + start)
}

front3("Java")
front3("Chocolate")
front3("abc")


/*Given a string, take the first 2 chars and return the string with the 2 chars
added at both the front and back, so "kitten" yields"kikittenki".
If the string length is less than 2, use whatever chars are there.*/

def front22 (str:String) : Unit ={
  var start =""
  if (str.length >= 2) {start = str.substring(0,2)}
  else start = str
  println(start + str + start)
}

front22("kitten")
front22("Ha")
front22("abc")

/*Given 2 int values, return true if either of them is in the range 10..20 inclusive.*/
def in1020(intA:Int, intB: Int): Boolean ={
  if ((intA >= 10 && intA <= 20) || (intB >=10 && intB <=20)) true
  else false
}

in1020(12, 99)
in1020(21, 12)
in1020(8, 99)

/*
Given a string, if the string "del" appears starting at index 1,
 return a string where that "del" has been deleted. Otherwise, return the string unchanged.*/

def delDel(str:String): Unit ={
  if (str.substring(1,4).equals("del")) {
    println(str.substring(0,1) + str.substring(4,str.length))
  }
  else println(str)
}

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"

/* Given three int values, a b c, return the largest. */

def intMax(x:Int, y:Int, z:Int): Unit ={
  (x,y,z) match {
    case a if (x > y && x > z) => println("x =" + x)
    case b if (y > x && y > z) => println("y =" + y)
    case c if (z > x && z > y) => println("z =" + z)
    case _ => println("all values are equal")
  }
}

intMax(1, 2, 3)
intMax(1, 3, 2)
intMax(3, 2, 1)

/* Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
or return 0 if neither is in that range. */

def max1020(intA:Int, intB:Int): Unit ={
  (intA, intB) match {
    case a if (intA > 10 && intA < 20) && (intA > intB) => println(intA)
    case b if (intB > 10 && intB < 20) && (intB > intA) => println(intB)
    case _ => println(0)
  }
}

max1020(11, 19)
max1020(19, 11)
max1020(11, 9)
max1020(10, 21)


/*Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there.
Note that str.toUpperCase() returns the uppercase version of a string.*/

def endUp(str:String): Unit = {
  if (str.length < 3) {
    println(str.toUpperCase)
  }
  if (str.length > 3) {
    val end = str.substring(str.length - 3, str.length)
    val rest = str.substring(0, str.length - 3)
    println(rest + end.toUpperCase)
  }
}

endUp("Hello")
endUp("hi there")
endUp("hi")