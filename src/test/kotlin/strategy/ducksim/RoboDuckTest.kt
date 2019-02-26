package strategy.ducksim

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class RoboDuckTest {
    lateinit var roboDuck:RoboDuck
    lateinit var output:ByteArrayOutputStream
    @Before
    fun setUp() {
        roboDuck = RoboDuck()
        output = ByteArrayOutputStream()
        System.setOut(PrintStream(output))
    }

    @After
    fun tearDown() {
    }

    @Test
    fun display() {
        roboDuck.display()
        assertEquals("Bzbz I am a Robo Duck!\n",output.toString())
    }

    @Test
    fun setQuackBehavior() {
        roboDuck.quackBehavior=CantQuack()
        roboDuck.performQuack()
        assertEquals("I can not make Noise!\n",output.toString())

    }

    @Test
    fun setFlyBehavior() {
        roboDuck.flyBehavior=CantFly()
        roboDuck.performFly()
        assertEquals("I can not fly!\n",output.toString())
    }

    @Test
    fun performQuack() {
        roboDuck.performQuack()
        assertEquals("Bzbz Quack!\n",output.toString())
    }

    @Test
    fun performFly() {
        roboDuck.performFly()
        assertEquals("I am flying with rockets!\n",output.toString())

    }
}