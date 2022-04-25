fun main() {

    tailrec fun display(value: Int){
        println("Recursive $value")
        if (value > 0)
            display(value -1)
    }
    display(10000)

    //factorial tail
    tailrec fun factorialRecursive(value: Int, total: Int = 1): Long{
        return when (value){
            1 -> 1
            else -> factorialRecursive(value -1, total * value)
        }
    }

    println(factorialRecursive(10))
}