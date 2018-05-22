package com.example.user.codelabkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeText(view : android.view.View) {
        val tv = findViewById<TextView>(R.id.textView)

        if (tv.text.equals("Hello World!"))
            tv.text = "Hello SoundCloud!"
        else
            tv.text = "Hello World!"
    }
}
