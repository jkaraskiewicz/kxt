@file:JvmName("TextViewUtil")

package com.karaskiewicz.wax_library.util

import android.support.annotation.DimenRes
import android.util.TypedValue
import android.widget.TextView
import com.karaskiewicz.wax_library.internal.dimen

fun TextView.setTextSizeWithDimen(@DimenRes size: Int) {
    setTextSize(TypedValue.COMPLEX_UNIT_PX, dimen(size).toFloat())
}