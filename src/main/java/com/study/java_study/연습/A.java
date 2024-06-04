package com.study.java_study.연습;

public class A {
    /*
    Static - 정적

    A a = new A(); -> 생성 (동적 할당)

    public class A {
    private static int num = 10;

    public static int getNumber() {
        return num; // 만약, num이 static이 아니면 num를 가져오지 못함
                       가지고 올려면 getNumber에서 a를 생성해서 타고 들어가서 num을 가지고 와야함
    }
   }
   생성안해도 쓸 수 있는 이유는 정적으로 정적으로 메모리에 할당되어있음  -> A.getNumber();
   만약, static이 아니라면 생성해서 타고 들어가야함

   static이면 생성안하고 호출할 수 있음
   정적할당은 이미 할당 되어있는거, 동적할당은 생성하면 계속 새로운 메모리를 만들어 냄

   클래스명.(점) 찍으면 스태틱


     */

    /*

    싱글톤

   class A {
       private static A instance; - 이미 이 메모리는 존재함

       public static A getInstance() { - getInstance 메소드 명
            if(instance == null) {
                instance = new A(); - 동적 할당
            }
            return instance; - static과 static이여서 바로 호출 가능
       }

   }

   main문에서
  (A a1 =) A.getInstance(); 100번 주소
  (A a2 =) A.getInstance(); 100번 주소
   A a3 = new A(); 200번 주소

   싱글톤은 단 하나만 존재하는 ~ 위 처럼 되면 class A 안에 생성자가 private으로 정의 되어야함
   private A(){}





     */




}
