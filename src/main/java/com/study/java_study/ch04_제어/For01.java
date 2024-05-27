package com.study.java_study.ch04_제어;

public class For01 {

    public static void main(String[] args) {

        // for반복문은 순서가 있는 반복, 일정하게 무언가 증가&감소 하는 ~ ex) 줄넘기를 100개하면 그만해
        // while반복문은 조건이 있는 반복, if 조건문을 반복을 돌린다 생각하면 됨 ex) 내가 올때까지 줄넘기를 해, 횟수가 정해져있지 않음

        for(int i = 0; i < 10000; i ++) {  // for(초기문; 조건문; 후처리문)
            System.out.println(10000 - i);
        }






    }
}
