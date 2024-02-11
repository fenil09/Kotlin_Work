

// Kotlin is able to handle the nullability with 
//ease by introducing the non-nullable variables.
fun main(args: Array<String>) {
    // kotlin wont allow you to assign null values to the not null
    // data types hence it is helping us to avoid the problems of null pointer exception.
  
     // now if we want to explicitly allow the not null values to hold null values we need to use the ? operator

    var rocks:Int?=null
    println(rocks)

    // this feature is more helpfull when there is the presence of
    // complex data types such as list because list can be empty for some period of time and can contain elements
    // let us say after an operation such as an database operation is been performed.


   var fishfood:Int?=null
   fishfood=fishfood?.dec()
   println(fishfood)

   // here we are making the code more consice by using the set of operators provided bt kotlin.

   // let us implement multiple conditions using the elvis operator ?:

   var fooddata:Int?=null
   fooddata=fooddata?.dec() ?: 0
   println(fooddata)
   // this code is executed in the following manner let us say the value of fooddata is not null so we would be able to decrease it value by 1 by its value is null then the 
   // compiler would be using the fallback value which in this case is 0



   // The not null assertion operator.
   // Let us say for example we have an variable is value cannot be null at
   // any point of time and if we are sure about its value being not null we can assign a not null assertion to it which can help us to catch errors in the program as when the value of
   // that particular variable comes out to be null then the program would throw us an null pointer exception helping us to know where the things went wrong.

     nullxception()



}

fun nullxception(){
   var s:String?=null
   var length =s!!.length
   println(length)
}



