package strategy.ducksim

/**
 * Overwrites quack() from interface Quackbehavior to make an electric quack possible.
 */
class ElectricQuack : QuackBehavior {
    override fun quack() {
        println("Bzbz Quack!")
    }

}