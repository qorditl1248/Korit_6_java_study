package com.study.java_study.ch04_제어;

import java.util.Random;
import java.util.Scanner;

public class while01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Random random = new Random();

      int num = random.nextInt(10) ; // 0 ~ 9 까지 중 랜덤한 값을 가질 수 있게 만들어줌 (즉, 10이 범위)
//        int num = random.nextInt(10) + 1; ~> 1 ~ 10까지 숫자



        while (true) {
            System.out.print("입력: ");
            int data = scanner.nextInt();
            if(num == data) {
                System.out.println("정답은" + data  + "입니다.");
                break;
            }
            System.out.println("틀렸습니다. 다시 입력하세요.");
        }



    }
}
