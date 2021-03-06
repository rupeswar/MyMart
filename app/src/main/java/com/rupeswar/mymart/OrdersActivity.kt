package com.rupeswar.mymart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rupeswar.mymart.adapters.OrdersAdapter
import com.rupeswar.mymart.databinding.ActivityOrdersBinding

class OrdersActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOrdersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrdersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val orders = binding.orders
        val adapter = OrdersAdapter()
        orders.adapter = adapter
        orders.layoutManager = LinearLayoutManager(this)
    }
}