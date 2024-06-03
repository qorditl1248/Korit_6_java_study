package com.study.java_study.ch17_컬렉션;

import java.util.*;

public class StringHashSetMain {
    public static void main(String[] args) {


        HashSet<String> strSet = new HashSet<>();

        // 추가
        strSet.add("김준일");
        strSet.add("김준이");
        strSet.add("김준삼");
        strSet.add("김준사");

        System.out.println(strSet); // 해시값에 의해 정렬되어 들어감

        for(String name : strSet) { // set은 인덱스 번호가 존재하지 않음 -> foreach로 사용 !
            System.out.println(Objects.hash(name));
        }

        strSet.addAll(List.of("김준일", "김준일", "김준이"));

        System.out.println(strSet);

        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(strSet); // set은 중복 불가, 똑같은 값을 많이 넣어도 하나만 들어감
                                // 집합에서 사용, 중복제거 할 때 사용!

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };

        strList.sort(stringComparator);

        // 위에 오버라이딩 적혀있는 코드를 한줄로 줄인 거 ! (나중에 배움)
        strList.sort(((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1, o2)));
        System.out.println(strList);

    }



}
