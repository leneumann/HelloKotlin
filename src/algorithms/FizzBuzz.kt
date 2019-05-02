package algorithms

fun main() {
    for (a in 1..100) {
        if (a % 3 == 0 && a % 5 == 0)
            print("FizzBuzz")
        else {
            if (a % 5 == 0)
                print("Buzz")
            if (a % 3 == 0)
                print("Fizz")
        }
    }
}