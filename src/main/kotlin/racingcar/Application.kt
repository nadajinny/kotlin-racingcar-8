package racingcar
import camp.nextstep.edu.missionutils.Console
import camp.nextstep.edu.missionutils.Randoms


class Car (val name: String, var dist: Int = 0) {
    fun move() {
        val randomNumber = Randoms.pickNumberInRange(0,9)
        if(randomNumber >= 4) dist++
    }
    fun getPosition(): String {
        return "-".repeat(dist )
    }
}
fun main() {
    // TODO: 프로그램 구현
    println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    var input = Console.readLine()
    if(input.isBlank()) throw IllegalArgumentException("자동차 이름이 제대로 입력되지 않았습니다.")
    input = checkValidName(input)
    val cars = splitName(input)
    println("시도할 횟수는 몇 회인가요?")
    val raceCnt = Console.readLine()!!.toInt()
    if(raceCnt <= 0) throw IllegalArgumentException("경주의 횟수가 올바르지 않습니다: $raceCnt")
    println("실행 결과")
    repeat(raceCnt) {
        race(cars)
    }
    val winner = checkWinner(cars)
    print("최종 우승자 : ${winner.joinToString(", ")}")
}

fun checkValidName(input: String) : String {
    return input.replace(" ", "")
}

fun splitName(input: String): List<Car> {
    val carName = input.split(",")
    val cars = mutableListOf<Car>()

    for(name in carName) {
        val trimed = name.trim()
        if(trimed.isBlank()) throw IllegalArgumentException("자동차의 이름이 제대로 입력되지 않았습니다.")
        if(trimed.length >= 6) throw IllegalArgumentException("자동차의 이름의 길이가 5를 초과합니다.")
        cars.add(Car(name))
    }
    return cars
}

fun race(cars: List<Car>) {
    for(car in cars) {
        car.move()
        println("${car.name} : ${car.getPosition()}")
    }
    println("")
}

fun checkWinner(cars: List<Car>): List<String> {
    val maxDistance = cars.maxOf{it.dist}
    return cars.filter{it.dist == maxDistance}.map{it.name}
}