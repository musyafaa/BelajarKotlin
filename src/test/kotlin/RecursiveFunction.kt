fun main() {

    fun factorial(value: Int): Int{
        var result = 1
        for (i in value downTo 1 ){
            result *= i
        }
        return result
    }

    println(factorial(10))

    //recursive
    fun factorialRecursive(value : Int): Int {
        return when (value){
            1 -> 1
            else -> value * factorialRecursive(value -1)
        }
    }
    println(factorialRecursive(10))
}