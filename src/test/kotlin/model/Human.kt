package model

data class Human(
    val name: String,
    val age: Int,
    val height: Double? = null
) {

    var address: String? = null
    private set

    fun initAddress(address: String) {
        this.address = address
    }
}