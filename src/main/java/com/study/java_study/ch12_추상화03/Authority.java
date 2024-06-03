package com.study.java_study.ch12_추상화03;

/*
    인터페이스(interface)
    1. 일반 클래스와 동일하게 정의 할 수 없음
    2. 일반 변수(멤버변수)를 정의 할 수 없음
    3. 무조건 상수만 정의 할 수 있음
    4. 일반 메소드(멤버메소드)를 정의하기 위해서는 default 키워드를 사용해야 함
    5. 추상 메소드를 정의할 때 abstract 키워드를 생략 할 수 있음
    6. 인터페이스 안에 정의되어 지는 모든 상수와 메소드들은 public 접근 지정자를 사용
    인터페이스는 여러 개 구현 가능
    기능적인것은 인터페이스
 */

import com.sun.nio.sctp.AbstractNotificationHandler;

public interface Authority {
   // public static final 생략
   String DEFAULT_ROLE = "ROLE_USER"; // 상수

   // public abstract 생략
   String getAuthority();

   // public 생략, default를 사용해야 일반 메소드 사용 가능
   default void printAuthority() {
      System.out.println(DEFAULT_ROLE);
   }

}
