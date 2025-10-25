package racingcar

import racingcar.controller.RacingController
import racingcar.view.ConsoleInputView
import racingcar.view.ConsoleOutputView

fun main() {
    // TODO: 프로그램 구현
    val racingController = RacingController(ConsoleInputView(), ConsoleOutputView())
    racingController.run()
}
