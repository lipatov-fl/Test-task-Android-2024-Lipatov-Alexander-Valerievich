package org.example

// Класс для подписчика новостей
class Subscriber(private val name: String) : Observer {
    override fun update(news: String) {
        println("Подписчик $name получил последнюю новость: $news")
    }
}
