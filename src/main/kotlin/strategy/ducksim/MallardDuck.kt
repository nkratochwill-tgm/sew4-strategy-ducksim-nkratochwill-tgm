package strategy.ducksim

/**
 * inherits from Duck class to make behavior possible
 */
class MallardDuck : Duck() {

    /**
     * primary constructor, which initializes standard behavior for a mallard duck
     */
    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("I am a Mallard Duck!")
    }
}