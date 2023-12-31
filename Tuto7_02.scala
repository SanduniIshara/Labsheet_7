object Tuto7_02 {
  def main(args: Array[String]): Unit = {
    def calculateSquare(numbers: List[Int]): List[Int] = {
      numbers.map(number => number * number)
    }

    val inputList = List(1, 2, 3, 4, 5)
    val outputList = calculateSquare(inputList)

    println(outputList)

  }

}
