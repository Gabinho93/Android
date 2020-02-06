package com.example.myfirstandroidapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bouton.setOnClickListener { hello.append("E")
        val names = listOf(
            "Charles","Leo","Alexandre","Benoit","Leon"
        )
        val tri =}
    }
}

