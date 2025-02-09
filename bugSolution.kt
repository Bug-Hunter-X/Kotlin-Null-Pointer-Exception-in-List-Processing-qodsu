fun main() {
    val list = listOf(1, 2, null, 4, 5)
    val doubledList = list.mapNotNull { it?.let { it * 2 } }
    println(doubledList)
}