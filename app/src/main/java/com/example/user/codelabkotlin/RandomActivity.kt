package com.example.user.codelabkotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_random.*
import java.util.*

class RandomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)

        val number = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random()
        var randomInt = 0
        if (number > 0) {
            randomInt = random.nextInt(number + 1)
        }

        titleText.text = getString(R.string.top_label, number)
        numberText.setText(randomInt.toString())

        val resultIntent = Intent().putExtra("RANDOM_NUMBER", randomInt)
        setResult(Activity.RESULT_OK, resultIntent)
    }

    companion object {
        const val TOTAL_COUNT = "TOTAL_COUNT"
    }
}
