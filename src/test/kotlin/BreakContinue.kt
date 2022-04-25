fun main() {

    var i = 0
    while (true)
    {
        println("Hello ke $i")
        i++

        if (i > 1000){
            break
        }

    }

    //continue
    for (i in 0..100){
        if (i % 2 == 0){
            continue
        }

        println("Anka $i")

    }

}