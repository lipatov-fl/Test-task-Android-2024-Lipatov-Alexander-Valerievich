package org.example

/* Определите дублированный элемент в массиве, в котором содержатся элементы типа int от 1 до 100,
при условии, что в массиве дублируется только один элемент? */

fun main() {
    findDuplicateElement()
}

fun findDuplicateElement() {
    while (true) {
        println("Введите дублирующийся элемент:")
        val duplicateElement = readlnOrNull()?.toIntOrNull() ?: -1

        if (duplicateElement !in 1..100) {
            println("Пожалуйста, введите целое число от 1 до 100.")
            continue
        }

        val numbers = IntArray(101) { it + 1 }
        numbers[numbers.size - 1] = duplicateElement
        val sumWithDuplicate = numbers.sum()
        val sumWithOutDuplicate = IntArray(100) { it + 1 }.sum()
        val duplicate = sumWithDuplicate - sumWithOutDuplicate
        println("Дублирующий элемент: $duplicate")
    }
}