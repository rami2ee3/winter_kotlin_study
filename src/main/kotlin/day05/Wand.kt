package day05
/*지팡이의 이름은 null 일 수 없고, 반드시 3문자 이상이어야 한다
지팡이의 마력은 0.5 이상 100.0 이하여야 한다.
마법사의 지팡이는 null 일 수 없다.*/
class Wand(
    val initialName: String,
    val initialPower: Double,
) {
    init {
        validateName(initialName)
        validatePower(initialPower)
    }
    companion object {
        private val NAME_LENGTH = 3
        private val WAND_POWER: ClosedFloatingPointRange<Double> = 0.5..100.0

        private fun validateName(name: String) {
            require(name.length >= NAME_LENGTH) {"지팡이의 이름은 $NAME_LENGTH 문자 이상이어야 한다"}
        }

        private fun validatePower(initialPower: Double) {
            require(initialPower in WAND_POWER) {"지팡이의 마력은 ${WAND_POWER.start} 이상 ${WAND_POWER.endInclusive} 이하여야 한다"}
        }
    }

    var name: String = initialName
        set(value) {
            validateName(value) // 이름 변경 시 검증
            field = value
        }

    var power: Double = initialPower
        set(value) {
            validatePower(value)    // init에서 검증은 초기화 시점에만 진행되기 때문에, 값 변경 시 set에서도 검증해주어야 한다
            field = value
        }
}