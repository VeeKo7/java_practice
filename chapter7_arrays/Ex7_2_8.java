package org.example.chapter7_arrays;

public class Ex7_2_8 {

    public static void main(String[] args) {
        double [] numbers = new double[10];
        numbers[0] = 0.0;
        numbers[1] = 6.6;
        numbers[2] = 1.0;
        numbers[3] = 2.0;
        numbers[4] = 3.0;
        numbers[5] = 9.0;
        numbers[6] = 8.0;
        numbers[7] = 7.0;
        numbers[8] = 5.4;
        numbers[9] = 5.5;
        double sum = numbers[0] + numbers[1];
        System.out.println("sum: " + sum);

        //find total of the array
        double total = 0;
        for (double e : numbers) {
            total += e;
        }
            System.out.println("total: " + total);

        //find min element in the array

        double min = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (min < numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("min: " + min);

        //randomly generate an index and
        //display the element of this index in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random() * 10;
            System.out.printf("%.2f\n", numbers[i]);
        }
    }
}
