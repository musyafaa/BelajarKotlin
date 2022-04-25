fun toUpper(value: String): String = value.toUpperCase()

fun main() {

    val contohLambda: (String, String) -> String = { firsname: String, lastname: String ->
        val result = "$firsname $lastname"
        result

    }

    val result = contohLambda("Musyafa", "Fadila")
    println(result)

    //kunci it
    val sayHello: (String) ->String = {
        "Hello $it"
    }

    println(sayHello("mus"))

    //method references
    val toUpperCase : (String) ->String = ::toUpper
    println(toUpperCase(     "Musyafa"))
}