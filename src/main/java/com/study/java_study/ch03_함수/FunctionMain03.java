package com.study.java_study.ch03_함수;

public class FunctionMain03 {

    public static void main(String[] args) {
        Function03 fx = new Function03();

        fx.fx01(1234, "학생", 31, "01099881916"); // 전화번호는 문자열로 만들어야 함 (? 코딩에서 0이 앞에 있을 수 없음)

        Student student = new Student();
        // Student 라는 자료형(변수) + 변수명 =
        // new Student() ~> 주소값을 가짐

        // 타고 타고 간다라고 생각하자
        // student.StudentCode
        // student 타고 가서 StudentCode 안에 1111 이라는 값을 주입


        student.StudentCode = 1111;
        student.name = "학생";
        student.age = 31;
        student.phone = "012344";

        fx.fx02(student);
        // 위에 student 안에 값들을 다 넣어둔것을 fx02의 인자값으로 받아옴!
        // 받아온 fx02(student)를 해당 fx의 값을 보여줌

        System.out.println("------------------------");

        student.StudentCode = 2222;
        student.name = "학생2";
        student.age = 44;
        student.StudentCode = 111;
        fx.fx03(student);

    }
}
