package com.example.notify

import android.content.Context
import android.graphics.Color
import android.util.DisplayMetrics
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.math.roundToInt


class Card(context: Context, private val displayMetrics: DisplayMetrics) {

    val card: CardView = CardView(context)

    private val height = dP(92);
    private val width = ((displayMetrics.widthPixels) * 0.9).toInt()

    init {

        create()
    }

    private fun create() {


        val params = ConstraintLayout.LayoutParams(
            width, height
        )
        params.leftToRight = R.id.clay1
        params.rightToLeft = R.id.clay1


        card.layoutParams = params;
        card.setCardBackgroundColor(Color.CYAN)
        card.radius = 35F
    }

    private fun dP(px: Int): Int {
        val displayMetrics: DisplayMetrics = displayMetrics
        return (px * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT)).roundToInt()
    }
}