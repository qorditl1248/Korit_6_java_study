package com.study.java_study.ch10_추상화01;

public class AnimalMain {
    public static void main(String[] args) {

        Dog dog = new Dog("콩이", 1, "말티즈");
        Animal tiger = new Tiger("옹이", 5, 100);

        dog.move();
        tiger.move();
        ((Tiger)tiger).hunt();
        dog.bark();

        System.out.println();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름이 없는 동물", 10);
        animals[1] = new Dog("콩이", 1, "말티즈");
        animals[2] = new Tiger("옹이", 5, 100);

        for (Animal animal : animals) {
            animal.move();    // Animal, Dog, Tiger 셋 다 move가 있어서 다 나옴
        }

        System.out.println();

        // 자료형 비교 - 최신버전에서는 사용이 안됨
//        for(Animal animal : animals) {
//           if(animal instanceof Tiger) {
//               Tiger t = (Tiger) animal;
//               t.hunt();
//           } else if(animal instanceof Dog) {
//               Dog d = (Dog) animal;
//               d.bark();
//           }
//
//        }

        System.out.println();

        int a = 10;


        for(Animal animal : animals) {

            if(animal.getClass() == Tiger.class) { // 자료형 비교, getClass 랑 class랑 같으면 ~
                System.out.println(animal.getClass());
                Tiger t = (Tiger) animal;
                t.hunt();
            } else if(animal.getClass() == Dog.class) {
                System.out.println(animal.getClass());
                Dog d = (Dog) animal;
                d.bark();
            }

        }


    }
}
