package documentation.classes

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  // return type is none (생략가능)

    /**
     * 단일 유형으로 데이터 타입을 얻을 수 있다. (single implementation) => singleton pattern
     * 객체에 액세스할 때 한번만 생성되기 때문에 lazy 하다.
     */
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("==")
    println("dayRates :: $dayRates")
    println("dayRates.javaClass :: ${dayRates.javaClass}")
    println("total price : $$total")
}

class Sample {

    // anonymous objects 은 private function 에서만 사용할 수 있다.
    // anonymous objects 로 반환된다.
    private fun foo() = object {
        val x: String = "x1"
    }

    // anonymous objects 은 public 선언 시 접근할 수 없다.
    fun publicFoo() = object {
        val x: String = "x2"
    }

    fun bar() {
        val x1 = foo().x
        println(x1)
        // 아래의 구문은 컴파일 에러가 발생한다. Unresolved reference: x
        // val x2 = publicFoo().x
    }
}

fun main() {
    val aRent = rentPrice(10, 2, 1)
    val bRent = rentPrice(20, 4, 2)

    val sample = Sample()
    sample.bar()

    println()
    println(sample.publicFoo())
    println(sample.publicFoo())
}