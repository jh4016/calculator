package com.example.myapplication

class Div : Operation {
    override fun calculate(num_1: Double, num_2: Double): Double {
        if (num_2 != 0.0) {
            return num_1 / num_2
        } else {
            throw IllegalArgumentException("0으로 나눌수 없습니다.")
        }
    }
}