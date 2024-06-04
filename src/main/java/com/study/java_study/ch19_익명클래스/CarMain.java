package com.study.java_study.ch19_익명클래스;

public class CarMain {
    public static void main(String[] args) {

        KiaCar kiaCar = new KiaCar("k8", "화이트");
        System.out.println(kiaCar); // AbstractCar(model=k8, color=화이트)

        // 익명클래스를 쓰는 이유 "일회용", 잠시쓰는 경우 (추상이랑 인터페이스에 있는걸 오버라이드를 해서)
        // 익명클래스를 생성하기 위해서는 추상클래스이거나 인터페이스이거나
        // 익명함수여서 생성자 정의 못함
        // 파일을 생성하는게 아니고, 구현하자마자 생성

        // 중괄호 부터는 임시로 클래스를 정의하겠다 이 뜻, 중괄호 시작하기전에 extends가 생략
        // 익명클래스 사용 예시)  로그인 버튼 같은 경우, 추상클래스인 버튼이라는 객체를 익명 클래스 사용

        AbstractCar abstractCar = new AbstractCar("내가 만든 자동차", "블랙") {
            @Override
            public void createCar() {
                System.out.println("한번 만들어봄");
            }

            @Override
            public void showCar() {
                System.out.println("자동차 정보...");
            }
        };
    }
}
