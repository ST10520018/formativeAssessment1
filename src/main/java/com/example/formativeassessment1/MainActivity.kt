package com.example.formativeassessment1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val timeOfDayResult = findViewById<EditText>(R.id.edtTime)
        val suggestionButton = findViewById<Button>(R.id.btnSuggestion)
        val outputSuggestion = findViewById<TextView>(R.id.txtResult)
        val resetButton = findViewById<Button>(R.id.btnReset)

        suggestionButton.setOnClickListener {

            val timeInput = timeOfDayResult.text.toString().trim().lowercase()

            if (timeInput.isEmpty()){
                outputSuggestion.text = "Please enter a valid input"
        }
            else if (timeInput == "morning" ){
                outputSuggestion.text = "Send a 'Good Morning' to a family member"
        }
            else if (timeInput == "mid-morning"){
                outputSuggestion.text = "Reach out to a colleague with a quick 'Thank you'"
            }
            else if (timeInput == "afternoon"){
                outputSuggestion.text = "Share a funny meme or an interesting link with a friend"
            }
            else if (timeInput == "afternoon snack time"){
                outputSuggestion.text = "Send a quick 'thinking of you' message"
            }
            else if (timeInput == "dinner"){
                outputSuggestion.text = "Call a friend or relative for a 5 minute catch-up"
            }
            else if (timeInput == "after dinner"){
                outputSuggestion.text = "Leave a thoughtful comment on a friend's post"
            }
            else if (timeInput == "night"){
                outputSuggestion.text = "Leave a thoughtful comment on a friend's post"
            }
            else {
                outputSuggestion.text = "Please enter a valid input"
            }
        }
        resetButton.setOnClickListener {
            timeOfDayResult.text.clear()
            outputSuggestion.text = ""
        }
    }
}