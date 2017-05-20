@file:JvmName("TextViewUtil")

package com.karaskiewicz.kxt.util

import android.support.annotation.DimenRes
import android.util.TypedValue
import android.widget.TextView
import com.karaskiewicz.kxt.internal.dimen

fun TextView.setTextSizeForDimen(@DimenRes size: Int) {
    setTextSize(TypedValue.COMPLEX_UNIT_PX, dimen(size).toFloat())
}