package documentation.controlflow.step03

fun main() {
    for(i in 0..3) {
        print("$i ")
    }
    println()

    // exclusive
    for(i in 0 until 3) {
        print("$i ")
    }
    println()

    // step incr
    for(i in 2..8 step 2) {
        print("$i ")
    }
    println()

    // reverse order (include)
    for(i in 3 downTo 0) {
        print("$i ")
    }
    println()

    // 문자열 기반으로 루프를 돌 수 있음
    for(c in 'a'..'d') {
        print("$c ")
    }
    println()

    // 'z' 에서 두 스텝씩 멀어진다.
    for(c in 'z' downTo 's' step 2) {
        print("$c ")
    }
    println()

    val x: Int = 2

    // 범위 포함
    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }
    println()

    // 범위 미포함
    if (x !in 6..10) {
        print("x is not in range from 6 to 10")
    }
}