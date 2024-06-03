package com.study.java_study.ch16_제네릭;

import lombok.ToString;

@ToString
public class Sender<T, T2, T3> { // 변수명 <T> -> 제네릭
    private T data1;
    private T2 data2;
    private T3 data3;

    public Sender(T data1, T2 data2, T3 data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

}
