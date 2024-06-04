package com.study.java_study.ch20_람다;

public class AdditionMain {
    public static void main(String[] args) {

        // 익명함수
        Addition addition = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        int result = addition.add(10, 20);
        System.out.println("결과: " + result); // 결과: 30


        // 람다식 (익명함수를 정의하고 생성를 다 포함한 식)
        Addition addition2 = ((x, y) -> x + y);

        result = addition2.add(10, 20);
        System.out.println("결과2: " + result); // 결과2: 30

    }
}
