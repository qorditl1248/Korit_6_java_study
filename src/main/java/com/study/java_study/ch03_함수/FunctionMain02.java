package com.study.java_study.ch03_함수;

public class FunctionMain02 {
    public static void main(String[] args) {
        Function02 fx = new Function02();

        fx.fx01(); // 호출한다
        fx.fx02(10, 20);
        fx.fx02(10, (int)20.1); // 형변환 가능, 자료형에 맞게 넣기

        System.out.println(fx.빙수만들기("딸기", 4) + "주문완료");

        String 빙수 = fx.빙수만들기("초코", 5);
        System.out.println(빙수);

        System.out.println(fx.getDate());
    }
}
