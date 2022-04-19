package com.kamiz.gitsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GalleryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        val etUser = findViewById<TextView>(R.id.et_user)
        val name = intent.getStringExtra("KEY")
        etUser.text= name

    }
}