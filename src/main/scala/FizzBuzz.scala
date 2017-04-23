object FizzBuzz{
  def fizzbuzz(num: Int): Unit =  {
    for(i <- 1 to num){
      if(i % 3 == 0 && i % 5 == 0){
        println("FizzBuzz")
      } else if(i % 3 == 0){
        println("Fizz")
      } else if(i % 5 == 0){
        println("Buzz")
      } else {
        println(i)
      }
    }
  }
}
