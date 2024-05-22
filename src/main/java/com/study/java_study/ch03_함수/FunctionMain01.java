package com.study.java_study.ch03_함수;

public class FunctionMain01 {
    public static void main(String[] args) {
        // 무조건 생성자가 필요함
        Function01 function01 = new Function01();
        // 여기서는 기능만 사용해 function01만 생성해서 사용

        int result = function01.add(10, 2);
        int result2 = function01.add(100, 50);

        System.out.println(result); // 12
        System.out.println(result2); // 150

        int result3 = function01.sub(10, 2);
        int result4 = function01.sub(100, 50);

        System.out.println(result3); // 8
        System.out.println(result4); // 50

        int result5 = function01.mul(10, 2);
        int result6 = function01.mul(100, 50);

        System.out.println(result5);
        System.out.println(result6);
    }
}
