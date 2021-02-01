package collections

/**
 * [ordered]
 * - 목록이 변경가능한 mutableList
 * - 읽기 전용인 list
 * - 읽기 전용 라이브러리 listOf()
 */
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

fun addSudoer(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSudoer(4)
    println("Tot sudoers : ${getSysSudoers().size}")
    getSysSudoers().forEach { i ->
        println("Some useful info on user $i")
    }

    var numbers = listOf(1, 2, 3, 4)
    // 아래의 구문은 에러가 발생한다.
    // listOf() 는 읽기전용 리스트 반환 라이브러리이기 때문이다.
    //numbers.add(5)
}