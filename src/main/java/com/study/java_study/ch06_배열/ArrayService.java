package com.study.java_study.ch06_배열;

import java.lang.reflect.Field;
import java.util.Scanner;

public class ArrayService {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while (isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름찾기");
            System.out.println("5. 전체조회");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴 선택: ");

            String selectedName = scanner.nextLine();

            String[] newNames = null; // 밖으로 빼줌
            int findIndex = -1;

            switch (selectedName) {
                case "1":
                    System.out.println("[이름 등록]");
                    newNames = new String[names.length + 1]; // 새로운 배열을 생성해서 크기 늘리기
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames; // newNames의 주소를 names에 넣음, newNames는 필요없어짐
                    System.out.print("등록 할 이름: ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료!");
                    break;

                case "2":
                    // 단일 책임을 무시함
//                    System.out.println("[이름 수정]");
//                    System.out.print("수정 될 이름: ");
//                    String modifyName = scanner.nextLine();
//                    for(int i = 0; i < names.length; i++) {
//                        if(names[i].equals(modifyName)) {
//                            System.out.print("수정 할 이름:  ");
//                            names[i] = scanner.nextLine();
//                            System.out.println("수정 완료");
//                            break;
//                        }
//                    }
//
//                    break;

                    System.out.println("[이름 수정]");
                    System.out.print("수정 될 이름: ");
                    String modifyName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, modifyName); // names 배열과 수정할 이름을 넣어 줌
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다");     // 스위치 문 빠져나가기 위해서 있는 if문
                        break;                                            // 메소드로 빼면 그냥 출력하는 메소드일 뿐 스위치 문을 빠져나가지는 않음
                    }
                    System.out.print("새 이름: ");
                    names[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료!");

                    break;


                case "3":
                    System.out.println("[이름 삭제]");
                    System.out.print("삭제 할 이름: ");
                    String removeName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, removeName);
                    for(int i = 0; i < names.length; i++) {
                        String name = names[i];
                        if(name.equals(removeName)) {
                            findIndex = i;
                            break;
                        }
                    }
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다");
                        break;
                    }
                     newNames = new String[names.length - 1];
                    for(int i = 0; i < newNames.length; i++ ) {
                        if(i < findIndex) {
                            newNames[i] = names[i];
                            continue;
                        }
                        newNames[i] = names[i + 1]; // 작지않으면 + 1 해줌
                    }
                    names = newNames;  //배열 주소를 바꿔줌
                    System.out.println(removeName + "을(를) 삭제하였습니다.");
                    break;

                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("조회 할 이름: ");
                    String findeName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, findeName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    System.out.println("해당 이름은 등록된 이름입니다.");
                    break;


                case "5":
                    System.out.println("[전체 조회]");
                    for (int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]" + names[i] );
                    }

                    break;

                case "q":
                    isRun = false;
                    break;

                default:
                    System.out.println("다시 입력하세요.");
            }

            System.out.println();


            // switch는 case1, case2로 나뉘지 않고 중괄호 전체를 포함
            // case1에서 선언한 변수를 case2에서 똑같은 변수를 선언 할 수 없음
            // -> switch 밖에서 선언해놓고 사용하던가 아니면 다 다른 변수를 사용


        }

    }

}
