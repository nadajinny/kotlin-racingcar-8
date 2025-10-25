package racingcar.view

class ConsoleOutputView: OutputView {
    override fun printRequestCarName() {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    }

    override fun printRequestRaceCount() {
        println("시도할 횟수는 몇 회인가요?")
    }

    override fun printRaceStart() {
        println("실행 결과")
    }

    override fun printCurrentRace(round: List<Pair<String, String>>) {
        round.forEach{
            (name, position) -> println("$name: $position")
        }
        println()
    }

    override fun printRaceResult(winner: List<String>) {
        print("최종 우승자 : ${winner.joinToString(", ")}")
    }
}