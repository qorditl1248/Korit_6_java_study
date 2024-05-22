package com.study.java_study.ch02_클래스01;

public class ObjectMain {

    public static void main(String[] args) {
        int a = 10;

        ObjectA objectA1 = new ObjectA(); // 앞에는 클래스명 뒤에는 변수 (변수는 소문자로 시작!)
        // new object()의 주소를 objcetA에 담을 거, new objcetA는 메모리 할당 (메모리 공간이 생김)
        // 100번 주소

        ObjectA objectA2 = new ObjectA(); // 200번

        System.out.println(a); // 10
        System.out.println(objectA1); // com.study.java_study.ch02_클래스01.ObjectA@7a81197d
        System.out.println(objectA2); // com.study.java_study.ch02_클래스01.ObjectA@5ca881b5

        objectA1.num = 20;
        objectA2.num = 30;

        System.out.println(objectA1.num); // 20
        System.out.println(objectA2.num); // 30

        System.out.println(objectA1.name); // null



    }
}
