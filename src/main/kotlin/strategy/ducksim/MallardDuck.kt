package strategy.ducksim

class MallardDuck : Duck() {
    init {
        quackBehavior = Quack()
    }
    fun display(){
        print("I am a Mallard Duck!")
    }
}