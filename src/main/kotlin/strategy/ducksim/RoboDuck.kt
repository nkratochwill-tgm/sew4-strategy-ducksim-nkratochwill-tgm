package strategy.ducksim

class RoboDuck : Duck() {
    init {
        flyBehavior = FlyWithRockets()
        quackBehavior = ElectricQuack()
    }

    fun display() {
        println("Bzbz I am a Robo Duck!")
    }
}