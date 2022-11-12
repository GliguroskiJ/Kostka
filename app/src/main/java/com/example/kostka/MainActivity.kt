package com.example.kostka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import kotlin.random.Random

lateinit var confirm_button : Button
lateinit var textView: TextView
lateinit var rB6: RadioButton
lateinit var rB20: RadioButton
lateinit var rB100: RadioButton
var randnum = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        confirm_button = findViewById(R.id.confirm_button)
        textView = findViewById(R.id.textView)
        rB6 = findViewById(R.id.rb6)
        rB20 = findViewById(R.id.rb20)
        rB100 = findViewById(R.id.rb100)

        confirm_button.setOnClickListener() {
            if (rB6.isChecked){
                randnum = Random.nextInt(1, 6)
                textView.text = randnum.toString()
            }
            else if(rB20.isChecked){
                randnum = Random.nextInt(1, 20)
                textView.text = randnum.toString()
            }
            else if(rB100.isChecked){
                randnum = Random.nextInt(1, 100)
                textView.text = randnum.toString()
            }
        }
    }
}