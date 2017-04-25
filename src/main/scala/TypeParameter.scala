object TypeParameter {
  def divide(m: Int, n: Int): Unit = {

    // 自分で作成
    val myPair = new Pair[Int, Int](m / n, m % n)
    println("自分で作成 : " + myPair)

    // Tuple (数字は引数の数)
    val tuple = Tuple2(m / n, m % n)
    println("Tuple : " + tuple)

    // Tuple短縮
    val shortTuple = (m / n, m % n)
    println("Tuple短縮 : " + shortTuple)

  }


}

class Pair[A, B](val a: A, val b: B){
  override def toString(): String = "(" + a + "," + b + ")"
}