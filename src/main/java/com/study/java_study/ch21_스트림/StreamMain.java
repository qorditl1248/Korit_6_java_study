package com.study.java_study.ch21_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        /*

            한번 쓰고 나면 못씀
            < Stream 생성(사용) 절차 >
            1. 배열 생성 -> 스트림으로 변환
            2. 리스트 생성 -> 스트림으로 변환
            3. generate 메소드 -> 스트림 생성
            4. 범위 지정 -> 스트림 생성
            5. 빌더 -> 스트림 생성

            < Stream 중간(가공) 절차 >
            1. map(Function) - 중요함 (자바에서 많이 사용)
            2. filter(Predicate) - 중요함 (자바스크립트에서 많이 사용)
            3. sorted(Comparator) - function이랑 똑같음

            < Stream 최종(결과) 절차 >
            1. collect -> stream을 list로 변환
            2. 반복자 -> forEach 반복을 돌려서 출력

            스트림 핵심
            -> 반복 작업을 하기 위해서 (새로운 스트림을 만들 수도 있고, 정렬이나 조건을 통해서 새로운 스트림을 생성 할 수도 있고)


         */

        Stream<Integer> st1 = Arrays.stream(new Integer[] {1, 2, 3, 4, 5}); // 스트림 생성
               List<Integer> numberList = st1.map(n -> n * 2) // 가공
                .peek(n -> System.out.println(n)) // 가공(기타 스트림 메소드)
                .collect(Collectors.toList());
                // 최종적으로 리스트가 만들어 짐 List<Integer> numberList = st1. map(n -> n * 2)

        numberList.forEach(n -> System.out.println("n: " + n));

        List<Integer> filteringNumberList = numberList.stream()
                .map(n -> n / 2)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(filteringNumberList);


        List<Integer> sortedNumberList = numberList.stream()
                .sorted((o1, o2) -> o2 - o1)
                .collect(Collectors.toList());

        System.out.println(sortedNumberList);

        Stream<String> nameStream = Stream.<String>builder()
                .add("손경태")
                .add("최단비")
                .add("김지현")
                .add("정령우")
                .add("이성민")
                .build();

//        nameStream.sorted((o1, o2) -> Objects.hash(o2) - Objects.hash(o1))
//                .forEach(name -> System.out.println(name));


        nameStream
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o2, o1))
                .forEach(name -> System.out.println(name)); // 내림차순


        List<Phone> phoneList = List.of(
                Phone.builder().number(1).model("아이폰").build(),
                Phone.builder().number(2).model("갤럭시").build(),
                Phone.builder().number(3).model("샤오미").build()

        );

        phoneList.stream()
                .map(phone -> Phone.builder() // 새로운 폰 객체 생성
                    .number(phone.getNumber() * 2)
                    .model(phone.getModel())
                    .build())
                .forEach(phone -> System.out.println(phone));

        System.out.println();

        phoneList.stream()
                .filter(phone -> phone.getNumber() % 2 != 0)
                .forEach(phone -> System.out.println(phone));


        System.out.println();

        phoneList.stream()
                .sorted((o1, o2) -> o2.getNumber() - o1.getNumber())
                .forEach(phone -> System.out.println(phone));

        System.out.println();

        phoneList.stream()
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getModel(), o2.getModel()))
                .forEach(System.out :: println);

    }
}
