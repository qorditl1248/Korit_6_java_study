package com.study.java_study.ch07_클래스02;

public class StudyB {

    private String name;    // private - 클래스 내부 o, 외부 x
    private int age;

    public StudyB() {}      // 기본 생성자 생략 가능, 하지만 오버로딩을 하면 기본 생성자를 명시해줘야 함


    public StudyB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 정보은닉, 캡슐화 settter, getter (단축키 - command + N)
//
//    set - 정보를 넣어줌, 리턴값 없어서 void
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    get - 정보를 가져와줌, 리턴값 존재
//    public String getName() {
//        return name;
//    }







    public void show() {         //
        System.out.println(name);
        System.out.println(age);
    }

}
