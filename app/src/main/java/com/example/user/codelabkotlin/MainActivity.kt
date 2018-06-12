package com.example.user.codelabkotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "App launched successfully")

        toast_button.setOnClickListener { toastMe() }

        count_button.setOnClickListener { countMe() }

        random_button.setOnClickListener { randomMe() }
    }

    private fun toastMe() {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    private fun countMe() {
        // Get the value of the text view.
        val countString = myTextView.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // Display the new value in the text view.
        myTextView.text = count.toString();
    }

    private fun randomMe() {
        // Create an Intent to start the second activity
        val randomIntent = Intent(this, RandomActivity::class.java)

        val counterString = myTextView.text.toString()
        val count = Integer.parseInt(counterString)

        randomIntent.putExtra(RandomActivity.TOTAL_COUNT, count)

        // Start the new activity.
        startActivityForResult(randomIntent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
            val randomNumber = data?.getIntExtra("RANDOM_NUMBER", 0) ?: 0
            Log.d("MainActivity", "Random number is: ${randomNumber}")
        }
    }
}
