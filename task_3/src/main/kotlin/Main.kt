package org.example
import kotlin.math.PI

fun main() {
    val sphere = Sphere(5.0)
    println("Объем сферы: ${sphere.volume()}")
    println("Площадь основания сферы: ${sphere.baseArea()}")

    val cylinder = Cylinder(3.0, 7.0)
    println("Объем цилиндра: ${cylinder.volume()}")
    println("Площадь основания цилиндра: ${cylinder.baseArea()}")

    val cone = Cone(4.0, 6.0)
    println("Объем конуса: ${cone.volume()}")
    println("Площадь основания конуса: ${cone.baseArea()}")

    val cuboid = Cuboid(5.0, 6.0, 7.0)
    println("Объем параллелепипеда: ${cuboid.volume()}")
    println("Площадь основания параллелепипеда: ${cuboid.baseArea()}")

    val pyramid = Pyramid(4.0, 3.0, 5.0)
    println("Объем пирамиды: ${pyramid.volume()}")
    println("Площадь основания пирамиды: ${pyramid.baseArea()}")
}

