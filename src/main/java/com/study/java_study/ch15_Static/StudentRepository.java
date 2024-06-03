package com.study.java_study.ch15_Static;

public class StudentRepository {
    private String[] names;

    private static StudentRepository instance;

    private StudentRepository() {
        names = new String[5];
    }

    public static StudentRepository getInstance() {
        if(instance == null) {
            instance = new StudentRepository(); // 처음 돌때는 instance가 null, 2번째에는 그 주소가 들어있어서 똑같은 주소를 줌
        }
        return instance;    // 객체 주소
    }

    public  void add(String name) {
        for(int i = 0; i < names.length; i++) {
            if(names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() {
        return names;
    }


}
