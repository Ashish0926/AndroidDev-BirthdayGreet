package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*button.setOnClickListener {
            Toast.makeText(this, "Button Pressed", Toast.LENGTH_SHORT).show()
        }*/
    }

    fun createCard(view: View) {
        val name = BirthdayName.editableText.toString()
        /*Toast.makeText(this, "Name entered : $name", Toast.LENGTH_SHORT).show()*/
        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME, name)
        startActivity(intent)
    }
}