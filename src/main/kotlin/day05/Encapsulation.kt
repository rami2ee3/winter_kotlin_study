package day05

class Human(val name: String, var age: Int) {
    fun bye() {

    }

    fun die() {

    }
}

fun main() {
    val person = Human("홍길동", 10)
    person.age = 11

}

