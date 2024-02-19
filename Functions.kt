import java.util.*;
fun main(args: Array<String>) {
     feedthefish()
     swim("very fast")
     val day=randomday()
    println(shouldwaterChange(day))
}



// our main task is to create a function that would be calling another function which would help it to get the random day of the week



fun feedthefish(){
    val day= randomday()
    val food=fishfood(day)
    println("Day is $day and fish eats $food")
}



fun randomday():String{
    val week= arrayOf("Monday","Tuesday","Wednesday","Thursday")
    return week[Random().nextInt(week.size)]
    // this wwould help us to get an random integer from the range which would be starting from 0 to the size of our array
    // which in this case would be from 0 to 4.

}



/// now modfiying the code by adding different foods for different days but ths time we would be using the when statement for handling the different days


fun fishfood(day:String):String{
    var food=""
    when(day){
        "Monday" -> food="Chicken"
        "Tuesday" -> food="Pasta"
        "Wednesday" -> food="lentils"
        "Thursday" -> food="pizza"
    }
    return food
}


// concept of default value for an parameter in a function.


fun swim(speed:String="Fast"){
   println("swimming $speed")
   // this function is created with an default value to the parameter speed
   // so during function calling it is not mandatory to pass the value for speed.

}





fun shouldwaterChange(day:String,temperature:Int=22, dirtylevel:Int=20):Boolean{
 
  // Now here we are having multiple conditions to tackle, which includes checking the day of the week, the temperature rate,
  // and the dirtylevel so if we want to use when statement to handle all these conditons we need to use it without an argument.

  return when {
    temperature >30 -> true
    dirtylevel >30 -> true
    day == "Thursday" -> true
    else -> false
  }

  // One important thing about the using the when statement without any argument is that while handling all the conditions that are present
  // inside the block, it would return true when any one of the condition is true individually
