package strategy.ducksim
open class Duck{
    lateinit var quackBehavior: QuackBehavior
    fun performQuack(){
        quackBehavior.quack()
    }
}