package com.rupeswar.mymart.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.rupeswar.mymart.R
import com.rupeswar.mymart.utils.CartUtil

class CartAdapter : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {
    class CartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var count = 1
        val remove: ImageButton = itemView.findViewById(R.id.remove)
        val add: ImageButton = itemView.findViewById(R.id.add)
        val quantity: TextView = itemView.findViewById(R.id.quantity)
        val name: TextView = itemView.findViewById(R.id.name)
    }

    var total = CartUtil.itemsInCart

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cart, parent, false)

        return CartViewHolder(view)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
//        TODO("Not yet implemented")
        holder.name.text = "Item ${position}"
        holder.remove.setOnClickListener{
            holder.apply {
                if(count > 0) {
                    count--
                    total--
                }
                quantity.text = count.toString()
            }
        }

        holder.add.setOnClickListener{
            holder.apply {
                count++
                total++
                quantity.text = count.toString()
            }
        }
    }

    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
        return CartUtil.itemsInCart
    }
}