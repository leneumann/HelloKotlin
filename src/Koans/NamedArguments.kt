package Koans
//named arguments
fun main() {
    val collection:Collection<String> = listOf("Fowler", "Beck", "Evans")

    print(joinOption(collection))
}

fun joinOption(options: Collection<String>) = options.joinToString(separator = "|",prefix = "{", postfix = "}")