package com.sully.tarotapp.Model

class Tirage() {
    constructor(user: User) : this() {
        user.tirages.add(this)
    }
}
