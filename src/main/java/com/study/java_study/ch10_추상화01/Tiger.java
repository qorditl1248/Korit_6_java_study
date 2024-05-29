package com.study.java_study.ch10_추상화01;

public class Tiger extends Animal {

    private int power;

    public Tiger() {
        // super(); - 기본적으로 생략이 되어있음, 부모 객체 생성, Animal 객체 생성자 호출
        System.out.println("호랑이 객체 생성");
    }

    public Tiger(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    // 재정의 -> 상속관계에서만 가능 (상위에서 받은 것을 하위에서 바꿈)
    @Override   // @ - 어노테이션, 있어도 없어도 동작함, 오버라이딩 했다는 걸 알려주는거
                // 재정의한거는 재정의한 것만 보여줌
    public void move() {
        System.out.println("호랑이가 네 발로 뛰어갑니다.");
        super.move(); // - 상위에 있는 move를 보여줌, 생성에만 순서가 존재
    }

    public void hunt() {
        System.out.println("호랑이가" + power + "의 힘으로 사냥합니다.");
    }




    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }
}
