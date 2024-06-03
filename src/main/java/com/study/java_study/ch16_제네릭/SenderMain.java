package com.study.java_study.ch16_제네릭;

public class SenderMain {

    public static void main(String[] args) {

        // [ Wrapper 자료형 ] (제너럴은 일반자료형 사용 x)

        // Integer                      int
        // Boolean      --(언박싱)-->     boolean
        // Character    <--(박싱)--      char
        // Double                       double
        // Long                         long
        // Float                        float


        Integer num = new Integer(10); // 박싱, 리터럴 10를 interger로 감싼

        int num2 = num.intValue();     // 언박싱 interger로 감싸진 리터럴10을 풀어서 num2에 대입

        // Java에서 자동 박싱&언박싱 해줌
        Integer num3 = 20; // 자동 박싱 (자료형이 앞에 있으면 박싱)
        int num4 = num3;   // 자동 언박싱

        // 생성한다는것은 메모리를 할당하는 거
        // 제네릭은 메모리를 할당할 때 크기, 형태를 정해줌 담을 수 있는 그릇(자료형 같은거)
        // 많아야 2개 씀
        // 생성할 때 자료형을 정할 수 있음


        Sender sender1 = new Sender<Integer, String, Double>(10, "20", 3.14);
//      Sender<Integer, String, Double> sender1 = new Sender<>(10, "20", 3.14); - 앞에 쓰면 뒤에 생략 가능

    }
}
