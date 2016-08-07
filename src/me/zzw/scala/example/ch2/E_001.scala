package me.zzw.scala.example.ch2

/**
  * Created by Administrator on 2016-07-17.
  */
object E_001 {
  def sort(xs: Array[Int]): Unit = {
    def swap(i: Int, j: Int) {
      val t = xs(i);
      xs(i) = xs(j);
      xs(j) = t
    }
    def sort1(l: Int, r: Int): Unit ={
      val pivot = xs((l + r) / 2 )
      var i = l; var j = r
      while(i < j) {
        while (xs(i) < pivot) i += 1
        while (xs(j) > pivot) j -= 1
        if (i <= j) {
          swap(i , j)
          i += 1
          j -= 1
        }
      }
      if (l < j) sort1(l, j)
      if (j < r) sort1(i, r)
    }
    sort1(0, xs.length - 1)
          for (i <- 0 until xs.length)
            println(i + ": " + xs(i))
  }

  def sort2(xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      Array.concat(
        sort2(xs filter (pivot >)),
        xs filter (pivot ==),
        sort2(xs filter (pivot <)))
    }
  }
    def main(args: Array[String])  {
      var array = Array.apply(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
      sort(array)

      val sorted2 = sort2(array)
      for (i <- 0 until sorted2.length)
        println(i + ": " + sorted2(i))
}

}
