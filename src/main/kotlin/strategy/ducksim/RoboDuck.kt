package strategy.ducksim

class RoboDuck : Duck() {
    init {
        flyBehavior = FlyWithRockets()
        quackBehavior = ElectricQuack()
    }

    override fun display() {
        println("Bzbz I am a Robo Duck!")
    }
}