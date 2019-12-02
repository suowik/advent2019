package it.slowik.advent2019

class ResourceReader {
    companion object {
        fun readLines(filename: String): List<String> {
            return ResourceReader::class.java.getResourceAsStream(filename).bufferedReader().readLines()
        }
    }
}