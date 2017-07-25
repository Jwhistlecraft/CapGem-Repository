//An intro into lists

val lostNumbers = List(4,8,15,16,23,42)
lostNumbers

List(1,2,3,4) ++ List(5,6,7,8)

"hello" + " " + "world"

List('w','o') ++ List('o', 't')

val numList = List(4,3,2,1)
val frontFive = 5 +:numList
val backFive = numList :+ 5

val cat = List("small", "cat")
val A = "A"
val newCat = A+:cat


val numbList = List(1,2,3,4,5,6,7)
numbList(5)

val b = List(List(1,2,3,4),List(5,3,3,3), List(1,2,2,3,4), List(1,2,3))
b

val l1 = List(3,2,1)
val l2 = List(3,2,1)
val l3 = List(4,3,2)

l1.toSet == l2.toSet
l3.sorted == l1.sorted

def greaterThanLists(listA:List[Int], listB:List[Int]): Boolean ={
  def iter(i:Int): Boolean = i match {

    case a if (i == listA.length) => false
    case b if (i == listB.length) => true
    case c if (listA(i) > listB(i)) => true
    case d if (listA(i) < listB(i)) => false
    case _ => iter(i+1)
  }
  iter(0)
}

greaterThanLists(List(5,4,3,2,1), List(5,4,3,2,1))
greaterThanLists(List(4,3,2,1,1), List(5,4,3,2,1))
greaterThanLists(List(5,4,3,2,1), List(4,3,2,1,1))


List(5,4,3,2,1).head

List(5,4,3,2,1).tail

List(5,4,3,2,1).last

List(5,4,3,2,1).init

List(5,4,3,2,1).length

List(1,2,3).isEmpty

List().isEmpty

List(1,2,3,4).reverse

val x = List(5,4,3,2,1)
x.take(3)

List(5,4,3,2,1).take(3)

List(5,4,3,2,1).drop(3)

List(5,4,3,2,1).max

List(5,4,3,2,1).min

List(5,4,3,2,1).sum

List(5,4,3,2,1).product

List(5,4,3,2,1).exists(_==5)

List(5,4,3,2,1).exists(_==6)


//Texas Ranges

val tR = (1 to 100 by 2).toList

val aR = ('a' to 'z').toList
print(aR)
val l = List(5,4,3,2,1)

Stream.continually(l.toStream).flatten.take(20).toList

("5"* 3).toList


//I'm a list comprehension

def evens(from:Int, to:Int) :List[Int] ={
  for (i <-List.range(from, to)) yield i*2
}

println(evens(0,20))

def evens12(from:Int, to:Int) :List[Int] = {
  for (i <- List.range(from, to) if i % 2 == 0 && i > 12) yield i
}
println(evens12(0,20))


def mod7(from:Int, to:Int) :List[Int] = {
  for (i <- List.range(from, to) if i % 7 == 3) yield i
}
println(mod7(50,100))

def boomBang(list: List[Int]):List[String]= {
  for (i <- list if i %2 != 0) yield {if (i < 10) "boom" else "bang"}
}
println(boomBang(List.range(7,14)))
