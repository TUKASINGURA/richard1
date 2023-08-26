package session13

//create a class color having attributes name, symbol and hex_code and a function
// that returns the three attributes as a string

//create a class called Rainbow that inherites from the class color and
//modifies the function in class color to return all the colors of the class Rainbow and prints the output

open class Color{
    var name:String ="cow"
    var symbol:String= ""
    var hexCode:String=""
   open fun attributes():String{

        return "the name of the animal is $name represented by $symbol "
    }
}

class RainBow: Color(){
    override fun attributes(): String {
        return super.attributes()
    }
    }

fun main(){
    val g= Color()
    println(g.attributes())
}