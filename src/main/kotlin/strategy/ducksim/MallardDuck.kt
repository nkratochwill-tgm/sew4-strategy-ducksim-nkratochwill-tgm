package strategy.ducksim

class MallardDuck : Duck() {
    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }
    fun display(){
        print("I am a Mallard Duck!")
    }
}