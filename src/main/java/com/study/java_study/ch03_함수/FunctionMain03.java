package com.study.java_study.ch03_함수;

public class FunctionMain03 {

    public static void main(String[] args) {
        Function03 fx = new Function03();
        Student student = new Student();

        fx.fx01(1234, "학생", 31, "01099881916"); // 전화번호는 문자열로 만들어야 함 (? 코딩에서 0이 앞에 있을 수 없음)

        student.StudentCode = 1111;
        student.name = "학생";
        student.age = 31;
        student.phone = "012344";

        fx.fx02(student);

    }
}
