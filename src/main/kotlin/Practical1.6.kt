fun addNums(x:Int , y:Int , z:Int):Int{
    val Addition:Int=x+y+z
    println("Addition of $x , $y , $z is :$Addition")
    return Addition
}
fun subNums(x:Int , y:Int , z:Int):Int{
    val Subtraction:Int=x-y-z
    println("Subtraction of $x , $y , $z is :$Subtraction")
    return Subtraction
}
fun multNums(x:Int , y:Int , z:Int):Int{
    val Multiplication:Int=x*y*z
    println("Multiplication of $x , $y , $z is :$Multiplication")
    return Multiplication
}
fun divNums(x:Int , y:Int ):Double{
    val Division=x/y.toDouble()
    println("Division of $x , $y is :$Division")
    return Division
}

fun main(){
    println("Enter 3 Numbers: ")
    val x= readLine()?.toInt()!!
    val y= readLine()?.toInt()!!
    val z= readLine()?.toInt()!!

    addNums(x,y,z)
    subNums(x,y,z)
    multNums(x,y,z)
    divNums(x,y)
}