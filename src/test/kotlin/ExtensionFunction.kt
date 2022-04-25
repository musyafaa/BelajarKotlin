fun String.hello(): String {
    return "Hello $this"
}

fun String.printhello(): Unit = println("Hello $this")

fun main() {
    val name: String = "Mus"
    println( name.hello())

    name.printhello()
}