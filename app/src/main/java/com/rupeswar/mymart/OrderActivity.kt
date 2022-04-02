package com.rupeswar.mymart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.rupeswar.mymart.adapters.CartAdapter
import com.rupeswar.mymart.databinding.ActivityOrderBinding

class OrderActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cart = binding.cart
        val adapter = CartAdapter()
        cart.adapter = adapter
        cart.layoutManager = LinearLayoutManager(this)

        binding.order.setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            intent.putExtra("amount", adapter.total * 300)
            startActivity(intent)
            onBackPressed()
        }
    }
}