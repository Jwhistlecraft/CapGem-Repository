//Types and Typeclasses

'a'
true
"hello"
(true, 'a')
4==5

def removeNonUpper(str:String) : String = {
  for (a<-str if a.isUpper) yield a
}
removeNonUpper("AbCd")

def removeUpper(str:String) : String = {
  for (a <- str if a.isLower) yield a
}
removeUpper("AbCd")

def intz(intA:Int, intB:Int, intc:Int):Int ={
  intA + intB + intA
}
intz(1,2,3)


def factorial(n: BigInt): BigInt = {
  if (n <= 1)
    1
  else
    factorial(n-1) * n
}
factorial(5
)

def circumference(fl:Float):Unit ={
  val r = 2*math.Pi*fl
  println(r)
}
circumference(4)

def circumference2(fl:Double):Unit ={
  val r = 2*math.Pi*fl
  println(r)
}

circumference2(4.2)


//Type Variables

List(1,2,3,4,5).head

val lst = List(1,2,3,4,5)
lst(0)
List(1,2,3,4,5).take(1)

//Typeclasses 101

5==5
5!=5
'a' == 'a'
3.432 == 3.432

"awfafds" > "QD"
5>=2

3 compareTo 5 // + == gt, -1 == lt

//show pressents any data type as a string eg:

println(1.toString)

//read is essentially a catch all inference term,
//likely to use .toInt .toString in

Int.MinValue
Int.MaxValue

val a:Double = 4

val b:Float = 5