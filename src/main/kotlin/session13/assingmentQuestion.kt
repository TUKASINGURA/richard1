package session13

//create a class color having attributes name, symbol and hex_code and a function
// that returns the three attributes as a string

//create a class called Rainbow that inherites from the class color and
//modifies the function in class color to return all the colors of the class Rainbow and prints the output

open class Color{
    var name:String ="cow"
    var symbol:String= ""
    var hexCode:String=""

    constructor()
    open fun attributes(): String {
        return ""
    }

    constructor(name:String, symbol:String,hexCode:String)
   open fun attributes(name:String, symbol:String,hexCode:String):String{
       this.name=name
       this.symbol=symbol
       this.hexCode=hexCode

        return "$name $symbol $hexCode"
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