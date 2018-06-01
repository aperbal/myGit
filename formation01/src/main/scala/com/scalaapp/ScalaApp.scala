package com.scalaapp

/**
  * Created by aperbal on 05/01/2018.
  */
object ScalaApp {
  def main(args: Array[String]): Unit = {
    println("Hello, World !")
    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    println(capital("France"))
    println(capital("US"))
  }
}
