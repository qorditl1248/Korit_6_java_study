package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        // 제네릭 와일드 카드: 기호 -> ? (Object)

        Message<?> m1;
        Message<String> m2 = null;

        m1 = new Message<>("10");
        String s = (String)m1.getMessage(); // 다운캐스팅

        // 와일드 카드 제약 (수용할 수 있는 범위)

        // 하행 - String을 기준으로 밑으로 상속된 애들  / String 자기자신, String를 상속받은 것들만
        Message<? extends String> m3 = new Message<>("10"); // 하행

        // 상행 - String을 기준으로 위로는 다 됨
        Message<? super String> m4 = new Message<>(new Object()); // 상행


        String s2 = m3.getMessage();




    }
}
