package model

class BlackBox : Box {
    override var name: String = ""
    override val source: String = ""
    override fun getMyName(): String {
        return this.name
    }
}