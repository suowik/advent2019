package it.slowik.advent2019.t1

import it.slowik.advent2019.ResourceReader
import kotlin.math.floor

val FuelCounterUpper = { filename: String ->
    val lines = ResourceReader.readLines(filename)
    FuelCounterUpperImpl(lines)
}

internal val FuelCounterUpperImpl = { input: List<String> ->
    input.asSequence()
            .map { it.toDouble() }
            .map {
                floor(it / 3)
            }
            .map { it.toInt() }
            .map { it - 2 }
            .sum()
}