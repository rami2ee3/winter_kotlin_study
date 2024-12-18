package day03

import kotlin.time.measureTime

//fun main() {
//    var time = measureTime {
//        var text = ""
//        repeat(100000) {
//            text += "1"
//        }
//    }
//    println(time)
//}

fun main() {
    var time = measureTime {
        var text = StringBuilder("")
        repeat(100000) {
            text.append("1")
        }
    }
    println(time)
}