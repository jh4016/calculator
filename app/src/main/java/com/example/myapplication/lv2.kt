package com.example.myapplication


fun main() {
    println("************계산기************")
    println("첫 번째 숫자를 입력하세요:")
    val num_1 = readLine()?.toDoubleOrNull()
    println("두 번째 숫자를 입력하세요:")
    val num_2 = readLine()?.toDoubleOrNull()
    val result:Double
    println("연산기호를 입력해주세요~ (예시: +, -, *, /, %)")
    val operator = readLine()

    if (num_1 != null && num_2 != null && operator != null) {
        if (operator == "+") {
            result = num_1 + num_2
            println("${num_1}과 ${num_2}의 합은 ${result}입니다.")
        } else if (operator == "-") {
            result = num_1 - num_2
            println("${num_1}과 ${num_2}의 차는 ${result}입니다.")
        } else if (operator == "*") {
            result = num_1 * num_2
            println("${num_1}과 ${num_2}의 곱은 ${result}입니다.")
        } else if (operator == "/") {
            if (num_2 != 0.0) {
                result = num_1 / num_2
                println("${num_1}과 ${num_2}의 나눗셈은 ${result}입니다.")
            } else {
                println("0으로 나눌 수 없습니다.")
            }
        } else if (operator == "%") {
            result = num_1 % num_2
            println("${num_1}을 ${num_2}로 나눈 나머지는 ${result}입니다.")
        } else {
            println("올바르지 않은 입력입니다. 다시 시도해주세요.")
        }
    } else {
        println("유효하지 않은 숫자 또는 연산자입니다.")
    }
}
