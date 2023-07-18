import java.util.Scanner

fun main()
{
    val sc = Scanner(System.`in`)
    println("Enter Number:")
    val r=sc.nextInt()
    if(r%2==0)
    {
        println("Number is even")
    }
    else{
        println("Number is odd")
    }


}