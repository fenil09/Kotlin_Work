


fun main(){

     var electricengine=electicengine()
     var electriccar=car(electicengine())
     electriccar.drivecar()


     val gasolinengine=gasolinengine()
     val gasolinecar=car(gasolinengine())
     gasolinecar.drivecar()
     

}

/* 
class car(){
   
    private val engine:Engine=Engine()
    fun startcar(){
        engine.drivecar()
    }
    private val electicengine:electricengine= electricengine()
    
    fun driveelecric(){
        electicengine.testelectric()
    }
}

class Engine(){
    fun drivecar(){
        println("driving the car is starting")

    }
}


class electricengine(){
    fun testelectric(){
        println("test my electric")
    }
}

// now this code is not extensible
// and also its not clean let us see how DI can help
// us to make it extensible meaning future ready and more clean

*/

class car(private val engine:Engine){

     fun drivecar(){
        engine.start()
     }
}


open class Engine{
    open fun start(){
        println("engine is started")
    }
}

class electicengine:Engine(){
    override fun start(){
        println("electric engine is started")
    }

}


class gasolinengine:Engine(){
    override fun start(){
        println("gasoline engine is started")
    }
}


// This Constructor Injection made the code more extensible and even cleaner so that let us say any changes which comes in the future can easiy be added to the code without
// any hassle and confusions.
