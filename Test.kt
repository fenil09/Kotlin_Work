//Write a Kotlin function called filterTransactions that takes a list of Transaction objects and a category name as input. 
//The function should return a new list containing only the transactions that belong to the specified category.



fun main(args:Array<String>){

    val listoftransaction=listOf(Transactions(
        2,2500.25,"Primary"
    ),Transactions(3, 500.2, "secondary"), Transactions(4, 45.20, "Quartley"),Transactions(7, 54.20, "not imporant"))

    println(filterTransactions("not imporant", listoftransaction))
    println(calculateamount(listoftransaction))


}


data class Transactions(val id:Int,val amout:Double,val category:String)


fun filterTransactions(categoryname:String,transactionobject:List<Transactions>):List<Transactions>{
    return transactionobject.filter { 
        it.category == categoryname
     }
}



//Additionally, write a function called calculateTotalAmount that takes a list of Transaction objects as input and calculates the total amount of all transactions in the list.

fun calculateamount(transactionobject:List<Transactions>):Double{
    return transactionobject.sumOf { it.amout } 
}