package com.study.java_study.ch01_변수와_자료형;

public class TypeStudy {
    public static void main(String[] args) {

        // [ 일반 자료형 ]
        // 1. 논리
        boolean a = true;
        boolean b = false;

        // 2. 숫자(정수)
        int c = 1000;
        long d = 10000000000l;

         /*
         리터럴(literal)
         >> 자바에서는 리터럴은 '그 자체의 값'을 의미
         >> 상수와 같은 의미이지만, 자바에서 상수는 '한번 만 값을 저장 가능한 변수'로 정의 했기 때문에
         >> 구별하기 위해서 리터럴이라는 단어를 사용
         >> 리터럴 상수는 이미 정해져있는 것

         기본적으로 정수리터럴은 int 타입! (4byte)
         만약, long 타입의 변수에 값을 저장할 때 그 값이 int자료형의 범위를 넘어갔을 경우,
         맨 마지막에 L을 붙여줘야 한다 (대소문자 구분 x -> 1과 혼동할 우려로 대문자 사용 권장)
         */

        // 3. 숫자(실수)
        double e = 3.14;

        // 4. 문자
        char f = '가'; // 문자는 '한 글자'만 저장할 수 있음, 2글자 이상이면 문자열 사용! AC00

        // 5. 문자열
        String g = "가나";

        // System.out.println >> sout 단축키
        System.out.println((char)((int)f + 1)); // 형변환 - 업캐스팅(하위 -> 상위), 다운캐스팅 (상위 -> 하위)

        // 형변환: 문자 -> 정수 -> 실수

        double num = 3.14;
        System.out.println(num);
        int num2 = (int)num; // 다운캐스팅, 명시적 형변환 >> 가고자하는 자료형을 앞에 명시해주는 것

        System.out.println(num2);
        double num3 = num2; // 업캐스팅, 묵시적 형변환 >> 자료형을 앞에 명시 안해줘도 됨
        System.out.println(num3);


    }
}
