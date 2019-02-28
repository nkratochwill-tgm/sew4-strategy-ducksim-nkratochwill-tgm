package strategy.ducksim

/**
 * Overwrites quack() from interface Quackbehavior to make a squeak possible.
 */
class Squeak : QuackBehavior {
    override fun quack() {
        println("Squeak!")
    }

}