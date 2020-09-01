package com.example.notify

import android.content.Context
import android.graphics.Color
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.card.MaterialCardView


class Card(private val context: Context) {

    val card: MaterialCardView = MaterialCardView(context)
    val logo: ImageView = ImageView(context)

    init {

        create()
        setLogo()
    }

    private fun create() {

        card.radius = 45F
        card.strokeColor = Color.GRAY
        card.cardElevation = 0F
        card.strokeWidth = Convert.toDp(2)
        card.setPadding(0, 0, 0, 0)
    }

    private fun setLogo() {
        logo.setImageResource(R.drawable.codeforces)

        val imgparam = ConstraintLayout.LayoutParams(Convert.toDp(92), Convert.toDp(92))
        imgparam.leftToLeft = card.id
        logo.layoutParams = imgparam
        card.addView(logo)
    }


}