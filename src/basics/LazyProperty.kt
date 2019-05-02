package basics

class LazySample {
    val lazy: String by lazy {
        println("computed!")
        "my lazy"
    }
}


fun main(){
    val sample = LazySample()
    println("lazy = ${sample.lazy}")
    println("lazy = ${sample.lazy}")
}