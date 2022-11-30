package com.adventofcode

import java.net.URL

fun main() {
  val day = 1
  val url = URL("https://adventofcode.com/2022/day/$day/input")
  url.openStream()
    .bufferedReader()
    .forEachLine(::process)
}

fun process(line: String) {

}
