import scala.io.Source

/**
  * 高階関数
  */
object HigherOrder {

  def add(n: Int, g: Int => Int): Int = {
    g(g(n))
  }

  def around(init: () => Unit, body: () => Any, fin: () => Unit ): Any = {
    init()
    try {
      body()
    } finally {
      fin()
    }
  }

  def withFile[A](fileName: String)(f:Source => A): A = {
    val s = Source.fromFile(fileName)
    try {
      f(s)
    } finally {
      s.close()
    }
  }

}