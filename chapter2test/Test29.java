package org.example.chapter2test;

import java.util.List;

public class Test29 {

    public static void main(String[] args) {

        //travel(new List.of(1,2,3));
    }

    public static void travel(List<Integer> roads) {
        for (int w = 1; w <= roads.size(); w++) {
            System.out.println(roads.get(w-1));
        }
    }
}
