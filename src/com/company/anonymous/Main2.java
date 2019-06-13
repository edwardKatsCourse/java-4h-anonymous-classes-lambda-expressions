package com.company.anonymous;

import java.util.*;

public class Main2 {

    private int digit = 1_000_000_000;


    public static void main(String[] args) {
        //                                  Object implements
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

        //statement
        for (String i : new ArrayList<String>()) {
        }
        int i = 15;

        //statement
        switch (i) {
            case 1:
                break;
        }

        //expression
        Comparator c = (o1, o2) -> 0;

        MyInterface myInterface_1 = value -> Integer.parseInt(value);

        MyInterface myInterface_2 = /*new MyInterface*/
                /*Integer singleMethod*/(/*String*/ s)
                -> {
            return Integer.parseInt(s);
        };

        MyInterface myInterface_3 = /*singleMethod*/(s) -> {
            return Integer.parseInt(s);
        };

        myInterface_3.singleMethod("41242");



        //Type Inference - Автоматическое выведение типов (компилятор догадался)

//        statement(car);

        Comparator<Double> doubleComparator = (param1, param2) -> {
            return 0; //type inference (компилятор догадался про возвращаемый тип)
        };

        doubleComparator.compare(1., 2.);

        Set<String> list = new HashSet<>();
        list.add("blue");
        list.add("green");
        list.add("yellow");

        //Method Reference
        //           x         ->      (x)
//        list.forEach(System.out::println);

        list.forEach(x -> System.out.println(x));
    }

    public static void statement(Object o) {
//        String result = o();
    }

    public static String expression() {
        MyInterface myInterface = (s) -> 15;
        return "";
    }
}

//Functional Interface
@FunctionalInterface
interface MyInterface {
    Integer singleMethod(String value);
}

