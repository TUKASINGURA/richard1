fun main(){
    println("Enter the three numbers that your want to multiply" )
    val a1 = readln().toFloat()
    val b2= readln().toFloat()
    val c3= readln().toFloat()

    multiplythreenums(a1,b2,c3)
}

fun multiplythreenums(a:Float, b:Float,c:Float){

    val product= a*b*c

    println("The product of the three numbers captured from the keyboard is $product")

}