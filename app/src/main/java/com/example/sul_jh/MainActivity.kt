package com.example.sul_jh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textInputEditText.addTextChangedListener(textWatcher)
    }

    private val textWatcher = object:TextWatcher{
        override fun afterTextChanged(s: Editable?) {
            //TODO("Not yet implemented")

            val timer = Timer()

            timer.schedule(object:TimerTask(){
                override fun run() {
                    runOnUiThread{
                        textView.setText(s.toString())
                    }
                }

            }, 1000)
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            //TODO("Not yet implemented")
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            //TODO("Not yet implemented"

        }

    }
}