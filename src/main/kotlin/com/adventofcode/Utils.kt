package com.adventofcode

import java.net.URL

fun processDay(day: Int, f: (line: String) -> Unit) {
  URL("https://adventofcode.com/2022/day/$day/input")
    .openStream()
    .bufferedReader()
    .forEachLine(f)
}