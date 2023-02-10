package org.example.chapter2test;

public class Test17 {
    public static void main(String[] args) {

        var flavors = 30;
        int eaten = 0;
        switch(flavors) {
            case 30: eaten++;//1
            case 40: eaten+=2;//3
            default: eaten--;//2
        }
        System.out.print(eaten);
    }
}
