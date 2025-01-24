package com.avcialper.activityusagesample

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.avcialper.activityusagesample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnChangeActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            val user = User("John", "Doe")
            intent.putExtra("number", 25)
            intent.putExtra("string", "intent usage sample")
            intent.putExtra("boolean", true)
            intent.putExtra("user", user)

            startActivity(intent)
        }

        defaultUISettings()
    }

    private fun defaultUISettings() {
        enableEdgeToEdge()
        val view = binding.root
        ViewCompat.setOnApplyWindowInsetsListener(view) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}