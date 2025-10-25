package racingcar.util

import racingcar.model.Car
import racingcar.util.ErrorMessage
import racingcar.util.ErrorMessage.IDENTICAL_CAR_NAME

object CarFactory {
    fun ExtractCarName(input: String): List<Car> {
        val eraseBlank = input.replace(" ", "")
        require(eraseBlank.isNotBlank()) { ErrorMessage.EMPTY_CAR_NAME }

        val carNames = eraseBlank.split(",")
        val cars = carNames.map {
            val trimmed = it.trim()
            //Car에 init로 검증이 존재하긴 하지만, CarFactory에는 입력을 제대로 전달해야므로 작성
            //CarFactory -> "입력 파싱 책임", Car -> "객체 무결성 책임"
            require(trimmed.isNotBlank()) { ErrorMessage.EMPTY_CAR_NAME }
            require(trimmed.length <= 5) { ErrorMessage.TOO_LONG_CAR_NAME }
            Car(trimmed)
        }
        val identicalNames = cars.map { it.name }.toSet()
        require(identicalNames.size == cars.size) { ErrorMessage.IDENTICAL_CAR_NAME }

        return cars
    }
}