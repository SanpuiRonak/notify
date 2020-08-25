package com.example.notify

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val root = findViewById<ConstraintLayout>(R.id.clay1)

        val list1 = CardList(this, resources.displayMetrics, root)
        list1.add()
        list1.add()

    }


}