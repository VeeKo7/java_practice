package org.example.chapter5_loops;

public class ForLoopExecutionTimes {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {//0 1 2 3 4 5 6 7 8 9
            for (int j = 0; j < i; j++) {//0 1 2 3 4 5 6 7 8
                System.out.printf("%3d", i * j);
                count++;
            }
            System.out.println();
        }
        System.out.println("count: " + count);
    }
}
