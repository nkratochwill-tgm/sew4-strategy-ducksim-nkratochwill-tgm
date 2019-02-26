package strategy.ducksim

class CantFly: FlyBehavior {
    override fun fly() {
        print("I can not fly!")
    }
}
