package com.example.myapplication
interface Operation {
    fun calculate(num_1: Double, num_2: Double): Double
}


fun main() {
    println("************계산기************")
    println("첫 번째 숫자를 입력하세요:")
    val num1 = readLine()?.toDoubleOrNull()
    println("두 번째 숫자를 입력하세요:")
    val num2 = readLine()?.toDoubleOrNull()
    println("연산기호를 입력해주세요~ (예시: +, -, *, /, %)")
    val operator = readLine()

    if (num1 != null && num2 != null && operator != null) {
        val operation: Operation = if (operator == "+") {
            Add()
        } else if (operator == "-") {
            Sub()
        } else if (operator == "*") {
            Mul()
        } else if (operator == "/") {
            Div()
        } else if (operator == "%") {
            Div() // 나머지 연산은 Div 클래스로 처리합니다.
        } else {
            throw IllegalArgumentException("올바르지 않은 입력입니다. 다시 시도해주세요.")
        }

        val calculator = Calculator(operation)
        val result = calculator.calculate(num1, num2)
        println("결과: ${result}")
    } else {
        println("유효하지 않은 숫자 또는 연산자입니다.")
    }
}