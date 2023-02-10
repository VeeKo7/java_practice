package org.example.chapter5_loops;

//Logic seems to be correct.

public class Ex5_7 {
    public static void main(String[] args) {
        double tuition = 10_000;
        double totalFor10Years = 0;
        double totalFor14Years = 0;


        for (int i = 0; i < 10; i++) {//0-9
            tuition = tuition * 1.05;
            totalFor10Years += tuition;
        }

        System.out.printf("Tuition in 10 years will be $%4.2f.",  totalFor10Years);

        for (int j = 0; j < 14; j++) {
            tuition = tuition * 1.05;
            totalFor14Years += tuition;
        }


        double cost = totalFor14Years - totalFor10Years;


        System.out.printf("\nTuition in 14 years is $%4.2f.",  totalFor14Years);

        System.out.printf("The total \ncost of 4 years' worth of tuition " +
                "\nstarting after the tenth year is %4.2f", cost);
    }
}
