fun main()
{
    //Integer
    val age: Byte = 30
    val name: Int = 2000
    println(age)
    println(name)

    //Floating
    val value: Float = 95.07F
    val radius: Double = 1234124325.1121313
    println("")
    println(value)
    println(radius)

    //Literals
    var binary: Int = 0b10101010101
    println("")
    println(binary)

    //Underscore
    var price: Int = 10_000_000
    println("")
    println(price)

    //conversaion
    var number: Int = 100

    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()
    println("")
    println(byte)
    println(short)
    println(long)
    println(float)
    println(double)


}