package dev.juliet.photoshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2Activity : AppCompatActivity() {
    lateinit var btn7:Button
    lateinit var btn8:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn8=findViewById(R.id.btn8)
        btn8.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        btn7=findViewById(R.id.btn7)
        btn7.setOnClickListener {
            val intent=Intent(this,SplashActivity::class.java)
            startActivity(intent)
        }
    }
}
