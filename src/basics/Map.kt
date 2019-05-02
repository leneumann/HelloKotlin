package basics

fun main() {
    val map = hashMapOf<String, Int>()
    map.put("one", 1)
    map.put("two", 2)

    for ((key, value) in map)
        println("key = $key, value = $value")

}