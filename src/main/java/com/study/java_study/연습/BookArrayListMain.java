package com.study.java_study.연습;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookArrayListMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Book> BookList = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            String bookName;
            String author;

            System.out.print("도서명 입력 : ");
            bookName = scanner.nextLine();

            System.out.print("저자명 입력: ");
            author = scanner.nextLine();

            BookList.add(new Book(bookName, author));
        }

        // 전체 조회
        for(Book book : BookList) {
            System.out.println("도서명 :" + book.getBookName());
            System.out.println("저자명 : " + book.getAuthor());
        }

        System.out.print("삭제 할 도서: ");
        String removeBookName = scanner.nextLine();

        for(int i = 0; i < BookList.size(); i++) {
            if(BookList.get(i).getBookName().equals(removeBookName)) {
                BookList.remove(i);
                break;
            }
        }

        for(int i = 0; i < BookList.size(); i++) {
            System.out.println("도서명 : " + BookList.get(i).getBookName() );
            System.out.println("저자명 : " + BookList.get(i).getAuthor());
        }

    }
}
