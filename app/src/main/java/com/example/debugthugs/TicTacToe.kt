package com.example.debugthugs

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


import android.widget.Button

class TicTacToe : AppCompatActivity() {

    lateinit var startNewGameButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toe)

        startNewGameButton = findViewById(R.id.startNewGameButton)

        startNewGameButton.setOnClickListener {
            val intent = Intent(TicTacToe@this, GameActivity::class.java)
            startActivity(intent)
        }
    }
}

