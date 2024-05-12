package org.example

import kotlin.math.PI

// Класс для сферы
class Sphere(private val radius: Double) : Figure {
    override fun volume(): Double {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius
    }

    override fun baseArea(): Double {
        return Math.PI * radius * radius
    }
}