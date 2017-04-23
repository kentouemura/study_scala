object Main {
  def main(args: Array[String]) = {
    questions()
    test()
  }

  def questions(): Unit = {
    // 1歳から6歳までの就学以前の子どもかどうかR
    //println("1歳 : " + Question.isBaby(1, false))

    // whileで1から9まで出力する
    //Question.loopFrom0To9()

    // 三辺からなる三角形が直角三角形になるような a, b, cの組み合わせを全て出力
    //Question.rightTriangle(1000)

    // 最初と最後の文字が同じ英数字であるランダムな~つの文字を~回出力
    //Question.randomString(100, 5)

    // withFileメソッドを使って、テキストファイルの中身を一行ずつ表示
    //Question.printFile("test.txt")
  }

  def test(): Unit = {
    // FizzBuzz
    //FizzBuzz.fizzbuzz(100);

    // コンパニオンオブジェクト
    //Person.tanakaPR()

    // 線形化[Trait]
    //LinearizationTrait.hoge()

    // 自分型[Trait]
    //SelfType.hoge()

    // トレイトの初期化順序
    //InitOrderTrait.hoge()

    // 関数
    //    val add = new Function2[Int, Int, Int]{
    //      def apply(x: Int, y: Int): Int = x + y
    //    }

    // 無名関数
    //val add = (x: Int, y: Int) => x + y
    //println(add(100,200))

    // カリー化
    //val addCurried = (x: Int) => ((y: Int) => x + y)
    //println(addCurried(100)(100))

    // カリー化 [ver2]
    //println(AddCurried.add(100)(200))

    // 高階関数 [Int]
    //println(HigherOrder.higherOrder(3, g => g * 3))

    // 高階関数 [初期化/何らかの処理/後始末処理]
    //     println(HigherOrder.around(
    //       () => println("ファイル開く"),
    //       () => throw new Exception("例外発生!"),
    //       () => println("ファイルを閉じる")
    //     ))

  }

}