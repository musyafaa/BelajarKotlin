fun main() {

    val nilaiujian = 80
    val nilaiabsen = 60

    val apakahlulusujian = nilaiujian > 75
    val apakahlulusabsen = nilaiabsen > 75

    val apakahlulus = apakahlulusujian && apakahlulusabsen
    println(apakahlulus)
}