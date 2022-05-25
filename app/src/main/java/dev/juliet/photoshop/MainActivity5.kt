package dev.juliet.photoshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    lateinit var button3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        button3=findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent=Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }

    }
}