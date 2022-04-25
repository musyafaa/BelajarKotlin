fun main() {

    val names = arrayOf("Muhammad", "Musyafa", "Fadila")
    var array = arrayOf("Muhammad", "Musyafa", "Fadila")

    var total = 0
    for (name in names)
    {
        println(name)
        total++
    }
    println("Total perulangan = $total")

    //For Range
    for (value in 0..100 step 10)
        println(value)

    val ukuranArray = array.size -1
    for (i in 0..ukuranArray){
        println("index ke $i = ${array.get(i)}")
    }
}