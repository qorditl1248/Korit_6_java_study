package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String a = scanner.next(); // String 문자열을 리턴
//        int num = scanner.nextInt(); // int 숫자를 리턴


        /*
            next() 메소드
            1. 공백과 줄바꿈(엔터)는 무시한다.
            2. 버퍼를 사용한다.

            버퍼를 비운다는 것은 -> nextLine();


         */

        System.out.print("B: ");
        String b = scanner.nextLine();
        System.out.println("비: " + b);





    }

}
