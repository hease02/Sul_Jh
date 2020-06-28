package com.example.sul_jh

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        splashAnimation()
    }

    private fun splashAnimation(){
        val imageAnim:Animation = AnimationUtils.loadAnimation(this, R.anim.animation_splash)
        imageView_sul.startAnimation(imageAnim)

        imageAnim.setAnimationListener(object: AnimationListener {
            override fun onAnimationEnd(animation:Animation){
                Handler().postDelayed({startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    finish()},
                    1000)


            }
            override fun onAnimationStart(animation:Animation){

            }
            override fun onAnimationRepeat(animation:Animation) {

            }
        })

    }
}

