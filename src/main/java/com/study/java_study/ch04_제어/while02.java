package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class while02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("개수: ");
        int count = scanner.nextInt();

        int i = 0;
        while (i < count) {
            if (i  % 2 == 0) {
                System.out.println("짝수 입니다.");
                i++;
                continue;
            }
            System.out.println("홀수 입니다.");
            i++;
        }

        System.out.println("-----------------");



        for(int j = 0; j < count; j++) {
            if ( j % 2 == 0 ) {
                System.out.println("짝수 입니다.");
            } else {
                System.out.println("홀수 입니다.");
            }
        }

        // for문에서 countinue를 만나면 자동으로 후처리문에 간다

        for(int k = 0; k < count; k++) {
            if(k % 2 == 0) {
                System.out.println("짝수입니다.");
                continue;
            }
            System.out.println("홀수입니다.");
        }







    }

}
