/**
  * 菱形継承問題
  */
object DiamondTrait extends DTraitB with DTraitC {
  //override def greet(): Unit = println("wow") // OK
  override def greet(): Unit = super[DTraitB].greet() // OK
  //def greet(): Unit = println("wow") // NG
}

trait DTraitA {
  def greet(): Unit
}

trait DTraitB extends DTraitA {
  def greet(): Unit = println("Good morning!")
}

trait DTraitC extends DTraitA {
  def greet(): Unit = println("Good evening!")
}

