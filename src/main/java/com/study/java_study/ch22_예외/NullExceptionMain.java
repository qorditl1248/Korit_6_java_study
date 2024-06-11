package com.study.java_study.ch22_예외;

import java.util.ArrayList;
import java.util.List;

public class NullExceptionMain {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(); // List of -> null 포함 x

        names.add("신선애");
        names.add("김동인");
        names.add("백승주");
        names.add(null);


        try {
//            names.forEach(name -> System.out.println(name.toString()));
            for(int i = 0; i < 5; i++) {
                System.out.println(names.get(i).toString());
            }
            System.out.println("try 마지막 부분"); // 위 반복 도중에 예외가 뜨면 밑으로는 실행안되고 catch 구문으로 넘어감
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable e) { // 최종 예외
            e.printStackTrace();
        } finally {
            System.out.println("예외이든 아니든 실행");
        }

        System.out.println("프로그램 종료");

    }

}
