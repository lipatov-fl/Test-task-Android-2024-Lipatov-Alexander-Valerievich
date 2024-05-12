package org.example

// Класс для пирамиды
class Pyramid(private val length: Double, private val width: Double, private val height: Double) : Figure {
    override fun volume(): Double {
        return (1.0 / 3.0) * length * width * height
    }

    override fun baseArea(): Double {
        return length * width
    }
}