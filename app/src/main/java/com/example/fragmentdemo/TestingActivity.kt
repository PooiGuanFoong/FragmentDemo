package com.example.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class TestingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testing)

        var name = intent.getStringExtra("personName")

        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }
}