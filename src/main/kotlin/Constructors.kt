class Vehicle (
    val make: String, val model: String,
    val year: Int, val state: String = "CA"
        ) {
    override fun toString(): String {
        return "$year $make $model ($state)"
    }

    init {
        println("First initializer block - $this")
    }

    constructor(
        make: String, model: String,
        year: Int, state: String, style: String
    ): this(make, model, year, state){
        this.style = style
    }

    constructor(
        make: String, model: String, year: Int,
        state: String, style: String, status: String
    ): this(make, model, year, state, style){
        this.status = status
    }

    private var style = ""
    private var status = ""
}

fun main() {
    val car = Vehicle("Chevrolet", "Volt", 2018)
    println(car)
    val car2 = Vehicle(state = "NV", make = "Ford", model = "Mustang", year = 2019)
    println(car2)
    val car3 = Vehicle("Tesla", "Model S", 2013,"RI","P100D")
    println(car3)
    val car4 = Vehicle("Tesla", "Model 3", 2019, "CA", "Performance", "New")
    println(car4)
}