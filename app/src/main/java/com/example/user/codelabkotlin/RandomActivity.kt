package com.example.user.codelabkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_random.*

class RandomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)

        val number = intent.getIntExtra(TOTAL_COUNT, 0)

        numberText.setText(number.toString())
    }

    companion object {
        const val TOTAL_COUNT = "TOTAL_COUNT"
    }
}
