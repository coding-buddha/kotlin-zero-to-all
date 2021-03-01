package standardlib.string

class Basic {

    private val strings = "Hello World"

    fun forLoop1() {
        print("forLoop1 :: ")
        for (c in strings) {
            print(c)
        }
        println()
    }

    fun forLoop2() {
        print("forLoop2 :: ")
        for (index in 0 until strings.count()) {
            print(strings[index])
        }
        println()
    }

    fun stringIsImmutable() {
        val name = "hong"   // 최초에 한번만 할당되고, 새로운 값으로 할당할 수 없다.
        println("new string :: ${name.toUpperCase()}") // 새로운 스트링 오브젝트를 만든다.
        println("origin string :: ${name}")   // 오리지널 스트링은 그대로 남아있다.
    }

    fun concatenateString() {
        var name = "hong"
        val secondName = "gil dong"
        name += " "

        // + 연산을 통해서 문자열을 연결할 수 있다.
        println(name + secondName)
    }
}

fun main() {
    val basic = Basic()
    basic.forLoop1()
    basic.forLoop2()
    basic.stringIsImmutable()
    basic.concatenateString()
}