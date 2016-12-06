package com.hackerearth
import scala.collection.mutable.Queue
import scala.util.control.Breaks._
case class Spider(var power: Int, var pos: Int)
object MonkAndChambersOfSecrets {
  def main(args: Array[String]) = {
    val lines = io.Source.stdin.getLines()
    val Array(n, m) = lines.next().trim().split(" ").map(_.toInt)
    val spiders = Queue[Spider]()
    lines.next().trim().split(" ").zipWithIndex.foreach { case (x, i) => spiders.enqueue(Spider(x.toInt, i + 1)) }
    for (i <- 0 until m) {
      var best = spiders.front
      var removedSpiders = Queue[Spider]()
      breakable {
        for (j <- 0 until m) {
          if (spiders.isEmpty) {
            break
          }
          val spider = spiders.dequeue
          if (spider.power > best.power) {
            best = spider
          }
          removedSpiders.enqueue(spider)
        }
      }
      print(best.pos.toString + " ")
      var found = false
      while (!removedSpiders.isEmpty) {
        var spider = removedSpiders.dequeue
        breakable {
          if (!found) {
            if (spider.power == best.power) {
              found = true
              break
            }
          }
          if (spider.power-1 > 0) spider.power = spider.power-1
          else spider.power = 0          
          spiders.enqueue(spider)
        }
      }
    }
  }
}