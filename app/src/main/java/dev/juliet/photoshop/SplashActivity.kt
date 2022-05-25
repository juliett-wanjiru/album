package dev.juliet.photoshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashActivity : AppCompatActivity() {
    lateinit var btn1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        btn1 = findViewById(R.id.btn1)

        btn1.setOnClickListener {


            var intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)

        }
    }
}