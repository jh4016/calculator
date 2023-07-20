package com.example.myapplication

class Calculator(private val operation: Operation) {
    fun calculate(num_1: Double, num_2: Double): Double {
        return operation.calculate(num_1, num_2)
    }
}