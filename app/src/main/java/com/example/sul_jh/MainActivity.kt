package com.example.sul_jh

import android.animation.ObjectAnimator
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    var flag = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textInputLayout.setEndIconOnClickListener {
            inputLayerUpAnimation ()

            layoutRiseUp()
        }
    }

    /**
    private val textWatcher = object:TextWatcher{
        override fun afterTextChanged(s: Editable?) {
            val timer = Timer()

            timer.schedule(object:TimerTask(){
                override fun run() {
                    runOnUiThread{
                        //textView.setText(s.toString())
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

    } **/

    private fun inputLayerUpAnimation () {
        if (flag == 0) {
            flag = 1

            ObjectAnimator.ofFloat(textInputLayout, "translationY", -300f).apply {
                duration = 500
                start()
            }
        }
    }

    private fun layoutRiseUp(){
        val riseAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.animation_rise_up)
        sulLayout.startAnimation(riseAnim)

        riseAnim.setAnimationListener(object: Animation.AnimationListener {
            override fun onAnimationEnd(animation: Animation){

            }
            override fun onAnimationStart(animation: Animation){
                sulLayout.visibility = View.VISIBLE
            }
            override fun onAnimationRepeat(animation: Animation) {

            }
        })
    }


    private fun layoutDropDown(){
        val riseAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.animation_drop_down)
        sulLayout.startAnimation(riseAnim)

        riseAnim.setAnimationListener(object: Animation.AnimationListener {
            override fun onAnimationEnd(animation: Animation){
                sulLayout.visibility = View.INVISIBLE
            }
            override fun onAnimationStart(animation: Animation){

            }
            override fun onAnimationRepeat(animation: Animation) {

            }
        })
    }

}