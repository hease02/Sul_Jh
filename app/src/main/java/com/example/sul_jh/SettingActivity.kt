package com.example.sul_jh

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

//        bottom_navigation.setOnNavigationItemSelectedListener { item ->
//            when(item.itemId) {
//                R.id.page_1 -> {
//
//                    val nextIntent = Intent(this, MainActivity::class.java)
//                    startActivity(nextIntent)
//
//                    // Respond to navigation item 1 click
//                    true
//                }
//                R.id.page_2 -> {
//
//                    true
//                }
//                else -> false
//            } }
//
//        bottom_navigation.setOnNavigationItemReselectedListener { item ->
//            when(item.itemId) {
//                R.id.page_1 -> {
//
//                    val nextIntent = Intent(this, MainActivity::class.java)
//                    startActivity(nextIntent)
//
//                    // Respond to navigation item 1 click
//                    true
//
//                }
//                R.id.page_2 -> {
//                    true
//                }
//                else -> false
//            }
//        }
    }

}
