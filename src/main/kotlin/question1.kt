import kotlin.math.sqrt

/*
1. Solve the equation x2+10x+25 = 0  - x = (-b+-Sqrt(b2-4ac))/2a

*/

fun main() {
    // solution to question 1. Solve the equation x2+10x+25 = 0  - x = (-b+-Sqrt(b2-4ac))/2a

    println("this method is meant for solving the quudratic equation")
    println("")
    val  a:Int =1
    val b:Int =10
    val c:Int = 25

    if (((b*b)-(4*a*b))<0) {
        println("the quadratic equation gives out complex roots")
    }else{
        // calculating the square root of (b*b - 4ac)
        val squareroot:Double= sqrt(((b*b)-(4*a*c)).toDouble())

        // calcualating the value of the  root one of the equation
        val root1:Double= (-b.toDouble() - squareroot )/(2*a).toDouble()
         println("the value of root one: $root1")
        //calculating the value of the second root
        val root2:Double= (-b.toDouble() +squareroot )/(2*a).toDouble()
        println("the value of root two: $root2")

    }    }
