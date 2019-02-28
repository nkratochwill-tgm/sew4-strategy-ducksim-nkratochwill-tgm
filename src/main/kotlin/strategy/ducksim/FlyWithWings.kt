package strategy.ducksim

/**
 * Overwrites fly() from interface Flybehavior to make flying with wings possible.
 */
class FlyWithWings : FlyBehavior {
    override fun fly() {
        println("I am flying!")
    }
}