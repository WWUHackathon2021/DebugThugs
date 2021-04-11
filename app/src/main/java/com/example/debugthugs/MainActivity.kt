package com.example.debugthugs

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    // Go to Tic-Tac-Toe activity
    fun goToTTT(view: View) {
        val sg: Intent = Intent(this, TicTacToe::class.java)
        startActivity(sg)
    }

    // Go to rock paper scissors activity
    fun goToRPS(view: View) {
        val sg: Intent = Intent(this, RockPaperScissors::class.java)
        startActivity(sg)
    }

    // Go to Coin Flip activity
    fun goToCoinF(view: View) {
        val sg: Intent = Intent(this, CoinFlip::class.java)
        startActivity(sg)
    }
}




