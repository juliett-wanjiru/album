package dev.juliet.photoshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    lateinit var btn2:Button
    lateinit var btn3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btn2=findViewById(R.id.btn2)
        btn2.setOnClickListener {
            val intent=Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
        btn3=findViewById(R.id.btn3)
        btn3.setOnClickListener {
            val intent=Intent(this,Main2Activity::class.java)
            startActivity(intent)
        }
    }
}