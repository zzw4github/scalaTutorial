package me.zzw.scala.example.ch7

/**
  * Created by Administrator on 2016-08-07.
  */


class TestTrait {
  def main(args: Array[String]): Unit = {
    val date1 = new Date(2016, 8, 7);
    val date2 = new Date(2016, 8, 5);
    println(date1 < date2)
  }

  class Date(y: Int, m: Int, d: Int) extends Ord {
    def year = y

    def month = m

    def day = d

    override def toString(): String = year + ""
    +month + ""
    +day

    override def equals(that: Any): Boolean =
      that.isInstanceOf[Date] && {
        val o = that.asInstanceOf[Date]
        o.day == day && o.month == month && o.year == year
      }

    def <(that: Any): Boolean = {
      if (!that.isInstanceOf[Date])
        sys.error("cannot compare " + that + " and a Date")
      val o = that.asInstanceOf[Date]
      (year < o.year) ||
        (year == o.year && (month < o.month ||
          (month == o.month && day < o.day)))
    }


  }

  trait Ord {
    def < (that: Any): Boolean
    def <=(that: Any): Boolean = (this < that) || (this == that)
    def > (that: Any): Boolean = !(this <= that)
    def >=(that: Any): Boolean = !(this < that)
  }


}

