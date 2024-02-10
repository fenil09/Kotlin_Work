

fun main(){
  Member().heymember()
}

class Member{
    fun heymember(){
        println("member function is been called")
    }
}

// The thing here is that we do not need to create the instance of the class Member for calling the heymember function because as the function is been created inside
// the class it becomes its member and thus kotlin allows this flexibility to call function without having relying on the instance of tha class which associate the function.
