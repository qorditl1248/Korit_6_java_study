package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {

        BookArrayUtils bookArrayUtils = new BookArrayUtils();
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while (isRun) {
            System.out.println("[도서 관리 프로그램]");
            System.out.println("[1.도서 이름 등록]");
            System.out.println("[2.도서 이름 수정]");
            System.out.println("[3.도서 이름 삭제]");
            System.out.println("[4.도서 이름 찾기]");
            System.out.println("[5.전체 조회]");
            System.out.println("[q.프로그램 종료]");

            System.out.print("메뉴 선택: ");
            String selectedName = scanner.nextLine();

            int findIndex = -1;
            String[] newNames = null;

            switch (selectedName) {
                case "1":
                    System.out.println("[1. 도서 이름 등록]");
                    newNames = new String[names.length + 1];
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록 할 이름: ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료! ");
                    break;

                case "2":
                    System.out.println("[2. 도서 이름 수정]");
                    System.out.print("수정 할 이름: ");
                    String modifyName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexBynames(names, modifyName);
                    if(findIndex == -1) {
                        System.out.println("수정 할 이름이 존재하지않습니다.");
                        break;
                    }
                    System.out.print("새 이름: ");
                    names[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료!");
                    break;

                case "3":
                    System.out.println("[3. 도서 이름 삭제]");
                    System.out.print("삭제 할 이름: ");
                    String removeName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexBynames(names, removeName);
                    if(findIndex == -1) {
                        System.out.println("삭제 할 이름이 존재하지 않습니다.");
                    }
                    newNames = new String[names.length - 1];
                    for(int i = 0; i < newNames.length; i++) {
                        if(i < findIndex) {
                            newNames[i] = names[i];
                            continue;
                        }
                        newNames[i] = names[i + 1];
                    }
                    names = newNames;
                    System.out.println(removeName + "을/를이 삭제 되었습니다");
                    System.out.println("삭제 완료!");
                    break;

                case "4":
                    System.out.println("[4. 도서 이름 찾기]");
                    System.out.print("조회 할 이름: ");
                    String findName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexBynames(names, findName);
                    if(findIndex == -1) {
                        System.out.println("조회 할 이름이 존재하지 않습니다.");
                    }
                    System.out.println(findName + "이 존재합니다.");
                    System.out.println("찾기 완료!");
                    break;

                case "5":
                    System.out.println("[5. 전체 조회]");
                    for(int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]:" + names[i]);
                    }
                    System.out.println("전체 조회 완료!");
                    break;

                case "q":
                    System.out.println("[프로그램 종료]");
                    isRun = false;
                    break;

                default:
                    System.out.println("메뉴가 존재하지 않습니다.");
                    break;

            }

        }
        System.out.println("프로그램이 종료되었습니다.");





    }
}
