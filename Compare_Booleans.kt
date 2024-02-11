
 fun main(args: Array<String>) {
    val fish=50
    if(fish in 1..25){ //-> // indicates an rang for an value like in this case whether the 
                            // value of fish variable is in the range of 1 to 25
        println("things work")
    }
    else{
        println("it does not work")
    }
    fishcheck(fish)
}

// When statement would be simplyfying the if-else statement like if we have
// more condition to tackle then using the when statment we can do it efficiently.

fun fishcheck(fish:Int){
 
    when(fish){
        in 1..50 -> println("Inclusive range")
        else -> println("Sorry this is not allowed")
    }

}