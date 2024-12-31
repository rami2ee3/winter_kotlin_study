package day11

fun main() {
// runtime error를 try-catch()문으로 예외처리
// 예외 발생 시 0으로 처리
    val numString = ("10.5")
    var num: Int
    try {
        num = numString.toInt()
    } catch (e: Exception) {
        num = 0
    }
    println(num)
}

