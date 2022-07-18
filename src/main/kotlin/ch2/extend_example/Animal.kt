package ch2.extend_example

abstract class Animal( protected val species: String, protected open val legs: Int) {
    abstract fun move()
}