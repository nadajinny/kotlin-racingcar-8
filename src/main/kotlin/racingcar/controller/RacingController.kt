package racingcar.controller

import racingcar.model.Race
import racingcar.util.CarFactory
import racingcar.util.Validations
import racingcar.view.InputView
import racingcar.view.OutputView

class RacingController (
    private val input : InputView,
    private val output : OutputView
){
    fun run() {
        output.printRaceStart()
        val cars = CarFactory.ExtractCarName(input.readLine())
        output.printRequestRaceCount()
        val round = Validations.parseRound(input.readLine())

        val race = Race(cars)
        output.printRaceStart()

        repeat(round) {
            val result = race.runRound()
            output.printCurrentRace(result)
        }

        output.printRaceResult(race.checkWinners())
    }
}