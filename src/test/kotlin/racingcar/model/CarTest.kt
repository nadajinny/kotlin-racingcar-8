package racingcar.model

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows

class CarTest {
    @Test
    fun `전체 자동차 이름 문자열이 비어있으면 예외`() {
        assertThrows<IllegalArgumentException> { Car("")}
    }

    @Test
    fun `자동차 이름이 5자를 초과하면 예외`() {
        assertThrows<IllegalArgumentException> { Car("6글자넘은자동차")  }
    }

    @Test
    fun `자동차의 현재 위치는 하이픈의 갯수로 표시`() {
        val car = Car("car", 6)
        assertEquals("------", car.position())
    }
}