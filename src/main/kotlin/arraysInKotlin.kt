fun descriptionOfArrays(){
    // there are two types of arrays ie primitive and non primitive arrays
    //primitive arrays contain only one data type e.g

    val firstArray= Array<Int>(5,{0})
    firstArray[0]=1
    firstArray[1]=1
    firstArray[2]=1
    firstArray[3]=1
    firstArray[4]=4
    //non primitive arrays contain different data types e.g
    val secondArray= arrayOf("richard",5,'r',false)
    println(secondArray[2])
}

fun main(){
    descriptionOfArrays()
}