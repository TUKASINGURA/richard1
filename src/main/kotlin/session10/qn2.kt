fun main(){
    // 2. assuming a group A contains elements {a, b, c, d, e , a, g, r, f}
    //      group B contains {ant, bee, elephant, dog, cat}. Create a map that links the two groups using their first characters
    //
    //    3. after implementing 2 above, add five entries that map five unique characters to the respective animal name

    val groupA= listOf<String>("a", "b", "c", "d", "e", "g", "r", "f")
    val groupB= listOf<String>("ant", "bee","cat" , "dog","elephant")

    val combinedGroups= mutableMapOf<String, String>(
        groupA[0] to groupB[0],
        groupA[1] to groupB[1],
        groupA[2] to groupB[2],
        groupA[3] to groupB[3],
        groupA[4] to groupB[4]
)
println(combinedGroups)

    combinedGroups.putIfAbsent("c", "cow" )
    combinedGroups.putIfAbsent("g", "girraffe")
    combinedGroups.putIfAbsent("r","rat")
    combinedGroups.putIfAbsent("d","dog")
    combinedGroups.putIfAbsent("e","elephant")
    combinedGroups.replace("e","rabbit")
    combinedGroups.putIfAbsent("f","frog")
    println(combinedGroups)
}

