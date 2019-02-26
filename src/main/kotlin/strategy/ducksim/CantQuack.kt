package strategy.ducksim

class CantQuack : QuackBehavior {
    override fun quack() {
        println("I can not make Noise!")
    }

}