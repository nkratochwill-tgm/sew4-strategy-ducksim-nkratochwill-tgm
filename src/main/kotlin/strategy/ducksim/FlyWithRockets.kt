package strategy.ducksim

/**
 * Overwrites fly() from interface Flybehavior to make flying with rockets possible.
 */
class FlyWithRockets : FlyBehavior {
    override fun fly() {
        println("I am flying with rockets!")
    }

}