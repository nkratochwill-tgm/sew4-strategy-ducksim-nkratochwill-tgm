package strategy.ducksim

class RubberDuck : Duck(){
    init {
        quackBehavior = CantQuack()
        flyBehavior = CantFly()
    }
    fun display(){
        print("I am a Rubber Duck!")
    }
}