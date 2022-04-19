package com.kamiz.gitsample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.kamiz.gitsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupViews()
    }

    private fun setupViews() {
        binding.btLogin.setOnClickListener {
            loginUser(binding.etUser.text.toString(), binding.etPassword.text.toString())
        }
    }

    fun loginUser(user: String, password: String) {
//        if (user.toUpperCase() == "ALVARO") {
        if (user.equals("alvaro", ignoreCase = true)) {
            var intent = Intent(this, GalleryActivity::class.java)
            intent.putExtra("KEY", binding.etUser.text)
            startActivity(intent)
        } else {
            Log.e("Ml", "$user - $password")
        }
    }
}