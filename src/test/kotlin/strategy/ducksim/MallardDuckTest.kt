package strategy.ducksim

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

/**
 * Test for mallard duck
 * To accomplish testing of print functions, we are using an ByteArrayOutputStream and setting it as our main system output,
 * therefore every console output gets forwarded to the aforementioned OutputStream
 * it is now possible to compare the print functions to our expected results.
 */
class MallardDuckTest {
    private lateinit var mallardDuck: Duck
    private lateinit var output: ByteArrayOutputStream
    @Before
    fun setUp() {
        mallardDuck = MallardDuck()
        output = ByteArrayOutputStream()
        System.setOut(PrintStream(output))
    }

    @After
    fun tearDown() {
    }

    @Test
    fun display() {
        mallardDuck.display()
        assertEquals("I am a Mallard Duck!\n", output.toString())
    }

    @Test
    fun setQuackBehavior() {
        mallardDuck.quackBehavior = CantQuack()
        mallardDuck.performQuack()
        assertEquals("I can not make Noise!\n", output.toString())

    }

    @Test
    fun setFlyBehavior() {
        mallardDuck.flyBehavior = CantFly()
        mallardDuck.performFly()
        assertEquals("I can not fly!\n", output.toString())
    }

    @Test
    fun performQuack() {
        mallardDuck.performQuack()
        assertEquals("Quack!\n", output.toString())
    }

    @Test
    fun performFly() {
        mallardDuck.performFly()
        assertEquals("I am flying!\n", output.toString())

    }
}