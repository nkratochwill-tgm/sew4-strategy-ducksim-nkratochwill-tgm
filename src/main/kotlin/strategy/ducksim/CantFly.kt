package strategy.ducksim

/**
 * Overwrites fly() from interface Flybehavior to make non flyable behavior possible.
 */
class CantFly : FlyBehavior {
    override fun fly() {
        println("I can not fly!")
    }
}
