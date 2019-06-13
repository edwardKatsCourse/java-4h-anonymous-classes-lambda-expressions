package com.company.anonymous;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        String name = "Anton";

        class Local {
            public void print() {
                System.out.println(name);
            }
        }

        Local local = new Local();
        local.print();

        System.out.println("------------------------");



        //                                          new Object implements Comparator
        Comparator<String> stringComparator = new /*Object implements*/ Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println(name);
                return o1.compareTo(o2);
            }
        };

        Comparator<Integer> integerComparator = (o1, o2) -> o1.compareTo(o2);

    }
}

interface Barkable {

    void bark();
}

abstract class AbstractClass implements Barkable {}
