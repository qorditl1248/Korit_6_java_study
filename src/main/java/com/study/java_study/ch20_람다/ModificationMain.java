package com.study.java_study.ch20_람다;

public class ModificationMain {
    public static void main(String[] args) {
        Modification<String> m1 = new Modification<>() {
            @Override
            public String modify(String oldData, String newData) {
                System.out.println("기존데이터: " + oldData); // 기존데이터: 김준일
                System.out.println("새로운데이터: " + newData); // 새로운데이터: 김준이
                return  newData;
            }
        };

        Modification<String> m2 = new Modification<>() {
            @Override
            public String modify(String oldData, String newData) {
                return  newData;
            }
        };


        // 람다 (중요한거, 대입 되는 변수의 자료형! )
        Modification<String> m3 = (oldName, newName) -> { // 자료형인 Modification이 있기 때문에 가능
            System.out.println("기존데이터: " + oldName);
            System.out.println("새로운데이터: " + newName);
            return newName;
        };

        // 다른 명령없이 리턴만 있을 경우
        Modification<String> m4 = (oldName, newName) -> newName;


        String name = "김준일";

        String newName = m1.modify(name, "김준이");
        System.out.println(newName); // 김준이

        String newName2 = m2.modify(name, "김준삼");
        System.out.println(newName2); // 김준삼

        String newName3 = m3.modify(name, "김준사");
        System.out.println(newName3);




    }
}
