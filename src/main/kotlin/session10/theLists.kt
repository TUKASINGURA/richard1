//package session10
//
//fun main(){
////    val list= listOf<String>("richard","ben","orishaba","amos")
////
////    val convertedList= list.indexOfFirst {  }
//
//    val array= arrayOf<String>()
//    array.fill("richard", fromIndex =0, toIndex =4)
//
//    array.forEach { println(it) }
//
//
//}

fun main(){
     val map= mutableMapOf<String, String>()

    val groupA= listOf("a","b","c","d","c")
    val groupB= listOf("agreey","bosco","dancun","emannnual","girraffee")

    for(i in groupA){
        for (j in groupB){

            if (i.first()==j.first()){

                map.put(i,j)
            }
        }
    }

    map.forEach{
        println(it) }
}