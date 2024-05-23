package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        // == 는 "주소값 비교"
        // String 안에 있는 메소드 .equals()로 문자열 비교
        // .equals()는 boolean 값을 리턴함

        String text = new String("");
        String name = "김준일";
        String phone = null;

        StringUtils stringUtils = new StringUtils();


        if(stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다");
            return; // 함수의 리턴 자료형이 void 일때만 return의 값이 없어도 됨, return 함수를 빠져나감
        }

        if(stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비어있습니다");
            return;
        }

        if(stringUtils.isEmpty(text)) {
            System.out.println("text이 비어있습니다");
            return; // 코드가 끝나기 때문에 return이 필요없음
        }







    }
}
