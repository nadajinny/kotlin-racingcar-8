package racingcar.model

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows

class RaceTest {
    @Test
    fun `우승자가 여러명일 경우`() {
        val cars = listOf( Car("1",1), Car("2",1), Car("3",1), Car("4",0), Car("5",0))
        val race = Race(cars)
        assertEquals(listOf("1","2","3"), race.checkWinners())
    }


}