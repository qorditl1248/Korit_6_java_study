package com.study.java_study.ch09_클래스04;


import com.study.java_study.ch04_제어.For01;

import javax.swing.plaf.IconUIResource;

// 저장소 -> CRUD
public class BookRepository {
    private int bookId;
    private BookEntity[] books;

    public BookRepository() {
        books = new BookEntity[0];
    }

    public int autoIncrementBookId() {
        return ++bookId;
    }

    private void extendBooks() {
        // 기존 배열보다 크기가 하나 더 큰 배열을 생성한다. (기존 배열 books)
        BookEntity[] newBooks = new BookEntity[books.length + 1];

        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 빈값이다.
        for(int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }

        // 기존 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입한다.
        books = newBooks;
    }

    private int getLastIndex() {  // 인덱스 마지막 자리에 넣어줌
        return books.length - 1;
    }

    public void saveBook(BookEntity book) {
//         배열 확장, 크기가 커짐, 배열 생성
        extendBooks();

        // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다.
        books[getLastIndex()] = book;
    }

    // 단건조회
    public BookEntity findBookByBookId(int bookId) {
        BookEntity findBook = null;

        // 선형탐색
        for(BookEntity book : books) {
            if(book.getBookId() == bookId) {
                findBook = book;
                break;
            }
        }

        return findBook;   // for문이 끝나고 맞는 값이 없으면 null 값 반환
    }

    // 단건조회
    public BookEntity findBookByBookName(String bookName) {
        BookEntity findBook = null;

        // 선형탐색
        for(BookEntity book : books) {
            if(book.getBookName().equals(bookName)) {
                findBook = book;
                break;
            }
        }

        return findBook;
    }
    // 검색 된 배열의 사이즈를 만들어줌
    private int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;

        switch (option) {
            case 1: //통합검색
                for(BookEntity book : books){    // 도서 하나씩 꺼내서 확인, 셋 중에 하나라도 true면 true
                    if(book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 2: //도서명검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 3: //저자명검색
                for(BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 4: //출판사명검색
                for(BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }

        }

        return newArraySize;
    }

    // 다건조회
    public BookEntity[] searchBooks(int option, String searchText) {
        int newArraySize = getNewArraySize(option, searchText); // 리턴해야할게 배열

        BookEntity[] searchBooks = new BookEntity[newArraySize];
        int i = 0;
        switch (option) {
            case 1: //통합검색
                for(BookEntity book : books){
                    if(book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 2: //도서명검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 3: //저자명검색
                for(BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 4: //출판사명검색
                for(BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }

        }

        return searchBooks;
    }

    private int IndexOfBookId(int bookId) {
        int findIndex = -1;

        for(int i = 0; i < books.length; i++) {
            if(books[i].getBookId() == bookId) {
                findIndex = i;
                break;
            }
        }
        return findIndex;
    }

    // 삭제
    public void deleteBookByBookId(int bookId) {
        int findIndex = IndexOfBookId(bookId);
        BookEntity[] newBooks = new BookEntity[books.length - 1];  // 삭제해야하니 기존것 보다 하나 작은 새 배열 생성


        for(int i = 0; i < books.length; i++) { // 전체 books 반복을 돌림
            if(books[i].getBookId() == bookId) { // 삭제할 bookId가 있으면 findeIndex
                findIndex = i;
                break;
            }
        }

        for (int i = 0; i < newBooks.length; i++) {
            if(i < findIndex) {
                newBooks[i] = books[i];
                continue;
            }
            newBooks[i] = books[i + 1];
        }
        books = newBooks; // 주소 옮김
    }

}









