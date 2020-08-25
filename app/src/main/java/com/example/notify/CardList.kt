package com.example.notify

import android.content.Context
import android.util.DisplayMetrics
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.math.roundToInt

class CardList(
    private val context: Context,
    private val displayMetrics: DisplayMetrics,
    private val root: ConstraintLayout
) {
    private val list = ArrayList<Card>()

    init {

    }

    fun add() {

        val height = dP(92)
        val width = ((displayMetrics.widthPixels) * 0.9).toInt()
        val params = ConstraintLayout.LayoutParams(
            width, height
        )
        val pad = dP(20)
        params.leftToRight = R.id.clay1
        params.rightToLeft = R.id.clay1

        if (list.isEmpty()) {
            params.topToTop = R.id.clay1
            params.topMargin = dP(pad)
        } else {
            params.topToBottom = list.last().card.id
            params.topMargin = dP(pad)

        }
        list.add(Card(context, displayMetrics, list.size + 1))

        list.last().card.layoutParams = params
        list.last().card
        root.addView(list.last().card)
    }

    private fun dP(px: Int): Int {
        val displayMetrics: DisplayMetrics = displayMetrics
        return (px * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT)).roundToInt()
    }
}