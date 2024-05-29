package com.study.java_study.ch10_추상화01;

public class Animal {

    private String name;
    private int age;

    public Animal() {
        System.out.println("동물 객체 생성");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {    // animal이 dog랑 tiger을 가지고 있음
        System.out.println("동물이 움직입니다.");
    }




    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
