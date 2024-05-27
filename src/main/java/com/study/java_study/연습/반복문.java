package com.study.java_study.연습;

import java.util.Scanner;

public class 반복문 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;

        while (isRun) {
            System.out.println("[메인 메뉴]");
            System.out.println("1.회원 등록");
            System.out.println("2.회원 조회");
            System.out.println("3.회원 탈퇴");
            System.out.println("q.프로그램 종료");

            System.out.print("메뉴 선택: ");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1":
                    System.out.println("회원 등록으로 들어오셨습니다");
                    break;
                case "2":
                    System.out.println("회원 조회로 들어오셨습니다.");
                    break;
                case "3":
                    System.out.println("회원 탈퇴로 들어오셨습니다.");
                    break;
                case "q":
                    System.out.println("프로그램 종료");
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못된 입력 입니다");
                    break;
               }
        }
            System.out.println("프로그램을 종료하겠습니다");
    }
}
