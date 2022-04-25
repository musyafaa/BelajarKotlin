fun labelbreak(){
    LoopI@ for(i in 1..10){
        LoopJ@ for(j in 1..10){
            if (i > 5){
                break@LoopI
            }
            println("$i * $j = ${i * j}")


        }
    }
}
fun kabelContinue(){
    LoopI@ for(i in 1..10){
        LoopJ@ for(j in 1..10){
            if (j == 5){
                continue@LoopJ
            }
            println("$i * $j = ${i * j}")


        }
    }
}
fun main() {

    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)
        test("") test@{
            if (it == ""){
                return@test
            }else{
                println("mus")
            }
        }



}