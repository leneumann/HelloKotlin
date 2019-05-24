package enums

fun main(){
    val prot = ProtocolState.TALKING
    val prota = ProtocolState.WAITING

    println(prot.signal())
    println(prota.signal())
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}
