package com.example.contatosbootcamp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ContactAdapter(val contactList: ArrayList<Contact>): RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactAdapter.ViewHolder, position: Int) {
        holder.bindItem(contactList[position])
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindItem(contact: Contact){
            val textName = itemView.findViewById<TextView>(R.id.contact_name)
            val textPhones = itemView.findViewById<TextView>(R.id.contact_phone_number)

            textName.text = contact.name
            textPhones.text = contact.phoneNumber

        }
    }

}