package com.scala.examples

object treetest extends App {
  
    val exp: Tree = Sum(Sum(Var("x"), Var("x")), Sum(Const(7), Var("y")))
    val env: TreeExec.Environment = { case "x" => 5 case "y" => 7 }
    println("Expression: " + exp)
    println("Evaluation with x=5, y=7: " + TreeExec.eval(exp, env))
    println("Derivative relative to x:\n " + TreeExec.derive(exp, "x"))
    println("Derivative relative to y:\n " + TreeExec.derive(exp, "y"))
  
}