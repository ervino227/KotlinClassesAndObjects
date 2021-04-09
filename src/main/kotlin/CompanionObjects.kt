/*
Reasons to create a companion object

1. to scope properties and functions to a top-level scope
2. to provide static constants
3. to provide a factory method

 */
class CantCreate private constructor(val message: String) {
    fun showMessage() {
        println(message)
    }

    companion object {
        const val Light_Speed = 299_792_458
        fun factory(msg: String): CantCreate {
            return CantCreate(msg)
        }
        fun sillyPrint(self: CantCreate) {
            println("Accessing ${self.message}")
        }
    }
}

fun main() {
    val c1 = CantCreate.factory("Hello There")
    c1.showMessage()
    CantCreate.sillyPrint(c1)
    println("The speed of light is ${CantCreate.Light_Speed} ms/s")
}