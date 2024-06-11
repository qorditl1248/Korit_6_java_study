package com.study.java_study.ch20_람다;

import java.util.function.*;

public class Lambdainterface2 {
    public static void main(String[] args) {

        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run1");
            }
        };
        run1.run();

        Runnable runn2 =() -> {
                System.out.println("run2");
            };
        runn2.run();

        Function<String, Integer> function1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        Integer num1 = function1.apply("100");
        System.out.println("num1: " + num1);

        Function<String, Integer> function2 = (s) -> {
            return Integer.parseInt(s);
        };

        Integer num2 = function2.apply("1000");
        System.out.println("num2: " + num2);

        Integer num3 = function2
                .andThen(result -> result + 1000)
                .andThen(result -> result / 2)
                .apply("1000");

        System.out.println("num3: " + num3);

        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        };

        con.accept("안녕하세요");

        Consumer<Integer> con2 = (i) -> {
            System.out.println(i + "출력");
        };

        con2.accept(2);

        Predicate<Integer> num = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };

        Predicate<Integer> even = n -> n % 2 == 0;

        System.out.println(even.test(20));
        System.out.println(even.test(5));

        Supplier<Integer> number = () -> {
            Integer nums = num3 + 100;
            return 100;
        };

        System.out.println(number.get());






    }
}
