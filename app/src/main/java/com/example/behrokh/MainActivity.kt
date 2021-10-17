package com.example.behrokh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1=findViewById<FrameLayout>(R.id.frame2)
        val btn2=findViewById<FrameLayout>(R.id.frame1)
        val frame1=findViewById<FrameLayout>(R.id.fram1)
        val frame2=findViewById<FrameLayout>(R.id.fram2)
        btn1.setOnClickListener {
            frame1.visibility=(View.GONE)
            frame2.visibility=(View.VISIBLE)

        }
        btn2
            frame1.visibility=(View.VISIBLE)
            frame2.visibility=(View.GONE)

        }
    }

}