package com.avcialper.activityusagesample

import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.avcialper.activityusagesample.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intentString = intent.getStringExtra("string")
        val intentNumber = intent.getIntExtra("number", 0)
        val intentBoolean = intent.getBooleanExtra("boolean", false)

        // Parcelable veriyi almak için SDK 33 ve üzeri sürümler için kontrol ekliyoruz
        val intentUser =
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
                intent.getParcelableExtra("user", User::class.java)
            else
                null

        binding.apply {
            txtNumber.text = intentNumber.toString()
            txtString.text = intentString
            txtBoolean.text = intentBoolean.toString()
            txtObject.text = intentUser?.name
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