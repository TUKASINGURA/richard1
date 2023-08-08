fun main(){
    //create an array of 6 doubles and print out the sum of all elements in the array
val numbers = Array<Double>(6,{6.0})
    numbers[0]=50.0
    numbers[1]=3.0
    numbers[2]=43.0
    numbers[3]=4.0
    numbers[4]=5.0
    numbers[5]=5.0
// variable for calculating the sum of the items in the array
    val sum = numbers.sum()
    println("the sum of the numbers is: $sum")
}