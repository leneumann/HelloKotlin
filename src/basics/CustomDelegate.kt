package basics

import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()

    override fun toString() = "basics.Example Class"
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "thisRef,thank you for delegating '${property.name}' to me"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, s: String) {
        println("$s has been assigned to ${property.name} in $thisRef")
    }
}

fun main() {
    val e = Example()
    println(e.p)
    e.p = "NEW"
}