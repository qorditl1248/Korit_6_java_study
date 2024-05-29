package com.study.java_study.ch08_클래스03;

public class Student {      // 참조 자료형
    private int code;
    private String name;
    private int age;

    public Student() {

    }

    public Student(int age, String name, int code) {
        this.age = age;
        this.name = name;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
