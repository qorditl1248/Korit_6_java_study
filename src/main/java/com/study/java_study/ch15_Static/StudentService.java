package com.study.java_study.ch15_Static;

public class StudentService {
    private static StudentService instance; // 자기자신을 담을수 있는 인스턴스 객체가 존재

    private StudentService() {} // 외부에서 생성될수 없게 private으로 생성자를 생성

    public static StudentService getInstance() { // static - getter 메소드 생성, 인스턴스를 받음
        if(instance == null) {
            instance = new StudentService();
        }
        return instance; // 리턴 자료형이 자기자신
    }

    public void addStudent() {
        StudentRepository.getInstance().add("김준일");
    }


    public void getStudentData() {
        String[] names = StudentRepository.getInstance().getNames();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

}
