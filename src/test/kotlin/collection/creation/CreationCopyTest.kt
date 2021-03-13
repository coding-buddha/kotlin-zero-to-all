package collection.creation

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("배열을 복사하는 함수")
class CreationCopyTest {

    @Test
    @DisplayName("배열로 복사하는 함수 테스트")
    fun copyTest() {

        // given
        val array:IntArray = intArrayOf(1, 2, 3, 4, 5)
        val newArray = IntArray(5)

        newArray.sumBy {it} shouldBe 0

        // when
        // (복사를 수행할 배열, 복사 시작 위치, 복사시작 인덱스 위치, 복사종료 인덱스 위치)
        array.copyInto(newArray, 3, 1, 3)

        // then
        println("array : ${array.contentToString()}")
        println("newArray : ${newArray.contentToString()}")
        newArray[0] shouldBe 0
        newArray[1] shouldBe 0
        newArray[2] shouldBe 0
        newArray[3] shouldBe 2
        newArray[4] shouldBe 3
    }

    @Test
    @DisplayName("배열을 부분복사하는 함수 테스트")
    fun copyOfRangeTest() {

        // given
        val array: IntArray = IntArray(10) { it * 10 }

        // when
        val newArray = array.copyOfRange(1, 5)

        // then
        println("array : ${array.contentToString()}")
        println("newArray : ${newArray.contentToString()}")
        array.size shouldBe 10
        newArray.size shouldBe 4
        array[1] shouldBe newArray[0]
        array[2] shouldBe newArray[1]
        array[3] shouldBe newArray[2]
        array[4] shouldBe newArray[3]
    }

    @Test
    @DisplayName("배열을 전체복사하는 함수 테스트")
    fun copyOfTest() {

        // given
        val array = IntArray(10) { it * 10 }

        // when
        val newArray = array.copyOf()

        // then
        array.size shouldBe newArray.size
        array contentEquals newArray shouldBe true
    }

    @Test
    @DisplayName("배열을 컬렉션으로 복사하는 함수 테스트")
    fun collectionToTest() {

        // given
        val array = IntArray(10) { it * 10 }
        val list: MutableList<Int> = mutableListOf()

        // when
        array.toCollection(list)

        // then
        println(list)
        list.size shouldBe 10
    }
}