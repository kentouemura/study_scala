/**
  * トレイトの初期化順序
  *
  * Scalaのクラスおよびトレイトはスーパークラスから順番に初期化されるため、
  * 呼び出したとしても「nullworld」になってしまう
  *
  * [解決方法]
  * 1.「lazy」or 「def」を使って、遅延させる
  * 2.自前定義
  */
object InitOrderTrait {
  def hoge(): Unit = {
    (new OrderClass).printBar()
    (new OrderClass2).printBar()
  }
}

trait OrderTraitA {
  val foo: String
}

//=======================================
// lazy」or 「def」を使って、遅延させる
//=======================================

trait OrderTraitB extends OrderTraitA {
  //val bar = foo + "world" // nullworld
  lazy val bar = foo + "world" // helloworld
}

class OrderClass extends OrderTraitB {
  val foo = "hello"

  def printBar(): Unit = println("lazy : " + bar)
}

//=======================================
// 自前定義をする
//=======================================

trait OrderTraitB2 extends OrderTraitA {
  val bar = foo + "world" // nullworld
}

class OrderClass2 extends {
  val foo = "hello"
} with OrderTraitB2 {
  def printBar(): Unit = println("自前定義 : " + bar)
}

