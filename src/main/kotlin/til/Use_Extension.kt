package til

import java.util.UUID

fun main() {
    applyAction("hello", "hi") {
        println("uuid[$it] ${it.uuid()}")
    }

    println("uuid : ${"hello".uuid()}")
}

fun applyAction(vararg s: String, action: (String) -> Unit) {
    s.forEach(action)
}

/**
 * 별도의 커스텀한 extension function
 */
fun String.uuid(): String {
    println("this : $this")
    return UUID.nameUUIDFromBytes(this.encodeToByteArray()).toString()
}
