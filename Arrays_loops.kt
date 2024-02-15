
import java.util.*;
fun main(args: Array<String>) {

    val life=listOf("Good", "Bad","Okay")
    println(life)

    // This is an simple list in which we cannot add or remove items meaning
    // its size is fixed.

    // If we want to create an list which can be manipulated we need to use the mutablelistof function.
    val mutablist=mutableListOf("tuna","salmon","pork")
    println(mutablist)
    mutablist.remove("salmon")
    println(mutablist)

    // Arrays in kotlin are also of fixed size we cannot change its size or meaning add or remove element once they are created.

    val myarray=arrayOf(1,2,3,4,5)
    println(Arrays.toString(myarray))

    // we can create an array that can hold elements of different data types 

    val mixarray = arrayOf(1,"fenil",20.56)
    println(Arrays.toString(mixarray))

    // Example showing the nesting done for arrays and list

    val numbers= intArrayOf(1,7,8)
    val oceans = listOf("Atlantic","Pacific")
    val oddlist= listOf(Arrays.toString(numbers),oceans,"salmon")
    println(oddlist)

    val array= Array(5) { 
        it*3
    }
    // In this block of code we are intiallizing an array which would have an size of 5
    // and using the lamba expression we would be setting its elements which would consist of
    // the multiplication result of the index number*3 leaving us with the output as
    //[0,3,6,12]

    println(Arrays.toString(array))


    // Creating loops to traverse the element of arrays and list

    val school= arrayOf("shark","salmon","tuna")
    for(element in school){
        print(element+" ")
    }
    // element is the loop variable that would be used to access the elements that would be present inside the array.
    


    // using the loop to get the element with their index number.

    for((index,element) in school.withIndex()){
        println("$element is present at $index")
    }

    // increasing and decreasing the value present inside the loop variable

    for(i in 3..8 step 2){
        print(i)
    }


    // Concept of Repeat loop like while execute something that is present inside its body for the number of times we have specified the task to be executed.
      var sum=0
     repeat(3) { 
       sum=sum+1
       println(sum)
      }

      // Given an array the task is to find the average and the sum of the elements that are present in it:
      
    SumAv()
           
    
}

fun SumAv(){
    var array=arrayOf(1,2,55,8)
    var sum=0
    var avg:Int=0
    val size:Int=array.size
    for(i in array){
      sum=sum+i
      avg= (sum/size)
    }
    println("Sum if the array is $sum and the average is $avg")
}


