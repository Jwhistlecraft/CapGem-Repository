//Pattern Matching

def lucky(int:Int) : String = {
  (int) match {
    case a if (int == 7) => "lucky number seven!"
    case _ => "sorry, you are out of luck, pal!"
  }
}

println(lucky(7))
println(lucky(4))


def sayMe(int:Int) : String = {
  (int) match{
    case a if (int == 1) => "one"
    case b if (int == 2) => "two"
    case c if (int == 3) => "three"
    case d if (int == 4) => "four"
    case e if (int == 5) => "five"
    case _ => "not between 1 and 5"

  }
}
sayMe(6)
sayMe(4)


def factorial(n:Int) : Int = {
  (n) match {
    case 0 => 1
    case _ => n * factorial(n - 1)
  }
}

println(factorial(3))
println(factorial(10))


def addVectors(a:Vector[Int], b:Vector[Int]):Vector[Int] = {
  a.length.toString match{
    case "0" => new Vector[Int]
    case "1" => new Vector[Int](a(0)+b(0))
    case "2" => new Vector[Int](a(0)+b(0))
    case _ => new Vector[Int](a(0)+b(0), a(1)+b(1), a(3)+b(3))
  }
}

/* def addVectors(a:Vector[Int], b:Vector[Int]):Vector[Int] = {
   a.length.toString match{
     case "0" => new Vector[Int]
     case "1" => new Vector[Int](a(0)+b(0))
     case "2" => new Vector[Int](a(0)+b(0))
     case _ => new Vector[Int](a(0)+b(0), a(1)+b(1), a(3)+b(3))
   }
 }

println(addVectors(Vector(1),Vector(2))) */


def headEx(list : List[Any]):Any = list.length match{
  case 0 => "can't call head on an empty list dummy!"
  case _ => list.head
}
headEx(List(1,2,3,4))
headEx(List())

def tell(list: List[Any]) :String = list match{
  case Nil => "the List is Empty"
  case a::Nil => "the List has one element " + a
  case a::b::Nil => "the list has two elements " + a + " and " + b
  case a::b::_ => "the list has many elements, the first two are " + a + " and " + b
}

tell(List())
tell(List(1))
tell(List(1,2))
tell(List(1,2,3,4))

def lstLength(list: List[Any]) :Int = list match {
  case Nil => 0
  case _::a => 1 + lstLength(a)
}
lstLength(List())
lstLength(List(1))
lstLength(List(1,2,3))

def  lstSum(list: List[Int]) :Int = list match{
  case Nil => 0
  case a::b => a + lstSum(b)
}
lstSum(List())
lstSum(List(1,2))
lstSum(List(1,2,3))

//guards

def bmiTell(weight : Float, height: Float):String = {
  val bmi = weight / height * height
  bmi match {
    case emo if bmi <= 18.5 => "You're underweight, you emo, you!"
    case normal if bmi <= 25.0 => "You're supposedly normal. Pffft, I bet you're ugly!"
    case fat if bmi <= 30.0 => "You're fat! Lose some weight, fatty!"
    case _ => "You're a whale, congratulations!"
  }
}

bmiTell(20f, 150f)
bmiTell(10f, 100f)
bmiTell(30f,200f)


def max(a: Int, b:Int): Int = a match{
  case x if a > b => a
  case _ => b
}

//recursion

//def maximun(lst:List[Int]): List[Int] ={
  
//}

