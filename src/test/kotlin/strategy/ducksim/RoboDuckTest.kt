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
class RoboDuckTest {
    private lateinit var roboDuck: Duck
    private lateinit var output: ByteArrayOutputStream
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
        assertEquals("Bzbz I am a Robo Duck!\n", output.toString())
    }

    @Test
    fun setQuackBehavior() {
        roboDuck.quackBehavior = CantQuack()
        roboDuck.performQuack()
        assertEquals("I can not make Noise!\n", output.toString())

    }

    @Test
    fun setFlyBehavior() {
        roboDuck.flyBehavior = CantFly()
        roboDuck.performFly()
        assertEquals("I can not fly!\n", output.toString())
    }

    @Test
    fun performQuack() {
        roboDuck.performQuack()
        assertEquals("Bzbz Quack!\n", output.toString())
    }

    @Test
    fun performFly() {
        roboDuck.performFly()
        assertEquals("I am flying with rockets!\n", output.toString())

    }
}