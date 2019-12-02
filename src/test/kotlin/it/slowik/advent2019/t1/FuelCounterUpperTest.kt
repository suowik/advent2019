package it.slowik.advent2019.t1


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class FuelCounterUpperTest {

    companion object {
        @JvmStatic
        fun testData(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(listOf("12"), 2),
                        Arguments.of(listOf("14"), 2),
                        Arguments.of(listOf("1969"), 966),
                        Arguments.of(listOf("100756"), 50346)
                )
    }

    @ParameterizedTest
    @MethodSource("testData")
    fun tests(input: List<String>, expected: Int) {
        val res = fuelCounterUpperImpl(input)
        assertEquals(expected, res)
    }

}