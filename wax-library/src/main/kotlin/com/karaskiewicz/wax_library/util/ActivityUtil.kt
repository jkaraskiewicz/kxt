@file:JvmName("ActivityUtil")

package com.karaskiewicz.wax_library.util

import android.content.Intent

inline fun <reified T> Intent.extra(key: String) = getSerializableExtra(key) as T