package com.adventofcode

fun main() {
  val resource = ::main.javaClass.getResourceAsStream("/day1.example.txt")!!
  val reader = resource.bufferedReader()
  reader.forEachLine(::println)
}


