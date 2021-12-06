package com.n1ko1ay.fivecities

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
    private val popTextView: TextView = itemView.findViewById(R.id.pop_text_view)


    fun bind(city: City) {
        nameTextView.text="Название:  ${city.name}"
        popTextView.text="Численность населения: ${city.pop}"

        itemView.setOnClickListener {
            Toast.makeText(itemView.context,city.name,Toast.LENGTH_LONG).show()
        }
    }

}