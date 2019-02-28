package strategy.ducksim

/**
 * Overwrites quack() from interface Quackbehavior to make a normal quack possible.
 */
class Quack : QuackBehavior {
    override fun quack() {
        println("Quack!")
    }

}