fun main() {

    var nilai = 'B'

    when (nilai){
        'A' -> {
            println("Amazing")
        }
        'B' ->{
            println("Good")
        }
        'C' -> {
            println("Not Bad")
        }
        'D' -> {
            println("Bad")
        }
        else -> {
            println("coba taun depan")
        }
    }

    //multiple
    when(nilai){
        'A', 'B', 'C' -> {
            println("Selamat Anda Lulus")
        }else ->{
            println("Belum bisa lulus")
        }
    }


    //expesi in
    nilai = 'B'
    val nilaiLulus: String = "B"
    when(nilai){
        in nilaiLulus -> {
            println("Selamat anda lulus")
        }
        !in nilaiLulus -> {
            println("Belum lulus")
        }
    }

    //expresi is
    val name = "mus"
    when(name){
        is String -> println("name is string")
        !is String -> println("name is not string")
    }

    val nilaiexam = 60
    when {
        nilaiexam > 70 -> println("Lulus")
        nilaiexam > 60 -> println("belum Lulus")
        else -> println("jgn nangis")
    }
}