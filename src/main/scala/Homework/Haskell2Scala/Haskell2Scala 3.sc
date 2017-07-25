def multiPreds(list: List[Int]):List[Int] = {
  for (i <- list if i != 13 && i != 15 && i != 19) yield i
}
println(multiPreds(List.range(10,20)))


def multiPreds(listA: List[Int], listB:List[Int]):List[Int] = {
  for (a <- listA; b <- listB) yield a * b
}
println(multiPreds(List(2,5,10),List(8,10,11)))


def multiPreds2(listA: List[Int], listB:List[Int]):List[Int] = {
  for (a <- listA; b <- listB if (a*b) > 40) yield a * b
}
println(multiPreds2(List(2,5,10),List(8,10,11)))



def joinUp(listA:List[String],listB:List[String]) :List[String] ={
  for (a<- listA; b <-listB) yield a + " " + b
}

println(joinUp(List("Lazy", "grouchy", "scheming"),List("hobo","frog","pope")))


def myLength(listA: List[Any]):Int={
  (for (a <-listA) yield 1).sum
}
myLength(List(1,2,3,4,5))

def removeUpper(str:String) : String = {
  for (a<-str if a.isUpper) yield a
}
println(removeUpper("Hahaha! Ahahaha!"))
println(removeUpper( "IdontLIKEFROGS"))

def removeOdds(lst:List[List[Int]]): List[List[Int]] ={
  for (a <-lst) yield {
    for (b <- a if b %2 == 0) yield b
  }
}
println(removeOdds(List(List(1,3,5,2,3,1,2,4,5),List(1,2,3,4,5,6,7,8,9),List(1,2,4,2,1,6,3,1,3,2,3,6))))


//Tuples

val tup1 = (8,11)
println(tup1._1)
println(tup1._2)

val tup2 = ("wow",false)
println(tup2._1)
println(tup2._2)

List(5,4,3,2,1) zip List(1,2,3,4,5)

(1 to 5).toList zip List("one","two", "three", "four", "five")

List.range(1,5) zip List("one","two", "three", "four", "five")


List(5,3,2,6,2,7,2,5,4,6,6) zip List("im","a","turtle")
// only zips to the length of the smallest string


def rightTriangles() : List[Any] = {
  for(c <- List.range(1,11); b <- List.range(1,c); a <- List.range(1,b) if a*a + b*b == c*c) yield (a,b,c)
}
println(rightTriangles())

def rightTrianglesCheckPerimiter(per : Int) : List[Any] = {
  for(c <- List.range(1,11); b <- List.range(1,c); a <- List.range(1,b) if a*a + b*b == c*c && a+b+c == per) yield (a,b,c)
}
println(rightTrianglesCheckPerimiter(24))