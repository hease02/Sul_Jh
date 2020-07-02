package com.example.sul_jh

import android.animation.ObjectAnimator
import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
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
            val timer = Timer()

            timer.schedule(object:TimerTask(){
                override fun run() {
                    runOnUiThread{
                        textView.setText(s.toString())
                        inputLayerUpAnimation ()
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

    private fun inputLayerUpAnimation () {
        ObjectAnimator.ofFloat(textInputLayout, "translationY", -300f).apply {
            duration = 500
            start()
        }
    }


    private fun layoutRiseUp(){
        val layoutInflater:LayoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater


    }


    private fun layoutDropDown(){

    }

}