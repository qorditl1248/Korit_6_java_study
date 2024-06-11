package com.study.java_study.ch20_람다;

import com.study.java_study.ch13_추상화04.InterfaceA;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface {
    public static void main(String[] args) {

        // Runnable - run (매개변수 x, 반환값 x)
        Runnable runnable = () ->  {
            System.out.println("프로그램 실행");
            System.out.println("프로그램 종료");
        };

        runnable.run();

        // Function - apply (매개변수 o, 반환값 o)
        Function<String, Integer> fx = s -> Integer.parseInt(s); // 매개변수가 하나일 때 소괄호 생략 가능

        Integer num = fx.apply("10");
        System.out.println("num: " + num);

        Integer num2 = fx.andThen(result -> result + 100).apply("10"); // apply 실행 후 andThen 실행
        System.out.println(num2);
        // 문자열 10이 정수 10으로 바뀌고 난뒤에 100을 더함

        // Consumer - accept (매개변수 o, 반환값 x)
        Consumer<String> transform = s -> { // 안에 실행문이 1개면 중괄호 생략 가능
            System.out.println(s + "서버에 접속함");
            System.out.println(s + "님 환영합니다");
        };
            transform.accept("김준일");

        // Supplier - get (매개변수 x, 반환값 o)
        Supplier<Integer> role = () -> {
            Integer result = num + 999;
            return 999;
        };

        System.out.println(role.get());

        // Predicate - test (매개변수 o, 반환값 o)

        Predicate<Integer> even = n -> n % 2 == 0;

        System.out.println(even.test(10));

        }
    }

