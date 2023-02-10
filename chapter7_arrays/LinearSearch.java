package org.example.chapter7_arrays;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(
                linearSearch(new int [] {1, 2, 3, 4, 5}, 4));
    }

    /**
     * finds the key in the list
     * @param list where we are looking for key
     * @return return key index if found,
     * -1 if not.
     */
    public static int linearSearch (int [] list,
                                    int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
}
