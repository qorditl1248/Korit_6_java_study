package com.study.java_study.ch06_배열;

public class ArrayMain01 {
    public static void main(String[] args) {

//        int num1 = 10;
//        int num2 = 20;
//        int num3 = 30;

        int[] nums = new int[100]; // 배열 생성, 대괄호 안에 배열의 크기 지정

        for(int i = 0; i < 100; i++) {
            nums[i] = (i + 1) * 10;
        }
        for (int num : nums) {        // int num이 초기화(선언) : nums(배열)
            System.out.println(num);
        }


        // 인덱스 0

        for(int i = 0; i < nums.length; i++) { // 배열의 크기를 가져옴
            if(i % 2 == 0) {
                continue;
            }
            int num = nums[i];
            System.out.println(num);
        }



    }
}
