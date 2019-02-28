package strategy.ducksim

/**
 * Overwrites quack() from interface Quackbehavior to make non quackable behavior possible.
 */
class CantQuack : QuackBehavior {
    override fun quack() {
        println("I can not make Noise!")
    }

}