package com.study.java_study.ch20_람다;

public class CustomKeyMain {
    public static void main(String[] args) {

        // 익명함수
        CustomKey attackKey = new CustomKey() {
            @Override
            public void onKeyPress() {
                System.out.println("공격키 누름");
            }
        };

        attackKey.onKeyPress();

        // 람다
        CustomKey skillKey = () -> {
            System.out.println("스킬키 누름");
        };

        skillKey.onKeyPress();


    }
}
