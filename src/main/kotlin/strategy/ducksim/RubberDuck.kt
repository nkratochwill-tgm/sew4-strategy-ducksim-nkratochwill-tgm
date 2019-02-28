package strategy.ducksim

/**
 * inherits from Duck class to make behavior possible
 */
class RubberDuck : Duck() {

    /**
     * primary constructor, which initializes standard behavior for a rubber duck
     */
    init {
        quackBehavior = Squeak()
        flyBehavior = CantFly()
    }

    override fun display() {
        println("I am a Rubber Duck!")
    }
}