package org.example

import kotlin.math.PI

// Класс для цилиндра
class Cylinder(private val radius: Double, private val height: Double) : Figure {
    override fun volume(): Double {
        return Math.PI * radius * radius * height
    }

    override fun baseArea(): Double {
        return Math.PI * radius * radius
    }
}