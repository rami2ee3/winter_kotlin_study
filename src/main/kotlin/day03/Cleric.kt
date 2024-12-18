package day03
class Cleric(var name : String,
             var hp : Int = 50,
             val maxHp : Int = 50,
             var mp: Int = 10,
             val maxMp : Int = 10,) {


    fun selfAid() {
        if (hp < maxHp) {
            hp+=5
            mp-=5
        }
    }

//    fun pray(time : Int): Int {
//        // val range = 0..2
//        val num = (0..2).random()
//        var recoveryMp = time + num      // 3 + 0,1,2
//
//        if ((recoveryMp + hp) > maxHp && (recoveryMp <= maxMp)) {  // 회복포인트랑 현재 mp랑 더해서 최대 mp보다 작거나 같아야 함
//            var extraNum = (recoveryMp + hp) - maxHp
//            return recoveryMp - extraNum              // mp49일때 3이면 52되니까 50까지만 회복하고 / 회복량은 1로 표시되게
//        }                                             // r(time 3+random 0) + mp가 49
//        return recoveryMp                             // 3+49 = 52 - 50 = 2 extra 인데, r3-2 =1
//    }


    fun pray(time : Int) : Int {
//        val num = (0..2).random()
        val num = 2
        var recoveryMp = time + num
        var currentMp = mp
        if (recoveryMp + currentMp > maxMp) {
            return maxMp - currentMp
        }
        return recoveryMp
    }
}


fun main() {
    var hero = Cleric("용사")
    hero.selfAid()
    hero.pray(3)
}