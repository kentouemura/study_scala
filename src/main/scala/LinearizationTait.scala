/**
  * 線形化
  * トレイトがミックスインされた順番をトレイトの継承順番と見做すこと
  * 同じメソッドがあった場合、後から継承されたものが優先される
  */
object LinearizationTrait {
  def hoge(): Unit = {
    (new LClassA).greet()
    (new LClassB).greet()
  }
}

trait LineaTraitA {
  def greet(): Unit = println("Hey")
}

trait LineaTraitB extends LineaTraitA {
  override def greet(): Unit = {
    super.greet() // Hey
    println("Good morning")
  }
}

trait LineaTraitC extends LineaTraitA {
  override def greet(): Unit = {
    super.greet() // Hey
    println("Good evening")
  }
}

class LClassA extends LineaTraitB with LineaTraitC
class LClassB extends LineaTraitC with LineaTraitB