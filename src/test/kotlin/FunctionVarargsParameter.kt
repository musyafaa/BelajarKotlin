fun finalValue( name: String, vararg values: Int): Int {
    var total = 0

    for (value in values){
        total += value
    }

    return total
}
fun main() {
    val result = finalValue("Mus",10, 10, 10)
    println(result)

}
