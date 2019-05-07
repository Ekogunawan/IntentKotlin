package com.gmail.akakom16.eko.intentkotlin

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class DuaActivity : AppCompatActivity() {

    internal lateinit var list: ListView
    internal var maintitle = arrayOf("MAK", "BAK", "IZAM", "EDO", "EKO")
    internal var subtitle = arrayOf("IBU RUMAH TANGGA", "KEPALA KELUARGA", "ANAK KE 3", "ANAK KE 2", "ANAK KE 1")

    internal var imgid = arrayOf(
        R.drawable.download_1,
        R.drawable.download_2,
        R.drawable.download_3,
        R.drawable.download_4,
        R.drawable.download_5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua)


        val adapter = MyListAdapter(this, maintitle, subtitle, imgid)
        list = findViewById(R.id.list) as ListView
        list.adapter = adapter

        list.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                Toast.makeText(applicationContext, "Place Your First Option Code", Toast.LENGTH_SHORT).show()
            } else if (position == 1) {
                Toast.makeText(applicationContext, "Place Your Second Option Code", Toast.LENGTH_SHORT).show()
            } else if (position == 2) {
                Toast.makeText(applicationContext, "Place Your Third Option Code", Toast.LENGTH_SHORT).show()
            } else if (position == 3) {
                Toast.makeText(applicationContext, "Place Your Forth Option Code", Toast.LENGTH_SHORT).show()
            } else if (position == 4) {
                Toast.makeText(applicationContext, "Place Your Fifth Option Code", Toast.LENGTH_SHORT).show()
            }
        }
    }
}