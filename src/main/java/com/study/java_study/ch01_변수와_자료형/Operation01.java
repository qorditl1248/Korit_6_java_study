package com.study.java_study.ch01_변수와_자료형;

public class Operation01 {
    public static void main(String[] args) {
        // 연산자

        // 1. 산술 연산자

        int num1 = 10 + 20;
        int num2 = 9 / 2;
        System.out.println(num2); // 4
        int num3 = 9 % 2;
        System.out.println(num3); // 1
        boolean num4 = 5 % 2 == 0;

        System.out.println("----------------------");

        // 2. 증감 연산자

        int i = 0;
        System.out.println(i); // 0
        i++;
        System.out.println(i); // 1
        i = i + 1;
        System.out.println(i); // 2
        ++i;
        System.out.println(i); // 3
        System.out.println(++i); // 4
        System.out.println(i++); // 4
        System.out.println(++i); // 6

        System.out.println(--i); // 5
        System.out.println(i--); // 5
        System.out.println(i); // 4

        // 3. 논리 연산자
        // true => 1
        // false => 0
        // && => AND(곱)
        // || => OR(합)
        // ! => NOT(부정)

        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && false); // false
        System.out.println(!(true && true)); // false

        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || false); // false

        // 4. 관계 연산자
        System.out.println(3 > 2 && 1 == 1); // true
        System.out.println(1 != 1); // false

        // 5. 조건 연산자
        System.out.println(3 > 2 ? 10 : 20); // 10
        int x = 10;
        int y = 2;
        String result = x % y == 0 ? "y의 배수입니다." : "y의 배수가 아닙니다.";
        String result2 = "" + 10 /2 ; // 5
        System.out.println(result2);

        // 6. 복합 대입 연산자
        int number = 10;
        number += 5; // 15
        number -= 1; // 14
        number *= 2; // 28
        number /= 2; // 14
        number %= 2; // 0
        System.out.println(number);






















    }
}
