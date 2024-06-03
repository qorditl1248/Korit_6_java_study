package com.study.java_study.ch17_컬렉션;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapMain {
    public static void main(String[] args) {

        HashMap<Integer, String> strMap = new HashMap<>();

        // map은 값을 넣는게 put
        // key & value, 순서 없음
        // 이런 식으로 할거면 그냥 리스트 사용 -> strMap.put(0, "김준일");
        strMap.put(10, "김준일");
        strMap.put(11, "김준이");
        strMap.put(12, "김준삼");
        strMap.put(13, "김준사");

        System.out.println(strMap); // {0=김준일, 1=김준이, 2=김준삼, 3=김준사}

        // 값 꺼내오기 get
        System.out.println(strMap.get(0)); // null
        System.out.println(strMap.get(11)); // 김준이

        // 값 넣기
        Map<String, String> lang = Map.of(
                "java", "자바",
                "C", "C",
                "python", "파이썬",
                "js", "자바스크립트"
        );

        System.out.println(lang); // {C=C, java=자바, js=자바스크립트, python=파이썬}
        System.out.println(lang.get("java")); // 자바

        // entry를 타고 올라가면 map이 있음 (그래서 map. 가능)
        // entry는 set에 들어감 (list는 들어가지 못함 - 중복)
        // set안에 entry가 들어감 entry안에 키 벨류가 string

       Set<Map.Entry<String, String>> entries = lang.entrySet();

       // entrySet();
       // map -> set((entry), (entry)...)
       // entry안에는 key와 value를 String, String

        // key, value 값 가져오기
        for(Map.Entry<String, String> entry: entries) {
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }



    }
}
