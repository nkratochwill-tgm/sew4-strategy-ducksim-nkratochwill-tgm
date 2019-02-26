package strategy.ducksim

abstract class Duck {
    lateinit var quackBehavior: QuackBehavior
    lateinit var flyBehavior: FlyBehavior
    fun performQuack() {
        quackBehavior.quack()
    }

    fun performFly() {
        flyBehavior.fly()
    }

    abstract fun display()

}