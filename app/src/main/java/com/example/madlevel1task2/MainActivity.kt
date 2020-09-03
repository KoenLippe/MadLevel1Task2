package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var TRUE: String
    private lateinit var FALSE: String
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        TRUE = getString(R.string.True)
        FALSE = getString(R.string.False)

        binding.btnSubmit.setOnClickListener { onSubmit() }
    }

    private fun onSubmit() {
        var correct = 0;

        if(binding.txtAnswer1.text.toString().toUpperCase().equals(TRUE)) correct++
        if(binding.txtAnswer2.text.toString().toUpperCase().equals(FALSE)) correct++
        if(binding.txtAnswer3.text.toString().toUpperCase().equals(FALSE)) correct++
        if(binding.txtAnswer4.text.toString().toUpperCase().equals(FALSE)) correct++

        Toast.makeText(this, getString(R.string.correct_message, correct), Toast.LENGTH_LONG).show();
    }
}