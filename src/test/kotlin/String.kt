fun main()
{
    var firstname: String = "Musyafa"
    var lastname: String = "Fadila"
    var address: String= """
        >Jalan Brigjend Encung Gang Karang Indah 3,
        >Purwokerto Utara,
        >Indonesia
    """.trimMargin(">")

    println(firstname)
    println(lastname)
    println(address)

    //menggabungkan string
    var fullname: String = "$firstname $lastname"
    var desc: String = "total $firstname char = ${lastname.length}"
    println(fullname)
    println(desc)
}