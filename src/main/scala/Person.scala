/**
  * コンパニオンオブジェクト
  * @param name
  * @param age
  * @param height
  */
class Person(name: String, age: Int, private val height: Int) {

  private def say(message: String): Unit = {
    println("私は" + name + "。年齢は" + age + "で、身長は" + height + "だ。" + message)
  }

  private[this] def sayPrivateThis(message: String): Unit = {
    println("私は" + name + "。年齢は" + age + "で、身長は" + height + "だ。" + message)
  }

}

object Person {

  def tanakaPR(): Unit = {
    val tanaka = new Person("田中", 25, 170)
    tanaka.say("よろしく頼む。")
  }

  def tanakaPRPrivateThis(): Unit = {
    //val tanaka = new Person("田中", 25, 170)
    //tanaka.sayPrivateThis("よろしく頼む。")
  }

}
