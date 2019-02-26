package strategy.ducksim

class CantFly : FlyBehavior {
    override fun fly() {
        println("I can not fly!")
    }
}
