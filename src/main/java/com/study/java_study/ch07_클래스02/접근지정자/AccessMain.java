package com.study.java_study.ch07_클래스02.접근지정자;

import com.study.java_study.ch07_클래스02.StudyB;

/*
    1. private -> 같은 객체 안에서만 접근 할 수 있다 (같은 클래스 안에서)
    2. public -> 모든 영역에서 접근 할 수 있다.
    3. default -> 같은 패키지 안에서만 접근 할 수 있다. (명시하지 않으면 기본값으로 default 지정)
    4. protexted -> default와 동일, 같은 패키지 안에서 접근 할 수 있고 상속 관계일 때에는
    다른 패키지에 있어도 접근 할 수 있음

    => private 와 public 를 사용 많이 함


 */


public class AccessMain {
    private String test;

    public void printTest() {
        System.out.println(test);
    }

    public static void main(String[] args) {
        StudyB b = new StudyB("김준일", 31);
        b.show();  // 김준일, 31

//        b.setName("김준이");
//        System.out.println(b.getName()); // 김준이

        AccessMain accessMain = new AccessMain();
        accessMain.printTest();
        accessMain.test = "테스트";       // 같은 클래스 안에 있기 때문에 private test가 보여짐

    }
}
