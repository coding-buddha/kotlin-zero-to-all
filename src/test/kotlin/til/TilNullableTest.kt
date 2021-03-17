package til

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MyNullableItems(var items: List<String>?)

class MyBItems(var items: List<String>)

@DisplayName("nullability & null-safety test 는")
class TilNullableTest {

    @Test
    @DisplayName("typed nullability 를 확인한다.")
    fun nullabilityTest() {

        // given
        val items = listOf("a", "b", "c")

        // when
        val myItems = MyNullableItems(items)

        // then : 느낌표가 있음, items 는 널일수 없음을 명시한다.
        myItems.items!!.size shouldBe items.size
    }

    @Test
    @DisplayName("typed nullability 를 확인하지 않는다.")
    fun nullabilityNotTest() {

        // given
        val items = listOf("a", "b", "c")

        // when
        val myItems = MyBItems(items)

        // then
        myItems.items.size shouldBe items.size
    }

    @Test
    @DisplayName("null safety 하다.")
    fun nullSafetyTest() {

        // given
        val items = listOf("a", "b", "c")

        // when
        val myItems = MyNullableItems(items)

        // then
        myItems.items?.size ?: 10 shouldBe items.size

        // when
        val newMyItems = MyNullableItems(null)

        // then
        (myItems.items?.size ?: 10) shouldBe 3
        (newMyItems.items?.size ?: 10) shouldBe 10
    }
}