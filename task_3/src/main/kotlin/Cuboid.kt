package org.example

// Класс для параллелепипеда
class Cuboid(private val length: Double, private val width: Double, private val height: Double) : Figure {
    override fun volume(): Double {
        return length * width * height
    }

    override fun baseArea(): Double {
        return length * width
    }
}