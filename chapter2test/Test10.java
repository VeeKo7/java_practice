package org.example.chapter2test;

/*
* var keyword in which it detects
* automatically the datatype
* */

public class Test10 {
    public static void main(String[] args) {

        perform(new String[] {"1", "2", "3"});
    }

    public static void perform (String [] circus) {
//        for (int i = circus.length - 1; i >= 0 ; i--) {
//            System.out.print(circus[i] + " ");
//        }
// Output: 3 2 1

        //A
        for (int i = circus.length; i > 0 ; i--) {
            System.out.print(circus[i - 1] + " ");
        }

        //B - won't work
//        for-reversed (String c = circus)
//                System.out.print(c);

        //C
//        for (var c : circus) {
//            System.out.print(c);
//        }

        //D
//        for (var i = 0; i < circus.length; i++) {
//            System.out.print(circus[circus.length - i - 1] + " ");
//        }

        //E
//        for (int i = circus.length; i > 0 ; i--) {
//            System.out.print(circus[i + 1] + " ");
//        }

        //F won't work
//        for-each (String c circus)
//        System.out.print(c);
    }
}
