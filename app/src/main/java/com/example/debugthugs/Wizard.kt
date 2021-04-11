package com.example.debugthugs

class Wizard (name: String) {

    var health: Int = 0
    private var spell1: Spell = Spell()
    private var spell2: Spell = Spell()
    private var spell3: Spell = Spell()
    val name: String = name;

    fun setSpells() {
        when (name) {
            "wiz1" -> {
                spell1.setSpell("wiz11")
                spell2.setSpell("wiz12")
                spell3.setSpell("wiz13")
            }
            "wiz2" -> {
                spell1.setSpell("wiz21")
                spell2.setSpell("wiz22")
                spell3.setSpell("wiz23")
            }
            "wiz3" -> {
                spell1.setSpell("wiz31")
                spell2.setSpell("wiz32")
                spell3.setSpell("wiz33")
            }
        }
    }

    fun setHealth() {
        when (name) {
            "wiz1" -> {
                var health: Int = 100
            }
            "wiz2" -> {
                var health: Int = 150
            }
            "wiz3" -> {
                var health: Int = 75
            }
        }
    }
}