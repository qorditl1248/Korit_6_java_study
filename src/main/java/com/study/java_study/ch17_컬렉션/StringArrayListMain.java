package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringArrayListMain {
    public static void main(String[] args) {

        String[] strArray = new String[10];

        ArrayList<String> strList = new ArrayList<>();
        strList.add("test1");

        // 배열 <-> 리스트 변환
        List<String> list = Arrays.asList(strArray); // 기본적으로 업캐스팅 되어서 들어옴 arrays -> List

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list); // // 새 리스트를 만들어서 가지고 올 리스트를 다 넣는
        String[] strArray2 = strList.toArray(new String[strList.size()]);

        // 리스트 값 조회
        System.out.println(strList); // test1

        // contains 포함 여부
        System.out.println(strList.contains("test1")); // true

        // 리스트 바로 생성
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        System.out.println(nums); // [1, 2, 3, 4, 5]

        // 값 제거
        strList.add("김준일");
        strList.add("김준이");
        strList.add("김준삼");
        System.out.println(strList); // [test1, 김준일, 김준이, 김준삼]

        System.out.println(strList.remove("test1")); // true
        System.out.println(strList); // [김준일, 김준이, 김준삼]

        System.out.println(strList.remove(1)); // 김준이
        System.out.println(strList); // [김준일, 김준삼]

        // arrayList에서 removeAll 가능, List에서는 안됨
        System.out.println(nums);
        List<Integer> nums2 = List.of(1, 3, 5);
        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.addAll(nums); // [1, 2, 3, 4, 5]

        System.out.println(nums3.removeAll(nums2));
        System.out.println(nums3); // [2, 4]

        // 수정
        nums3.set(0, 10);
        System.out.println(nums3); // [10, 4]

        nums3.addAll(List.of(1, 2, 3));
        System.out.println(nums3); // [10, 4, 1, 2, 3]

        // 반복
        for(int i = 0; i < nums3.size(); i++) {
            System.out.println(nums3.get(i)); // 하나씩 꺼냄
        }

        for(Integer num : nums3) {
            System.out.println(num);
        }


        Iterator<Integer> ir = nums3.iterator(); // 조건을 줘서 꺼내고 싶을 때
        while (ir.hasNext()) {
            System.out.println(ir.next());
        }


    }
}
