package com.example.debugthugs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class CoinFlip : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_flip)

        // Wait for the startNewGameButton to be flipped
        val btn: Button = findViewById(R.id.flipButton)
        btn.setOnClickListener { onClick() }
    }

    // Method to flip the coin when the startNewGameButton has been clicked
    private fun onClick() {

        val rand = (1..2).random() // Heads or Tails
        val coin: ImageView = findViewById(R.id.coin) // Change image value
        val btn: Button = findViewById(R.id.flipButton) // Re-declare inside function

        // Animate the coin flip
        coin.animate().apply {
            duration = 1000
            rotationYBy(1800f)
            btn.isClickable = false
        }.withEndAction {
            if (rand == 1) {
                coin.setImageResource(R.drawable.heads_removebg_preview)
                Toast.makeText(this, "Heads", Toast.LENGTH_SHORT).show()
            } else {
                coin.setImageResource(R.drawable.tails_removebg_preview)
                Toast.makeText(this, "Tails", Toast.LENGTH_SHORT).show()
            }
            btn.isClickable = true
        }.start()

    }
}
