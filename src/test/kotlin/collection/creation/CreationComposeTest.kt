package collection.creation

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("컬렉션을 인스턴스화 하는 함수")
class CreationComposeTest {

    @Test
    @DisplayName("빈 컬렉션을 생성하는 함수 테스트")
    fun createEmptyTest() {
        // given
        // read-only
        val emptyList: List<String> = emptyList()
        val emptySet: Set<String> = emptySet()
        val emptyMap: Map<String, Any> = emptyMap()

        // then
        emptyList.size shouldBe 0
        emptySet.size shouldBe 0
        emptyMap.size shouldBe 0
    }

    @Test
    @DisplayName("read-only 컬렉션을 생성하는 함수 테스트")
    fun readOnlyCollectionTest() {

        // given
        val list = listOf("a", "b", "c", "a")
        val set: Set<String> = setOf("a", "b", "c", "c")
        val map: Map<String, Any> = mapOf("a" to 1, "b" to 2, "c" to 3, "a" to 10)

        // then
        list.size shouldBe 4
        set.size shouldBe 3
        map.size shouldBe 3

        // read-only 라도 var 은 선언하면 추가가 가능하다.
        // 하지만 var 을 val 로 변경하고 mutableListOf() 로 변경하라고 컴파일 단계에서 알려줌
        var newList = listOf(1, 2, 3)
        newList += 4
        newList.size shouldBe 4
    }

    @Test
    @DisplayName("컬렉션에 값을 추가 테스트")
    fun addElementInCollectionTest() {

        // given
        val list: MutableList<Int> = mutableListOf()
        val set: MutableSet<Int> = mutableSetOf()
        val map: MutableMap<Int, Any> = mutableMapOf()
        val arrayList: MutableList<Int> = arrayListOf()

        list.size shouldBe 0
        set.size shouldBe 0
        map.size shouldBe 0
        arrayList.size shouldBe 0

        // when
        list.add(1)
        list.add(2)
        list += 3
        list += 4

        set.add(1)
        set.add(2)

        map[1] = 1
        map[2] = 2

        arrayList += 1
        arrayList += 2
        arrayList.add(5)

        // then
        list.size shouldBe 4
        set.size shouldBe 2
        map.size shouldBe 2
        arrayList.size shouldBe 3
    }
}