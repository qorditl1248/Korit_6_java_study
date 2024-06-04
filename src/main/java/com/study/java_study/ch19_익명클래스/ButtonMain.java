package com.study.java_study.ch19_익명클래스;

public class ButtonMain {
    public static void main(String[] args) {

        Button homeButton = new HomeButton();

        click(new HomeButton());
        click(new Button() {
            @Override
            public void onClick() {
                System.out.println("로그인 하기");
            }
        });

        // 익명 함수
        Button loginButton = new Button() {
            @Override
            public void onClick() {
                System.out.println("로그인 하기");
            }
        };
        click(homeButton);
        click(loginButton);


    }

    public static void click(Button button) {
        System.out.println(button.getClass());
        button.onClick();
    }

}
