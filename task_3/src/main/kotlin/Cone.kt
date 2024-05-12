package org.example

import kotlin.math.PI

// Класс для конуса
class Cone(private val radius: Double, private val height: Double) : Figure {
    override fun volume(): Double {
        return (1.0 / 3.0) * Math.PI * radius * radius * height
    }

    override fun baseArea(): Double {
        return Math.PI * radius * radius
    }
}