package com.example.notify

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val root: ConstraintLayout = findViewById<ConstraintLayout>(R.id.clay1)

        Convert.displayMetrics.setTo(resources.displayMetrics)

        val list1 = CardList(this, root)
        list1.add()
        list1.add()
        val text = findViewById<TextView>(R.id.textView)
        val list = CodeForcesParser().list
        text.text = list.toString()
    }



}


