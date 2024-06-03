package com.study.java_study.ch15_Static;

/*
    싱글톤 디자인 패턴
    1. 객체를 유일하게 '하나만' 생성하여 사용하는 기법
    2. 생성자가 private으로 외부에서는 생성할 수 없다.

    선생님 사온 그 커피를 여러 사람이 똑같이 그 커피를 먹고싶어
    그 커피를 static 하는 거
    그럼 여러 사람 동일한 그 커피를 먹는거

    싱글톤의 핵심은 static (instance, getInstance)
    getInstance -> static의 getter

 */

public class StudentMain {
    public static void main(String[] args) {
//        StudentService studentService = new StudentService(); - Error (생성자가 - private)

        StudentService studentService = StudentService.getInstance();
        StudentService studentService2 = StudentService.getInstance();

//        StudentRepository studentRepository = new StudentRepository();
//        studentRepository.add("김준이");

        studentService.addStudent();
        StudentRepository.getInstance().add("김준이");
        studentService2.addStudent();


        studentService.getStudentData();

    }
}
