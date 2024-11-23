package com.faiz21.lab06

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.faiz21.lab06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.courses.setOnClickListener{
            binding.infotextview.text = "Android ATC 801 consists of topic ranging from " +
                    "Ui Craetui, Aoo Development and Firebase"
        }
        binding.Exams.setOnClickListener{
            binding.infotextview.text = "Exams consist of 45 question in 90 minute with passing mark" +
                    "of 70%"
        }
        binding.Freelance.setOnClickListener{
            binding.infotextview.text = " You can be an Android Engineer upon completion" +
                    "on the course."
        }

    }
}