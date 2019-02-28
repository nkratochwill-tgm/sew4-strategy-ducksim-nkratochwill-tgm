package strategy.ducksim

/**
 * abstract class duck provides functions for sub class ducks
 */
abstract class Duck {
    lateinit var quackBehavior: QuackBehavior
    lateinit var flyBehavior: FlyBehavior

    /**
     * To perform a quack, call duckobject.performQuack()
     */
    fun performQuack() {
        quackBehavior.quack()
    }

    /**
     * To perform a fly, call duckobject.performFly()
     */
    fun performFly() {
        flyBehavior.fly()
    }

    abstract fun display()

}