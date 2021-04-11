package com.example.debugthugs

import android.widget.ImageView

class Spell () {

    var cd: Int = 0
    var chargeTime: Int = 0
    var duration: Int = 0
    var radius: Int = 0
    var spellName: String = ""
    var spellIcon: ImageView? = null

    fun setSpell(spell: String) {
        when (spell) {
            "wiz11" -> {
                cd = 90
                chargeTime = 5
                duration = 20
                radius = 300
                spellName = "Wall of Fire"
                spellIcon.setImageResource(R.drawable.spell_icon1)
            }
            "wiz12" -> {
                cd = 90
                chargeTime = 5
                duration = 20
                radius = 300
                spellName = "Wall of Fire"
                spellIcon.setImageResource(R.drawable.spell_icon1)
            }
            "wiz13" -> {
                cd = 90
                chargeTime = 5
                duration = 20
                radius = 300
                spellName = "Wall of Fire"
                spellIcon.setImageResource(R.drawable.spell_icon1)
            }
            "wiz21" -> {
                cd = 90
                chargeTime = 5
                duration = 20
                radius = 300
                spellName = "Wall of Fire"
                spellIcon.setImageResource(R.drawable.spell_icon1)
            }
            "wiz22" -> {
                cd = 90
                chargeTime = 5
                duration = 20
                radius = 300
                spellName = "Wall of Fire"
                spellIcon.setImageResource(R.drawable.spell_icon1)
            }
            "wiz23" -> {
                cd = 90
                chargeTime = 5
                duration = 20
                radius = 300
                spellName = "Wall of Fire"
                spellIcon.setImageResource(R.drawable.spell_icon1)
            }
            "wiz31" -> {
                cd = 90
                chargeTime = 5
                duration = 20
                radius = 300
                spellName = "Wall of Fire"
                spellIcon.setImageResource(R.drawable.spell_icon1)
            }
            "wiz32" -> {
                cd = 90
                chargeTime = 5
                duration = 20
                radius = 300
                spellName = "Wall of Fire"
                spellIcon.setImageResource(R.drawable.spell_icon1)
            }
            "wiz33" -> {
                cd = 90
                chargeTime = 5
                duration = 20
                radius = 300
                spellName = "Wall of Fire"
                spellIcon.setImageResource(R.drawable.spell_icon1)
            }
        }
    }
}

