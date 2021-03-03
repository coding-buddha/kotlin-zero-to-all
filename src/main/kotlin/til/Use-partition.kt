package til

/**
 * partition 을 통해서 하나의 조건을 기준으로 두 개의 분류로 나눌 수 있다.
 * val (참, 거짓) = XXX.partition { 조건 }
 */
fun main() {

    val list = listOf(1, 2, 3, 4, 5, 6, 7)
    val (evenList, oddList) = list.partition { it % 2 == 0 }
    val resultList = list.partition { it % 2 == 0 }

    println("짝수배열 : $evenList")
    println("홀수배열 : $oddList")
    println("전체결과 : $resultList")
}