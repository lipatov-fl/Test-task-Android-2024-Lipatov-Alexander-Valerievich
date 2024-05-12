package org.example

// Интерфейс для издателя
interface Observable {
    fun subscribe(observer: Observer)
    fun unsubscribe(observer: Observer)
    fun notifyObservers(news: String)
}