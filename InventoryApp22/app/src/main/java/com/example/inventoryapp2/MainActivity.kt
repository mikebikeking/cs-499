package com.example.inventoryapp2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val products = ArrayList<String>()
    private val prices = ArrayList<String>()
    private val quantities = ArrayList<String>()
    private val totals = ArrayList<String>()

    private lateinit var table: TableLayout
    private lateinit var ed1: EditText
    private lateinit var ed2: EditText
    private lateinit var ed3: EditText
    private lateinit var b1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize views
        ed1 = findViewById(R.id.ed1)
        ed2 = findViewById(R.id.ed2)
        ed3 = findViewById(R.id.ed3)
        table = findViewById(R.id.tb1)
        b1 = findViewById(R.id.btn1)

        // Set button click listener
        b1.setOnClickListener {
            addProduct()
        }
    }

    private fun addProduct() {
        val productName = ed1.text.toString()
        val price = Integer.parseInt(ed2.text.toString())
        val quantity = Integer.parseInt(ed3.text.toString())

        val total = price * quantity

        // Add data to lists
        products.add(productName)
        prices.add(price.toString())
        quantities.add(quantity.toString())
        totals.add(total.toString())

        // Create table row
        val row = TableRow(this)

        // Create text views for product name, price, quantity, and total
        val productNameTextView = TextView(this)
        val priceTextView = TextView(this)
        val quantityTextView = TextView(this)
        val totalTextView = TextView(this)

        // Set text for text views
        productNameTextView.text = productName
        priceTextView.text = price.toString()
        quantityTextView.text = quantity.toString()
        totalTextView.text = total.toString()

        // Add text views to row
        row.addView(productNameTextView)
        row.addView(priceTextView)
        row.addView(quantityTextView)
        row.addView(totalTextView)

        // Add row to table
        table.addView(row)

        // Clear input fields
        ed1.text.clear()
        ed2.text.clear()
        ed3.text.clear()
    }
}