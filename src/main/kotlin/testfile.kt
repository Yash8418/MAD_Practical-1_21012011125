class student(enrollment_No:Int,name:String){
    var en=enrollment_No
    var n=name
    constructor():this(125,"Yash")
    {

    }
    fun print() {
        println(en)
        println(n)
    }

}
fun main(){
    val ob = student()
    ob.print()
}