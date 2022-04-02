package com.rupeswar.mymart.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.rupeswar.mymart.FeedbackActivity
import com.rupeswar.mymart.R
import com.rupeswar.mymart.utils.CartUtil

class OrdersAdapter : RecyclerView.Adapter<OrdersAdapter.OrdersViewHolder>() {
    class OrdersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrdersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_order, parent, false)

        return OrdersViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrdersViewHolder, position: Int) {
//        TODO("Not yet implemented")
        holder.name.text = "Item ${position}"
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, FeedbackActivity::class.java)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
        return 1000
    }
}