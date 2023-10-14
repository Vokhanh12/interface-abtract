fun main(args: Array<String>) {

}


abstract class Animal{

   abstract fun MakeSound()


}

abstract class Machine{

    abstract fun run()

    abstract fun stop()

}

class Bolt : Animal(){

    override fun MakeSound() {
        TODO("Not yet implemented")
    }

}

class AngryBird : Animal(){

    override fun MakeSound() {
        TODO("Not yet implemented")
    }

}

class Nemo : Animal(){

    override fun MakeSound() {
        TODO("Not yet implemented")
    }

}

class McQueen() : Machine(){

    override fun run() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }

}

class Siddeley() : Machine(){

    override fun run() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }


}