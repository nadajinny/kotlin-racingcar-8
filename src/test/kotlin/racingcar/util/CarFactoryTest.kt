package racingcar.util

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows

class CarFactoryTest {
    @Test
    fun `공백 제거 여부 확인`() {
        val cars = CarFactory.ExtractCarName("  1  , 2, 123")
        assertEquals(listOf("1","2","123"), cars.map{ it.name })
    }

    @Test
    fun `빈 문자열일 경우`() {
        val cars = CarFactory.ExtractCarName("     ")
        assertThrows<IllegalArgumentException> { ErrorMessage.EMPTY_CAR_NAME }
    }

    @Test
    fun `이름이 중복일 경우`() {
        val cars = CarFactory.ExtractCarName("  1  , 2, 2")
        assertThrows<IllegalArgumentException> { ErrorMessage.IDENTICAL_CAR_NAME }
    }

    @Test
    fun `이름이 5글자를 초과할 경우`() {
        val cars = CarFactory.ExtractCarName(" 123456")
        assertThrows<IllegalArgumentException> { ErrorMessage.TOO_LONG_CAR_NAME }
    }

}