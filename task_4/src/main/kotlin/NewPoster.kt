package org.example

// Класс для издателя новостей
class NewsPoster : Observable {
    private val observers = mutableListOf<Observer>()

    override fun subscribe(observer: Observer) {
        observers.add(observer)
    }

    override fun unsubscribe(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers(news: String) {
        observers.forEach { it.update(news) }
    }
}