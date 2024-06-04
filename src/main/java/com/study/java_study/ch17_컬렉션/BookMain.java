package com.study.java_study.ch17_컬렉션;

import com.study.java_study.ch15_Static.Static01;

import java.util.List;
import java.util.Map;

public class BookMain {
    public static void main(String[] args) {


        System.out.println("프로그램 시작");

        BookService.getInstance().run1();

        System.out.println("프로그램 종료");
    }
}
