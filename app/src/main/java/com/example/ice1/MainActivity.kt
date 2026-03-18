package com.example.ice1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.edtName)
        val ageInput = findViewById<EditText>(R.id.edtAge)
        val button = findViewById<Button>(R.id.btnCheck)
        val resultText = findViewById<TextView>(R.id.txtResult)

        button.setOnClickListener {

            //  input
            val name = nameInput.text.toString().trim().lowercase()
            val ageText = ageInput.text.toString().trim()

            // Validation
            if (name.isEmpty()) {
                resultText.text = "Please enter a pet name"
            }
            else if (ageText.isEmpty()) {
                resultText.text = "Please enter a valid age"
            }
            else {

                val age = ageText.toInt()

                // If-Else Logic
                val message = if (age <= 3) {
                    "$name is $age years old and very energetic!"
                } else if (age <= 7) {
                    "$name is $age years old and playful!"
                } else {
                    "$name is $age years old and loves relaxing"
                }

                resultText.text = message
            }
        }
    }
}