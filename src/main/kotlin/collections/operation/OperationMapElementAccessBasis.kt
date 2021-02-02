package collections.operation

fun main() {
    val map = mapOf("key" to 42)

    val value1 = map["key"]
    val value2 = map["key2"]
    val value3: Int = map.getValue("key")
    val mapWithDefault = map.withDefault { k -> k.length }

    // mapWithDefault 를 사용하여, 비어있는 key 값에 대해선 해당 key 에 대한 길이값을 반환하도록 하였다.
    val value4 = mapWithDefault.getValue("key2")

    try {
        map.getValue("anotherKey")
    } catch (e: NoSuchElementException) {
        println("Message : $e")
    }

    println(value1)
    println(value2)
    println(value3)
    println(mapWithDefault)
    println(value4)
}