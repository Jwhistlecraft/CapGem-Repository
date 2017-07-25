/*Given a string and a non-negative int n,
return a larger string that is n copies of the original string*/

def stringTimes(str: String, int: Int): Unit ={
  var i = 0
  for (i <- 1 to int) {
    print(str)
  }
}

stringTimes("Hi", 2)
stringTimes("Hi", 3)
stringTimes("Hi", 1)

/*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
 or whatever is there if the string is less than length 3. Return n copies of the front;*/

def frontTimes(str:String, int:Int): Unit ={
  var front = str.substring(0,3)
  var i = 0
  for (i<- 1 to int) {
    print(front)
  }
}

frontTimes("Chocolate", 2)
frontTimes("Chocolate", 3)
frontTimes("Abc", 3)


/*Count the number of "xx" in the given string.
We'll say that overlapping is allowed, so "xxx" contains 2 "xx". */
def countXX(str:String): Unit ={
  println(str.count(_== 'x'))
}

countXX("xx")
countXX("xxx")
countXX("xxxx")