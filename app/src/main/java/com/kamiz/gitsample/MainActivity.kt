package com.kamiz.gitsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvHello = findViewById<TextView>(R.id.tv_hello)
        tvHello.text = "Hola mundo"
        val imPlanets = findViewById<ImageView>(R.id.iv_main)
        imPlanets.setImageResource(R.drawable.img_planets)
    }
}