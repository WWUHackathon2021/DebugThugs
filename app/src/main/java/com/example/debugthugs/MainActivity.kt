package com.example.debugthugs

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun goToTTT(view: View) {
        val sg: Intent = Intent(this, TicTacToe::class.java)
        startActivity(sg)
    }

    fun goToRPS(view: View) {
        val sg: Intent = Intent(this, RockPaperScissors::class.java)
        startActivity(sg)
    }

    fun goToCoinF(view: View) {
        val sg: Intent = Intent(this, CoinFlip::class.java)
        startActivity(sg)
    }
}




