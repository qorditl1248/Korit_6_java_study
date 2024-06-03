package com.study.java_study.ch09_클래스04;

public class BookMain {

    public static void main(String[] args) {
        BookService bookService = new BookService();

        System.out.println("프로그램을 실행합니다.");

        while(bookService.run()) {} // while 문 안의 bookService.run()가 참인지 거짓인지 먼저 검사

        System.out.println("프로그램을 종료합니다.");

    }

}
