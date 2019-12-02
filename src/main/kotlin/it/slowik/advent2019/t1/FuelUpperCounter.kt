package it.slowik.advent2019.t1

import it.slowik.advent2019.ResourceReader

val FuelCounterUpper = { filename: String ->
    val lines = ResourceReader.readLines(filename)
    fuelCounterUpperImpl(lines)
}

internal val fuelCounterUpperImpl = { input: List<String> ->
    input.asSequence()
            .map { it.toInt() }
            .map { fuelUpperCounterRec(it) - it }
            .sum()
}

private fun fuelUpperCounterRec(fuel: Int): Int {
    val partialFuel = (fuel / 3) - 2
    return if (partialFuel < 0) {
        fuel
    } else {
        fuelUpperCounterRec(partialFuel) + fuel
    }
}
