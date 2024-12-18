package day03

import org.junit.Test

import org.junit.Assert.*

class ClericTest {

    @Test
    fun selfAid() {
        //given 준비
        val cleric = Cleric("용사")
        //when 실행

        //then 검증
        assertEquals(10, selfAid())
    }

//    @Test
//    fun pray() {
//        //given 준비
//        val cleric = Cleric("용사", hp = 49)
//        //when 실행
//        //then 검증
//        assertEquals(1, cleric.pray(3))
//    }

    @Test
    fun pray() {
        //given 준비
        val cleric = Cleric("용사", mp = 6)
        //when 실행
        //then 검증
        assertEquals(4, cleric.pray(3))
//        assertTrue(pray() <= getMaxMp(), "true")


    }

    @Test
    fun getName() {
    }

    @Test
    fun setName() {
    }

    @Test
    fun getHp() {
    }

    @Test
    fun setHp() {
    }

    @Test
    fun getMaxHp() {
    }

    @Test
    fun getMp() {
    }

    @Test
    fun setMp() {
    }

    @Test
    fun getMaxMp() {
    }
}

