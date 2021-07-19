package com.example.user.listviewanko

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

class DetailActivity : AppCompatActivity() {

    private var nama : String = ""
    lateinit var nametext:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            nametext = textView()
        }

        val intent = intent
        nama = intent.getStringExtra("nama")
        nametext.text = nama

    }
}
