fun main() {

    fun hello(name: String, transformer: (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val UpperOrLower = fun(value: String): String {
        if (value == ""){
            return "UPS"
        }else{
            return value.toUpperCase()
        }
    }
    println(hello("mus", UpperOrLower))
    println(hello("", UpperOrLower))

    println(hello("fadil", fun (value: String): String {
        return value.toLowerCase()
    }))


}