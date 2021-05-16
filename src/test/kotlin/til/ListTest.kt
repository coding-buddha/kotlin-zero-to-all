package til

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ListTest {

    @Test
    fun listSubListTest() {

        // given
        val list = mutableListOf(1, 2, 3, 4)

        // when
        val newList = list.subList(0, 1)

        // then
        newList.size shouldBe 1
    }

    @Test
    @DisplayName("순서를 섞는다.")
    fun listShuffledTest() {

        // given
        val list = mutableListOf(1, 2, 3, 4, 5, 6)

        // when
        val shuffledList = list.shuffled()

        // then
        shuffledList.size shouldBe 6
    }
}