package collections

/**
 * mapOf() 를 사용하면 단순히 읽기전용으로만 된다.
 */
const val POINTS_X_PASS = 15
val accounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 200, 3 to 300)
val reports: Map<Int, Int> = accounts

fun updatePointsCredit(accountId: Int) {
    if(accounts.containsKey(accountId)) {
        println("Updating $accountId")
        accounts[accountId] = accounts.getValue(accountId) + POINTS_X_PASS
        return
    }

    println("Error")
}

fun accountsReport() {
    reports.forEach { (k, v) -> println("ID $k: credit $v") }
}

fun main() {
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()

    val sampleMap: Map<Int, Int> = mapOf(1 to 10, 2 to 20)
}