package me.zzw.scala.example.ch4

/**
  * Created by Administrator on 2016-08-07.
  */
// everything is Object
class Ch4 {
//  Number is Object
  def med ( x: Int): Unit = {
    println(1 + 2 * 3 / x)
  println((1).+(((2).*(3))./(x)));
  }
}

// Function is Object
object Timer {
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  def timeFlies() {
    println("time flies like an arrow...")
  }
  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}

//Anonymous function
object TimerAnonymous {
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  def main(args: Array[String]) {
    oncePerSecond(() =>
      println("time flies like an arrow..."))
  }
}
