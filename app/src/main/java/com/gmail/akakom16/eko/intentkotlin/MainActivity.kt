
package com.gmail.akakom16.eko.intentkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener {
            val intent = Intent(this,NewActivity::class.java)
            startActivity(intent)
        }
        btn.setOnClickListener {
            val intent = Intent(this,DuaActivity::class.java)
            startActivity(intent)
        }
    }
}
