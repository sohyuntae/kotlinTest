package com.example.kotlintest

import org.junit.jupiter.api.Test

class TestBasic {

    @Test
    fun HelloWorld() {
        println("hello World")
        println(testMax(1, 2))
    }

    fun testMax(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    fun testMax2(a: Int, b: Int): Int = if (a > b) a else b

    fun testMax3(a: Int, b: Int) = if (a > b) a else b

    fun test() {
        // 변수(Variable)
        //var 변수명 : 변수타입 = 초기화
        //val 변수명 : 변수타입 = 초기화

        //타입을 명시하지 않아도 컴파일러가 타입을 추론한다.
        // val question = "sample question" -> String
        // val num = 42 -> Int
        // val yearsToCompute = 7.5e6 -> Double
        // 타입을 명시적으로 선언도 가능
        // val answer: Int = 42
    }
}
