package model

class WhiteBox(
    override var name: String,
    override val source: String
) : Box {
    override fun getMyName(): String {
        return this.name
    }
}