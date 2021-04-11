package com.example.debugthugs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast

class ChooseSpell : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_spell)

    }

    public fun sendMessage(view: View)
    {
        //val resultTextView: TextView = findViewById(R.id.textView)

        /* Wizard 1 */
        val btn_click_me = findViewById(R.id.wiz1) as Button
        btn_click_me.setOnClickListener{
            Toast.makeText(this@ChooseSpell, "You clicked Wizard 1", Toast.LENGTH_SHORT).show()
            //resultTextView.text = "Wiz1"
        }

        /* Wizard 2 */
        val btn_click_me2 = findViewById(R.id.wiz2) as Button
        btn_click_me2.setOnClickListener{
            Toast.makeText(this@ChooseSpell, "You clicked Wizard 2", Toast.LENGTH_SHORT).show()
            //resultTextView.text = "Wiz2"
        }

        /* Wizard 3 */
        val btn_click_me3 = findViewById(R.id.wiz3) as Button
        btn_click_me3.setOnClickListener{
            Toast.makeText(this@ChooseSpell, "You clicked Wizard 3", Toast.LENGTH_SHORT).show()
            //resultTextView.text = "Wiz3"
        }

        /* Name, Spells, HP */








    }

}