package com.study.java_study.ch03_함수;

public class Function02 {

    // 매개변수 x, 리턴 x -> 리턴 값이 없으면 반환자료형이 void
    void fx01() {  // void자리는 - 반환자료형, 리턴자료형이라고 함
        System.out.println("fx01 함수 호출");
    }

    // 매개변수 0, 리턴 x
    void fx02(int num1, int num2) { // int num1, int num2는 선언 / 선언은 한번만 가능
        System.out.println("fx02 함수 호출");
        System.out.println("num1: " + num1); // 문자열 최상위 >> 문자열 + int or double등을 하면 문자열 됨
        System.out.println("num2: " + num2);
    }

    // 매개변수 o, 리턴 o
    String 빙수만들기(String 재료, int count) {
        return 재료 + "빙수: " + count + "개";
    }

    // 매개변수 x, 리턴 o
    String getDate() {
        return "데이터";
    }





}
