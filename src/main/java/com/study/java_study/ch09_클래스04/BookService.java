package com.study.java_study.ch09_클래스04;

import java.util.Arrays;
import java.util.Scanner;

public class BookService {

    private Scanner scanner;
    private BookRepository bookRepository;

    public BookService() {
        scanner = new Scanner(System.in);
        bookRepository = new BookRepository(); // 새로운 객체 생성
    }

    private String selectMenu() {
        String[] menus = {"1", "2", "3", "4", "5"};
        String selectedMenu = null;

//        while (true) {
//            System.out.print("메뉴 선택: ");
//            selectedMenu = scanner.nextLine();
//            if(Arrays.binarySearch(menus, selectedMenu) > -1) { // menus라는 배열에서 selectedMenu가 있는지 찾아라
//                                                                // 배열의 크기는 0부터 시작
//                break;
//            }
//            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
//        }
//        return selectedMenu;

        while (true) {
            System.out.println("메뉴 선택: ");
            selectedMenu = scanner.nextLine();
            for(String menu : menus) {
                if(menu.equalsIgnoreCase(selectedMenu)) {
                    break;
                }
            System.out.println("잘못된 입력, 다시 입력");
            }
            return selectedMenu;
        }
    }


    public boolean run() {
        boolean isRun = true;
//        while (isRun) {} - 하위에 하위로 갔을 때 return에 함수를 계속 리턴해줘야함

        System.out.println("[ 도서 관리 프로그램 ]");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu(); // 메뉴 선택

        switch (selectedMenu) {
            case "q":
                isRun = false;
                break;
            case "1":
                registerBook(); // 첫 번째로 만듬
                break;
            case "2":
                search();
                break;
            case "3":
                modify();
                break;
            case "4":
                remove();
                break;
            default:
                System.out.println("입력 오류!");
        }
        System.out.println();

        return isRun;
    }

    private String validateValue(String title) {
        String value = null;
        while (true) {
            System.out.print(title + "명 입력: ");
            value = scanner.nextLine();
            if (!value.isBlank()) {   // 앞에 not을 사용 -> 문자열이 있으면
                break;
            }
            System.out.println(title + "명은 공백일 수 없습니다. 다시입력하세요.");
        }
        return value;
    }

    // 도서명 중복 체크
    private String duplicateBookName() {
        String bookName = null;
        while (true) {
            bookName = validateValue("도서");
            if(bookRepository.findBookByBookName(bookName) == null) {  // 같은 이름이 존재하지 않으면 break;
                break;
            }
            System.out.println("해당 도서명이 이미 존재합니다. 다시입력하세요.");
        }
        return bookName; // 입력받은 bookName이 리턴 됨
    }

    // 도서 등록
    private void registerBook() {
        System.out.println("[ 도서 등록 ]");
        String bookName = duplicateBookName();
        String author = validateValue("저자");
        String publisher = validateValue("출판사");
        int bookId = bookRepository.autoIncrementBookId(); // 얘는 순서 상관없음

        BookEntity book = new BookEntity(bookId, bookName, author, publisher); // 객체 생성
        bookRepository.saveBook(book);
        System.out.println("새로운 도서를 등록하였습니다.");
    }

    // 도서 검색
    private void search() {
        System.out.println("[ 도서 검색 ]");
        System.out.println("1. 통합 검색");  // 도서명, 저자명, 출판사명 다 검색할 수 있는 거 통합검색으로 해줌
        System.out.println("2. 도서명 검색");
        System.out.println("3. 저자명 검색");
        System.out.println("4. 출판사명 검색");
        System.out.print("옵션 선택: ");
        int option = scanner.nextInt();

        scanner.nextLine(); // 버퍼 비워줌

        System.out.print("검색어 입력: ");
        String searchText = scanner.nextLine();
        BookEntity[] searchBooks = bookRepository.searchBooks(option, searchText);

        System.out.println("[ 검색 결과 ]");
        if(searchBooks.length == 0) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }
        for(BookEntity book : searchBooks) {
            System.out.println(book.toString());
            System.out.println();
        }
    }

    // 삭제
    private void remove() {
        System.out.println("[도서 삭제]");
        search(); // 도서 검색 목록 보여줌
        System.out.print("삭제 할 도서번호 입력: ");
        int removeBookId = scanner.nextInt();
        scanner.nextLine(); // 버퍼 없앰

        BookEntity book = bookRepository.findBookByBookId(removeBookId);  // findeBooksbyBookId -> 도서가 있는지 확인
        if(book == null) {   // 도서객체를 조회해서 없으면 null, 있으면 넘어감
            System.out.println("해당 도서번호는 존재하지 않습니다");
            return;
        }
        bookRepository.deleteBookByBookId(removeBookId); // 삭제

    }

    // 수정
    private void modify() {
        System.out.println("[도서 수정]");
        search(); // 도서 정보를 보고 수정
        System.out.print("수정 할 도서번호 입력: ");
        int modifyBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(modifyBookId);
        if (book == null) {
            System.out.println("해당 도서번호는 존재하지 않습니다.");
        }

        System.out.println("<< 도서 수정 정보 입력 >> ");
        for (int i = 0; i < 3; i++) {
            String selected = null;
            switch (i) {
                case 0:
                    System.out.print("도서명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if (selected.equalsIgnoreCase("y")) { // equalsIngnoreCase - 대소문자 구분없이 구분하라
                        String bookName = duplicateBookName();
                        book.setBookName(bookName);
                        break;
                    }
                    break;

                case 1:
                    System.out.print("저자명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if (selected.equalsIgnoreCase("y")) { // equalsIngnoreCase - 대소문자 구분없이 구분하라
                        String author = validateValue("저자");
                        book.setAuthor(author);
                        break;
                    }
                    break;

                case 2:
                    System.out.print("출판사명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if (selected.equalsIgnoreCase("y")) { // equalsIngnoreCase - 대소문자 구분없이 구분하라
                        String publisher = validateValue("출판사");
                        book.setPublisher(publisher);
                        break;

                    }

            }


        }
    }
}












