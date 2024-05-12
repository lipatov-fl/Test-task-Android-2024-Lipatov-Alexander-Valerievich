package org.example

fun main() {
    val newsPoster = NewsPoster()
    val subscriber1 = Subscriber("Сергей")
    val subscriber2 = Subscriber("Витя")
    val subscriber3 = Subscriber("Александр")
    val subscriber4 = Subscriber("Женя")

    newsPoster.subscribe(subscriber1)
    newsPoster.subscribe(subscriber2)
    newsPoster.subscribe(subscriber3)
    newsPoster.subscribe(subscriber4)

    newsPoster.notifyObservers("Поздравляем! Это первая новость!")
    newsPoster.unsubscribe(subscriber1)
    newsPoster.unsubscribe(subscriber4)
    newsPoster.notifyObservers("Поздравляем! Это вторая новость!")

}