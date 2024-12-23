package day03

fun main() {
    val hero = Hero("홍길동", 90)
    //자바는 파라미터 순서 바꾸려면 오버로드 해야하는데, 코틀린은 걍 내가 설정가능(hp=100, name="홍길동")
    println(hero.hp)

    val slime = Slime(suffix = "A", hp = 50)
    hero.attack(slime)
    println(hero.hp)
    println(slime.hp)

    hero.sleep()
    println(hero.hp)

}

open class Hero(var name : String, var hp: Int = 100, ) { //초기값

    val maxHp: Int = hp

    //메소드
    open fun attack(slime: Slime) {
        println("${name}이 ${slime}을 공격했다" )
        println("슬라임의 반격을 받았다")
        hp -= 10
    }
    open fun run() {
        println("$name 이 도망쳤다")
    }

    fun sleep() {
        hp = 100
        println("${name}은 잠을 자고 회복했다 : $hp")
    }
    fun pung(): String {
        return "뽕"
    }
}

