package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
        val countButton: Button = findViewById(R.id.count_up_button)
        countButton.setOnClickListener{countUp()}
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener{resetDice()}
    }

    private fun rollDice(){
        val randomInt = Random().nextInt(6) + 1
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        val testInt = 1
        if(resultText.text == "Hello World!")
            resultText.text = "1"
        else if(resultText.text.toString().toInt() != 6)
            resultText.text = (resultText.text.toString().toInt() + 1).toString()
    }

    private fun resetDice(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }

}
