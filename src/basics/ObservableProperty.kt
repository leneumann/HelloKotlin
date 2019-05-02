package basics

import kotlin.properties.Delegates

class UserOb {
    var name: String by  Delegates.observable("no name"){
        _, old, new ->
        println("$old - $new")

    }
}

fun main(){
    val user = UserOb()
    user.name = "Carl"
}