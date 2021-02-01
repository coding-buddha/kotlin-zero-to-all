package collections

val openIssues: MutableSet<String> = mutableSetOf("unique1", "unique2", "unique3")
val closedIssue: Set<Int> = setOf(1, 2, 3)

fun addIssue(element: String): Boolean {
    return openIssues.add(element)
}

fun getStatusLog(isAdded: Boolean): String {
    return if(isAdded) "registered correctly." else "marked as duplicate and rejected"
}

fun main() {
    val newIssue: String = "unique4"
    val existIssue: String = "unique1"

    println(getStatusLog(addIssue(newIssue)))

    // 기존에 존재하는걸 넣으면 입력되지 않는다. 기존에 존재하기 때문에
    println(getStatusLog(addIssue(existIssue)))

    // closedIssue 는 읽기전용으로 setOf 가 구성된다.
}