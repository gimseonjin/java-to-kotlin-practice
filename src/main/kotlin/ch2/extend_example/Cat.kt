package ch2.extend_example

class Cat(species: String) : Animal(species, 4) {

    override fun move() = println("코틀린 고양이가 걸어갑니다.")

}