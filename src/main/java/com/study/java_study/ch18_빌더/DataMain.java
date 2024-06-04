package com.study.java_study.ch18_빌더;

public class DataMain {
    public static void main(String[] args) {
        Data data = new Data("a", 0, 10.4, null);
        Data data2 = new Data();
        data2.setData1("a");
        data2.setData3(3.14);

        DataEntity dataEntity = DataEntity.builer()
                .data1("a")
                .data2(10)
                .data4("b")
                .build();


        DataEntity2 dataEntity2 = DataEntity2.builder()
                .data1("a")
                .data2(20)
                .data3(3.14)
                .data4("b")

                .build();

        Student student = Student.builder()
                .studentCode(11)
                .name("11")
                .age(11)
                .build();

    }

}
