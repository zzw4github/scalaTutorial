package me.zzw.scala.example.ch3

import java.util.{Date, Locale}
import java.text.DateFormat._
/**
  * Created by Administrator on 2016-08-07.
  */
class Ch3 {

}

object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}
