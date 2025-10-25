package racingcar.view

interface OutputView {
    fun printRequestCarName()
    fun printRequestRaceCount()
    fun printRaceStart()
    fun printCurrentRace(round: List<Pair<String, String>>)
    fun printRaceResult(winner: List<String>)
}