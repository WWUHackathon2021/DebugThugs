package com.example.debugthugs

abstract class Enemy() {

    abstract var health: Int
    abstract var moveSpeed: Int
    abstract var damage: Int
    abstract var range: Int

}

class Bomber(): Enemy() {

    override var health = 50
    override var moveSpeed = 200
    override var damage = 100
    override var range = 0

}

class Giant(): Enemy() {

    override var health = 50
    override var moveSpeed = 200
    override var damage = 100
    override var range = 0

}

class Basic(): Enemy() {

    override var health = 50
    override var moveSpeed = 200
    override var damage = 100
    override var range = 0

}