package com.example.notify

import android.content.Context
import android.util.DisplayMetrics
import android.widget.TextView
import com.google.android.material.card.MaterialCardView
import kotlin.math.roundToInt


class Card(private val context: Context, private val displayMetrics: DisplayMetrics, val id: Int) {

    val card: MaterialCardView = MaterialCardView(context)

    init {

        create()
    }

    private fun create() {


//        card.setCardBackgroundColor(Color.CYAN)
        card.radius = 35F
        val tex = TextView(context)


        card.id = id
        tex.text = card.id.toString()
        card.addView(tex)
        card.setPadding(0, 100, 0, 0)
//        card.strokeColor = # b5b5b5
        card.strokeWidth = dP(2)
    }

    private fun dP(px: Int): Int {
        val displayMetrics: DisplayMetrics = displayMetrics
        return (px * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT)).roundToInt()
    }
}