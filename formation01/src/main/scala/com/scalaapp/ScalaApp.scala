package com.scalaapp

/**
  * Created by aperbal on 05/01/2018.
  */
object ScalaApp {
  def main(args: Array[String]): Unit = {
    print("Hello, World !")
    val capital = Map("US" -> "Washington", "France" -> "Paris")
    println(capital("France"))
  }
}
