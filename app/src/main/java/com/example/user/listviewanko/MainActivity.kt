package com.example.user.listviewanko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val items = listOf(AppUser(1, "Aisyah", "aisyah.jpg", "Aisyah"),
                           AppUser(2, "Muhtia", "muthia.jpg", "Muthia"),
                           AppUser(3, "Zahra", "zahra.jpg", "Zahra"))

        verticalLayout{
            val listView = listView {}
            listView.adapter = CustomAdapter(items)
            
            listView.setOnItemClickListener { parent, view, position, id ->
                val appUser = parent.getItemAtPosition(position) as AppUser
                toast(appUser.nama)

                startActivity<DetailActivity>("nama" to appUser.nama)
            }
            
        }
    }
}
