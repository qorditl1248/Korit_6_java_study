package com.study.java_study.ch10_추상화01;

public class Dog extends Animal {  // animal에서 확장함 extends, 추상화 - 있는 자료형에 새로운 자료형을 덧붙이는 거

    private String breed;

    public Dog() {
        //  super(); - 기본적으로 생략이 되어있음, 부모 객체 생성, Animal 객체 생성자 호출
        System.out.println("강아지 객체 생성");
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void move() {
        System.out.println("강아지가 네 발로 움직입니다.");
        super.move();
    }

    public void bark() {
        System.out.println(breed + "종의 강아지가 짖습니다.");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';


        // 리터럴 형변환 - 주소값을 바꿈
        // 객체의 형변환 - 그 부분을 활성화/비활성
        // 메모리할당은 new
        // 다운캐스팅은 업캐스팅이 된적 있는 애들만 가능! 업캐스팅을 한적이 없는 애들이 다운캐스팅이 안됨
        // 추상화 - 자료를 묶기 위해서

//        Tiger t = new Tiger();
//        Animal a2 = new Tiger(); - 업캐스팅
//        Tiger t2 = (Tiger)a2     - 다운캐스팅
    }
}
