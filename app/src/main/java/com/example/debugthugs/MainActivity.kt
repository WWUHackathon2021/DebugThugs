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

    public fun goToChooseSpell(view: View) {
        val sg: Intent = Intent(this, ChooseSpell::class.java)
        startActivity(sg)
    }
}
