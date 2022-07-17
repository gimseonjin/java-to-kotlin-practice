fun main(){
    val a : Int = 5
    val b : Int = 24
    val result : String = "TUE"

    val answer = solution(a,b)

    println(result == answer)
}

fun solution(a: Int, b: Int): String {
    val monthList: List<Int> = listOf(0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val weekList: List<String> = listOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")

    val totalDate: Int = getTotalDate(monthList, a, b)

    return getWeek(weekList, totalDate)
}

fun getTotalDate(monthList: List<Int>, a: Int, b: Int) : Int {
    var totalDate : Int = 0

    for (i in 1 until a) {
        totalDate += monthList[i]
    }

    totalDate += b-1

    return totalDate;
}

fun getWeek(weekList: List<String>, totalDate: Int) = weekList[totalDate % 7]