inline fun hello(
    firstname: () -> String,
    lastname: () -> String
): String {
    return "Hello ${firstname()} ${lastname()}"
}

fun main() {
    for (i in 0..100){
        println(hello ({ "mus" }, {"Fad"}))
    }
}