package com.wirecard.examples

import java.time.LocalTime

// Convert this code to java

val validDays = LocalTime.of(11, 30) .. LocalTime.of(13, 30)

fun isLunchTime(time: LocalTime) = time in validDays

fun numberType(number: Any) =
    when(number) {
        is Int, is Long, is Byte -> "Integer"
        is Float, is Double -> "Floating Point"
        else -> "Not a number"
    }




