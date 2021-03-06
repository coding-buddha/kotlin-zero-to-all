package til

class Color {

    companion object {
        // 자바에서의 static final 의 형태와 유사하다.
        const val RED = "RED"
        const val BLUE = "BLUE"
        const val YELLOW = "YELLOW"

        // 외부에서 접근할 수 없다.
        private const val WHITE = "WHITE"
        private const val BLACK = "BLACK"
    }

    fun getRed(): String {
        return RED;
    }

    fun getBlack(): String {
        return WHITE
    }
}

fun main() {
    println("companion object 를 통한 접근 (private 는 불가)")
    println(Color.RED)

    println("Color 객체를 만들고 난 뒤, 메소드 호출")
    val currentColor = Color()
    println(currentColor.getRed())
    println(currentColor.getBlack())
}