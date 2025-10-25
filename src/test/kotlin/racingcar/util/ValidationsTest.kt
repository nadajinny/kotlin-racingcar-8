package racingcar.util

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows

class ValidationsTest {
    @Test
    fun `레이싱 횟수가 숫자로 입력되지 않았을 경우`() {
        assertThrows<IllegalArgumentException> { Validations.parseRound("abc") }
    }

    @Test
    fun `레이싱 횟수에 0 이하 값이 들어갔을 경우`() {
        assertThrows<IllegalArgumentException> { Validations.parseRound("-1") }
        assertThrows<IllegalArgumentException> { Validations.parseRound("0") }
    }

    @Test
    fun `레이싱 횟수가 제대로 입력되었을 경우`() {
        val round = Validations.parseRound("2")
        assertEquals(2, Validations.parseRound("2"))
    }
}