package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnStart.setOnClickListener{
                startService(Intent(this@MainActivity,MyService::class.java))
            }
            btnStop.setOnClickListener{
                stopService(Intent(this@MainActivity,MyService::class.java))
            }
        }
    }
}