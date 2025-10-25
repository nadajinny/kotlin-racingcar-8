package racingcar.model

import camp.nextstep.edu.missionutils.Randoms
import racingcar.util.ErrorMessage

data class Car(val name: String, var distance: Int = 0) {
    init {
        require(name.isBlank()) { ErrorMessage.INVALID_CAR_NAME }
        require(name.length > 5) { ErrorMessage.TOO_LONG_CAR_NAME }
    }

    fun move() {
        val randomNumber = Randoms.pickNumberInRange(0,9)
        if (randomNumber >= 4) { distance++ }
    }
}