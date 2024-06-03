package com.study.java_study.ch11_추상화02;

public abstract class Animal {   // 추상 클래스로 만들어줌

    private String name;

    public abstract void move(); // 추상화 시켜둠, 추상메소드를 하나라도 들고 있으면 '추상 클래스'

    public void eat() {
        System.out.println("동물이 밥을 먹습니다.");
    }
}

/*
    추상클래스 특징
    1. 클래스에 추상메소드가 하나라도 정의되어 있으면 추상 클래스로 정의해야 함
    2. 추상 클래스는 생성 할 수 없음
    3. 일반 클래스와 정의 할 수 있는 멤버변수, 멤버 메소드는 동일함
    4. 추상클래스라고 해서 무조건 추상메소드를 가지고 있어야하는 것은 아님
    5. 추상클래스를 상속 받은 클래스는 추상 메소드를 모두 구현하거나 해당 클래스도 추상클래스로 정의하여야 함

 */
