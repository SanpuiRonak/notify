package com.example.notify

import android.content.Context
import android.graphics.Color
import android.util.DisplayMetrics
import android.widget.TextView
import com.google.android.material.card.MaterialCardView
import kotlin.math.roundToInt


class Card(private val context: Context, private val displayMetrics: DisplayMetrics) {

    val card: MaterialCardView = MaterialCardView(context)

    //    val img:Image=
    init {

        create()
    }

    private fun create() {


//        card.setCardBackgroundColor(Color.CYAN)

        card.radius = 35F
        val tex = TextView(context)


        tex.text = card.id.toString()
        card.addView(tex)

        card.strokeColor = Color.GRAY
        card.cardElevation = 0F
        card.strokeWidth = dP(2)
    }

    private fun dP(px: Int): Int {
        val displayMetrics: DisplayMetrics = displayMetrics
        return (px * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT)).roundToInt()
    }
}