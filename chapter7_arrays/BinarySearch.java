package org.example.chapter7_arrays;

public class BinarySearch {

    public static void main(String[] args) {

        System.out.println(binarySearch(
                new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 8));
    }

    /**
     * use to find the key in the list
     * @param list where we look for the key
     * @return index for found number or
     * - low - 1 for not found number
     * */
    public static int binarySearch (int [] list,
                                    int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (high + low) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }

        //now high < low, key not found
        return - low - 1;
    }
}
