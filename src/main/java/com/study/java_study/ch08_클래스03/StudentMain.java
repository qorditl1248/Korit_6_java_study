package com.study.java_study.ch08_클래스03;

public class StudentMain {

    public static void main(String[] args) {

//        int[] numbers = new int[5];
//        Student[] students = new Student[5];
//
//        numbers[0] = 10;
//        students[0] = new Student();


        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;

        Student student1 = new Student(); //  객체 생성
        Student student2 = new Student();
        Student student3 = new Student();

        Student[] student = new Student[3]; // 공간이 3개인 student 배열을 생성, 공간을 만들고 값을 주입
        student[0] = new Student(20240501, "김준일", 31);
        student[1] = new Student(20240502, "김준이", 32);
        student[2] = new Student(20240503, "김준삼", 33);

        Student[] students = new Student[] {
                new Student(20240501, "김준일", 31),
                new Student(20240501, "김준일", 31),
                new Student(20240501, "김준일", 31)
        };


        for(int i = 0; i < student.length; i++) {
            if(student[i] == null) {
                continue;
            }
            students.toString();
            System.out.println();
        }








    }
}
