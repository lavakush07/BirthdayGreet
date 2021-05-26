package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object
    {
        const val NAME_EXTRA="name extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
val name=intent.getStringExtra(NAME_EXTRA)
val birthdayGreeting=findViewById<TextView>(R.id.birthdayGreeting)
        birthdayGreeting.text="Happy Birthday\n$name!"


    }
}