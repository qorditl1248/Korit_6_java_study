package com.study.java_study.ch04_제어;

public class Star {
    public static void main(String[] args) {
        System.out.println("aaa");
        System.out.println("aaa"); // 줄 바꿈 x
        /*

        *
        **
        ***
        ****
        *****

         */

        for(int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
        }



        /*

         *****
         ****
         ***
         **
         *

         */

        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
        }



        /*

           *
          **
         ***
        ****
       *****

         */

        for (int i = 0; i < 5; i++) {
            System.out.println("");  // 전체 코드 줄바꿈
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" "); // 각각의 열에 공백을 만듬
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*"); // 별 찍어주
            }
        }




        /*
           *
          ***
         *****
        *******
       *********

         */

        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
        }





    }
}
