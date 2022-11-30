package com.adventofcode

import java.net.URL

fun main(args: Array<String>) {
  val day = args.first().toUShort()
  val url = URL("https://adventofcode.com/2022/day/$day/input")
  url.openStream()
    .bufferedReader()
    .forEachLine(::process)
}

fun process(line: String) {

}
