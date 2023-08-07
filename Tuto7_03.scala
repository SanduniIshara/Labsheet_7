object Tuto7_03 {
  def main(args: Array[String]): Unit = {
    def filterPrime(numbers: List[Int]): List[Int] = {
      def isPrime(number: Int): Boolean = {
        if (number <= 1)
          false
        else if (number == 2)
          true
        else
          !(2 until number).exists(x => number % x == 0)
      }

      numbers.filter(isPrime)
    }

    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val outputList = filterPrime(inputList)

    println(outputList) 

  }

}
