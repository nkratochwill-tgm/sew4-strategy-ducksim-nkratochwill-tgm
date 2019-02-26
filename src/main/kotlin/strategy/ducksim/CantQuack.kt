package strategy.ducksim

class CantQuack : QuackBehavior {
    override fun quack() {
        print("I can not make Noise!")
    }

}