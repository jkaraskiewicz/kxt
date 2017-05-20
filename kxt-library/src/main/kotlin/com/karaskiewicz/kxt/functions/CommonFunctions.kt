@file:JvmName("CommonFunctions")

package com.karaskiewicz.kxt.functions

fun handle(block: () -> Unit): Boolean {
    block()
    return true
}