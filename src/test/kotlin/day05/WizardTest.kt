package day05

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.test.todo

class WizardTest {

@Test(expected = IllegalArgumentException::class)
 fun checkInitialNameValid() {
   val wand = Wand(name = "지팡이", power = 80.0)
   Wizard(initialName = "간", initialHp = 90, mp = 30, wand = wand)
 }

@Test(expected = IllegalArgumentException::class)
 fun checkMpValid() {
   val wand = Wand(name = "지팡이", power = 80.0)
   Wizard(initialName = "간달프", initialHp = 90, mp = -5, wand = wand)
 }

@Test(expected = IllegalArgumentException::class)
 fun checkWandPowerRange() {
   Wand(name = "지팡이", power = 200.0)
 }

@Test
fun CheckWandPowerValid(){
 //TODO 수정해야함
 val wand = Wand(name = "지팡이", power = 50.0)
 assertEquals(50.0, wand.power)
}

@Test
 fun checkHp() {
 //TODO 수정해야함
  val wand = Wand(name = "지팡이", power = 80.0)
  val wizard = Wizard(initialName = "간달프", initialHp = -10, mp = 30, wand = wand)
  assertEquals(0, wizard.hp)
 }

//  TODO junit4에서 assertThrows 하는 방법
//  @Test
//  fun checkName() {
//   Assert.assertThrows(IllegalArgumentException::class)
//   val wand = Wand(name = "지팡이", power = 80.0)
//   Wizard(initialName = "간", initialHp = 90, mp = 30, wand = wand)
//   throw IllegalArgumentException()
//  }
}