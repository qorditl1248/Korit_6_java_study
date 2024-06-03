package com.study.java_study.ch14_Object;

/*
    Object 클래스 (최상위 클래스)

 */

import java.util.Objects;

public class objectMain {
    public static void main(String[] args) {
        Object object = new Object();
        Student student = new Student("김준일", 31);
        Student student2 = new Student("김준일", 31);

        Object[] objects = new Object[3]; // object가 최상위 클래스여서 어떤 자료형이든 업캐스팅 가능
        objects[0] = new Object();
        objects[1] = "test";
        objects[2] = new Student("김준일", 31);

        System.out.println(student);

//        String str = "데이터";
//        System.out.println(str.toString()); - toString() 생략

        String studentData = student.toString();

        System.out.println(student.equals(student2)); // true (주소 비교x, 값비교o)

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student.hashCode() == student2.hashCode());

        System.out.println(Objects.hash("김준일"));
        System.out.println(Objects.hash("김준일"));

    }
}
