//Book- Learn You Some Haskell - Starting Out

//sample arithmetic

2+15
49*100
1892-1472
5.0/2.0

(50* 100) - 4999
50 *100 -4999
50*(100 - 4999)

5 * -3

//Boolean logic
true && false
true && true
false || true
!false
!(true&&true)
!(true&&true)


5==5
1==0
5!=5
5!=4
"hello" == "hello"
// 5==true comparing an int to a boolean will always yield false

//adding ints to string
5 + "llama"




//incremental function
def inc(x:Int) = {
  x + 1
}
inc(1)

var a = 1
a += 1
println(a)

//math functions
math.min(9,10)

math.min(3.4, 3.2)

math.max(100,101)

//equivalent statements
inc(9) + math.max(5,4)+1

(inc(9)) + (math.max(5,4)+1)


//babies first functions

def doubleMe(x:Int) : Int ={
  val doubleX = (x + x)
  doubleX
}
doubleMe(1)


def doubleUs(x:Int, y:Int) : Int ={
  val doubleXY = (x*2 + y*2)
  doubleXY
}
doubleUs(2,1)

//adding th two functions together
doubleUs(1,2) + doubleMe(1)


/*recreating the doubleUs function
by using the doubleMe function*/

def newDoubleUs(x:Int,y:Int) : Int={
  doubleMe(x) + doubleMe(y)
}
newDoubleUs(1,2)

def doubleSmallNumber(x:Int):Int={
  if (x>100) x
  else x*2
}
doubleSmallNumber(75)
doubleSmallNumber(101)

def doubleSmallerNumber(x:Int):Int ={
  val a = if (x > 100) x
  else x * 2
  a + 1
}
doubleSmallerNumber(75)
doubleSmallerNumber(101)

val conanOBrien = "It's me Conan O'Brien!"