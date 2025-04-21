class MainKtTest {

    /*
    simple way
    @Test
    fun `should return 3 when add 1 and 2 `() {
        val actual = sum(firstNumber = 1, secondNumber = 2)
        assertEquals(expected = 3, actual = actual)
    }
     */

    /*
some rules and naming
 @Test
    fun `sum should return 3 when add 1 and 2 by rule given when then`() {

        // given
        val input1 = 1
        val input2 = 2

        // when
        val actual = sum(firstNumber = input1, secondNumber = input2)

        // then

        assertEquals(expected = 3, actual = actual) // simple way

        actual shouldBe 3 // kotest way

        assertThat(actual).isEqualTo(3) // google truth way
    }

 */

    /*
    param test

     @ParameterizedTest
    @CsvSource(
        "1, 2, 3",
        "3, 2, 5"
    )
    fun `sum should return correct when add correct and correct inputs`(
        input1: Int,
        input2: Int,
        actual: Int
    ) {
        // When
        val result = sum(input1, input2)
        // Then
        assertThat(result).isEqualTo(actual)
    }

     */


}