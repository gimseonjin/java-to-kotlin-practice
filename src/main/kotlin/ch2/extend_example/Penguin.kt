package ch2.extend_example

class Penguin(species: String, private val wings: Int = 2)
    : Animal(species, 2), Swimable, Flyable {

    override fun move() = println("코틀린 펭귄이 걸어갑니다.")

    override val legs: Int
        get() = super.legs + this.wings

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

}