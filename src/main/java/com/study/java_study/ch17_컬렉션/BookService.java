package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class BookService {
    // 싱글톤
    private static BookService instance; // 자기 자신

    private BookService() {}

    public static BookService getInstance() {
        if(instance == null) {
            instance = new BookService();
        }
        return instance;
    }

    private List<Map<String, Object>> bookDB = List.of( // list 안에 map, key값은 string value는 object
            Map.of(
                    "bookId", 1,
                    "bookName", "자바의 정석"
            ),
            Map.of(
                    "bookId", 2,
                    "bookName", "파이썬의 정석"
            ),
            Map.of(
                    "bookId", 3,
                    "bookName", "데이터베이스의 정석"
            )
    );

    public void run1() {
        System.out.println("도서 전체 정보를 요청합니다.");
        run2();

    }

    public void run2() {
        System.out.println("도서 전체 정보를 요청을 받았습니다.");
        List<BookEntity> bookEntities = run3();          // status, message, bookEntities
        BookRequestDto bookRequestDto = new BookRequestDto(200, "조회 완료", bookEntities);
        run4(bookRequestDto);
    }

    public List<BookEntity> run3() {  // 리턴 자료가 List<BookEntity>
        System.out.println("데이터 베이스에서 도서 전체 정보를 조회합니다.");

        List<BookEntity> bookEntities = new ArrayList<>(); // bookentity를 담을 리스트

        for(Map<String, Object> bookMap : bookDB) { // DB가 list, list 안에 Map들이 있음
            BookEntity bookEntity = new BookEntity( // Object로 있기때문에 다운캐스팅해줘야 함
                    (int)bookMap.get("bookId"),
                    (String)bookMap.get("bookName")
            );
            bookEntities.add(bookEntity); // bookEntity를 만들때 마다 bookEntities라는 넣음
        }
        return bookEntities;
    }

    public void run4(BookRequestDto bookRequestDto) {
        System.out.println("데이터 베이스에 정보를 요청한 클라이언트에게 응답합니다.");
        System.out.println("[ 응답 데이터 ]");
        System.out.println(bookRequestDto);
    }

}
