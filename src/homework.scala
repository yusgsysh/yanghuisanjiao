object homework {
  def main(args: Array[String]): Unit = {
    val array = Array.ofDim[Int](12, 12)
    for (i <- 0 to 10) {
      for (j <- 0 to 10) {
        if (i == 0 || i == j) {
          array(i)(j) = 1
        }
        array(i + 1)(j + 1) = array(i)(j) + array(i + 1)(j)
        if(array(j)(i) != 0){
          print(array(j)(i)+"\t")
        }
      }
      println()
    }
  }
}

