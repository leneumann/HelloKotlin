package designPatterns.behavioral

import jdk.jshell.spi.ExecutionControl

fun main(){
    var strategy = client(Type.CONCRETECLASS1)
    try {
        strategy.algo()
    }
    catch (e: ExecutionControl.NotImplementedException){
        println(e.message)
    }
}

fun client(strategy: Type): Strategy {
    var instace: Strategy = when(strategy) {
        Type.CONCRETECLASS1 -> ConcreteClass1()
        Type.CONCRETECLASS2 -> ConcreteClass2()
        else ->{
            throw ExecutionControl.NotImplementedException("Class not found")}
    }
    return instace
}

interface Strategy {
    fun algo()
}

class ConcreteClass1: Strategy {
    override fun algo() {
        println("ConcreteClass1")
    }

}

class ConcreteClass2: Strategy {
    override fun algo() {
        println("ConcreteClass2")
    }

}

enum class Type{
    CONCRETECLASS1,
    CONCRETECLASS2
}