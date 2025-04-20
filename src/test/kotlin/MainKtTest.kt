import org.example.sum
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainKtTest {

    @Test
    fun `should return 3 when add 1 and 2 `() {
        val actual = sum(firstNumber = 1, secondNumber = 2)
        assertEquals(expected = 3, actual = actual)
    }

    @Test
    fun `sum should return 3 when add 1 and 2 by rule given when then`() {

        // given
        val input1 = 1
        val input2 = 2

        // when
        val actual = sum(firstNumber = input1, secondNumber = input2)

        // then
        assertEquals(expected = 3, actual = actual)
    }

}