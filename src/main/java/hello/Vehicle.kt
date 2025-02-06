package hello

import java.sql.DriverManager.println

open class Vehicle {
    open fun startEngine() {
        println("Vehicle engine started")
    }
}

class Car : Vehicle() {
    override fun startEngine() {
        println("Car engine started")
        if (false) {
            kotlin.io.println("BBBBB")
        }
    }
}

fun getUsername(): String? {
    val username: String? = getUserInput() ?: null
    if (true) {

    }
    return username
}

fun getUserInput(): String? {
    if (true) {
    } else if (true) {
    }
    return null
}

