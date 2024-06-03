package com.study.java_study.ch12_추상화03;

public class ConstantMain {
    public static void main(String[] args) {
        // 변수
        int a = 10;
        a = 20;

        /*
           상수
           1. 선언과 초기화를 잘 구분해야한다 (초기화 -> 제일 처음 값을 대입할 때)
           2. 선언 이후에 한번이라도 초기화가 되면 그 다음 부터는 다른 값으로 변경 X
           3. 상수는 가능한 대문자로 표기
           4. 모든 상수명이 대문자이기 때문에 스네이크 표기법 사용  (ex. SUM_NUMBER)

           선언하고 나서 초기화하는것은 되지만, 선언과 동시에 초기화를 하고 다른값으로 변경하는 것은 불가능

         */

        final int b = 30;
//        b = 40;

    }
}
