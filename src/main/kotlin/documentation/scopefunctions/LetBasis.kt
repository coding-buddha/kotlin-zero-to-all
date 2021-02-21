package documentation.scopefunctions

fun customPrint(it: String) {
    print("==> ${it.toUpperCase()}")
}

/**
 * let 은 범위지정 및 null 검사에 사용할 수 있다.
 * 객체를 호출하면, 주어진 코드블록을 실행하고 마지막의 표현식의 결과값을 반환한다.
 * 해당 객체는 it 표가를 통해서 블록 내에서 액세스 가능하다.
 */
fun main() {
    // (1) 수행 이후에 (2) 가 수행된다.
    val empty = "test".let {
        customPrint(it)     // (1)
        it.isEmpty()        // (2) : 마지막 표현식의 결과값을 반환한다.
    }

    println(" is empty: $empty")

    println()
    println()
    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        // 안전하게 호출할 수 있도록 한다.
        // ? 표기를 사용함으로써, 해당 블록은 null 이 아닌 경우에만 수행된다. 그리고 추가적으로 파라미터 인자에서 ? 를 표기해서 null 이 들어올 수 있음읆 명시해주었다.
        str?.let{
            print("\t")
            customPrint(it)
            println()
        }
    }

    printNonNull(null)
    printNonNull("my string")
}
