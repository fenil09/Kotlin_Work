import java.util.*
fun main(args: Array<String>) {
 
    val decorations= listOf("rock","pagoda","plant")
    // now we are using filters in here so let us say we want to print only the items
    // who have the first letter as p so we can apply filter on it

    println(decorations.filter { it[0] == 'p' })

    // concept of lazy and eager filter, by default so filters in kotlin are eager meaning everytime we apply an filter the list is been created.

// In general if we use eager filtering then every time the filter is been applied it would create the new filtered list for us but in
// lazy filtering when we apply the filter it would not create the filtered list instead it would just apply the filter and when we try to access the elements after the filter
// is been applied then it would create a list for us.

val lazylist = listOf("cricket","football","Faceball")
println(lazylist.asSequence().filter { it[0] =='f' })
// it would return an object not the elements
println(lazylist.asSequence().filter { it[0]=='f' }.toList())

val lazymap =decorations.asSequence().map { 
    println("access $it")
    it
 }

 println(lazymap)
 println("--------------")
 println("first: ${lazymap.first()}")
 println("--------------")
 println("ALL: ${lazymap.toList()}")

 // so if we see the execution of the above print statements output of the first statement would be an object as we have use the lazy filter and still not access any element after the map function is applied
 // the third print statement would be able to trigger the map function and execute the code inside the lambda for the map which would first print the first element and performing the mapping.
 // and the last print statment would access every element in the list, triggers the map function for every element in the list and then convert the sequence into the list.

 mappinganparticulatitem()
 applyinganlazyfilter()
 val scorelist=listOf(88,99,97,105,23)
 println(filterhigherscores(scorelist))

 val arraylist=arrayOf(4,5,9,8,7,6,3,2)
 println(Arrays.toString(filterevennumbers(arraylist)))
 
 val names=arrayOf("fenil","dishnat","Avi","jashpal","Chetan","Wu")
 println(Arrays.toString(filternnamesbylength(5, names)))

}

// one important thing that we need to keep in mind is that when to use the particular time of filters
// the basic thing is that let us say we have limited amount of items been present and we are sure about their accessiblity then we should go for the eager loading,
// another view to this argument is that if we have an large amount of data whose accessiblity is not sure then why we need to create an immediate list for that as the filter is applied
// we can do it when the elements are been accessed which would help us to save some siginificant amount of memory making our code more optimised.


fun mappinganparticulatitem(){
    // our goal here is to only transform the first element that just append usa to the first element of the list so let us see how can we do it.
    val decoration = listOf("Fenil","Rahul","Jashpal")
    val lazymap = decoration.asSequence().mapIndexed { index, element ->
           println("accessed $element")
           when(index){
            0 -> "USA $element"
            else -> element
           }
    }
    println("First being transformed ${lazymap.first()}")
     println("-------------")
    println("All elements ${lazymap.toList()}")
}




fun applyinganlazyfilter(){
    // here we are just appling an lazy filter to an list

    val decoraions = listOf("burger","pizza","salad")
    val lazyfilter = decoraions.asSequence().filter { 
        println("accessed: $it")
        it[0]=='b'
     }

     println(lazyfilter)
     println("----------")
     println("first :${lazyfilter.first()}")
     println("-------------")
     println("ALL: ${lazyfilter.toList()}")
}



fun filterhigherscores(scorelist:List<Int>):List<Int>{
    return scorelist.filter { it>=90 }
}



// Test question
//You are given an array of integers called numbers. Write a Kotlin function called filterEvenNumbers that takes this array as input and returns a 
//new array containing only the even numbers from the input array.


fun filterevennumbers(numbers:Array<Int>):Array<Int>{
    return numbers.filter { it%2==0 }.toTypedArray()
}





//You are given an array of strings representing names. Write a Kotlin function called filterNamesByLength that takes this array and a minimum 
//length as input and returns a new array containing only the names with a length greater than or equal to the specified minimum length.

fun filternnamesbylength(minlength:Int,stringarray:Array<String>):Array<String>{
    return stringarray.filter { 
        it.length>=minlength
     }.toTypedArray()
}

