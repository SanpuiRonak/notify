package com.example.notify

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lay = findViewById<ConstraintLayout>(R.id.clay1)
        val card = Card(this, resources.displayMetrics)


        lay.addView(card.card)
    }


}