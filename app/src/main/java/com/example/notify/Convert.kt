package com.example.notify

import android.util.DisplayMetrics
import kotlin.math.roundToInt

class Convert() {

    companion object {
        val displayMetrics: DisplayMetrics = DisplayMetrics()

        fun toDp(px: Int): Int {

            return (px * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT)).roundToInt()
        }

    }


}

