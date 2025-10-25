package racingcar.util

object Validations {
    fun parseRound(input: String): Int {
        val round = input.toIntOrNull()?: throw IllegalArgumentException(ErrorMessage.INVALID_RACE_COUNT)
        require(round > 0) { ErrorMessage.INVALID_RACE_COUNT }
        return round
    }
}