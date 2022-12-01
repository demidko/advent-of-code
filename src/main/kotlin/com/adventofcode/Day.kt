package com.adventofcode

import com.adventofcode.Day.solution

object Day {
  fun process(l: String) {
    TODO()
  }

  fun solution(): Long {
    TODO()
  }
}

fun main() {
  ::main
    .javaClass
    .getResourceAsStream("/input")!!
    .bufferedReader()
    .forEachLine(Day::process)
  println(solution())
}