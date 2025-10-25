package racingcar.model

import racingcar.util.ErrorMessage

class Race(private val cars: List<Car>) {
    init {
        val names = cars.map { it.name }
    }

    fun runRound(): List<Pair<String,String>> {
        cars.forEach { it.move() }
        return cars.map { it.name to it.position() }
    }

    fun checkWinners(): List<String> {
        val max = cars.maxOf { it.distance }
        return cars.filter { it.distance == max }.map { it.name }
    }
}