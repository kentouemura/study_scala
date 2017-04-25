import scala.util.Random

object Question {

  /**
    * 1歳から6歳までの就学以前の子どもかどうか
    * @param age
    * @param isSchoolStarted
    * @return
    */
  def isBaby(age: Int, isSchoolStarted: Boolean): Boolean = (age > 1 && age < 6 && !isSchoolStarted)


  /**
    * whileで1から9まで出力する
    */
  def loopFrom0To9(): Unit = {
    var i = 0
    do {
      println(i)
      i += 1
    } while (i<10)
  }

  /**
    * 1から1000までの3つの整数a, b, cについて、
    * 三辺からなる三角形が直角三角形になるような a, b, cの組み合わせを全て出力
    */
  def rightTriangle(count: Int): Unit = {
    for(a <- 1 to count; b <- 1 to count; c <- 1 to count if a * a == b * b + c * c) println(a, b, c)
  }

  /**
    * 最初と最後の文字が同じ英数字であるランダムな~つの文字を~回出力
    * @param count
    * @param strNum
    */
  def randomString(count: Int, strNum: Int): Unit = {
    for (i <- 1 to count) {
      val text = new Random(new java.security.SecureRandom()).alphanumeric.take(strNum).toList match {
        case List(a, b, c, d, _) => List(a, b, c, d, a).mkString
      }
      println(text)
    }
  }

  /**
    * withFileメソッドを使って、テキストファイルの中身を一行ずつ表示
    * @param fileName
    */
  def printFile(fileName: String): Unit = {
    HigherOrder.withFile(fileName) {
      file => file.getLines().foreach(println)
    }
  }

  def printStack(): Unit = {
    val intStack: Stack[Int] = Stack()
    println(intStack)
    val stringStack: Stack[String] = Stack()
    println(stringStack)
  }

}

//================================================
// 共変
//================================================

trait Stack[+A] {
  def push[E >: A](e: E): Stack[E]
  def top: A
  def pop: Stack[A]
  def isEmpty: Boolean
}

class NonEmptyStack[+A](private val first: A, private val rest: Stack[A]) extends Stack[A] {
  def push[E >: A](e: E): Stack[E] = new NonEmptyStack[E](e, this)
  def top: A = first
  def pop: Stack[A] = rest
  def isEmpty: Boolean = false
}

case object EmptyStack extends Stack[Nothing] {
  def push[E >: Nothing](e: E): Stack[E] = new NonEmptyStack[E](e, this)
  def top: Nothing = throw new IllegalArgumentException("empty stack")
  def pop: Stack[Nothing] = throw new IllegalArgumentException("empty stack")
  def isEmpty: Boolean = true
}

object Stack {
  def apply(): Stack[Nothing] = EmptyStack
}