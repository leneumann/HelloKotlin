import kotlin.properties.Delegates

class UserNotNull {
    var name: String by Delegates.notNull()

    fun init(name: String) {
        this.name = name
    }
}

fun main (){
    val user = UserNotNull()

    user.init("Carl")
    println(user.name)
}