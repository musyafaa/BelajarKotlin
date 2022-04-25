fun main() {

    //return if
    fun sayHello(name: String = ""):String{
        return if (name == ""){
            "Hai Guys"
        }else{
            "Hello $name"
        }
    }

    println(sayHello())
    println(sayHello("Musyafa"))

    //return when
    fun hello(name: String = ""): String{
        return when(name){
            "" -> "Hello Gan"
            else -> "Hello $name"
        }
    }

    println(hello())
    println(hello("Hehe"))
}