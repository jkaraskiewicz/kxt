@file:JvmName("CommonFunctions")

package com.karaskiewicz.wax_library.functions

fun handle(block: () -> Unit): Boolean {
    block()
    return true
}