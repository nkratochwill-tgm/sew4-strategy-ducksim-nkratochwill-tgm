package strategy.ducksim

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

/**
 * Test for rubber duck
 * To accomplish testing of print functions, we are using an ByteArrayOutputStream and setting it as our main system output,
 * therefore every console output gets forwarded to the aforementioned OutputStream
 * it is now possible to compare the print functions to our expected results.
 */
class RubberDuckTest {
    private lateinit var rubberDuck: Duck
    private lateinit var output: ByteArrayOutputStream
    @Before
    fun setUp() {
        rubberDuck = RubberDuck()
        output = ByteArrayOutputStream()
        System.setOut(PrintStream(output))
    }

    @After
    fun tearDown() {
    }

    @Test
    fun display() {
        rubberDuck.display()
        assertEquals("I am a Rubber Duck!\n", output.toString())
    }

    @Test
    fun setQuackBehavior() {
        rubberDuck.quackBehavior = CantQuack()
        rubberDuck.performQuack()
        assertEquals("I can not make Noise!\n", output.toString())

    }

    @Test
    fun setFlyBehavior() {
        rubberDuck.flyBehavior = FlyWithWings()
        rubberDuck.performFly()
        assertEquals("I am flying!\n", output.toString())
    }

    @Test
    fun performQuack() {
        rubberDuck.performQuack()
        assertEquals("Squeak!\n", output.toString())
    }

    @Test
    fun performFly() {
        rubberDuck.performFly()
        assertEquals("I can not fly!\n", output.toString())

    }
}