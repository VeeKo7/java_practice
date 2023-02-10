package org.example.chapter6_methods.afterChapterExercises;

public class Ex6_13 {

    public static void main(String[] args) {

        System.out.printf("%.4f", sum());
    }

    /**
     * Sum series
     * @return sum
     * */
    public static double sum () {

        double m;
        double sum = 0;
        int count = 0;
        int i = 1;
        int j = 2;
        while (count < 20) {
            m = (double) i/j;
            sum = sum + m;
            System.out.printf("", sum);
            i++;
            j++;
            count++;
        }
        return sum;
    }

    public  static void display () {
        System.out.println("i\tm(i)");

    }
}
