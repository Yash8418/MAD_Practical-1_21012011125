fun main() {
    var a : Int = 10
    var b = a.toDouble()
    var c : String = a.toString()
    var d = c.toInt()

    var e : String = "11.12"
    var f = e.toDouble()

    println("Int value : "+a)
    println("Double value(From Int) : "+b)
    println("String value : "+c)
    println("Int value1 (from string) : "+d)
    println("Int value2 (from string) : "+d)
    println("Double value (from string) : "+f)

}