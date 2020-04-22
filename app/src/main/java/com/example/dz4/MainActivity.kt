package com.example.dz4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            var run: Int = (input.text.toString().toInt()..inputTo.text.toString().toInt()).random()
            greetingButton.text = run.toString()

        }

    }
}

