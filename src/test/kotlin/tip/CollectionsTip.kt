package tip

import io.kotest.assertions.asClue
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

data class Fruit(val name: String, val sugar: Int)

// https://youtu.be/ApXbm1T_eI4
class CollectionsTip {

    private lateinit var fruits: List<Fruit>

    @BeforeEach
    fun setup() {
        this.fruits = listOf(
            Fruit(name = "banana", 12),
            Fruit(name = "apple", 10),
            Fruit(name = "orange", 9),
            Fruit(name = "pineapple", 10),
            Fruit(name = "peach", 8),
            Fruit(name = "lemon", 10),
            Fruit(name = "mango", 13)
        ).sortedWith { a, b ->
            if (a.sugar == b.sugar) {
                a.name.compareTo(b.name)
            } else {
                b.sugar - a.sugar
            }
        }
    }

    @Test
    fun takeTest() {
        // given

        // when
        val takeFruits = fruits.take(4)

        // then
        takeFruits.size shouldBe 4
        takeFruits[0].name shouldBe "mango"
        takeFruits[1].name shouldBe "banana"
        takeFruits[2].name shouldBe "apple"
        takeFruits[3].name shouldBe "lemon"
    }

    @Test
    fun takeLastTest() {
        // given

        // when
        val takeFruits = fruits.takeLast(4)

        // then
        takeFruits.size shouldBe 4
        takeFruits[0].name shouldBe "lemon"
        takeFruits[1].name shouldBe "pineapple"
        takeFruits[2].name shouldBe "orange"
        takeFruits[3].name shouldBe "peach"
    }

    @Test
    fun dropTest() {
        // given

        // when
        val takeFruits = fruits.drop(4)

        // then
        takeFruits.size shouldBe 3
        takeFruits[0].name shouldBe "pineapple"
        takeFruits[1].name shouldBe "orange"
        takeFruits[2].name shouldBe "peach"
    }

    @Test
    fun dropLastTest() {

        // given

        // when
        val takeFruits = fruits.dropLast(4)

        // then
        takeFruits.size shouldBe 3
        takeFruits[0].name shouldBe "mango"
        takeFruits[1].name shouldBe "banana"
        takeFruits[2].name shouldBe "apple"
    }

    @Test
    fun partitionTest() {

        // given

        // when
        val (sweet, superSweet) = fruits.partition { it.sugar < 10 }

        // then
        sweet.asClue {
            it.size shouldBe 2
            it.map(Fruit::name) shouldContain "orange"
            it.map(Fruit::name) shouldContain "peach"
        }

        superSweet.asClue {
            it.size shouldBe 5
            it.map(Fruit::name) shouldContain "mango"
            it.map(Fruit::name) shouldContain "banana"
            it.map(Fruit::name) shouldContain "apple"
            it.map(Fruit::name) shouldContain "pineapple"
        }
    }
}