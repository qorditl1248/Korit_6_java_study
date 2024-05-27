package com.study.java_study.연습;

import javax.swing.*;
import java.util.Scanner;

public class 배열_이름관리 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while (isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1.등록");
            System.out.println("2.수정");
            System.out.println("3.삭제");
            System.out.println("4.찾기");
            System.out.println("5.전체 조회");
            System.out.println("q.프로그램 종료");

            System.out.print("메뉴 선택: ");
            String selectedName = scanner.nextLine();

            switch (selectedName) {
                case "1":
                    System.out.println("[이름 등록]");
                    String[] newNames = new String[names.length + 1];
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록 할 이름: ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("!!!! 이름 등록 완료 !!!!");
                    break;

                case "2":
                    System.out.println("[이름 수정]");
                    System.out.print("수정 할 이름: ");
                    String modifyName = scanner.nextLine();
                    for(int i = 0; i < names.length; i++) {
                        if(names[i].equals(modifyName)) {
                            System.out.print("새로운 이름: ");
                            names[i] = scanner.nextLine();
                        }
                    }
                    System.out.println("이름 수정 완료");
                    break;

                case "3":
                    System.out.println("[이름 삭제]");
                    System.out.print("삭제 할 이름: ");
                    String delName = scanner.nextLine();
                    for (int i = 0; i < names.length; i++) {
                        if(names[i].equals(delName)) {
                            names[i] = " ";
                        }
                    }
                    System.out.println("!!!! 이름 삭제 완료 !!!!");
                    break;

                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("찾을 이름 입력: ");
                    String findName = scanner.nextLine();
                    for(int i = 0; i < names.length; i++) {
                        if(names[i].equals(findName)) {
                            System.out.println( i + "번째에 "+ findName + "라는 이름이 있습니다");
                        }
                    }
                    System.out.println();
                    break;

                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]:" + names[i]);
                    }
                    System.out.println();
                    break;

                case "q":
                    System.out.println("[프로그램 종료]");
                    isRun = false;
                    break;
            }
            System.out.println("프로그램이 종료되었습니다.");

        }

    }
}
