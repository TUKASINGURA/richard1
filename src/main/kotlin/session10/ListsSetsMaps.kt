fun main(){
    // all the user defined functions are always called inside the main function
    maps()
}
fun lists(){
    var myList= mutableListOf<Int>(1,2,3,4)
    myList.add(9)
    val sumOfNumber=myList.sum()
 myList.forEach{ println(it) }
    println("the sum of the numbers is $sumOfNumber")
}
fun sets() {
    // sets are composed of only unique items or objects
    // constists of unique items meaning there is no duplication of the variables
    // elements in a set can not be accessed by indexing coz a set consists of the elements that are not ordered

    val items = setOf<String>(
        "Onions",
        "Onions",
        "Tomatoes",
        "Carrots",
        "WaterMelon"
    )// for this type of set you can not append any value to it
    // converting the given set into a list
    val sortList = items.toList()

//    items.forEach{println(it)}
//    println(sortList)
//
    val number = mutableSetOf<Int>(12, 34, 1, 34, 56, 78)// this set allows the appending of the items to it
    number.add(78)
    number.add(78)
    number.add(23)
    //it should be noted that the duplication of the elements is not allowed
    //each element in a set will be printed once despite how many times its being listed in the set when creating it
    val numberList = number.toList()
    println(numberList)

//    number.forEach{ println(it) }
}

fun maps(){
    //maps in kotlin are similar to the dictionaries in python
    // the elements in the map are uniquely identified by their corresponding keys

    val mapOne = mapOf<Int, String>(1 to "Richard", 2 to "Werinde", 3 to "Annet")// this list can not be changed

    val mapSecond= mutableMapOf<Int, String>(23 to "Onions", 24 to "Bread", 25 to "Coffee")// this list can be changed
    mapSecond.remove(24)
    mapSecond.replace(23,"Onions","Ginger")
    mapSecond[56]="Cabbage"

    mapSecond.forEach{
        int,string->
        println("$int and $string")
    }

}