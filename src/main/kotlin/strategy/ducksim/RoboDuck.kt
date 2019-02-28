package strategy.ducksim

/**
 * inherits from Duck class to make behavior possible
 */
class RoboDuck : Duck() {

    /**
     * primary constructor, which initializes standard behavior for a robo duck
     */
    init {
        flyBehavior = FlyWithRockets()
        quackBehavior = ElectricQuack()
    }

    override fun display() {
        println("Bzbz I am a Robo Duck!")
    }
}