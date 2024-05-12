package org.example

/* Напишите код, подсчитывающий количество каждых элементов и выведите сначала элемент,
 а затем количество вхождений в массив. */

fun main() {
    elementCounting()
}

fun elementCounting() {
    val exp = (Array(10) { it + 1 } + arrayOf(2, 3, 10, 4, 4, 2, 6, 5, 5, 8, 2, 2, 6))
    for (i in exp.groupingBy { it }.eachCount()) {
        println("Элемент: ${i.key} | Кол-во вхождений = ${i.value}")
    }
}