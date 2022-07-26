package com.example.fragmentdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnTesting = findViewById<Button>(R.id.btnTesting)

        btnTesting.setOnClickListener(){

            // to call the number give in below
//            val contactNumber = Uri.parse("tel: 01135132997")
//            var intent: Intent = Intent(Intent.ACTION_DIAL, contactNumber)
//            startActivity(intent)

            // to view location on maps using longitude latitude
//            val geo = Uri.parse("geo: 3.2156,101.7281")
//            var intent: Intent = Intent(Intent.ACTION_VIEW, geo)
//            startActivity(intent)

            // to send email action
//            var intent: Intent = Intent(Intent.ACTION_SENDTO)
//            intent.data = Uri.parse("mailto:abc@gmail.com")
//            intent.putExtra(Intent.EXTRA_SUBJECT, "testing")
//            intent.putExtra(Intent.EXTRA_TEXT, "hello")
//            startActivity(intent)

            var intent: Intent = Intent(this,TestingActivity::class.java)
            intent.putExtra("personName", "ali")
            startActivity(intent)

        }
    }
}