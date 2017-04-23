/**
  * カリー化
  */
object AddCurried {
  def add(x: Int)(y: Int): Int = x + y
}
