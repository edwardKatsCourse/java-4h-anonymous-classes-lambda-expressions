package com.company.nested;

class Main {

    public static void main(String[] args) {
        System.out.println();
//	    new Outer();
        System.out.println("--------");
//	    new Outer().new StaticNested();

        /**
         * 1. StaticNested ctor, затем Outer ctor
         * --> 2
         * 2. Outer ctor, затем StaticNested ctor
         * --> 1
         * 3. Runtime exception (Ошибка в рантайме)
         * --> 0
         * 4. Outer ctor only (вызовется только Outer ctor)
         * --> 1
         * 5. StaticNested ctor only (вызовется только StaticNested ctor)
         * --> 1
         *
         * ---------------------
         *
         * Будет ли создан экземпляр Outer?
         * 1. камуван (разумеется)          2
         * 2. ма питом? (с чего вдруг)      2
         */
    }
}


class Outer {
    private static String staticField;

    private static String getStaticField() {
        return staticField;
    }

    private String s = "abc";

    public Outer() {
//        this.s = s;
        System.out.println("Outer constructor");
        System.out.println(getStaticField());
    }

    //STATIC START
    static class StaticNested {
        private Integer s = 15;

        public StaticNested() {
            String s = "142";
            Object o = s; //String vs Integer????
            System.out.println(o); //15
            System.out.println("StaticNested constructor");
        }
    }
    //STATIC END
}