package standardlib.string

/**
 * 스트링 템플릿을 이용한 스트링 출력
 */
fun useStringTemplate() {
    val name = "Park"

    println("Hello, $name")
    println("Your name is ${name.count()} long!")
}

/**
 * 멀티라인 스트링
 * (문자열에 일반적으로 예약된 여러 줄의 텍스트 또는 특수문자가 포함되어 있는 경우)
 * 쌍따옴표를 세개 연달아 붙이게 되는 경우 인텔리제이에서 자동으로 trimIndent() 를 붙여준다.
 * trimIndent() 는 모든 행의 공통된 들여쓰기를 제거한다. 추가적으로 첫번째 줄과 마지막 줄의 공백도 제거한다.
 */
fun useMultiLineString() {
    val name = """
        hong gil dong
        the great
        the "Knowledgeable"
    """.trimIndent()
    println("Hello, $name!")
    println("Your name is ${name.count()} long!")
}

fun useMultiLineStringWithoutTrimIndent() {
    val name = """
        hong gil dong
        the great
        the "Knowledgeable"
    """
    println("Hello, $name!")
    println("Your name is ${name.count()} long!")
}

fun useJsonStringMyMultiLineString() {
    val json = """
        {
            "name": "jane",
            "lastName": "doe",
            "age": 29
        }
    """.trimIndent()
    println(json)
}

/**
 * 큰 문자열을 생성할 때 유용하다.
 */
fun useBuildString() {
    val name = "Jane"
    val result = buildString {
        repeat(5) {
            append("Hello, ")
            append(name)
            appendLine("!")
        }
    }
    println(result)
}

/**
 * isBlank() 함수는 isEmpty() 보다 엄격하다.
 * 공백에 대해서도 true 를 반환한다.
 * " " -> true
 * "" -> true
 */
fun useStringBlankMethod(value: String) {
    val result = value.isBlank()
    println("[$value] 의 isBlank() 의 결과는 $result 입니다.")
}

/**
 * " " -> false
 * "" -> true
 */
fun useStringEmptyMethod(value: String) {
    val result = value.isEmpty()
    println("[$value] 의 isEmpty() 의 결과는 $result 입니다.")
}

/**
 * 해당 문자열이 비어있거나 공백인 경우 함수를 실행시킨다.
 */
fun useIfBlankMethod(value: String) {
    // ifEmpty {} 메소드도 존재한다.
    val neverBlankString = value.ifBlank {
        "해당 글자는 비어있으니깐 이 메소드를 수행한다."
    }

    println(neverBlankString)
}

fun useComparingStringByEquality(value: String) {
    val origin = "hello"
    val result = origin == value
    println("$origin 과 $value 는 == 연산의 결과가 $result 로 나왔다.")
}

/**
 * equals() 함수의 ignoreCase 를 이용하는 것이,
 * 인자값으로 들어온 문자열에 대해 toLowerCase() 함수를 호출해서 비교하는 것보다 성능상 이점이 있다.
 */
fun useComparingStringByIgnoreCase(value: String) {
    val origin = "hello"
    val result = origin.equals(value, ignoreCase = true)
    println("$origin 과 $value 는 equals(ignoreCase = true) 연산의 결과가 $result 로 나왔다.")
}

/**
 * 멀티라인을 배열로 반환한다.
 */
fun useMultiLinesLineMethod() {
    val input = """
        Hi
        Hello
        Everyone
        Good News
    """.trimIndent()
    println(input.lines())
}

/**
 * https://dev.to/kotlin/kotlin-standard-library-safari-strings-3lj1
 * 해당 문서 보고 직접 타이핑 해보는 시간을 가짐
 */
fun main() {
    useStringTemplate()
    println("----------")
    useMultiLineString()
    println("----------")
    useMultiLineStringWithoutTrimIndent()
    println("----------")
    useJsonStringMyMultiLineString()
    println("----------")
    useBuildString()
    println("----------")
    useStringBlankMethod(" ")
    useStringBlankMethod("")
    useStringBlankMethod("a")
    useStringEmptyMethod(" ")
    useStringEmptyMethod("")
    useStringEmptyMethod("a")
    println("----------")
    useIfBlankMethod(" ")
    useIfBlankMethod("")
    useIfBlankMethod("안녕하세요")
    println("----------")
    useComparingStringByEquality("hello") // true
    useComparingStringByEquality("Hello") // false
    println("----------")
    useComparingStringByIgnoreCase("hello") // true
    useComparingStringByIgnoreCase("Hello") // true
    println("----------")
    useMultiLinesLineMethod()
}
