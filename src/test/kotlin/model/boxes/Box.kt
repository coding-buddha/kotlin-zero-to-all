package model.boxes

interface Box {
    var name: String
    val source: String

    fun getMyName(): String
}