import kotlin.math.PI
import kotlin.math.roundToInt
import kotlin.math.sqrt

// 2-08 Extension Properties & Methods - Starter

//---๐โโ ๏ธโ๐ปโโข๏ธโ๐คกโ๐ซโ๐ฌโ๐---

class Circle(var radius: Double = 0.0) {
  val circumference: Double
    get() = PI * radius * 2
}

//---๐โโ ๏ธโ๐ปโโข๏ธโ๐คกโ๐ซโ๐ฌโ๐---


// Add Circle Extension Property




//---๐โโ ๏ธโ๐ปโโข๏ธโ๐คกโ๐ซโ๐ฌโ๐---

class SimpleDate(var month: String) {
  fun monthsUntilJingleBells(): Int {
    return months.indexOf("December") - months.indexOf(month)
  }

  companion object {
    val months = arrayOf(
        "January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"
    )
  }
}
//---๐โโ ๏ธโ๐ปโโข๏ธโ๐คกโ๐ซโ๐ฌโ๐---


// Add SimpleDate Extension Method




//---๐โโ ๏ธโ๐ปโโข๏ธโ๐คกโ๐ซโ๐ฌโ๐---
class TVMath {
  companion object {
    fun getDiagonal(width: Double, height: Double): Int {
      val result = sqrt(width * width + height * height)
      return result.roundToInt()
    }

    fun getWidthAndHeight(diagonal: Int, ratioWidth: Double, ratioHeight: Double): Pair<Double, Double> {
      val ratioDiagonal = sqrt(ratioWidth * ratioWidth + ratioHeight * ratioHeight)
      val height = diagonal * ratioHeight / ratioDiagonal
      val width = height * ratioWidth / ratioHeight

      return Pair(width, height)
    }
  }
}
//---๐โโ ๏ธโ๐ปโโข๏ธโ๐คกโ๐ซโ๐ฌโ๐---


// Add TVMath Companion Object Extension Method



fun main() {

}