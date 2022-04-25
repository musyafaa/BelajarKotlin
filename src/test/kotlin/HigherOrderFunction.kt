fun main() {

    fun hello(name: String, transformer: (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaupper = {value : String -> value.toUpperCase() }
    println(hello("mus", lambdaupper))

    println(hello("mus")  {value : String -> value.lowercase() })

    //trailing lambda
    val result1 = hello("mus", {value : String -> value.lowercase() })
    val result2 = hello("mus") {value : String ->
        value.lowercase() }

    println(result1)
    println(result2)
}