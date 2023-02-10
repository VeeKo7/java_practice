package org.example.chapter5_loops;

public class Test4 {
    public static void main(String[] args) {

        int balance = 10;
        while (true) {
            if (balance < 9)//10 9
                break;
            balance = balance - 9;//1
        }


        System.out.println("Balance is " + balance);
    }
}
