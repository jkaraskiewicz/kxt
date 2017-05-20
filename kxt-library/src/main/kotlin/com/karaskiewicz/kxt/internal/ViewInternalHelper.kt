package com.karaskiewicz.kxt.internal

import android.view.View

internal fun View.dimen(key: Int) = resources.getDimensionPixelSize(key)
