package classes

/**
 * 각각의 인스턴스 내에 공통으로 사용하는 속성을 정의할 수 있다.
 * companion object 를 이용하여 공통된 속성을 정의할 수 있다.
 */
class FoodPoll(val name: String) {
    companion object {
        var total: Int = 0
    }

    var count = 0;

    fun vote() {
        total++
        count++
    }
}

fun main() {
    val rice = FoodPoll("밥")
    val noodle = FoodPoll("라면")

    rice.vote()
    rice.vote()
    rice.vote()
    noodle.vote()

    println("rice count : ${rice.count}")
    println("noodle count : ${noodle.count}")
    println("total count : ${FoodPoll.total}")
}