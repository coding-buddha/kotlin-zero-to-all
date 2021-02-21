package documentation.delegation

interface SoundBehavior {
    fun makeSound()
}

class ScreamBehavior(val n: String): SoundBehavior {
    override fun makeSound() {
        println("${n.toUpperCase()} !!!")
    }
}

class RockAndRollBehavior(val n: String): SoundBehavior {
    override fun makeSound() {
        println("I'm the king of rock 'N' Roll: $n")
    }
}

/**
 * 위임패턴을 바로 구현할 수 있다.
 * 메소드는 따로 구현하지 않는다.
 * 대신 메소드 호출을 책임있는 구현에 위임한다.
 * 대리자 개체는 by 키워드 뒤에 정의된다.
 */
class TomAraya(n: String): SoundBehavior by ScreamBehavior(n)

class ElvisPresley(n: String): SoundBehavior by RockAndRollBehavior(n)

fun main() {
    val tomAraya = TomAraya("Thrash Metal")
    tomAraya.makeSound()

    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvisPresley.makeSound()
}