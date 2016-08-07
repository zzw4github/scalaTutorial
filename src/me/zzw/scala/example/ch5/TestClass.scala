package me.zzw.scala.example.ch5

/**
  * Created by Administrator on 2016-08-07.
  */

class Complex(real: Double, imaginary: Double) {
  def re() = real
  def im() = imaginary
}

class Complex1(real: Double, imaginary: Double) {
  def re = real
  def im = imaginary
}
//override
class Complex2(real: Double, imaginary: Double) {
  def re = real
  def im = imaginary
  override def toString() =
    "" + re + (if (im < 0) "" else "+") + im + "i"
}

object ComplexNumbers {
  def main(args: Array[String]) {
    val c = new Complex(1.2, 3.4)
    println("imaginary part: " + c.im())
  }
}
