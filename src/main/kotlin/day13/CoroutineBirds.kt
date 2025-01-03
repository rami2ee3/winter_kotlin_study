package day13
// 한 새는 1초마다, 다른 새는 2초마다, 마지막 새는 3초마다 소리를 냅니다.
// 각 새의 소리 타이밍을 재현하되, 각 새마다 하나의 코루틴을 사용하세요. -> 각 새의 행동(소리를 내고 대기하는 반복 작업)을 독립된 코루틴에서 실행하라는 뜻
// 각 코루틴은 4번만 출력한 후 완료되어야 합니다. -> 각 새마다 4번씩 울음
// 첫 번째 새는 "꾸우" 소리를 냅니다. 두 번째 새는 "까악" 소리를 냅니다. 마지막 새는 "짹짹" 소리를 냅니다.
// --------------------------------------------------
// 이전 과제를 확장하여 콘솔에 4번만 출력하는 제한을 제거 -> 각 코루틴은 무기한으로 출력
// 10초 후에 모든 실행 중인 코루틴을 취소하는 메커니즘을 추가

import kotlinx.coroutines.*

suspend fun kkou() {
    while (true) {
        println("꾸우")
        delay(1000)
    }
}

suspend fun kkack() {
    while (true) {
        println("까악")
        delay(2000)
    }
}

suspend fun jjack() {
    while (true) {
        println("짹짹")
        delay(3000)
    }
}

fun main() = runBlocking {
    val job = launch {
        launch { kkou() }
        launch { kkack() }
        launch { jjack() }
    }
    delay(10_000)
    job.cancelAndJoin() // 각각 따로 호출하지 않고 단일 메서드로 처리 가능. 코루틴을 취소하고, 모든 작업이 종료될 때까지 기다린다.
    println("10초가 경과하여 작업을 종료합니다.")
}


//fun main() = runBlocking {
//    val job = launch {
//        val time = measureTimeMillis {
//            val result1 = kkou()
//            val result2 = kkack()
//            val result3 = jjack()
//        }
//        if (time >= 10000) {
//            cancel()
//        }
//    }
//}
//---------------------------------------------
//fun main() {
//    runBlocking {
//        val job: Job = launch {
//            launch { kkou() }
//            launch { kkack() }
//            launch { jjack() }
//        }
//        job.cancel()
//    }
//}

//fun main():Unit = runBlocking {
//    launch { kkou() }
//    launch { kkack() }
//    launch { jjack() }
//}

