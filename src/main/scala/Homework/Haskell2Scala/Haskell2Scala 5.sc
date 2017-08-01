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

//