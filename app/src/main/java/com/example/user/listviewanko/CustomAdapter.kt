package com.example.user.listviewanko

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import org.jetbrains.anko.*

class CustomAdapter(private val list: List<AppUser>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val appUser = getItem(position)

        return with(parent!!.context){
            verticalLayout(){
                val textNama = textView {
                    //id = 1
                }.lparams{
                    //alignParentLeft()
                    //alignParentRight()
                    topMargin = 20
                    leftMargin = 20
                }

                val textDes = textView{
                    //id = 2
                }.lparams{
                    //below(1)
                    //alignParentRight()
                    topMargin = 20
                    leftMargin = 20
                }

                textNama.text = appUser.nama
                textDes.text = appUser.description

            }
        }
    }

    override fun getItem(position: Int): AppUser {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return getItem(position).id
    }

    override fun getCount(): Int {
        return list.size
    }
}