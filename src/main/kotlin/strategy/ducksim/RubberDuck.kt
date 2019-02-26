package strategy.ducksim

class RubberDuck : Duck() {
    init {
        quackBehavior = CantQuack()
        flyBehavior = CantFly()
    }

    override fun display() {
        println("I am a Rubber Duck!")
    }
}