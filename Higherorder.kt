


fun main(args: Array<String>) {    
 
    val result=Netoperations(20,40,::add)
    println(result)

}



fun add(a:Int,b:Int):Int{
    return a+b
}

fun subtract(a:Int,b:Int):Int{
    return a-b
}



fun Netoperations(x:Int,y:Int, operations:(Int,Int) -> Int):Int{
    return operations(x,y)}


    

    
