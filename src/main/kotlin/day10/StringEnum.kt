package day10

import java.awt.Rectangle

fun main() {

    val str1 = "hello"
    val str2 = "hello"
    println(str1 === str2)   //true.  string은 불변객체이고, 메모리를 재활용 한다

    val str3 = String("hello".toCharArray())
    println(str1 === str3)    //false

    val str4 = "hel" + "lo"
    println(str1 === str4)     //true

    val str5 = "hel" + getLo()
    println(str1 === str5)      //false.   getlo() 생성 시기 다르기 때문에

    val box = Rectangle(5, 10, 60, 40)
    println(box.x)
    println(box.width)
    box.translate(25, 40)
    println(box.x)
    println(box.width)
    println(box.y)
}

fun getLo() = "lo"


// i 번째 글자가 모음인지 알려주는 isVowel() 함수 완성하기
// 모음은 a, e, i, o, u
class Word(val word: String) {

    fun isVowel(i: Int): Boolean {
        if (i !in word.indices) throw IndexOutOfBoundsException()
        return word[i].lowercase() in "aeiou"
    }

    // i 번째 글자가 자음인지 알려주는 isConsonant() 함수 완성하기
    fun isConsonant(i: Int): Boolean = !isVowel(i)


//    fun isConsonant(i: Int): Boolean {
//        return if (i !in word.indices) false else !isVowel(i)
//    }
}

/*
* require와 throw를 사용할 때의 차이 : 예외를 던지는 대상이 다르다
* require는 함수 내부에서 조건이 false일 때 IllegalArgumentException을 던진다.
* 주로 매개변수나 입력 값을 검증하는 데 사용된다.
*
* throw는 직접 예외를 던지는데, 예외 타입을 직접 지정할 수 있다.
*
* */
