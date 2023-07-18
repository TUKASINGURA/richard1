/*

     3. A person has four option of choosing between;
    pizza, chicken, pancakes or cake. If they choose pizza, they'll go to pizza hut,
     if chicken, they'll go to kfc, if pancakes, they'll go to foodhub,
     if cake, they'll go to cakely. Write
     -a program using an if statement that captures the persons choice and prints the
     selected restaurant
     -same program using a when statement

 */

//fun main(){
//    try {
//        println("select among the following available choiices:")
//        println("1.pizza")
//        println("2.chicken")
//        println("3.pancake")
//        println("4.cake")
//        print("what is your choice: ")
//        var userinput = readln()
//
//        if (userinput=="pizza"){
//            println("you will go to the PIZZA Hut")
//        }else if (userinput=="chicken"){
//            println("you will go to KFC ")
//        }else if (userinput=="pancake"){
//            println(" You will go the foodhub")
//        }else if (userinput=="cake"){
//            println("You will go to the cakely")
//        }else{
//            println("can you please select a right option")
//        }
//
//    }catch (e: Exception){
//        println("enter the right choice")
//    }
//}

//implementing the above using the when condition

fun main(){
        println("select among the following available choiices:")
        println("1.pizza")
        println("2.chicken")
        println("3.pancake")
        println("4.cake")
        print("what is your choice: ")
        val userinput = readln()

    val result = when (userinput) {
        1.toString() -> "you will go to the PIZZA Hut"
        2.toString()-> "you will go to KFC"
        3.toString() -> "You will go the foodhub"
        4.toString() -> "You will go to the cakely"

        //for the users who will be entering the words
        "pizza" -> "you will go to the PIZZA Hut"
        "chicken"-> "you will go to KFC"
        "pancake" -> "You will go the foodhub"
        "cake" -> "You will go to the cakely"
        else -> "you must select what' available on our menu."
    }
    println(result)

}
