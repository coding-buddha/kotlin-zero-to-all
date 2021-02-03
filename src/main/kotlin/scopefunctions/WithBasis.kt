package scopefunctions

class Configuration(var host: String, var port: Int)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    // use with scope
    with(configuration) {
        println("$host:$port")
    }

    // does not use with scope
    println("${configuration.host}:${configuration.port}")
}