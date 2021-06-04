package bestpractice

data class Person(
    val name: String,
    val age: Int,
) {
    var address: String? = null
        private set

    fun setAddress(address: String) {
        this.address = address
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age, address=$address)"
    }
}
