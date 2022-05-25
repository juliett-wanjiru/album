package dev.juliet.photoshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    lateinit var btn4:Button
    lateinit var btn5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        btn4=findViewById(R.id.btn4)
        btn4.setOnClickListener {
            val intent=Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }
        btn5=findViewById(R.id.btn5)
        btn5.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}