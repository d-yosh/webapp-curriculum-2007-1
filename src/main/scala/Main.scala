object Main {
  val tribs: Stream[Int] = 0 #:: 0 #:: 1 #:: tribs.zip(tribs.tail).zip(tribs.tail.tail).map {x => x._1._1 + x._1._2 + x._2 }
}
