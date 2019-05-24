package designPatterns.behavioral

import javax.management.OperationsException

fun main() {
println(calculator(3,CalculatorWithEnum.PLUS.instance(),4))
}

fun calculator(valueA: Int, operator: Calculator, valueB: Int): Int = operator.apply(valueA, valueB)

enum class CalculatorWithEnum {
    PLUS {
        override fun instance() = Plus()
    },
    TIMES {
        override fun instance() = Times()
    },
    MINUS {
        override fun instance() = Minus()
    },
    DIVIDE {
        override fun instance() = Divide()
    };

    abstract fun instance(): Calculator
}

interface Calculator {
    fun apply(valueA: Int, valueB: Int): Int
}

class Plus : Calculator {
    override fun apply(valueA: Int, valueB: Int): Int = valueA + valueB
}

class Times : Calculator {
    override fun apply(valueA: Int, valueB: Int): Int = valueA * valueB
}

class Minus : Calculator {
    override fun apply(valueA: Int, valueB: Int): Int {
        if (valueA - valueB >= 0)
            return valueA - valueB
        throw OperationsException("Negative value")
    }
}

class Divide : Calculator {
    override fun apply(valueA: Int, valueB: Int): Int = valueA / valueB
}

