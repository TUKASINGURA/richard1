/*

     5. A person is moving to his village with a car moving at 20km/h and He has many
    alternative routes.
    If he uses route1, he'll move a distance of 5000km
    If he uses route2, he'll move a distance of 25000km
    If he uses route3, he'll move a distance of 50000km
    If he uses another, he'll move a distance of 10000km

     Find the time it will take him to reach the village using the separate routes
     -using an if statement
     -using a when statement
 */
fun main(){
    println("the following are the routes available, you can make a selelection")
    println()
    println("1.5000km")
    println("2.25000km")
    println("3.50000km")
    println("4.1000km")

    print("what is the route you have chosen: ")

    val route= readln()

    //using the try exception to capture any wrong input from the user to avoid crushing our programm
try {
    if (route.toInt()==1){
        val speed:Int=20
        val distance:Int=5000
        val time= distance*speed
        println("the time you will take is $time" + "hours")
    }else if (route.toInt()==2){
        val speed:Int=20
        val distance:Int=25000
        val time= distance*speed
        println("the time you will take is $time" + "hours")
    }else if (route.toInt()==3){
        val speed:Int=20
        val distance:Int=50000
        val time= distance*speed
        println("the time you will take is $time" + "hours")
    }else if (route.toInt()==4){
        val speed:Int=20
        val distance:Int=1000
        val time= distance*speed
        println("the time you will take is $time" + "hours")
    }else{
        println("you must select a route from the available rooots ")
    }
}

// incase the user inputs another word or character this message should be displayed on the screen
catch (e: Exception){
    println("you should select a number representing your route not anything else")
}
}