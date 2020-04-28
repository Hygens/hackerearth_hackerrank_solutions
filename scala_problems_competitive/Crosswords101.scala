package com.scala.examples

object Crosswords101 {
  type Result = Map[(Int, Int), Char]
  def solve(board: Seq[String], words: List[String]) {
    val positions = board.zipWithIndex.flatMap {
      case (s, i) =>
        s.zipWithIndex.withFilter {
          case (c, j) => c == '-'
        }.map {
          case (c, j) => (i, j)
        }
    }
    val positionsWithDirections = positions.flatMap(x => Set((x, 0), (x, 1)))
    val stripes = positionsWithDirections.filter {
      case (p, d) =>
        !positionsWithDirections.contains((p._1 - 1 + d, p._2 - d), d) &&
          positionsWithDirections.contains((p._1 + 1 - d, p._2 + d), d)
    }.map {
      case (p, d) =>
        (0 to 9)
          .map(i => ((p._1 + (1 - d) * i), (p._2 + d * i)))
          .takeWhile(positions.contains(_))
    }.groupBy(_.length)
    def search(ws: List[String], st: Map[Int, Seq[Seq[(Int, Int)]]], res: Result): Result = ws match {
      case Nil => res
      case w :: wt => {
        val l = for {
          stripe <- st(w.length)
          curr: Result = (stripe zip w).toMap
          next: Result = res ++ curr
          if next == curr ++ res
        } yield search(wt, st + Tuple2(w.length, st(w.length).filterNot(_ == w)), next)
        l.find(_ != Map.empty) match {
          case Some(x) => x
          case None => Map.empty
        }
      }
    }
    val m = Array.fill(10, 10)('+')
    search(words, stripes, Map.empty).foreach(x => m(x._1._1)(x._1._2) = x._2)
    m.foreach(x => println(x.mkString))
  }
  def main(args: Array[String]) {
    solve((1 to 10).map(_ => readLine), readLine.trim.split(';').toList)
  }
}
