package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class while03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;

        System.out.println("프로그램 시작");

        while (isRun) {
            System.out.println("[메인 매뉴]");
            System.out.println("1. 회원 등록 ");
            System.out.println("2. 회원 조회 ");
            System.out.println("3. 회원 탈퇴 ");
            System.out.println("q. 프로그램 종료 ");

            System.out.print("메뉴 선택: ");
            String selectedMenu = scanner.nextLine();

            switch (selectedMenu) {
                case "1":
                    System.out.println("회원 등록으로 들어오셨습니다.");
                    boolean isRunMenu1 = true;
                    while (isRunMenu1) {
                        System.out.println("[회원 등록]");
                        System.out.println("[1. 네이버 아이디로 등록]");
                        System.out.println("[2. 카카오톡 아이디로 등록]");
                        System.out.println("[q. 뒤로가기]");

                        System.out.print("회원 등록 선택: ");
                        selectedMenu = scanner.nextLine();
                        switch (selectedMenu) {
                            case "1":
                                System.out.println("네이버 아이디로 등록하기에 들어왔습니다.");
                                break;
                            case  "2":
                                System.out.println("카카오톡 아이디로 등록하기에 들어왔습니다.");
                                break;
                            case  "q":
                                System.out.println("뒤로가기");
                                isRunMenu1 = false;
                                break;
                        }
                        System.out.println();
                    } break;
                case "2":
                    System.out.println("회원 조회로 들어오셨습니다.");
                    boolean isRunMenu2 = true;

                    while (isRunMenu2) {
                        System.out.println("[회원 조회]");
                        System.out.println("1. 회원 번호로 조회");
                        System.out.println("2. 회원 이름으로 조회");
                        System.out.println("b. 뒤로 가기");
                        System.out.print("메뉴 선택: ");
                        selectedMenu = scanner.nextLine();

                        switch (selectedMenu) {
                            case "1":
                                System.out.println("회원 번호로 조회하기에 들어오셨습니다");
                                break;
                            case "2":
                                System.out.println("회원 이름으로 조회하기에 들어오셨습니다");
                                break;
                            case "b":
                                System.out.println("뒤로가기");
                                isRunMenu2 = false;
                                break;
                            case "q":
                                System.out.println("프로그램 종료");
                                isRun = false;
                                isRunMenu2 = false;
                            default:
                                System.out.println("잘못된 입력입니다.");
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("회원 탈퇴로 들어오셨습니다.");
                    boolean isRunMenu3 = true;
                    while (isRunMenu3) {
                        System.out.println("[회원 탈퇴]");
                        System.out.println("1. 회원을 영구적으로 탈퇴");
                        System.out.println("2. 휴면계정");
                        System.out.println("b. 뒤로가기");
                        System.out.print("회원 탈퇴: ");
                        selectedMenu = scanner.nextLine();

                        switch (selectedMenu) {
                            case "1":
                                System.out.println("회원을 영구적으로 탈퇴");
                                break;
                            case "2":
                                System.out.println("휴면계정");
                                break;
                            case "b":
                                System.out.println("뒤로가기");
                                isRunMenu3 = false;
                                break;
                        }
                        System.out.println();
                    }
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못된 입력! 다시 입력하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");


    }

}
