package com.test.excotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var button: Button
    lateinit var seccondButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.changeButton)
        seccondButton = findViewById(R.id.seccondButton)
        textView = findViewById(R.id.test)
    }

    fun didTapChangeValue(sender: View) {
        val intent = Intent(this, SecondActivity::class.java)
       startActivity(intent)
    }

    fun didTapMovet3rd(sender: View) {
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }

    fun setTitle(txt: String) {
        textView.text = txt
    }
}