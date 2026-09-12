package com.atlas.space
fun main() {
    while(true) {

        print("User@Atlas_Interface >")
        val shipment = readln()
        if (shipment.lowercase() == "exit") break
        Fly(shipment.trim())
        //no exit for now oh well

    }

}