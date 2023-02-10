package org.example.chapter2test;

public class Test20 {
    public static void main(String[] args) {

        int count = 0;
        var stops = new String[] { "Washington", "Monroe",
                "Jackson", "LaSalle" };
        while (count < stops.length)//0 < 4, it will happen 4 times
            if (stops[++count].length() < 8)//count 1
                break;
            else continue;
        System.out.println(count);
    }

}
