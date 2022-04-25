fun main() {

    var counter: Int = 0

    val lambdaIncrement = {
        println("lambda Increment")
        counter++
    }

    val anonymousIncrement = fun(){
        println("Anonymous Function Increment")
        counter++
    }

    fun functionIncrement(){
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}