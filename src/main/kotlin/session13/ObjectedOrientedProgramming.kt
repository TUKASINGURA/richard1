package session13

import org.w3c.dom.ranges.Range
import java.awt.datatransfer.ClipboardOwner
import java.time.Year

// objects are the instances of the classss



class Car{
    var bond: String=""
    var brand: String=""
    var model:String=""
    var color:String=""
    var year: String=""
    var hosePower:String= ""


    constructor()
    constructor(name1:String)
    constructor(brand1:String,owner:String)
}

//// a class with the constructor
//class Car2(var color1:String="", var year:String=""){
//    var owner:String=""
//}

fun main(){
     val RangeRover= Car()

    RangeRover.bond="Success Motors"
    RangeRover.year="2009"
    RangeRover.model="Range RoverSport"
    RangeRover.color ="Black"
    RangeRover.brand="New Model"

    println(RangeRover.brand)
}

open class Engine(){
    //private, public and protected members of a class

    // all the members of a class a public by default

   private  var piston:Int= 56
    protected var plugs:Int=4
    var motors:Int=4
    var funs:Int=32

    fun mainPurpose(){
        println("make the element move ")
    }
}

class CarEngine: Engine(){

}