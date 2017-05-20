@file:JvmName("ViewUtil")

package com.karaskiewicz.kxt.util

import android.content.Context
import android.support.annotation.DimenRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.karaskiewicz.kxt.internal.dimen

fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}

fun Context.inflate(layoutId: Int): View {
    return LayoutInflater.from(this).inflate(layoutId, null)
}

var View.visible: Boolean
    get() = visibility == View.VISIBLE
    set(value) {
        visibility = if (value) View.VISIBLE else View.GONE
    }

fun View.setPaddingForDimens(@DimenRes left: Int, @DimenRes top: Int, @DimenRes right: Int, @DimenRes bottom: Int) {
    setPadding(dimen(left), dimen(top), dimen(right), dimen(bottom))
}