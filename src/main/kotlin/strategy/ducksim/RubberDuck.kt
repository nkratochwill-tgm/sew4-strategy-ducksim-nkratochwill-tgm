package strategy.ducksim

class RubberDuck : Duck(){
    init {
        quackBehavior = CantQuack()
        flyBehavior = CantFly()
    }
    fun display(){
        println("I am a Rubber Duck!")
    }
}