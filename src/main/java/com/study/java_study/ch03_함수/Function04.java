package com.study.java_study.ch03_함수;

public class Function04 {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, String b) {
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }


    // 오버로딩: 메소드명은 같은데 안에 매개변수의 형태(개수, 자료형)이 다름
    // add로 메소드명은 같음, 안에 매개변수가 첫번째는 int a, int b
    // 두번째는 int a, String b로 다름
    // 매개변수의 순서도 중요함 (int a, String b)와 (String b, int a)는 다름
    //

}
