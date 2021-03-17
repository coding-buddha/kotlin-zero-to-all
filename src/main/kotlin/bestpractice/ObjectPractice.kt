package bestpractice

object Network {
    const val API_URL = "http://localhost:8080"
    const val TIMEOUT = 1000L
}

object Positions {
    @JvmStatic
    fun create(x: Int, y: Int): Position {
        return Position(x, y)
    }

    class Position(var x: Int, var y: Int)
}

fun main() {

    /** 이건 싱글톤의 스태틱한 값을 보관하기 위함 **/
    val network = Network.API_URL
    val timeout = Network.TIMEOUT

    /** 아래는 좋은 방법인지 모르겠음.**/
    val position1 = Positions.create(10, 50)
    val position2 = Positions.create(10, 50)

    println(position1 == position2)
    println(position1 === position2)
    println(position1.equals(position2))
    println(position1)
    println(position2)
}