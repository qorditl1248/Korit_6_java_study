package com.study.java_study.ch14_Object;

import java.util.Objects;

public class Student {
    // 변수 정의
    private String name;
    private int age;

    // 생성자
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter && setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 오버라이드 equals
    @Override
    public boolean equals(Object obj) { // student가 object로 업캐스팅해서 들어옴
        if(this == obj) {
            return true;
        }
        if(obj.getClass() == this.getClass()) {
            Student student = (Student) obj; // 위 조건이 맞으면 object -> student로 다운캐스팅
            // student.name은 obj 매개변수로 받아온거
            return Objects.equals(student.name, name) && Objects.equals(student.age, age);
        }
        return false;
    }

    // 오버라이드 hashCode
    // 각각 다른 패키지 안의 클래스에서 정의한 name과 age의 값이 같으면 같다고 봄
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // 오버라이드 toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
