package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {
        // "김준일" => 999
        String a = "김준일";              // 999
        String b = new String("김준일");  // new String 하는 순간 새로운 주소 200 생성 / new를 하면 항상 새로운 공간을 생성
                                        // 200번 주소 안에 999가 들어있음

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "김준일"); // true
        System.out.println(b == "김준일"); // false


        String[] names = new String[2];
        names[0] = "김준일";
        names[1] = new String("김준일");

        String[] names2 = {"김준일", new String("김준일")}; // 위 동작을 한번에 함
//        String[] names2 = new String[] {"김준일", new String("김준일")}; // 위 동작을 한번에 함
//        new String[]이 생략되어 있음, 매번 생략하는게 아니라 상황에 따라 붙여줘야할 때도 있음

        System.out.println(names[0] == names2[0]);  // true
        System.out.println(names[1] == names2[1]);  // false

        // 배열 주소 비교
        System.out.println(names == names2); // false

        System.out.println(new String[2]); // [Ljava.lang.String;@36baf30c 배열의 주소값 (앞에 대괄호 있음)
        System.out.println(new String[] {"a", "b"}); // [Ljava.lang.String;@7a81197d
//        System.out.println({"a", "b"}); - Error 배열로 인식하지 못함

        // 배열은 순서가 있다 - 인덱스 번호가 존재한다
        // 값이 중복이 가능 - 각 인덱스 번호가 있어서 중복된 값이라도 인덱스의 번호를 따라감
        // 배열의 공간은 늘리거나 줄일 수 없음






    }
}
