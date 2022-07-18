package ch2

class User (val name: String = "홍길동", var age: Int = 1){
    init {
        require(age > 0) { "나이는 0살 이상이어야 합니다." }
    }

    val isAdult: Boolean
        get() = this.age >= 20

    fun getUpperCaseName() = this.name.uppercase()

}

fun main(){

    val user = User("kimseonjin", 27)
    val user2 = User("kimseonjin")

    println(user.isAdult)
    println(user2.isAdult)

    print(user.getUpperCaseName())

}