package strategy.ducksim

class MallardDuck : Duck() {
    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("I am a Mallard Duck!")
    }
}