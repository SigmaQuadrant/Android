package com.example.hellofudan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bt = findViewById<Button>(R.id.button)
        var tv = findViewById<TextView>(R.id.TextView)

        bt.setOnClickListener{
            Toast.makeText(this,"ok you succeed!",Toast.LENGTH_SHORT).show()
        }
    }
}
