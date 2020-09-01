package com.example.notify

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout

class CardList(
    private val context: Context,

    private val root: ConstraintLayout
) {
    private val list = ArrayList<Card>()

    init {

    }

    fun add() {

        val height = Convert.toDp(92)
        val width = ((Convert.displayMetrics.widthPixels) * 0.9).toInt()

        val params = ConstraintLayout.LayoutParams(
            width, height
        )

        params.leftToRight = root.id
        params.rightToLeft = root.id

        val pad = Convert.toDp(20)
        if (list.isEmpty()) {
            params.topToTop = R.id.clay1
            params.topMargin = 3 * pad
        } else {
            params.topToBottom = list.last().card.id
            params.topMargin = pad

        }

        list.add(Card(context))
        list.last().card.id = list.size + 1;
        list.last().card.layoutParams = params

        root.addView(list.last().card)
    }


}