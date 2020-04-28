package com.scala.examples

import annotation.tailrec

object ExChallenge extends App {
  def f(x: Float):Float=
  {  
    1.toFloat+x
    +(math.pow(x, 2)/(1 to 2).product).toFloat
    +(math.pow(x, 3)/(1 to 3).product).toFloat
    +(math.pow(x, 4)/(1 to 4).product).toFloat
    +(math.pow(x, 5)/(1 to 5).product).toFloat
    +(math.pow(x, 6)/(1 to 6).product).toFloat
    +(math.pow(x, 7)/(1 to 7).product).toFloat
    +(math.pow(x, 8)/(1 to 8).product).toFloat
    +(math.pow(x, 9)/(1 to 9).product).toFloat     
  }
}