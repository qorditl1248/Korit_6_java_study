package com.study.java_study.ch09_클래스04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class BookEntity {
    private int bookId;
    private String bookName;
    private String author;
    private String publisher;


}
