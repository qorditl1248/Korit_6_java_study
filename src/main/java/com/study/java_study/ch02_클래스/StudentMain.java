package com.study.java_study.ch02_클래스;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student(); // 학생 객체를 생성한다
        Student student2 = new Student();
        // 각각의 학생마다 정보가 다르기 때문에 student1,2를 만든것

        student1.name = "학생 1";
        student1.age = 29;

        student2.name = "신선애";
        student2.age = 25;

        System.out.println(student1.name);


    }
}
