package controlflow.step02

class Animal(val name: String)

class Zoo(private val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
         return animals.iterator()
    }
}

fun main() {

    // listOf 를 통한 배열화
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {
        println("animal name : ${animal.name}")
    }
}